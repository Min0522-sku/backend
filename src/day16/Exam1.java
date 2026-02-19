package day16;

import day07.package1.B;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        // 제네릭 타입
        // 여러가지 타입에서 동작할 수 있도록 만든 타입
        // 클래스 정의할때 변수 *타입* 정하지 않고 인스턴스(객체) 생성할 때 타입을 정한다

        /*
            사용법
            제네릭타입병은 대문자로 한다.
            여러개 가능
            제네릭타입에 대입되는 타입은 기본타입 안된다 <래퍼클래스 사용>
             int -> Integer

            class 클래스명<제네릭타입1, 제네릭타입2>{
                제네릭타입1 멤버변수명;
                void 함수명(제네릭타입2 매개변수명){}
            }

        */



        Box1 box1 = new Box1(); // 인스턴스  미리 설계된(클래스) 타입으로 메모리 생성
        box1.content = "안녕하세요"; // 멤버변수에 대입
        String content1 = box1.content; // 멤버면수 값 호출

        Box2 box2 = new Box2();
        box2.content = 100;
        int content2 = box2.content;

        // box1.content = 100; 타입이 다른 멤버 변수에는 값 대입 불가능.

        // 제네릭 사용되는 상황
        Box3<String> box3 = new Box3<>();
        box3.content = "안녕"; String content3 = box3.content;
        Box3<Integer> box33 = new Box3<>();
        box33.content = 100; int content33 = box33.content;

        // ArrayList 컬렉션 프레임 워크 사용됨
        ArrayList<String> list1 = new ArrayList<>(); // ArrayList 안에서 제네릭 타입을 String으로 사용

        // 제네릭 타입 여러개
        Box4<String, Integer> box4 = new Box4<>();
        box4.value1 = "안녕"; box4.value2 = 100;

        //제네릭 타입 중첩 가능
        Box4<String, ArrayList<String>> box44 = new Box4<>();
        box44.value1 = "안녕"; box44.value2 = new ArrayList<>();

        // (5) 활용처2: 배열 -> 리스트
        내가만든리스트< String > list2 = new 내가만든리스트<>();

    }
}
class Box1{String content;}
class Box2{int content;}
class Box3<제네릭타입>{제네릭타입 content;} // 제네릭 타입 사용법
class Box4<T, E>{T value1; E value2;} // 여러개 가능
class 내가만든리스트< E > {
    E content;
    내가만든리스트(){ content = (E)new Object[10]; }
}
