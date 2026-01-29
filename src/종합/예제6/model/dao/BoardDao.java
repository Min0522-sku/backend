package 종합.예제6.model.dao;

import 종합.예제6.model.dto.BoardDto;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){
        return  instance;
    }

    // 추후 삭제 예정
    private static final ArrayList<BoardDto> boardDB = new ArrayList<>();
    private static int currentNumber = 1;




    // 듣록처리
    public boolean doPost(String content, String writer){
        BoardDto boardDto = new BoardDto(currentNumber, content, writer);
        currentNumber++;
        return boardDB.add(boardDto);
    }
}
