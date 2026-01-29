package day07;

public class Practice9 {
    public static void main(String[] args) {
        Book book1 = new Book("이것이 자바다", "신용권", 30000);
        Book book2 = new Book("자바의 정석", "남궁성", 28000);
        System.out.printf("book1 : %s %s %d\n", book1.title, book1.author, book1.price);
        System.out.printf("book2 : %s %s %d\n", book2.title, book2.author, book2.price);

        Rectangle rectangle = new Rectangle(10,5);
        System.out.println("사각형의 넓이: "+(rectangle.getArea(rectangle.width, rectangle.height)));

//        BankAccount bankAccount = new BankAccount("111-222-3333", "유재석", 10000);
//        if(bankAccount.deposit("111-222-3333", "유재석", 5000)){
//            System.out.println("입금 성공");
//        }else System.out.println("입금 실패");
//        if(bankAccount.withdraw("111-222-3333", "유재석", 3000)){
//            System.out.println("출금 성공");
//        }else System.out.println("출금 실패");
//        System.out.println("금액:"+bankAccount.balance);


        Goods goods1 = new Goods("콜라", 2000);
        Goods goods2 = new Goods();
        System.out.printf("goods1 : %s %d\n", goods1.name, goods1.price);
        System.out.printf("goods2 : %s %d\n", goods2.name, goods2.price);

        //Member member = new Member();
        //System.out.println("Member: "+member.id+" "+member.isLogin);
    }
}
//class  Member{
//    String id;
//    boolean isLogin;
//    Member(){
//        id = "guest";
//        isLogin = false;
//    }
//}

class Goods{
    String name;
    int price;
    Goods(){
        name = "미정";
        price = 0;
    }
    Goods(String name, int price){
        this.name =name;
        this.price = price;
    }

}
//class BankAccount {
//    String accountNumber;
//    String ownerName;
//    int balance;
//
//    BankAccount(String accountNumber, String ownerName, int balance) {
//        this.accountNumber = accountNumber;
//        this.ownerName = ownerName;
//        this.balance = balance;
//    }
//    boolean deposit(String accountNumber, String ownerName, int money){
//        if (accountNumber.equals(this.accountNumber)  && ownerName.equals(this.ownerName)){
//            this.balance += money;
//            return true;
//        }
//        return false;
//    }
//    boolean withdraw(String accountNumber, String ownerName, int money){
//        if (accountNumber.equals(this.accountNumber)  && ownerName.equals(this.ownerName) && this.balance > money){
//            this.balance -= money;
//            return true;
//        }
//        return false;
//    }
//
//}

class Rectangle{
    int width;
    int height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    double getArea(int width, int height){
        return (width*height);
    }
}
class Book{
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

