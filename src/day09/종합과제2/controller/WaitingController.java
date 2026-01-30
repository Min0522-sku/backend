package day09.종합과제2.controller;

import day09.종합과제2.model.dao.WaitingDao;
import day09.종합과제2.model.dto.WaitingDto;

import java.util.ArrayList;

public class WaitingController {
    private WaitingController(){}
    private static final WaitingController instance = new WaitingController();
    public static WaitingController getInstance(){
        return instance;
    }

    private WaitingDao wd = WaitingDao.getInstance();

    public boolean waitingAdd(String phone, int num){
        boolean result = wd.waitingAdd(phone, num);
        return result;
    }

    public ArrayList<WaitingDto> waitingGet(){
        ArrayList<WaitingDto> result = wd.waitingGet();
        return result;
    }
}
