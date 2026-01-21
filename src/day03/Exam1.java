package day03;

public class Exam1 {
    public static void main(String[] args) {
        int ondo = 5;
        if(ondo <= 10) System.out.println("외투를 입는다");
        int age = 10;
        if(age >= 19){
            System.out.println("성인입니다.");
            System.out.println("19세 이상입니다.");
        }

        boolean user = false;
        if(user == true){
            System.out.println("안녕하세요 회원님");
        }else {
            System.out.println("비회원입니다.");
        }

        int money = 1750;
        if(money >= 3000){
            System.out.println("택시를 탄다");
        } else if (money >= 1700) {
            System.out.println("버스를 탄다");
        } else if (money >= 1200) {
            System.out.println("자전거를 탄다");
        }else {
            System.out.println("걸어간다");
        }

        if(money >= 3000){
            System.out.println("택시를 탄다");
        }
        if (money >= 1700) {
            System.out.println("버스를 탄다");
        }
        if (money >= 1200) {
            System.out.println("자전거를 탄다");
        }

        int age2 = 25;
        char gender = 'w';
        if(age2 >= 19){
            System.out.println("[성인]");
            if (gender == 'w'){
                System.out.println("[여자]");
            }else {
                System.out.println("[남자]");
            }
        }else {
            System.out.println("[미성년자]");
        }

        // swich

        char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("우수학생");
                break;
            case 'B':
                System.out.println("장려 학생");
                break;
            default:
                System.out.println("학생");

        }

        int adult = 1;
        char gender2 = 'w';
        switch (adult){
            case 1:
                System.out.println("성인");
                switch (gender2){
                    case 'w':
                        System.out.println("여자");
                        break;
                    default:
                        System.out.println("남자");
                }
                break;
            default:
                System.out.println("미성년자");
        }



















    }
}
