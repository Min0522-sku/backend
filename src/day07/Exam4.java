package day07;

public class Exam4 {
    void 멤버메소드(){}
    static void 정적메소드(){}
    public static void main(String[] args) {
        /*final , 고정
        사용법: final 타입 변수명 = 초기값;
        final 변수는 초기값이 무조건 필수이다. <수정 못하니까>
*/
        //클래스 명. 정적(static) 변수 객체없이 가능
        System.out.println(D.point); //가능
        System.out.println(D.name);
        D d = new D();
        System.out.println(d.PI);

        /*
        static, 정적인
        사용법 : static 타입 변수명; , static void 메소드명(){}
        static 변수/메소드 는 프로그램 실행시 우선(메모리)할당 되고 프로그램 종료시 까지 유지
        메모리 할당된 변수/메소드 이므로 객체가 필요없다. <과도한 사용은 좋지 않다>
-> 프로그램내 공유변수, 공유 메소드에 대해서 사용, 즉] 프로그램내 1개만 존재해야하는 변수/메소드
        static 갖는 메소드는 실행문에서 일반메소드 호출이 불가능하다 <객체 필요>
*/

        //멤버메소드();// 불가능  static갖는 변수/메소드는 우선할당 이므로 객체가 아닌 멤버메소드를 모른다
        Exam4 exam4 = new Exam4();
        exam4.멤버메소드(); // 가능
        정적메소드();//가능



    }
}


class D{
    // 수정불가능한
    final double PI = 3.141592;
    // 공유 변수
    static int point;

    //공개용 상수 public static final
    public static final char name = 'A';
    // final메소드 오버라이딩/재정의 금지
    public final void method1(){}
    // static메소드 객체 유무없이 호출 가능한 메소드
    public static void mothod2(){}
}
