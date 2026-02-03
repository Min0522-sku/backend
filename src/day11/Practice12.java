package day11;

import java.util.ArrayList;

public class Practice12 {
    public static void main(String[] args) {
       Student student = new Student();
       student.name = "유재석";
       student.studentId = 20200865;
       System.out.println(student.name+" "+ student.studentId);

       Cat cat = new Cat();
       cat.makeSound();

       Computer computer = new Computer();

        Triangle triangle = new Triangle();
        Figure figure = triangle; // 자손에서 부모로 타입변환 가능

        Shape shape = new Circle();
        shape.draw();// 오버라이딩된 메소드가 최우선이므로 원을 그립니다가 출력된다.

        Vehicle vehicle = new Bus();
        if(vehicle instanceof Bus){
            ((Bus) vehicle).checkFare();

        }

        ArrayList<Beverage> beverages = new ArrayList<>();
        Coke coke = new Coke();
        Coffee coffee = new Coffee();
        beverages.add(coke);
        beverages.add(coffee);

        for (Beverage beverage : beverages){
            beverage.drink();
        }


        Character character = new Character();
        character.weapon = new Sword();
        character.use(character.weapon);
        character.weapon = new Gun();
        character.use(character.weapon);

        SuperClass obj = new SubClass(); // 부모클래스 타입에 자식 클래스 객체 저장
        System.out.println(obj.name); //  동일한 명의 멤버변수 존재시 현재타입 우선
        obj.method(); //오버라이딩된 메소드가 최우선적으로 실행

        Laptop laptop = new Laptop();
        System.out.println(laptop instanceof Electronic);
        System.out.println(laptop instanceof Device);
    }
}
//문제10
class Device{}
class Electronic extends Device{}
class Laptop extends Electronic{}

//문제9
class SuperClass{
    String name = "상위";
    void method(){
        System.out.println("상위 메소드 출력");
    }
}
class SubClass extends SuperClass{
    String name = "하위";

    @Override
    void method() {
        System.out.println("하위 메소드 출력");
    }
}
//문제8
class Character{
    Weapon weapon;
    void use(Weapon weapon){
        weapon.attack();
    }
}
class Weapon{
    void attack(){
        System.out.println("무기로 공격합니다.");
    }
}
class Sword extends Weapon{
    @Override
    void attack() {
        System.out.println("검으로 공격합니다.");
    }
}
class Gun extends Weapon{
    @Override
    void attack() {
        System.out.println("총으로 공격합니다.");
    }
}
//문제7
class Beverage{
    void drink(){
        System.out.println("음료를 마십니다.");
    }
}
class Coke extends Beverage{
    @Override
    void drink() {
        System.out.println("콜라를 마십니다.");
    }
}
class Coffee extends Beverage{
    @Override
    void drink() {
        System.out.println("커피를 마십니다.");
    }
}
//문제6
class Vehicle{

}
class Bus extends Vehicle{
    void checkFare(){
        System.out.println("요금을 확인합니다.");
    }
}
//문제5
class Shape{
    void draw(){
        System.out.println("도형을 그립니다.");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("원을 그립니다");
    }
}

//문제4
class  Figure{

}
class Triangle extends Figure{

}

//문제3
class Machine{
    Machine(){
        System.out.println("부모 클래스 생성자 실행");
    }
}
class Computer extends Machine{
    Computer(){
        System.out.println("자식 클래스 생성자 실행");
    }
}



//문제2
class Animal{
    void makeSound(){
        System.out.println("동물이 소물이 냅니다.");
    }
}
class Cat extends Animal{
    @Override
    void makeSound() {
        System.out.println("고양이가 야옹하고 웁니다");
    }
}
//문제1
class Person{
    String name;
}
class Student extends Person{
    int studentId;
}