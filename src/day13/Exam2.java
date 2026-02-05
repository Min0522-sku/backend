package day13;

public class Exam2 {
    // 메소드1, throws : 해당 메소드에서 예외 발생시 메소드 호출 했던곳으로 예외 전달
    public static void  method1() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }
    public static void  method2() throws ClassNotFoundException {
        Class.forName("java.lang.String3"); // 일반예외
    }
    public static void main(String[] args) {
        //예외던지기(떠넘기기/전달) throws
        try {method1();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
