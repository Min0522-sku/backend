package day16;

import java.util.*;

public class Exam2 {
    public static void main(String[] args) {
        // [1] 컬렉션(수집) 프레임(틀) 워크(일)
        // 1.정의 : 자료들을 수집/저장 하는 방법들을 미리 만들어둔 인터페이스/클래스
        // 2.목적 : 복잡한 자료구조를 제공받아 편리한 데이터 관리
        // 자료구조란? 컴퓨터가 자료들을 효율적으로 저장하는 방법/구조 , ex] 리스트/해시/큐/스택/트리 등등
        // 3. 종류 : 인터페이스란? 서로 다른 클래스/타입 들을 기능 통합
        /*
                인터페이스       구현체
                List            ArrayList, Vector, LinkedList, Stack 등
                Set             HashSet , TreeSet 등
                Map             HashMap , HashTable, TreeMap 등
         */
        // [2] List 타입
        ArrayList< String > list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        // List 주요 메소드
        // .add()
        list2.add("유재석");
        list2.add("유재석");
        list2.add(0, "강호동");
        // .set()
        list2.set(1, "신동엽");
        // .get()
        System.out.println(list2.get(0));
        // .size
        System.out.println(list2.size());
        // .contains,  indexOf()
        boolean result1 = list2.contains("유재석");

        // .remove()

        // .isEmpty()

        // .clear


        // List 타입과 반복문
        // 일반 for 문
        for(int i = 0; i <= list2.size()-1; i++){
            System.out.println(list2.get(i));
        }
        // 향상된 for문
        for (String str : list2){
            System.out.println(str);
        }
        // *forEach 문*
        // 변수명.forEach((반복변수) -> {실행문;});
        list2.forEach((str)->{System.out.println(str);});


        // List 구현체들, 구현체란? 인터페이스의 추상메소드를 구현(오버라이딩)한 클래스/객체
        List<Integer> list; // 인터페이스 타입

        //공통 : 여러 요소(값)들을 순서대로(인덱스) 저장하는  <배열> 구조
        list = new ArrayList<>();// *싱글스레드 사용 , 비동기화 메소드
        list.add(0, 50);
        list = new Vector<>(); // *멀티스레드 사용, 동기화(synchronized) 메소드
        list = new LinkedList<>(); // *싱글스레드 사용, + <링크> 구조
        list.add(0,100);
        // ArrayList 중간 삽입/삭제 시 다른 데이터들의 이동 발생
        // vs
        // LinkedList 중간 삽입/삭제 시 다른 데이터들의 이동 발생 안함
        list = new Stack<>();
        Stack<String> stack = new Stack<>();
        stack.push("강호동");
        stack.push("유재석");
        stack.pop();
        System.out.println(stack.pop());
        // Stack 자료 구조 LIFO 입구와 출구가 하나라서 먼저 들어온 값이 나중에 나간다.


        //

    }
}
