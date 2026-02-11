package day15;

import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Practice15 {
    public static void main(String[] args) {
        Object obj1 = new BookDto();
        Object obj2 = new BoardDto();
        System.out.printf("obj1 = %s obj2 = %s\n", obj1, obj2);

        Object obj3 = new String("유재석");
        Object obj4 = new String("유재석");
        System.out.println(obj3==obj4);
        System.out.println(obj3.equals(obj4));


        try {
            Object obj5 = new String();
            Class c2 = Class.forName("java.lang.String");
            Method[] c3 = c2.getMethods();
            System.out.println(obj5.getClass()+" | forName :"+ c2 +" | method count:"+c3.length);
        } catch (ClassNotFoundException e) {
        }

        int int1 = Integer.parseInt("100");
        Double dou1 = Double.parseDouble("3.14");
        String str1 = int1+"";
        String str2 = dou1+"";
        System.out.printf("int:%d, double: %f, str1: \"%s\", str2: \"%s\"\n", int1, dou1, str1, str2);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
        System.out.println("현재: "+localDateTime.format(formatter) +" | +10일: "+localDateTime.plusDays(10) +" | -30일: "+localDateTime.minusDays(30));
    }
}

class BookDto{

}
class BoardDto{
    @Override
    public String toString() {
        return "BoardDto{}";
    }
}