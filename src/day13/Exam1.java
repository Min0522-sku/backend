package day13;

public class Exam1 {
    public static void main(String[] args) {
        //예외 처리 : 개발자가 구현한 로직이나 사용자의 영향으로 문제
        //  -> 시스템오류 : 시스템이 종료되는 심각한 문제
        // 예외 종류
        // 일반 예외 : 컴파일(실행전) 될때 예외 처리 코드 검사
            // 입출력, 네트워크, 파일, JDBC(DB연동)등 주로 외부와통신
        // 실행 예외 : 실행 도중에 발생하는 예외 처리 코드 검사(개발자 예측/경험 의존도 큼)
            // 연산문제, null, index 등 주로 코드적인문제, 타입문제

        // 목적 : 예외를 고치는게 아닌 예외가 발생하면 피해서 다른 코드로 이동, 즉 24시간 코드실행

        // 사용법:
            // trt{예외가 발생 하거나 발생할것같은 코드}
            // catch(발생한예외클래스명 변수명){만약에 예외발생 했을때 처리할 코드}
        // 주요 예외 클래스
        // 1. ClassNotFoundException : 클래스를 못 찾았을때 발생하는 예외 클래스
        // 2. InterruptedException : 흐름(스레드)가 중단 되었을때 발생하는 예외 클래스
        // 3. NullPointerException : 객체가 null일때 (.)접근연산자 사용시 발생하는 예외 클래스

        //일반예외 예시1 Class.forName("패키지명.클래스명"); : 현재 프로젝트내 클래스가 존재하는지 검사/동적할당
        try {
            Class.forName("java.lang.String"); // String 클래스가 존재하는지 확인
        }catch (ClassNotFoundException e1){
            System.out.println("예외 발생1: String 클래스가 없습니다.");
        }
        //일반예외 예시2 Thread.sleep(밀리초) : 현재 흐름(스레드) 일시정지 메소드
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e2){
            System.out.println("예외 발생2 : 스레드 중단 발생 했습니다.");
        }

        //일반예외 클래스들은 실행 전에 코드 밑줄에 빨강색으로 예외 발생 가이드 라인 해준다.

        //실행예외 예시3

        try {
            String name = null;
            System.out.println(name.length()); // . 접근연산자는 객체가 존재 해야만 가능하다.
        }catch (NullPointerException e3){
            System.out.println("예외 발생3 : null은 메소드를 호출 할 수 없다.");
        }

        //실행예외 예시4
        String str1 = "100";
        int int1 =Integer.parseInt(str1); // Integer.parseInt(문자열) : 문자열 -> 정수타입 변환 메소드
         // 가능

        try{
            String str2 = "1abc";
            int int2 = Integer.parseInt(str2); // NumberFormatException
        }catch (NullPointerException e4){
            System.out.println("예외 발생4 : 정수타입으로 변환 불가능하다.");
        }


    }
}
