package day10.doseosystem.view;


import day09.과제2인.model.dto.ProductDto;
import day10.doseosystem.controller.DoseoController;
import day10.doseosystem.controller.UserController;
import day10.doseosystem.model.dto.DoseoDto;

import java.util.ArrayList;
import java.util.Scanner;

public class DoseoView {
    private DoseoView(){}
    private static final DoseoView instance = new DoseoView();
    public static DoseoView getInstance(){return instance;}
    private Scanner scan = new Scanner(System.in);
    private UserController UC = UserController.getInstance();
    private DoseoController DC = DoseoController.getInstance();

    public void indexView(){
        if (UserController.getInstance().getCurrentUserNo() == 1){
            for (; ; ) {

                System.out.println("========== 로그인 후 메뉴 ==========");
                System.out.println("1. 도서등록");
                System.out.println("2. 도서대출");
                System.out.println("3. 도서반납");
                System.out.println("4. 전채도서조회");
                System.out.println("5. 내대출도서조회");
                System.out.println("6. 로그아웃");
                System.out.println("================================");
                System.out.print("선택>");
                int ch = scan.nextInt();
                if (ch == 1) {addBookView();}
                else if (ch ==2) {doseoDeView();}
                else if (ch ==3) {doseoBanView();}
                else if (ch ==4) {printDoseo();}
                else if (ch ==5) {printMyDe();}
                else if (ch ==6) {
                    UC.logout();
                    break;
                }
            }
        }else{
            for (; ; ) {

                System.out.println("========== 로그인 후 메뉴 ==========");
                System.out.println("1. 도서대출");
                System.out.println("2. 도서반납");
                System.out.println("3. 전채도서조회");
                System.out.println("4. 내대출도서조회");
                System.out.println("5. 로그아웃");
                System.out.println("================================");
                System.out.print("선택>");
                int ch = scan.nextInt();
                if (ch == 1) {doseoDeView();}
                else if (ch ==2) {doseoBanView();}
                else if (ch ==3) {printDoseo();}
                else if (ch ==4) {printMyDe();}
                else if (ch ==5) {
                    UC.logout();
                    break;
                }
            }
        }
    }
    public void addBookView(){
        scan.nextLine();
        System.out.println("--- 도서 등록 ---");
        System.out.print(" 제목 : ");
        String title = scan.nextLine();
        System.out.print(" 저자 : ");
        String writer = scan.nextLine();
        boolean result = DC.addBook(title, writer);
        if(result){
            System.out.println("[안내] 도서등록이 완료되었습니다.");
        } else {
            System.out.println("[경고] 도서등록이 실패했습니다.");
        }
    }
    public void doseoDeView(){
        System.out.println("--- 도서 대출 신청 ---");
        System.out.println(" 도서를 대출할 도서번호 : ");
        int doseoNo = scan.nextInt();
        boolean result = DC.doseoDe(doseoNo);
        if(result){
            System.out.println("[안내] 도서대출이 완료되었습니다.");
        } else {
            System.out.println("[경고] 도서대출이 실패했습니다. 대출 가능한 도서번호를 입력해주세요!");
        }
    }
    public void doseoBanView(){
        System.out.println("--- 도서 반납 신청 ---");
        System.out.println(" 도서를 반납할 도서번호 : ");
        int doseoNo = scan.nextInt();
        boolean result = DC.doseoBan(doseoNo);
        if(result){
            System.out.println("[안내] 도서반납이 완료되었습니다.");
        } else {
            System.out.println("[경고] 도서반납이 실패했습니다. 본인이 대출한 번호를 입력해 주세요!");
        }
    }
    public void printDoseo(){
        ArrayList<DoseoDto> doseoDto = DC.getDoseo();
        System.out.println("========== 전체 도서 목록 ===========");
        for (DoseoDto book : doseoDto){
            System.out.printf("도서번호 : %d | 제목: %s | 저자: %s | 대출가능여부: %S \n", book.getBookNo(), book.getTitle(), book.getWriter(), book.isStatus() ? "가능" : "불가능");
        }
        System.out.println("================================");
    }
    public void printMyDe(){
        System.out.println("\n============= 내 대출 도서 목록 =============");
        int myUserNo = UC.getCurrentUserNo();
        ArrayList<DoseoDto> list = DC.getDoseo();
        for(DoseoDto D : list){
            if(D.getUserNo() == myUserNo && D.isStatus() == false){
                System.out.printf("도서번호: %d | 제목: %s | 저자: %s\n",
                        D.getBookNo(), D.getTitle(),D.getWriter());
            }
        }
        System.out.println("--------------------------------------------");
    }
}
