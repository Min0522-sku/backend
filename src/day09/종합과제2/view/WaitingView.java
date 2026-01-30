package day09.종합과제2.view;

import day09.종합과제2.controller.WaitingController;
import day09.종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;
import java.util.Scanner;

public class WaitingView {
    private WaitingView(){}
    private static final WaitingView instance = new WaitingView();
    public static WaitingView getInstance(){
        return instance;
    }

    private WaitingController wc = WaitingController.getInstance();


    private Scanner scan = new Scanner(System.in);

    public void addView(){
        scan.nextLine();
        System.out.print("전화번호 : ");
        String phone = scan.nextLine();
        System.out.print("인원수 : ");
        int num  = scan.nextInt();
        boolean result = wc.waitingAdd(phone, num);
        if(result){
            System.out.println("[안내]대기 등록이 완료되었습니다.");
        }else {
            System.out.println("[경고]더 이상 대기 등록을 할 수 없습니다.");
        }
    }

    public void waitingView(){
        ArrayList<WaitingDto> waitingList = wc.waitingGet();
        for (WaitingDto waiting : waitingList){
            System.out.println("==========대기 현황==========");
            System.out.printf("%d. 연락처: %s -인원: %d \n", waiting.getNo(), waiting.getPhone(), waiting.getNum() );
            System.out.println("_______________________________");
        }
    }

    public void indexView(){
        for (; ; ) {

            System.out.println("==========맛집 대기 시스템==========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("================================");
            System.out.print("선택>");
            int ch = scan.nextInt();
            if (ch == 1) {addView();}
            else if (ch ==2) {waitingView();}

            }
        }
    }

