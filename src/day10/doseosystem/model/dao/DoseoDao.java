package day10.doseosystem.model.dao;


import day10.doseosystem.controller.UserController;
import day10.doseosystem.model.dto.DoseoDto;

import java.util.ArrayList;

public class DoseoDao {
    private DoseoDao(){}
    private static final DoseoDao instance = new DoseoDao();
    public static DoseoDao getInstance(){return instance;}

    private ArrayList<DoseoDto> DoseoList = new ArrayList<>();
    private static int bookNo = 1;

    public boolean addBook(String title, String writer){
        DoseoDto doseoDto = new DoseoDto(bookNo++, title, writer);
        boolean result = DoseoList.add(doseoDto);
        return result;
    }
    public ArrayList<DoseoDto> getDoseoList(){return DoseoList;}

    public boolean doseoDe(int bookNo){
        ArrayList<DoseoDto> bookList = getDoseoList();
        for (DoseoDto book : bookList){
            if (book.getBookNo() == bookNo && book.isStatus()){
                book.setUserNo(UserController.getInstance().getCurrentUserNo());
                book.setStatus(false);
                book.setUserNo(UserController.getInstance().getCurrentUserNo());
                return true;
            }
        }
        return false;
    }
    public boolean doseoBan(int bookNo){
        ArrayList<DoseoDto> bookList = getDoseoList();
        for (DoseoDto book : bookList){
            if (book.getBookNo() == bookNo && book.getUserNo() == UserController.getInstance().getCurrentUserNo()){
                book.setUserNo(0);
                book.setStatus(true);
                return true;
            }
        }
        return false;
    }
}
