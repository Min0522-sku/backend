package day10.doseosystem.model.dto;

public class DoseoDto {
    private int bookNo;
    private String title;
    private String writer;
    private boolean status;
    private int userNo;

    public DoseoDto() {}

    public DoseoDto(int bookNo, String title, String writer, boolean status, int userNo) {
        this.bookNo = bookNo;
        this.title = title;
        this.writer = writer;
        this.status = status;
        this.userNo = userNo;
    }

    public DoseoDto(int bookNo, String title, String writer) {
        this.bookNo = bookNo;
        this.title = title;
        this.writer = writer;
        this.status = true;
        this.userNo = 0;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }
}
