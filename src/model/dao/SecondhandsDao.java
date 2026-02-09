package model.dao;

import model.dto.SecondhandsDto;

import java.sql.*;
import java.util.ArrayList;

public class SecondhandsDao {
    private SecondhandsDao(){connect();}
    private static final SecondhandsDao instance = new SecondhandsDao();
    public static SecondhandsDao getInstance(){return instance;}
    private String url = "jdbc:mysql://localhost:3306/secondhands";
    private String user = "root"; private String pw = "0950";
    private Connection conn;

    private void connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pw);
        } catch (Exception e) {
            System.out.println("연동실패"+e);
        }
    }
    public boolean add(String nickname, String pname, String ptxt, int pprice, String ppw, String pnumber) {
        try {
            String sql = "insert into secondhands(nickname, pname, ptxt, pprice, ppw, pnumber) values(?,?,?,?,?,?)";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nickname);
            ps.setString(2, pname);
            ps.setString(3, ptxt);
            ps.setInt(4, pprice);
            ps.setString(5, ppw);
            ps.setString(6, pnumber);
            int count = ps.executeUpdate();
            if (count == 1){return true;}
            else return false;
        } catch (SQLException e){
            System.out.println("[시스템 오류] SQL 문법 문제 발생: "+e);
        }
        return false;
    }

    public ArrayList<SecondhandsDto> findAll(){
        ArrayList<SecondhandsDto> shdto = new ArrayList<>();
        try{
            String sql = "select * from secondhands";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            // Resultset : select 결과물을 제어하는 인터페이스
            // rs.next() : 조회 결과에서 다음 레코드 1번 이동 , 만약 레코드가 10개이면 next 10번
            while (rs.next()){
                //rs.get타입명(속성명) : 현재 레코드의 속성 값 호출
                int pno = rs.getInt("pno");
                String nickname = rs.getString("nickname");
                String pname = rs.getString("pname");
                String pdate = rs.getString("pdate");
                int pprice = rs.getInt("pprice");
                boolean pstatus = rs.getBoolean("pstatus");
                String pnumber = rs.getString("pnumber");
                SecondhandsDto secondhandsDto = new SecondhandsDto(pno, pname,pprice,nickname,pdate,pstatus,pnumber);
                shdto.add(secondhandsDto);
            }

        }catch (SQLException e){System.out.println("[시스템 오류] SQL 문법 문제 발생: "+e);}
        return shdto;
    }

    public boolean update(int pno, String pname, String ptxt, int pprice, String pnumber, boolean pstatus, String ppw){
        try{
            String sql = "update secondhands set pname = ?, ptxt = ?, pprice = ?, pnumber = ?, pstatus = ? where pno = ? and ppw = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pname);
            ps.setString(2, ptxt);
            ps.setInt(3, pprice);
            ps.setString(4, pnumber);
            ps.setBoolean(5, pstatus);
            ps.setInt(6, pno);
            ps.setString(7, ppw);


            int count = ps.executeUpdate();
            if (count == 1){return true;}
            else return false;
        }catch (SQLException e){
            System.out.println("[오류] 올바른 비밀번호를 입력해 주세요: "+e);
        }
        return false;
    }

    public boolean delete(int pno, String ppw) {
        try {
            String sql = "delete from secondhands where pno = ? and ppw = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, pno);
            ps.setString(2, ppw);
            int count = ps.executeUpdate();
            if (count == 1){return true;}
            else return false;
        } catch (SQLException e) {
            System.out.println("[오류] 비밀번호가 일치 하지 않습니다: "+e);
        }
        return false;
    }

}
