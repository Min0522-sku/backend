package day06.jonghap;
import java.util.Scanner;

public class WaitingService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        WaitingController controller = new WaitingController();
        for (; ; ) {

            System.out.println("==========맛집 대기 시스템==========");
            System.out.println("1.대기 등록 | 2.대기 현황");
            System.out.println("================================");
            int ch = scan.nextInt();
            if (ch == 1) {
                scan.nextLine();
                System.out.print("전화번호 : ");
                String phone = scan.nextLine();
                System.out.print("인원수 : ");
                int count  = scan.nextInt();
                if (controller.addWaiting(phone, count)){
                    System.out.println("[안내]대기 등록이 완료되었습니다.");
                }else {
                    System.out.println("[경고]더 이상 대기 등록을 할 수 없습니다.");
                }
            }else if (ch == 2) {
                Waiting[] waiting = controller.getWaitingList();
                System.out.println("==========대기 현황==========");
                for (int i = 0; i < waiting.length; i++) {
                    if (waiting[i] != null) {
                        System.out.printf("%d. 연락처: %s -인원: %d \n", i+1, waiting[i].phone, waiting[i].count);
                        System.out.println("_______________________________");
                    }
                }
            }
        }
    }
}
