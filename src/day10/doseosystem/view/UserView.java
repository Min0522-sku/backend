package day10.doseosystem.view;


import day10.doseosystem.controller.UserController;

import java.util.Scanner;

public class UserView {
    private UserView(){}
    private static final UserView instance = new UserView();
    public static UserView getInstance(){return instance;}
    private Scanner scan = new Scanner(System.in);

    private UserController UC = UserController.getInstance();
    private DoseoView DV = DoseoView.getInstance();

    public void singinView(){
        scan.nextLine();
        System.out.println("---회원 가입---");
        System.out.print("아이디: "); String id = scan.nextLine();
        System.out.print("비밀번호: "); String pw = scan.nextLine();
        System.out.print("닉네임: "); String nickname = scan.nextLine();
        boolean result = UC.singin(id,pw,nickname);
        if (result){
            System.out.println("[안내] 회원가입이 완료되었습니다.");
        }else {
            System.out.println("[안내] 회원가입에 실패하였습니다.");
        }
    }

    public void loginView(){
        scan.nextLine();
        System.out.println("---로그인---");
        System.out.print("아이디: "); String id = scan.nextLine();
        System.out.print("비밀번호: "); String pw = scan.nextLine();
        boolean result = UC.login(id,pw);
        if (result){
            System.out.printf("[안내] %s님 환영합니다\n", UC.returnNickname(id));
            DV.indexView();
        }else {System.out.println("로그인 실패");}
    }
    public void indexView(){
        for (; ; ) {

            System.out.println("========== 도서관리 시스템 ==========");
            System.out.println("1.회원가입 | 2.로그인");
            System.out.println("================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {singinView();}
            else if (ch ==2) {loginView();}

        }
    }
}
