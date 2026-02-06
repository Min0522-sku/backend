package 종합.예제7.controller;

import 종합.예제7.dao.BoardDao;
import 종합.예제7.dto.BoardDto;

import java.util.ArrayList;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){return instance;}

    private BoardDao bd = BoardDao.getInstance();

    public boolean writer(String bcontent, String bwriter){
        boolean result = bd.writer(bcontent,bwriter);
        return result;
    }
    public ArrayList<BoardDto> findAll(){
        ArrayList<BoardDto> result = bd.findAll();
        return result;
    }
    public boolean update(int bno, String bcontent){
        boolean result = bd.update(bno, bcontent);
        return result;
    }
    public boolean delete(int bno){
        boolean result = bd.delete(bno);
        return result;
    }
}
