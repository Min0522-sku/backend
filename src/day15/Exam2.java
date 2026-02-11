package day15;

import java.util.Arrays;

public class Exam2 {
    public static void main(String[] args) {
        //String 클래스
        // 문자열 표현 방법
        char str1 = '유'; // char 한글자만 저장 가능.
        char[] str2 = {'유','재','석'}; // char 타입 배열

        // 문자 변환,    아스키코드(c언어) 7비트->128문자, 유니코드(자바) 전세계 표준 문자 부호
        char str3 = 65;
        System.out.println("str3 = " + str3);
        char[] str4 = {74, 65, 86, 65};
        System.out.println("Array.toString(str4) = " + Arrays.toString(str4));
        char str5 = '김';
        System.out.println("int(str5) = " + (int)str5);

        // 문자열 생성, == 리터럴 비교
        String str6 = "유재석";
        String str7 = "유재석";
        String str8 = new String("유재석");
        System.out.println(str6 == str7);
        System.out.println(str6 == str8);
        System.out.println(str6.equals(str8));

        // 주요 기능/메소드
        // "문자열"/문자열변수.concat("새로운문자") : 문자열에 새로운 문자열 연결 하여 *(새로운)*반환 하는 함수
        String str9 = "자바"; // str9 주소값
        String str10 = str9.concat("프로그래밍"); // str10 주소값
        System.out.println(str9.concat("프로그래밍"));
        
        // "문자열" + "새로운문자열" : 연결
        String str11 = str9 + "프로그래밍";
        
        //StringBuilder 클래스 .append 함수 이용하여 문자열 연결하는 객체, 연결된 문자열에 따른 *주소값 유지*
        StringBuilder builder = new StringBuilder();
        builder.append(str9);
        builder.append("프로그래밍");
        System.out.println(builder);
        
        //String.format( "%", "문자열")
        String str12 = String.format("%s%s", str9,"프로그래밍");
        System.out.println("str12 = " + str12);
        
        // """ """ 자동 줄바꿈 표현 하는 문자열
        String str13 = """
                자바
                프로그래밍
                """;
        System.out.println("str13 = " + str13);
        // 활용 : JDBC SQL
        String name = "유재석";
        String sql1 = "insert into table(name) values("+name+")";
        String sql2 = "insert into table(name) values(".concat(name)+")";
        String sql3 = String.format("insert into table(name) values(%s)", name);
        StringBuilder sql4 = new StringBuilder();
        sql4.append("insert into table(name)");
        sql4.append("value(");
        sql4.append(name);
        sql4.append(")");


        // .charAt(인덱스), 문자열내 지정한 인덱스 번호의 문자 1개 추출/반환
        char gender = "012345-1230123".charAt(7);
        System.out.println("gender = " + gender);

        // .length() 문자열내 문자 개수/길이 반환
        System.out.println("012345-1230123".length());

        // .replace(기존문자, 새로운문자) : 문자열내 기존문자가 존재하면 새로운문자로 치환하여 문자열 반환
        String str14 ="자바프로그래밍".replace("자바", "JAVA");
        System.out.println("str14 = " + str14);
        //활용
        String html = "<div>유재석<div> <br/><div>강호동<div> <br/>";
        System.out.println(html.replace("<br/>", "\n")); // html 줄바꿈 --> 자바 줄바꿈 치환

    }
}
