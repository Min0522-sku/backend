package day09.과제2인.view;

import day09.과제2인.controller.ProductController;
import day09.과제2인.controller.MemberController;

import java.util.Scanner;

public class ProductView {
    private ProductView(){}
    private static final ProductView instance = new ProductView();
    public static ProductView getInstance(){
        return instance;
    }


    private ProductController PC = ProductController.getInstance();
    private MemberController MC = MemberController.getInstance();




    private Scanner sc = new Scanner(System.in);
    public void BuyProductView(){
        sc.nextLine();
        System.out.println("--- 구매 의사 신청 ---");
        System.out.println(" 구매 의사를 신청할 제품번호 : ");
        int productNo = sc.nextInt();
        boolean result = PC.BuyProduct(productNo);
        if(result){
            System.out.println("[안내] 구매 의사 신청이 완료되었습니다.");
        } else {
            System.out.println("[경고] 구매 의사 신청이 실패했습니다.");
        }
    }
}
