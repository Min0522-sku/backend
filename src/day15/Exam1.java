package day15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam1 {
    public static void main(String[] args) {
        // 미리 만들어진 라이브러리/클래스
        // 날짜/시간 클래스
        //(컴퓨터)현재 날짜 클래스
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        //(컴퓨터)현재 시간 클래스
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        //(컴퓨터)현재 날짜,시간 클래스
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        // 정해진 날짜/시간 생성 .of(연도, 월, 일, 시, 분, 초)
        LocalDateTime datetime = LocalDateTime.of(2025,7,25,11,35,15);
        System.out.println("datetime = " + datetime);
        // 정해진 패턴(형식) 지정,  패턴: y M d h m s
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시mm분ss초");
        String today = datetime.format(formatter); // 날짜/시간객체.format(날짜/시간패턴)
        System.out.println("today = " + today);
        // 날짜 계산 .plusxxx(증가할 값); .minusxxx(감소할 값);
        LocalDateTime dateTime1 = datetime.plusDays(10); //10일 증가
        System.out.println("dateTime1 = " + dateTime1);
        LocalDateTime dateTime2 = dateTime1.minusDays(30); // 30일 감소
        System.out.println("dateTime2 = " + dateTime2);
        //날짜 세부 정보
        int year = localDateTime.getYear();
        System.out.println("year = " + year);
        int month = localDateTime.getMonthValue();
        System.out.println("month = " + month);
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());





    }
}
