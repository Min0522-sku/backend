package 종합.예제6.veiw;

import 종합.예제6.controller.BoardController;

import java.util.Scanner;

public class BoradView {
    private BoradView(){}
    private static final BoradView instance = new BoradView();
    public static BoradView getInstance(){
        return instance;
    }


    private BoardController bc = BoardController.getInstance();
    private Scanner scan = new Scanner(System.in);


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
}
