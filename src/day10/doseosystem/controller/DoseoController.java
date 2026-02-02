package day10.doseosystem.controller;

import day09.과제2인.model.dto.ProductDto;
import day10.doseosystem.model.dao.DoseoDao;
import day10.doseosystem.model.dao.UserDao;
import day10.doseosystem.model.dto.DoseoDto;

import java.util.ArrayList;

public class DoseoController {
    private DoseoController(){}
    private static final DoseoController instance = new DoseoController();
    public static DoseoController getInstance(){return instance;}

    private UserDao UD = UserDao.getInstance();
    private DoseoDao DD = DoseoDao.getInstance();

    public boolean addBook(String title, String writer){
        boolean result = DD.addBook(title, writer);
        return result;
    }
    public ArrayList<DoseoDto> getDoseo(){
        ArrayList<DoseoDto> result = DD.getDoseoList();
        return result;
    }
    public boolean doseoDe(int bookNo){
        boolean result = DD.doseoDe(bookNo);
        return result;
    }
    public boolean doseoBan(int bookNo){
        boolean result = DD.doseoBan(bookNo);
        return result;
    }
}
