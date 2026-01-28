package day07;

public class Exam3 {
    public static void main(String[] args) {
        User user = new User();
        //user.name = "유재석"
        //sout(user.name)



        //setter 와 getter을 이용한 멤버변수 접근
        user.setName("유재석");
        System.out.println(user.getName());

        System.out.println(user);
        // 주소값 -> toString 오버라이드 ->  User{name='유재석', age=0};
    }
}
class User{
    private String name;
    private int age;
    //클래스 내 마우스 오른쪽 클릭 생성 setter 및 getter 해서 생성 가능
    //getter
    public  String getName(){
        return this.name;
    }
    //setter
    public void setName(String name){
        this.name = name;
    }

    //자동생성된 getter setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // toString() 메소드
    // 모든 클래스가 자동으로 갖고 있는 메소드중 하나.
    // 객체의 주소(위치)값 출력
    // 자동: 클래스내 오른쪽클릭 생성 toString
    @Override // 기존 메소드를 커스텀/ 재정의
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
