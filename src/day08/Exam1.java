package day08;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {


        //ArrayList 클래스 : 컬렉션(수집)프레임(틀)워크(일) -> 수집 관련 클래스/기능 제공
    //정의: 컬렉션프레임워크 중 리스트(배열) 자료형 클래스/타입
    //목적 : 가변(변하는 요소들의수) 길이 의 배열 제공과 기능/메소드 제공 <편하다>
    //사용법
    //선언/정의 하기 : ArrayList<항목타입> 변수명 = new ArrayList()<>;
    //<>는 제네릭 타입으로 리스트 안에 저장할 항목들의 타입
    // 제네릭타입은 기본타입 불가능하므로 int -> Integer 클래스 변경해서 작성(8개타입)
        ArrayList<String> 리스트변수명 = new ArrayList<>(); // 여러개 String 객체를 저장하는 리스트
    //vs String[] 변수명 = new String[100];

    //요소 추가 : .add(새로운값); 마지막 빈 요소에 자료 추가
        리스트변수명.add("유재석"); // [유재석]
    //요소들 전체 출력 : 리스트변수명
        System.out.println(리스트변수명);
        리스트변수명.add("강호동");
        리스트변수명.add("신동엽");
        System.out.println(리스트변수명); //[유재석, 강호동, 신동엽]
    // 요소 중간 삽입 : .add(인덱스, 새로운값); 특정 인덱스에 자료추가
        리스트변수명.add(1, "서장훈");
        System.out.println(리스트변수명); // [유재석,서장훈,강호동,신동엽]
        //요소 수정: .set(인덱스, 새로운값); 특정한 인덱스의 자료수정
        리스트변수명.set(1, "박명수"); System.out.println(리스트변수명);
        //요소 총개수 : .size() : 리스트내 항목/요소/값 들의 총개수 반환
        System.out.println(리스트변수명.size());
        //요소 수정: .set(인덱스, 새로운값); 특정한 인덱스의 자료수정
        리스트변수명.set(1, "박명수"); System.out.println(리스트변수명);
    // 요소 값 호출 : .get(인덱스) 특정한 인덱스의 요소값 반환
        System.out.println(리스트변수명.get(0)); // 유재석

        for(int i = 0; i < 리스트변수명.size(); i++){
            System.out.println("리스트변수명.get(i) = " + 리스트변수명.get(i));
        }
        for(String str : 리스트변수명){
            System.out.println("str = " + str);
        }

        //요소 전체 삭제: .clear();
        리스트변수명.clear();
        //요소 존재 여부: .isEmpty(); 리스트내 요소가 하나도 없으면 true 있으면 false
        System.out.println(리스트변수명.isEmpty());
    }
}
