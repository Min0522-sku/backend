package 종합.예제2;

import java.util.Scanner;

public class BoardService {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] contents = new String[2];
        String[] writers = new String[2];

        for(;;){

            System.out.println("==========My Community==========");
            System.out.println("1.게시물 쓰기 | 2.게시물 출력");
            System.out.println("================================");
            int ch = scan.nextInt();
            if (ch == 1){
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();
                if(contents[contents.length-1] !=null){
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다.");
                }
                for (int i = 0; i < contents.length; i++){
                    if(contents[i] == null){
                        contents[i] = content;
                        writers[i] = writer;
                        break;
                    }
                }
            } else if (ch == 2) {
                for (int i = 0; i < contents.length; i++){
                    if(contents[i] != null){
                        System.out.printf("작성자: %s , 내용: %s \n", writers[i], contents[i]);
                    }
                }

            }
        }
    }
}
