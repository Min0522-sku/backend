package day12;

public class Exam3 {
    public static void main(String[] args) {
        Buy buy = new Customer();
        buy.method1(); // 추상메소드 호출 가능
        //buy.method6(); //불가능
        buy.method2(2); // 디폴트 메소드 실행 가능
        Buy.method3(); // static 정적 메소드 실행 가능
        //Buy.method4(); // private 메소드 실행 불가능

        //Sell sell = buy; //불가능
        Customer customer = (Customer)buy;
        Sell sell = customer;
        sell.method6();


    }
}

interface Buy{
    //추상메소드
    public abstract void method1();
    // 디폴트메소드 : 인터페이스가 구현한 메소드
    public default int method2(int x){return x;}
    // 정적메소드 : 인터페이스내 정적 구현 메소드
    public static void method3(){
        System.out.println("정적 구현 메소드");
    }
    // private 메소드 : 현재 인터페이스내에서 사용되는 메소드 (오버라이딩 안됨)
    private void method4(){}
    private static void method5(){}
}
interface Sell{ void method6();}

class Customer extends Object implements Buy,Sell{ // 상속은 1개의 클래스 가능 구현은 여러개 인터페이스 가능
    // extends 은 오버라이딩 선택! , implements 은 오버라이딩 (추상메소드)필수!!
    // 오른쪽클릭 -> 생성 -> 메서드 재정의

    @Override
    public void method6() {
        System.out.println("판매");
    }

    @Override
    public void method1() {
        System.out.println("구매");
    }
}