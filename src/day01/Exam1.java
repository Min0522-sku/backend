// 주석
/* 여러줄 주석 */
package day01;

public class Exam1 {
    //public : 공개용
    // class : 자바는 코드의 최소 실행단위, 즉 자바는 클래스가 필수이다.
    // Exam1 :  클래스 명은 무조건 첫글자를 대문자
    // { : 클래스 내부시작
    // } :  클래스 내부 종료, 즉 { }밖에서 작성한 코드는 실행 안됨/
    int a = 10; // 세미콜론 필수
    //System.out.print("안녕");// 출력 함수 안됨;
    public static void main(String[] args) {
        System.out.println("안녕"); // sout+엔터 자동완성
    } // main end
} // class end
// int a = 10;  {} 클래스 밖에서 코드 작성 안됨
