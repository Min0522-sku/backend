package day01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        //입력객체
        // Scanner 클래스 : 입력받은 자료들을 특정한 타입으로 변환
        //new : 새로운 객체 생성할때 사용되는 키워드
        // (System.in) : 시스템 입력 객체를 Scanner 객체에게 전달
        // 시스템 입력 객체를 Scanner 객체에 대입하여 Scanner 객체 생성
        // Scanner 변수명 = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // 입력 함수
        // .next() : 입력받은 자료들을 문자열(String)로 반환 띄어쓰기 불가능
        System.out.println("1.next()");
        String str1 = input.next(); // 키보드로 부터 입력받고 enter시 입력 종료
        System.out.println(str1);

        // .nextLine() : 띄어쓰기 가능
        // 주의 : 띄어쓰기를 포함하다 보니 앞전에 next()와 충돌하여 하나의 next 인식이됨
        // 해결법 : 앞전에 next()가 존재하면 임의의 nextLine() 하나 더 작성
        input.nextLine();
        System.out.println("2.nextLine()");
        String str2 = input.next();
        System.out.println(str2);



        // .nextByte() 입력받은 자료를 바이트로 반환 -128~+128 이외 자료 오류 발생
        System.out.println("3.nextByte()");
        Byte b1 = input.nextByte();
        System.out.println(b1);


        // .nextShort() 입력받은 자료를 쇼트로 반환 +- 3만 이외 자료 오류 발생
        System.out.println("4.nextShort()");
        Short s1 = input.nextShort();
        System.out.println(s1);
        // .nextInt() 입력받은 자료를 인트로 반환 +- 21억 정도
        System.out.println("5.nextInt()");
        int i1 = input.nextInt();
        System.out.println(i1);

        // .nextLong()
        System.out.println("6.nextLong()");
        Long l1 = input.nextLong();
        System.out.println(l1);

        // 소수점 입력
        System.out.println("7.nextFloat()");
        float f1 = input.nextFloat();
        System.out.println(f1);
        System.out.println("8.nextDouble()");
        double d1 = input.nextDouble();
        System.out.println(d1);


        // nextBoolean()
        System.out.println("9.nextBoolean()");
        Boolean bool1 = input.nextBoolean();
        System.out.println(bool1);


        // .next().charAt(0) 입력받은 자료에서 첫번째 글자 반환, char 문자 스캔은 없다.
        System.out.println("10.next().charAt(0)");
        char c1 = input.next().charAt(0);
        System.out.println(c1);

    }
}
