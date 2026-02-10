package day14;

import 종합.예제7.dto.BoardDto;

import java.lang.constant.Constable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exam1 {
    public static void main(String[] args) {
        /*
        *참조*타입 : String, Scanner, MemberDto, [ ] 등등 기본타입 외 모두
         - 기본타입 외 모두 참조타입이다.  배열, 클래스, 인터페이스
         - 대문자 시작ㅎ나다.
         - 기본 타입 외 개발자가 새로운 타입 만드는 행위, 예] int/double 2개 갖는 타입
         */
        // 자바 회사에서 제공하는 기본 클래스 들
        // Object : 자바에서 최상위 클래스 이면서 모든 클래스는 Object로 부터 상속받는다.
        Object o1 = 3;
        Object o2 = 3.14;
        Object o3 = true;
        Object o4 = "문자";
        Object o5 = new Object();
        Object o6 = new int[3];
        Object o7 = new BoardDto(); // 예제 7에서 가져온 dto
        // 즉 모든 자료들은 객체 포함 Object 로 타입변환(다형성)가능
        // toString() : 인스턴스/자료 주소값(메모리위치) 반환 함수
        System.out.println(o6.toString()); // 이와 같이 할당된 주소값(개발자가 제어 불가)
        System.out.println(o7.toString()); // 이와같이 toString 오버라이딩 한 객체는 문자열 출력

        // .equals() 주소가 참조하는 객체 비교 vs  == 주소가 갖는 주소(위치) 또는 리터럴 비교
        Object o8 = new BoardDto();
        Object o9 = new BoardDto();
        System.out.println( o8 == o9); // false
        System.out.println( o8.equals(o9)); // false
        Object o10 = o9; // 객체 참조 복사/복재
        System.out.println(o10 == o9); //true
        String str1 = new String("유재석");
        String str2 = new String("유재석");
        System.out.println(str1 == str2); // false : 서로 다른 객체가 같은 문자열을 갖는다
        System.out.println(str1.equals(str2)); //true : 서로 다른 객체내 문자열 비교

        // .hashCode() : 객체를 식별하는 값을 정수로 반환
        System.out.println(str1.hashCode()); // 1과2 같음
        System.out.println(str2.hashCode());
        System.out.println(o10.hashCode());// 10과 9 같음
        System.out.println(o9.hashCode());


        // Class : 클래스 정보(멤버변수/멤소드 등등) 담는 클래스
        String obj1 = new String();
        Class c1 = obj1.getClass();
        System.out.println(c1); // class java.lang.String

        Integer obj2 = 3;
        Class c2 = obj2.getClass();
        System.out.println(c2); // class java.lang.Integer

        //2 Class.forName("패키지명.클래스명") , 일반예외
        // *** 리플렉션 *** 최초 실행(컴파일) 할때 객체 생성하지 않고 실행 도중에 객체 생성 = 동적처리
        // 사용처 : JDBC(DB 연동), 스프링프레임워크(자바플랫폼) = 외부 라이브러리 동적 객체 생성
        try{Class.forName("java.lang.String"); // String 클래스가 존재하면 객체가 동적으로 생성된다.
        }catch (ClassNotFoundException e){}


        Field[ ] fields = c1.getFields(); // 객체내 모든 멤버변수/속성/필드 명 확인 (*private 제외)
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i]);
        }


        Constructor[ ] constructors = c1.getConstructors(); // 클래스내 모든 생성자 확인(매개변수 확인)
        for(int i = 0; i< constructors.length; i++){
            System.out.println(constructors[i]); //15개 오버로딩 이용한 다수의 생성자
        }

        Method[] methods = c1.getMethods(); // 클래스내 모든 메소드 확인
        for(int i = 0; i< methods.length; i++){
            System.out.println(methods[i]);
        }




        // 3 래퍼 클래스 : 기본타입 --> 참조타입 표현, 장점: 기본타입은 메소드(기능) 없다.
        int value1 = 100; // 자료는 100, 분류/타입 : int
        //System.out.println(value1.toString());
        Integer value2 = 100; // 자료는 100, 분류/타입 : Integer
        System.out.println(value2.toString()); // Integer 참조 타입으로 기능(메소드) 이 있다.

        // 언박싱 과 오토박싱
        int value3 = value2; // Integer -> int 언박싱, 참조타입 --> 기본타입
        Integer value4 = value1; // int --> Integer 오토박싱, 기본타입 --> 참조타입


        // 자바에서 외부자료들과 자료들을 주고받을때 타입변환( 엑셀/CSV/공공데이터API/JS통신/PYTHON통신)
        int val1 = Integer.parseInt("100"); // 문자열 -> 정수
        double val2 = Double.parseDouble("3.14"); // 문자열 -> 실수
        float val3 = Float.parseFloat("3.14"); // 문자열 -> 실수
        boolean val4 = Boolean.parseBoolean("true"); // 문자열 -> 논리

        //기본타입 --> 문자열
        String s1 = 100+""; // 기본타입자료+"" 100 -> "100"
        String s2 = String.valueOf(100); // 100 -> "100"




    }
}
