package day11;

public class Exam2 {
    public static void main(String[] args) {
        System.out.println("==== [1] ====");
        A a = new A(); // 총 객체:2개 A <- Object(슈퍼클래스)

        //상속관계에서는 객체생성시 부모객체 먼저 생성한다.
        System.out.println("==== [2] ====");
        B b = new B(); // 총객체 3개 B <- A <- object
        //다입변환시 업/다운 캐스팅만 가능하다.
        System.out.println("==== [3] ====");
        C c = new C(); // 총객체 3개 C<- A<- object
        System.out.println("==== [4] ====");
        D d = new D(); //총객체 4개 D <- B <- A <- object
        E e = new E(); //총객체 4개 E <- C <- A <- object
        //즉] 자바는 상속(물려주는)관계를 메모리(저장소)로 표현한다.

        System.out.println("==== [5] ====");
        // 자동타입변환
        A a2 = b;
        Object o2 = a2;
        //B b2 = c; // 오류 c객제가 생성될때는 b는 생성되지 않는다.

        System.out.println("==== [6] ====");
        //강제 타입변환
        B b2 = (B)a2; // a2의 태생은 b객체 이므로 가능
        //C c2 =(C)a2; // 오류발생 a2의 태생은 b객체 이므로 b가 태어날때 c는 생성되지 않았다.
        System.out.println("==== [7] ====");
        //타입 확인  객체 instanceof 클래스명/타입명
        System.out.println(a instanceof Object); // true
        //a 객체가 생성될때 object가 생성되었는지 확인
        System.out.println(e instanceof A); //true
        //System.out.println(b instanceof C); //false
        System.out.println(b instanceof D); //false
        //즉] 해당객체가 생성될때 부모객체는 생성되지만 자식객체는 생성안된다. *다운캐스팅이 안되는 전제조건*
    }
}
class A{
    A(){
        System.out.println("A객체 생성");
    }
}
class B extends A{
    B(){
        System.out.println("B객체 생성");
    }
}
class C extends A{
    C(){
        System.out.println("C객체 생성");
    }
}
class D extends B{
    D(){
        System.out.println("D객체 생성");
    }
}
class E extends C{
    E(){
        System.out.println("E객체 생성");
    }
}