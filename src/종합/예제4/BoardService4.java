package 종합.예제4;

import java.util.Scanner;

public class BoardService4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BoardController bc = new BoardController();
        for (; ; ) {

            System.out.println("==========My Community==========");
            System.out.println("1.게시물 쓰기 | 2.게시물 출력");
            System.out.println("================================");
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();
                if (bc.doPost(content, writer)){
                    System.out.println("[안내]등록성공");
                }else {
                    System.out.println("[경고]등록실패");
                }
            }else if (ch == 2) {
                bc.doGet();
                }
            }
        }
    }


class Board {
    String content;
    String writer;
}

class BoardController{
    Board[] boards = new Board[3];
    Boolean doPost(String content, String writer){
        Board board = new Board();
        board.content = content;
        board. writer = writer;
        if (boards[boards.length - 1] != null) {
            return false;
        }
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }
        }
        return null;
    }

    void doGet(){
        for (Board board : boards) {
            if (board != null) {
                System.out.printf("작성자: %s , 내용: %s \n", board.writer, board.content);
            }
        }
    }
}