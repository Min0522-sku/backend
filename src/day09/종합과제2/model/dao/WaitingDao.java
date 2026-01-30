package day09.종합과제2.model.dao;

import day09.종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingDao {
    private WaitingDao(){}
    private static final WaitingDao instance = new WaitingDao();
    public static WaitingDao getInstance(){
        return instance;
    }

    private final ArrayList<WaitingDto> waitingList = new ArrayList<>();

    private static int currnetNo = 1;

    public boolean waitingAdd(String phone, int num){
        WaitingDto waitingDto = new WaitingDto(currnetNo, phone, num);
        boolean result = waitingList.add(waitingDto);
        currnetNo++;
        return result;
    }

    public ArrayList<WaitingDto> waitingGet(){
        return waitingList;
    }
}
