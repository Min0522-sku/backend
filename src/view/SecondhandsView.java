package view;

import controller.SecondhandsController;
import model.dto.SecondhandsDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondhandsView {
    private SecondhandsView(){}
    private static final SecondhandsView instance = new SecondhandsView();
    public static SecondhandsView getInstance(){return instance;}
    private SecondhandsController sc = SecondhandsController.getInstance();
    private Scanner scan = new Scanner(System.in);

    public void index(){
        for(;;){
            try{
                System.out.println("====================Second Hands====================");
                System.out.println("1.물품등록 | 2.전체물품조회 | 3.물품정보수정 | 4.등록물품삭제");
                System.out.println("====================================================");
                System.out.print("선택 >"); int ch = scan.nextInt();
                if (ch == 1){add();}
                else if (ch==2) {findAll();}
                else if (ch==3) {update();}
                else if (ch==4) {delete();}
                else {System.out.println("[경고] 없는 기능 번호입니다.");}
            }catch (InputMismatchException e){
                System.out.println("[경고] 잘못된 입력 방식입니다.[재입력]");
                scan = new Scanner(System.in);
            }
            catch (Exception e){System.out.println("시스템 오류 관리자에게 문의"+ e);}
        }
    }

    public void add(){
        scan.nextLine();
        System.out.print("닉네임 : ");
        String nickname = scan.nextLine();
        System.out.print("물품명 : ");
        String pname = scan.nextLine();
        System.out.print("설명 : ");
        String ptxt = scan.nextLine();
        System.out.print("가격 : ");
        int pprice = scan.nextInt();
        scan.nextLine();
        System.out.print("비밀번호 : ");
        String ppw = scan.nextLine();
        System.out.print("연락처 : ");
        String pnumber = scan.nextLine();

        boolean result = sc.add(nickname, pname, ptxt, pprice, ppw, pnumber);
        if (result) {
            System.out.println("[안내]등록성공");
        }else {
            System.out.println("[경고]등록실패");
        }
    }

    public void findAll(){
        ArrayList<SecondhandsDto> shdto = sc.findAll();
        for(SecondhandsDto p : shdto){
            String status;
            if (p.isPstatus()){
                status = "판매중";
            }else  status = "판매종료";
            System.out.printf(" 번호 : %d , 물품명 : %s , 가격 : %d , 등록자 : %s , 판매여부 : %s, 연락처 : %s \n",p.getPno(), p.getPname(), p.getPprice(), p.getNickname(), status, p.getPnumber());
        }
    }

    public void update(){
        System.out.print("수정할 물품 번호 : "); int pno = scan.nextInt();
        scan.nextLine();
        System.out.print("수정할 물품명 : "); String pname = scan.nextLine();
        System.out.print("수정할 설명 : "); String ptxt = scan.nextLine();
        System.out.print("수정할 가격 : "); int pprice = scan.nextInt();
        scan.nextLine();
        System.out.print("수정할 연락처 : "); String pnumber = scan.nextLine();
        System.out.print("판매여부  true/false : "); boolean pstatus = scan.nextBoolean();
        scan.nextLine();
        System.out.print("비밀번호 : "); String ppw = scan.nextLine();
        boolean result = sc.update(pno, pname, ptxt, pprice, pnumber, pstatus, ppw);
        if (result) {
            System.out.println("[안내]수정성공");
        }else {
            System.out.println("[경고]수정실패");
        }
    }

    public void delete(){
        System.out.print("삭제할 물품 번호: "); int pno = scan.nextInt();
        scan.nextLine();
        System.out.print("비밀번호: "); String ppw = scan.nextLine();
        boolean result = sc.delete(pno, ppw);
        if (result){System.out.println("삭제성공");}
        else System.out.println("삭제 실패 또는 없는 게시물 번호");
    }
}
