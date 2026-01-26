package day05;

import java.util.Arrays;

public class Exam1 {
    public static void main(String[] args) {
        // 타입[] 변수명 = new 타입[총개수]
        // 동일한 타입끼리, 고정길이, 요소의 초기값 존재
        // 0번 시작
        int[] arr1 = new int[3]; // 0, 0, 0
        String[] arr2 = {"봄", "여름","가을","겨울"};
        System.out.println(arr1); // 주소값 출력
        System.out.println(arr2); // 주소값 출력 / 개발자가 제어 불가능

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        //new int[3] 선언하면 int[4바이트], int[4바이트], int[4바이트]
        //롱 4바이트 * 3 12바이트 생성됨
        // 컴퓨터는 최소의 (윈도우)저장당위를 바이트(위치/주소 값)
        // 12주소값 생성, 101번지102번지103번지104번지, 201번지202번지203번지204번지,301번지302번지303번지304번지
        // 배열의 변수는 총 12개의 주소값을 가진게 아니고 가장 첫번째의 주소값을 가진다.
        // int arr1 = new int[3];
        // arr1 = 101번지 : 첫번째 요소의 주소값이 들어있음.
        // 실행중에 개발자가 배열내 주소값을 삭제할 수 없다.
        // 주소값에 초기값이 생략되면 임의의 초기값을 자동으로 들어간다. < G = 쓰레기 C: 수집기, 비어있는 메모리 삭제>
        // 정수 : 0, 실수 : 0.0, 문자열/객체 : null, 논리 : false
        int a = 0;

        System.out.println(arr1.length); //배열 변수명.length: 배열의 총 길이 =3
        // 배열내 요소 값 수정
        arr1[0] = 10;
        System.out.println(arr1[0]); //출력 : 배열 변수명[인덱스]

        //arr1[4] = 40; // 배열의 요소 추가/삭제 는 오류 발생
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 3
        //at day05.Exam1.main(Exam1.java:35)

        //반복문 활용
        for(int i =0; i <= arr1.length; i++){
            System.out.println(arr1[i]);
        }
        //향상된 for문 , 이터레이터
        // for(타입 반복변수명 : 배열변수명) {}, iterator(이터레이터/반복자/순회자)가 가능한 배열/객체 만 사용가능
        for(int value : arr1){
            System.out.println(value);
        }


    }
}
