package day14;

import 종합.예제7.dto.BoardDto;

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


    }
}
