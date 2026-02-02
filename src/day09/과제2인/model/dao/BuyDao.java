package day09.과제2인.model.dao;

import day09.과제2인.model.dto.BuyDto;

import java.util.ArrayList;

public class BuyDao {
    private BuyDao(){}
    private static final BuyDao instance = new BuyDao();
    public static BuyDao getInstance(){
        return instance;
    }
    private final ArrayList<BuyDto> buyList = new ArrayList<BuyDto>();
    private static int currentBuyNo = 1;

    public static int currentUserNo = 0;


    public boolean BuyProduct(int productNo){
        BuyDto buyDto = new BuyDto(currentBuyNo++, productNo, currentUserNo);
        boolean result = buyList.add(buyDto);
        return result;
    }
}
