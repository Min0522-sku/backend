package controller;

import model.dao.SecondhandsDao;
import model.dto.SecondhandsDto;

import java.util.ArrayList;

public class SecondhandsController {
    private SecondhandsController(){}
    private static final SecondhandsController instance = new SecondhandsController();
    public static SecondhandsController getInstance(){return instance;}
    private SecondhandsDao sd = SecondhandsDao.getInstance();

    public boolean add(String nickname, String pname, String ptxt, int pprice, String ppw, String pnumber){
        boolean result = sd.add(nickname, pname, ptxt, pprice, ppw, pnumber);
        return result;
    }

    public ArrayList<SecondhandsDto> findAll(){
        ArrayList<SecondhandsDto> result = sd.findAll();
        return result;
    }

    public boolean update(int pno, String pname, String ptxt, int pprice, String pnumber, boolean pstatus, String ppw){
        boolean result = sd.update(pno, pname, ptxt, pprice, pnumber, pstatus, ppw);
        return result;
    }

    public boolean delete(int pno, String ppw){
        boolean result = sd.delete(pno, ppw);
        return result;
    }
}
