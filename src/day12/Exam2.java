package day12;

public class Exam2 {
    public static void main(String[] args) {
        // 인터페이스 타입은 객체 생성 불가능하다
        // new 키보드(); // 인터페이스 타입은 생성자가 없다.
        키보드 myKeyBorad; // 인터페이스 타입의 변수 선언
        // myKeyBorad.aKey(); //추상메소드는 실행 안된다.

        // 추상메소드 구현하기 = 클래스에서 오버라이딩
        myKeyBorad = new 격투게임();
        myKeyBorad.aKey(); // 공격
        myKeyBorad.bKey(3,2);
        //다형성 - 게임교체
        myKeyBorad = new 축구게임();
        myKeyBorad.aKey(); // 슈팅
        myKeyBorad.bKey(2,4);


        //구현체 없이 자체적으로 구현 == 익명(이름없는)구현체
        myKeyBorad = new 키보드(){
            @Override
            public void aKey() {
                System.out.println("공부하기");
            }

            @Override
            public int bKey(int x, int y) {
                System.out.println("공부하기");
                return x + y;
            }
        };

        myKeyBorad.aKey(); // 밥먹기

    }

}

class 격투게임 implements 키보드{
    @Override
    public void aKey() {
        System.out.println("[공격]");
    }

    @Override
    public int bKey(int x, int y) {
        System.out.println("[방어]");
        return x+y;
    }
}
class 축구게임 implements 키보드{
    @Override
    public void aKey() {
        System.out.println("[슈팅]");
    }

    @Override
    public int bKey(int x, int y) {
        System.out.println("[태클]");
        return (x+y);
    }
}