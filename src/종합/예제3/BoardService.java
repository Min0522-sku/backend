package 종합.예제3;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Board[] boards = new Board[100];


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
                Board board = new Board();
                board.content = content;
                board.writer = writer;
                if (boards[boards.length - 1] != null) {
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
                for (int i = 0; i < boards.length; i++) {
                    if (boards[i] == null) {
                        boards[i] = board;
                        break;
                    }
                }
            } else if (ch == 2) {
                for (int i = 0; i < boards.length; i++) {
                    if (boards[i] != null) {
                        System.out.printf("작성자: %s , 내용: %s \n", boards[i].writer, boards[i].content);
                    }
                }

            }

        }
    }
}


class Board {
    String content;
    String writer;
}