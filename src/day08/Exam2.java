package day08;

import javax.swing.text.View;

public class Exam2 {
    public static void main(String[] args) {
        Controller controller1 = Controller.getInstance();
        Controller controller2 = Controller.getInstance();
        View view1 = new View();
        View view2 = new View();
        System.out.println("view1 = " + view1);
        System.out.println("view2 = " + view2);
        System.out.println("controller1 = " + controller1);
        System.out.println("controller2 = " + controller2);

    }
}
class Controller{
    private Controller(){}
    private  static final Controller instance = new Controller();
    public static Controller getInstance(){
        return instance;
    }
}
class View{}