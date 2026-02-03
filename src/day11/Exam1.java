package day11;

public class Exam1 {
    public static void main(String[] args) {
        /* 상속 : 클래스로 부터 다른 클래스 에게 물려주는 행위
A클래스 로 부터 B클래스에게 (맴버변수/메소드) 물려주는 행위
목적: 빠른클래스 설계, 한번 만들어둔 클래스 재사용/활용 한다.
키워드: extends
장점: 유지보수, 계층관계표현, 재사용, **다형성** */

        동물 animal1 = new 동물(); // 동물객체
        animal1.name ="강아지";
        animal1.show();
        조류 bird1 = new 조류();
        bird1.name = "참새"; // 조류클래스에는 없지만 물려받은 멤버변수
        bird1.show(); // 물려받은 메소드
        비둘기 be1 = new 비둘기();
        be1.name = "비둘기1";
        be1.show();
        닭 ch = new 닭();
        ch.name = "닭1";
        ch.show();
        조류 bird2 = be1;// 자동 타입변환, 업캐스팅, 묵시적타입변환 비둘기가 조류가됨
        동물 animal2 = bird2; // 조류(비둘기)가 동물로 타입변환
        animal2.show(); // 객체 본질은 그대로
        비둘기 be3 = (비둘기)animal2; // 강제타입변환,다운캐스팅,명시적타입변환
        be3.show();
        System.out.println(be1);
        System.out.println(be3);

        //동물이 닭으로 타입변환
        닭 ch2 = (닭)animal1;// 태생이 동물이므로 조류 또는 닭/비둘기 타입변환 불가능
        // ch2.show(); // 오류발생
        //비둘기로 생성한 객체: 비둘기->조류->동물, 동물->조류->비둘기
        //조류로 생성한 객체는 : 조류->동물, 동물->조류
        //닭 ch3 = be1; //오류발생 //형제관계도 타입변환 불가능
    }
}

class 동물{
    String name;
    void show(){
        System.out.println("동물.show");
        System.out.println(name);
    }
}
class 조류 extends 동물{}// 조류 클래스는 동물 클래스로부터 상속받는다.
class 비둘기 extends 조류{}// 참새클래스는 조류 클래스로부터 상속받는다.
class 닭 extends 조류{}