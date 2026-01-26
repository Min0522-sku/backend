package day05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        book1.title = "이것이 자바다";
        book1.author = "신용권";
        book1.price = 30000;
        book2.title = "자바의 정석";
        book2.author = "남궁성";
        book2.price = 28000;
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.price);
        System.out.println(book2.title);
        System.out.println(book2.author);
        System.out.println(book2.price);
        System.out.println(book1);
        System.out.println(book2);

        //문제 2
        Pet pet1 = new Pet();
        Pet pet2 = new Pet();
        pet1.name ="초코";
        pet1.species = "푸들";
        pet1.age =3;
        pet2.name ="나비";
        pet2.species = "코리안숏헤어";
        pet2.age =5;
        System.out.printf("이름: %s, 종류: %s 나이: %d살\n", pet1.name, pet1.species, pet1.age);
        System.out.printf("이름: %s, 종류: %s 나이: %d살\n", pet2.name, pet2.species, pet2.age);

        //문제 3
        Rectangle rect = new Rectangle();
        rect.width = 10;
        rect.height = 5;
        System.out.printf("사각형의 넓이: %d\n",rect.width* rect.height);

        // 문제4
        BankAccount bank = new BankAccount();
        bank.accountNumber = "111-222-3333";
        bank.ownerName = "유재석";
        bank.balance = 10000;
        bank.balance += 5000;
        System.out.println("입금후 잔액: "+bank.balance);
        bank.balance -= 3000;
        System.out.println("출금후 잔액: "+bank.balance);

        //문제5
        Product pro1 = new Product();
        Product pro2 = new Product();
        pro1.name = "새우깡";
        pro1.price = 1500;
        pro2.name = "콜라";
        pro2.price = 2000;
        if (pro1.price < pro2.price){
            System.out.println(pro2.name+"이 더 비쌉니다");
        } else {
            System.out.println(pro1.name+"이 더 비쌉니다");
        }

        // 문제 6
        Member member = new Member();
        member.id = "admin";
        member.isLogin =false;
        System.out.println("로그인 전 상태: "+member.isLogin);
        member.isLogin = true;
        System.out.println("로그인 후 상태: "+member.isLogin);

        //문제7
        Television television = new Television();
        television.channel = 7;
        television.volume = 20;
        television.channel = 11;
        television.volume -= 2;
        System.out.println("채널 : " + television.channel);
        System.out.println("볼륨 : " + television.volume);

        //문제8
        Player player1 = new Player();
        Player player2 = new Player();
        player1.name ="손흥민";
        player1.power=90;
        player1.speed = 95;
        player2.name ="이강인";
        player2.power=85;
        player2.speed=92;
        System.out.println(player1.speed+player1.power > player2.power+player2.speed ? player1.name : player2.name);

        //문제9
        MenuItem menuItem1 = new MenuItem();
        MenuItem menuItem2 = new MenuItem();
        MenuItem menuItem3 = new MenuItem();
        menuItem1.name ="김치찌개";
        menuItem1.price = 8000;
        menuItem1.isSignature = true;
        menuItem2.name ="된장찌개";
        menuItem2.price = 8000;
        menuItem2.isSignature = false;
        menuItem3.name ="계란찜";
        menuItem3.price = 3000;
        menuItem3.isSignature = false;
        MenuItem[] 메뉴 ={menuItem1, menuItem2, menuItem3};
        for(int i = 0; i < 메뉴.length; i++){
            if(메뉴[i].isSignature == true){
                System.out.printf("[대표메뉴] [메뉴이름]: %s %d원\n",메뉴[i].name, 메뉴[i].price);
            }
        }

        // 문제 10
        Scanner scan = new Scanner(System.in);
        UserProfile user = new UserProfile();
        System.out.println("이름");
        user.name = scan.next();
        System.out.println("나이");
        user.age = scan.nextInt();
        System.out.println("mbti");
        user.mbti = scan.next();
        System.out.println("---프로필---");
        System.out.printf("이름: %s, 나이: %d, MBTI: %s", user.name, user.age, user.mbti);
    }
}
class UserProfile{
    String name;
    int age;
    String mbti;
}
class MenuItem{
    String name;
    int price;
    Boolean isSignature;
}
class Player{
    String name;
    int power;
    int speed;
}
class Television{
    int channel;
    int volume;
}
class Member {
        String id;
        Boolean isLogin;
        }
class Product{
    String name;
    int price;
}

class Book{
    String title;
    String author;
    int price;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
class Pet{
    String name;
    String species;
    int age;
}
class Rectangle{
    int width;
    int height;
}
class BankAccount{
    String accountNumber;
    String ownerName;
    int balance;
}