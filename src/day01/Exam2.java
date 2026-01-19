package day01; //패키지(폴더)로써 클래스 위치한 폴더명

public class Exam2 { //class start
    //public class : 공개용 클래스 선언 뜻 갖는 키워드
    // Exam2 임의의 클래스명 정의한다. 첫글자 대문자!
        //m+엔터 : main 함수
        // 자바에서 최초의 실행 흐름(스레드)를 갖는 (미리만들어진) 함수
    public static void main(String[] args) { // main s
        System.out.println(3);
        System.out.println();  // console.log() 와 동일한 기능의 함수
        System.out.println(); //

        /*자료형 (숫자) : 쓰는 byte
         정수 :byte(1), short(2), int(4, 정수 기본), long(8)
         실수: float(소수점 8자리 표현), double(소수점 17자리 표현, 실수 기본)
        문자 : char(2, '' 작은 따움표 감싼) 문자열: String(문자열 클래스: "" 큰따움표 감싼
        논리 : boolean(1, true,false)
        */
        boolean boo1 = true; // 자료형 선언 변수명 = 값
        // boolean boo2 = 3; // 자료형에 부합하지 않는 값은 오류 발생, 저장할수 없음
        System.out.println(boo1);

        char ch1 = 'A';
        //char ch2 = 'ABC' 오류 발생 "" 저장 불가능
        System.out.println(ch1);

        String str1 = "ABC";
        System.out.println(str1);

        byte b1 = 100; // +- 127
        //byte b2 == 300; 오류

        short s1 = 32000;
        //short s2 = 40000// 오류

        int i1 =210000000; // +- 21억
        // int i2 = 3000000000 // 오류

        long l1 = 3000000000L; // 리터럴 뒤에 L/l을 붙인다
        //long l2 = 30000000000 // 불가능 키보드로 밉력한 모든 값은(리터럴) 정수가 int 라서

        float f1 = 123.12345678F; // 리터럴 뒤에 F/f를 붙인다./ 소수점 8자리까지

        double d1 = 1.123124121234; // 소수 17자리 까지 , 실수 리터럴

    }//main e
}// class e
