package day04;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        /*문제 1*/
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }
        /*문제 2*/
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        /*문제 3*/
        int sum = 0;
        for(int i = 1; i <=50; i++){
            sum += i;
        }
        System.out.println(sum);
        /*문제 4*/
        for(int i = 1; i <=20; i++){
            if(i%2 ==0){
                System.out.println(i);
            }
        }
        /*문제 5*/
        for(int i = 1; i <= 30; i++){
            if(i%3 == 0){
                continue;
            }
            System.out.println(i);
        }
        /*문제 6*/
        int result = 0;
        for(int i = 1; i<= 100; i++){
            result += i;
            if(result >=100){
                System.out.println(i+"까지 더했을때 합계가 "+result+"로 100을 넘습니다.");
                break;
            }
        }
        /*문제 7*/
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //문제 8
        for(int i = 5; i>=1; i--){
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //문제9
        Scanner scan = new Scanner(System.in);
        boolean input = true;
        int index = 0;
        while (input) {
            ++index;
            System.out.println(index+"회 입력:");
            String abc = scan.next();
            if(abc.equals("end")){
                System.out.println("[안내] 프로그램을 종료합니다.[총 "+index+"회 입력]");
                input = false;
            }
        }
        //문제 10
        int july1 = 3532100;
        july1 = july1/10000;
        int july2 = 9123700;
        july2 = july2/10000;
        int july3 = 5183400;
        july3 = july3/10000;
        int july4 = 11738700;
        july4 = july4/10000;
        System.out.print("1주차 :");
        for (int i = 1; i <= (july1/100); i++){
            System.out.print("■ ");
        }
        System.out.println(july1+"만원");
        System.out.print("2주차 :");
        for (int i = 1; i <= (july2/100); i++){
            System.out.print("■ ");
        }
        System.out.println(july2+"만원");
        System.out.print("3주차 :");
        for (int i = 1; i <= (july3/100); i++){
            System.out.print("■ ");
        }
        System.out.println(july3+"만원");
        System.out.print("4주차 :");
        for (int i = 1; i <= (july4/100); i++){
            System.out.print("■ ");
        }
        System.out.println(july4+"만원");


        // 문제 11
        int jango = 0;
        while (true){
            System.out.println("----------------------");
            System.out.println("1:입금|2:출금|3:잔고|4:종료");
            System.out.println("----------------------");
            int menu = scan.nextInt();
            switch (menu){
                case 1:
                    System.out.print("입금액 : ");
                    int inputMoney = scan.nextInt();
                    jango += inputMoney;
                    break;
                case 2:
                    System.out.print("출금액 : ");
                    int outputMoney = scan.nextInt();
                    if(jango < outputMoney){
                        System.out.println("잔고 보다 큰 금액은 출금할수 없습니다.");
                        break;
                    }else {jango -= outputMoney;}
                    break;
                case 3:
                    System.out.println("잔고 : "+ jango);
                    break;
            }
            if (menu == 4){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

        }

    }
}
