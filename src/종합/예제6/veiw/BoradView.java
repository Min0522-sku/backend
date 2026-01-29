package 종합.예제6.veiw;

import 종합.예제6.controller.BoardController;
import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoradView {
    private BoradView(){}
    private static final BoradView instance = new BoradView();
    public static BoradView getInstance(){
        return instance;
    }


    private BoardController bc = BoardController.getInstance();
    private Scanner scan = new Scanner(System.in);

    public void indexView(){
        for (; ; ) {

            System.out.println("==========My Community==========");
            System.out.println("1.게시물 쓰기 | 2.게시물 출력");
            System.out.println("================================");
            int ch = scan.nextInt();
            if (ch == 1){writerView();} else if (ch==2) {printView();}
        }
    }

//등록 입출력 화면
    public void writerView(){
        scan.nextLine();
        System.out.print("내용 : ");
        String content = scan.nextLine();
        System.out.print("작성자 : ");
        String writer = scan.nextLine();

        boolean result = bc.doPost(content, writer);
        if (result) {
            System.out.println("[안내]저장성공");
        }else {
            System.out.println("[경고]저장실패");
        }
    }

    public void printView(){
        ArrayList<BoardDto> boards = bc.doget();
        for(BoardDto board : boards){
            System.out.printf("번호 : %d 작성자 : %s 내용 : %s\n", board.getNumber(), board.getWriter(), board.getContent() );
        }
    }
}
