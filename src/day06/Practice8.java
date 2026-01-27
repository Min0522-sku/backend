package day06;

public class Practice8 {
    public static void main(String[] args) {
        Printer pr = new Printer();
        pr.printMessage();

        Greeter gr = new Greeter();
        gr.greet("장민서");

        SimpleCalculator sim = new SimpleCalculator();
        int num = sim.add(10, 20);
        System.out.println(num);

        Checker ch = new Checker();
        if (ch.isEven(5)){
            System.out.println("짝수");
        }else {
            System.out.println("홀수");
        }

        Lamp lamp = new Lamp();
        System.out.println(lamp.turnOn());
        System.out.println(lamp.turnOff());


        Product product = new Product();
        product.name = "지우개";
        product.stock = 20;
        if(product.sell(21)){
            System.out.println("구매성공");
        }else {
            System.out.println("구매 실패 재고부족");
        }


        Visualizer visualizer = new Visualizer();
        System.out.println(visualizer.getStarts(5));


        ParkingLot parkingLot = new ParkingLot();
        System.out.println(parkingLot.calculateFee(65));
        System.out.println(parkingLot.calculateFee(140));
    }
}
class ParkingLot{
    int calculateFee(int time){
        int price;
        if (time <=30){
            price = 3000;
            return price;
        } else {
            price = 3000;
            time-=30;
            price += (time/10)*500;
            if (price >= 20000){
                price = 20000;
            }
            return price;
        }
    }
}
class  Visualizer{
    String getStarts(int s){
        String star = "";
        for (int i = 0; i < s; i++){
            star += "★";
        }
        return star;
    }
}
class Product{
    String name;
    int stock;
    Boolean sell(int buy){
        if (buy < stock){
            stock -= buy;
            return true;
        }else return false;
    }
}
class Lamp{
    Boolean isOn = false;
    Boolean turnOn(){
        isOn =true;
        return isOn;
    }
    Boolean turnOff(){
        isOn = false;
        return isOn;
    }


}
class Checker{
    Boolean isEven(int n){
        if(n%2==0){
            return true;
        }else {return false;}
    }
}
class SimpleCalculator{
    int add(int a, int b){
        return a+b;
    }
}
class Printer{
    void printMessage(){
        System.out.println("안녕하세요, 메소드입니다.");
    }
}
class Greeter {
    void greet(String name){
        System.out.printf("안녕하세요, %s님!\n", name);
    }
}