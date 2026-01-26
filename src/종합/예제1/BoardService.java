package 종합.예제1;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String writer1 = null;
        String writer2 = null;
        String writer3 = null;
        String content1 = null;
        String content2 = null;
        String content3 = null;

        for(;;){

            System.out.println("==========My Community==========");
            System.out.println("1.게시물 쓰기 | 2.게시물 출력");
            System.out.println("================================");
            int select = scan.nextInt();
            if(select == 1){
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();
                if(content1 == null && writer1 == null){
                    content1 = content;
                    writer1 = writer;
                    System.out.println("글쓰기 성공");
                } else if (content2 == null && writer2 == null) {
                    content2 = content;
                    writer2 = writer;
                    System.out.println("글쓰기 성공");
                } else if (content3 == null && writer3 == null) {
                    content3 = content;
                    writer3 = writer;
                    System.out.println("글쓰기 성공");
                } else {
                    System.out.println("[경고] 게시물을 등록할 공간이 없습니다.");
                }

            } else if (select == 2) {
                if(content1 != null && writer1 != null){
                    System.out.printf("작성자: %s , 내용: %s \n", writer1, content1);
                }
                if (content2 != null && writer2 != null){
                    System.out.printf("작성자: %s , 내용: %s \n", writer2, content2);
                }
                if (content3 != null && writer3 != null){
                    System.out.printf("작성자: %s , 내용: %s \n", writer3, content3);
                }

            }
        }

    }
}
