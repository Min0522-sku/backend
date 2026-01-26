package day05;

public class Exam2 {
    public static void main(String[] args) {
        /*
        객체 종류: 속성(값/의사) , 함수(기능/행위) 정의 가능한것들
        사람(물), 주문(논), 안경, 공기, 강의 등등
        객체 지향 프로그래밍: 개발자(주체)가 컴퓨터 안에서 (객체)대상 만들기
        객체 정의는 '클래스' 라는 설계도 에서 속성과 기능 코드로 정의한다.

        자바의 모든 코드는 클래스 단위로 컴파일/번역(코드->기계어) 한다.

        클래스 용도
        실행용도로써 main 함수를 갖는 클래스
        객체 설계 용도 로써 main 함수 없고 맴버변서/함수 를 갖는 클래스

        예시
        학생객체 설계: 1)속성 : 한번,이름,전화번호등 2)기능: 밥먺기(),공부하기(),잠자기() 등
        학생 객체 만들기: 1)클래스 만들기 2) 객체 생성 3) 객체 사용
        1. new; : 인스턴스화, 인스턴스를 만드는 키워드
        2. new 클래스명();  : 생성자, new 뒤로 생성자 = 클래스명 동일하며 () 인자값을 가질수 있음
        3. 클래스명 변수명 = new 클래스명(); : 동일한 클래스/타입 명으로 변수 선언하여 저장한다.
        */
        Student s1 = new Student();
        /*
        객체 사용
        객체 변수명.맴버변수 : 호출
        객체변수명.맴버변수 = 새로운값 :수정
        */
        // 맴버변수와 배열은 초기값 존재

        System.out.println("s1.studentID = "+s1.studentID); // 0
        System.out.println("s1.studentName = "+s1.studentName); // null
        s1.studentID =10;
        s1.studentName = "유재석";
        System.out.println("s1.studentId = " + s1.studentID);
        System.out.println("s1.studentName = " + s1.studentName);

        //예시2 붕어빵 객체 설계 속성) 내용물 가격 등등 2)굽기(),뒤집기() 등등
        // bong.java
        Bong 붕어빵1 = new Bong();
        붕어빵1.내용물 = "팥";
        붕어빵1.가격 = 1000;
        System.out.println("붕어빵1 = " + 붕어빵1);
        Bong 붕어빵2 = new Bong();
        붕어빵2.내용물 = "슈크림";
        붕어빵2.가격 = 1000;
        System.out.println("붕어빵2 = " + 붕어빵2);
        // 동일한 클래스는 1개이고 두개의 붕어빵(객체)은 서로 다르다.
        //동일한 객체 타입/클래스 를 여러개 저장한다 -> 배열
        Bong[] 붕어빵봉지 = {붕어빵1, 붕어빵2};







    }
}

//클래스 밖에서 또 다른 클래스 만들기 지금 현재 코드 작성하는 파일은  .class 파일이 아닌  .java 파일이다.
//즉 .java 파일에는 여러개 class 가 존재할수 있다.
class Student{ // 클래스명{}
    int studentID; // 학생번호 속성 / 맴버변수 정의 = 객체의 본질/특징/성질/값
    String studentName; // 학생명 속성
}// 설계도 단점: 복잡도 크다, 장점: 재사용이 빠르다.
