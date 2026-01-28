package day07;

public class Phone {
    //1. 멤버변수 - 속성
    String model;
    String color;
    int price;

    //2. 생성자
    Phone(){
        System.out.println("-> Phone 기본 생성자 실행");
    }
    Phone(String model, String color){
        this.model = model;
        this.color = color;
    }

    Phone(String model, String color, int price){
        this.model = model;
        this.color = color;
        this.price = (int)(price*0.8);
    }
    //3. 메소드- 멤버함수
}
