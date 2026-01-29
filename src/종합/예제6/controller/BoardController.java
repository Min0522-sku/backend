package 종합.예제6.controller;

import 종합.예제6.model.dao.BoardDao;

public class BoardController {
    private BoardController(){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){
        return  instance;
    }


    private BoardDao bd = BoardDao.getInstance();


    //등록제어
    // view 에게 입력받은 content, writer 받아서 dao 에게 요청 후 결과를 view에게 전달
    public boolean doPost(String content, String writer){
        boolean result = bd.doPost(content, writer);
        return result;
    }
}
