package day12;

public class Practice13 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Soundable soundable = cat;
        soundable.makeSound(); // 야옹
        soundable = dog;
        soundable.makeSound(); // 멍멍
        System.out.println(RemoteControl.MAX_VOLUME);
        System.out.println(RemoteControl.MIN_VOLUME);
        Runnable runner = new Person();
        runner.run();
        runner = new Car();
        runner.run();
        Sword sword = new Sword();
        Gun gun = new Gun();
        Character character = new Character();
        character.attack = sword;
        character.useWeapon(sword);
        character.attack = gun;
        character.useWeapon(gun);

        Duck duck = new Duck();
        duck.fly();
        duck.swimmable();
        Object obj = new Duck();
        if(obj instanceof Flyable){
            ((Flyable) obj).fly();
        } else if (obj instanceof  Swimmable) {
            ((Swimmable) obj).swimmable();
        }

        DataAccessObject dao = new OracleDao();
        dao.save();
        dao = new MySqlDao();
        dao.save();
        Greeting greeting = new Greeting() {
            @Override
            public void welcome() {
                System.out.println("환영합니다");
            }
        };
        greeting.welcome();

        Television tv = new Television();
        tv.turnOn();
        tv.turnOff();
        tv.setMute(true);
        System.out.println( Calculator.plus(10,20));
    }
}
//문제10
interface Calculator{
    static int plus(int x, int y){
        return x+y;
    }
}
//문제9
interface Device{
    void turnOn();
    void turnOff();
    public default void setMute(boolean mute){
        System.out.println("무음 처리");
    }
}class Television implements Device{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}

//문제8
interface Greeting{
    void welcome();
}
//문제7
interface DataAccessObject{
    void save();
}
class OracleDao implements DataAccessObject{
    @Override
    public void save() {
        System.out.println("오라클에 저장");
    }
}
class MySqlDao implements DataAccessObject{
    @Override
    public void save() {
        System.out.println("SQL에 저장");
    }
}
//문제5
interface Flyable{
    public abstract void fly();
}
interface Swimmable{
    public abstract void swimmable();
}
class Duck implements Flyable, Swimmable{
    @Override
    public void fly() {
        System.out.println("날다");
    }

    @Override
    public void swimmable() {
        System.out.println("수영");
    }
}
//문제4
class  Character{
    Attackable attack;
    void useWeapon(Attackable weapon){
        this.attack.attack();
    }
}
interface Attackable{
    void attack();
}
class Sword implements  Attackable{
    @Override
    public void attack() {
        System.out.println("스겅");
    }
}
class Gun implements Attackable{
    @Override
    public void attack() {
        System.out.println("탕");
    }
}
//문제3
interface Runnable{
    void run();
}
class Person implements Runnable{
    @Override
    public void run() {
        System.out.println("사람이 달립니다");
    }
}
class Car implements Runnable{
    @Override
    public void run() {
        System.out.println("자동차가 달립니다");
    }
}
//문제2
interface RemoteControl {
    public static final int MAX_VOLUME =10;
    public static final int MIN_VOLUME =0;
}
//문제 1
interface Soundable{
   public abstract void makeSound();
}
class Cat implements Soundable{
    @Override
    public void makeSound() {
        System.out.println("야옹");
    }
}
class Dog implements Soundable{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}