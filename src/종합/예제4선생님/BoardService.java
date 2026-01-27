package 종합.예제4선생님;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                // BoardController 의 저장 기능 호출하여 저장 결과 받기
                BoardController bc = new BoardController();
                boolean result = bc.doPost(content, writer);
                if (result) {
                    System.out.println("[안내]저장성공");
                }else {
                    System.out.println("[경고]저장실패");
                }

            }else if (ch == 2) {
                // BoardController 의 조회 기능 호출하여 조회 결과 받기
                BoardController bc = new BoardController();
                Board[] boards = bc.doGet();
                for(int i = 0; i < boards.length; i++){
                    if (boards[i] != null){
                        System.out.printf("작성자: %s , 내용: %s \n", boards[i].writer, boards[i].content);
                    }
                }
            }
        }
    }
}

