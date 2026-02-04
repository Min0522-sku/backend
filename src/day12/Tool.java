package day12;

public class Tool implements Testinterface{
    @Override public void method1(){
         System.out.println("해당 메소드 구현");
     }

    @Override
    public void method2(int x) {
        System.out.println("해당 메소드 구현" +x);
    }
}
