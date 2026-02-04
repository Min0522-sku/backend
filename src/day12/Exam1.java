package day12;

public class Exam1 {
    public static void main(String[] args) {
        /*
         인터페이스 정의 : 서로 다른 시스템이나 장치 사이에서 정보를 주고 받는 접점/경계
         생활속 예시: 리모콘 키오스크 키보드 휴대폰
         목적: **동일한 목적으로 서로 다르게 작동** , 함수/메소드 = 상호작용 = 매개변수/리턴
         ->상호작용 약속
         특징 : 객체의 호완성을 높이고 다형성 구현, 서로다른 클래스들 사이에 중간 매개 역할
          //자바 회사에서 먼저 상속(오버라이딩) 개발 했더니 다형성 중요성 커져서 오버라이딩 전용

         */
        // 인터페이스 사용법 : 인터페이스는 자체적으로 객체 생성이 불가능하다. == 생성자 없어서
        // class 클래스명 implement 인터페이스명{}
        // 인터페이스를 구현 해준 클래스의 객체 = 구현(객)체

        // 추상 메소드
        // public abstract 반환타입 메소드명(타엡 매개변수);
        // 메소드 선언부만 존재하며 {} 구현부가 없다.
        // implements 하는 클래스내에서 추상메소드 오버라이딩/재정의
        Testinterface testinterface = new Tool();
        testinterface.method1();
        // 상수 호출 가능
        System.out.println(testinterface.b);



        // implement vs extends

    }
}
