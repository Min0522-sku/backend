package day16;

import java.util.*;

public class Exam4 {
    public static void main(String[] args) {
        // Map 인터페이스 저장된 순서(인덱스) 없이 key와 value로 entry(한쌍)를 저장하는 구조
        // Map<KeyType, ValueType>
        Map<String, Integer> map1 = new HashMap<>();

        // .put(key, value) : 엔트리(key : value) 추가, key 는 중복 불가능 value는 중복 가능
        map1.put("유재석", 95);
        map1.put("유재석", 100); // key는 중복 불가능
        map1.put("강호동", 95);
        // .get(key) : 특정한 key의 value 반환
        System.out.println("map1.get(\"강호동\") = " + map1.get("강호동"));
        System.out.println("map1 = " + map1);
        // .size() : 전체 엔트리 개수 반환
        System.out.println("map1.size() = " + map1.size());
        // .containsKey , .containsValue 존재하면 true 아니면 false
        System.out.println(map1.containsKey("유재석"));
        System.out.println(map1.containsValue(100));
        // .remove(삭제할 키) : 특정한 키가 존재하면 엔트리 삭제
        map1.remove("유재석");
        // .clear() 전체 엔트리 삭제
        //map1.clear();
        // .isEmpty() 엔트리가 하나도 없으면 true 있으면 false
        // .entrySet() 모든 엔트리를 집합(Set) 반환, .keySet() 모든 키를  집합(Set)반환, .values() 모든 값 들을 컬렉션 반환
        Set<Map.Entry<String, Integer>> set = map1.entrySet();
        Set<String> keys = map1.keySet();
        Collection<Integer> values = map1.values();

        // map 타입과 반복문 관계
        // 일반 for문 불가능
        // 향상된  for 문
        for(String key : map1.keySet()){
            System.out.println(map1.get(key));
        }
        // forEach문
        map1.keySet().forEach((key)->{System.out.println(map1.get(key));});


        // map 구현체
        Map<String, Object> map;
        map = new HashMap<>(); // 싱글스레드
        map = new Hashtable<>(); // 멀티스레드 + 동기화
        map = new TreeMap<>(); // 이진트리(정렬)
        Properties properties = new Properties(); // +Hashtable 하위 클래스 + 프로젝트 설정값 파일 // 구현체는 아님


    }
}
