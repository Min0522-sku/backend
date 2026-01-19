package day01;

public class Exam3 {
    public static void main(String[] args) {
        /*
        system : 클래스 이면서 시스템(현컴퓨터) 관련 기능/함수 제공
        out : 출력에 관련된 기능/함수 갖는 객체 반환
        print : 출력함수
        */
        System.out.println("자바 안녕1"); // 자료 출력후 줄바꿈
        System.out.print("자바 안녕2"); // 자료만 출력
        System.out.printf("%s", "자바안녕3\n"); // 자료 출력 + 형식 문자
        /*
            printf(format 형식)
            %s 문자, %d, 정수, %c 문자, $f 실수
            %자릿수d 자릿수 만큼 자리 차지, 만일 비어있으면 공백, 오른쪽 정렬
            %-자릿수d 음수로 넣으면 왼쪽 정렬
            %0자릿수d 만일 비어있으면 0 으로 채움

            %전체자릿수.소숫점자릿수f   소수점 포함 전체자리수 만큼 자릿수 차지
        */
        String name = "유재석"; int age = 30;
        System.out.printf("저는"+name+"이고 나이는"+age+"입니다.\n");
        // + 로 연결
        System.out.printf("저는 %s 이고 나이는 %d 입니다.\n", name, age);
        // 변수 또는 수시깅 들어가는 자리에 형식 문자로 대체한다.
        System.out.printf("저는 %s 이고 나이는 %6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %-6d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %06d 입니다.\n", name, age);
        System.out.printf("저는 %s 이고 나이는 %3.2f 입니다.\n", name, 32.2564);


        //이스케이프/제어문자
        // \n 줄바꿈
        // \t 들여쓰기
        // \" "출력 \' '출력 \\ \출력
        System.out.println("안녕1\n 안녕2");
        System.out.println("안녕1\t 안녕2");
        System.out.println("안녕1\" 안녕2");
        System.out.println("안녕1\' 안녕2");
        System.out.println("안녕1\\ 안녕2");


    }
}
