package model.dto;

public class SecondhandsDto {
    private int pno;
    private String nickname;
    private String pname;
    private String ptxt;
    private int pprice;
    private String ppw;
    private String pnumber;
    private String pdate;
    private boolean pstatus;

    public SecondhandsDto() {}

    public SecondhandsDto(int pno, String nickname, String pname, String ptxt, int pprice, String ppw, String pnumber, String pdate, boolean pstatus) {
        this.pno = pno;
        this.nickname = nickname;
        this.pname = pname;
        this.ptxt = ptxt;
        this.pprice = pprice;
        this.ppw = ppw;
        this.pnumber = pnumber;
        this.pdate = pdate;
        this.pstatus = pstatus;
    }

    public SecondhandsDto(String nickname, String pname, String ptxt, int pprice, String ppw, String pnumber) {
        this.nickname = nickname;
        this.pname = pname;
        this.ptxt = ptxt;
        this.pprice = pprice;
        this.ppw = ppw;
        this.pnumber = pnumber;
    }

    public SecondhandsDto(int pno, String pname, int pprice, String nickname, String pdate, boolean pstatus, String pnumber) {
        this.pno = pno;
        this.nickname = nickname;
        this.pname = pname;
        this.pprice = pprice;
        this.pnumber = pnumber;
        this.pdate =pdate;
        this.pstatus = pstatus;
    }

    public boolean isPstatus() {return pstatus;}
    public void setPstatus(boolean pstatus) {this.pstatus = pstatus;}
    public int getPno() {return pno;}
    public void setPno(int pno) {this.pno = pno;}
    public String getPname() {return pname;}
    public void setPname(String pname) {this.pname = pname;}
    public String getPtxt() {return ptxt;}
    public void setPtxt(String ptxt) {this.ptxt = ptxt;}
    public int getPprice() {return pprice;}
    public void setPprice(int pprice) {this.pprice = pprice;}
    public String getNickname() {return nickname;}
    public void setNickname(String nickname) {this.nickname = nickname;}
    public String getPdate() {return pdate;}
    public void setPdate(String pdate) {this.pdate = pdate;}
    public String getPnumber() {return pnumber;}
    public void setPnumber(String pnumber) {this.pnumber = pnumber;}
    public String getPpw() {return ppw;}
    public void setPpw(String ppw) {this.ppw = ppw;}
    @Override
    public String toString() {
        return "SecondhandsDto{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", ptxt='" + ptxt + '\'' +
                ", pprice=" + pprice +
                ", nickname='" + nickname + '\'' +
                ", pdate='" + pdate + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", ppw='" + ppw + '\'' +
                '}';
    }
}
