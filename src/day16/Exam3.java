package day16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {
        // Set 인터페이스, 순서(인덱스) 없는 저장 -> 중복 불가능
        Set<String> set1 = new HashSet<>();

        // Set 주요메소드
        set1.add("유재석");
        set1.add("유재석"); // 중복 안됨
        set1.add("강호동");
        System.out.println("set1 = " + set1);
        // 인덱스가 업으므로  set, get, indexof 메소드 없음
        System.out.println(set1.size());
        boolean result1 = set1.contains("유재석");
        set1.remove("유재석");
        System.out.println(set1.isEmpty());
        // .clear()

        // .iterator() : 집합set 요소들을 반복할 수 있도록 인터페이스 반환
        Iterator<String> iterator = set1.iterator();
        while (iterator.hasNext()){ // .hasNext() 다음 요소가 존재하면 true 없으면 false 반환
            System.out.println( iterator.next()); // 다음요소(값) 반환
        }

        //집합 SET 과 FOR 문 관계
        // 일반 for 문 불가능
        // 향상된 for
        for (String str : set1){
            System.out.println(str);
        }
        //forEach
        set1.forEach((str) -> {System.out.println(str);});


        // Set 인터페이스
        Set<Integer> set2;
        set2 = new HashSet<>();
        TreeSet<Integer> set3;
        set3 = new TreeSet<>();
        set3.add(50); set3.add (30); set3.add(45);
        System.out.println("set3 = " + set3); // TreeSet 자동 정렬

        // 이진 트리란? 각자의 노드(값)이 최대 2개의 노드(값) 연결 하는 구조
        // 작은 값이 추가되면 왼쪽 노드에 추가, 큰값이 오른쪽 노드에 추가 구조
        // 기본값은 오츰차순 .descendingSet() 내림차순
        System.out.println(set3.descendingSet());
        // 활용처 정렬(검색 최적화)

        //컬렉션프레임워크: 자료구조 기반으로 인터페이스/클래스 (기능) 만듬
        // 자료구조: 스택/이진트리/리스트


    }
}
