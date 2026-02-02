package day10.doseosystem.model.dto;

public class UserDto {
    private int userNo;
    private String id;
    private String pw;
    private String nickname;

    public UserDto() {}

    public UserDto(int userNo, String id, String pw, String nickname) {
        this.userNo = userNo;
        this.id = id;
        this.pw = pw;
        this.nickname = nickname;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userNo=" + userNo +
                ", id='" + id + '\'' +
                ", pw='" + pw + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
