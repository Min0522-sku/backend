package day09.종합과제2.model.dto;



public class WaitingDto {
    private int no;
    private String phone;
    private int num;

    public WaitingDto() {}
    public WaitingDto(int no, String phone, int num) {
        this.no = no;
        this.phone = phone;
        this.num = num;
    }
    public int getNo() {return no;}
    public void setNo(int no) {this.no = no;}
    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}
    public int getNum() {return num;}
    public void setNum(int num) {this.num = num;}

    @Override
    public String toString() {
        return "WaitingDto{" +
                "no=" + no +
                ", phone='" + phone + '\'' +
                ", num=" + num +
                '}';
    }
}
