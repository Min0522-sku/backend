package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return  instance;
    }


    private BoardDao bd = BoardDao.getInstance();
}
