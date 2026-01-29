package 종합.예제6.model.dto;



public class BoardDto {
    private int number;
    private String content;
    private String writer;

    public BoardDto(){}

    public BoardDto(int number, String content, String writer) {
        this.number = number;
        this.content = content;
        this.writer = writer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "BoardDto{" +
                "number=" + number +
                ", content='" + content + '\'' +
                ", writer='" + writer + '\'' +
                '}';
    }
}
