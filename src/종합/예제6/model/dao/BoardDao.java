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




    // 듣록처리 controller 가 dao에게 content 와 writer 를 전달하여 등록 요청한다
    public boolean doPost(String content, String writer){
        BoardDto boardDto = new BoardDto(currentNumber, content, writer);
        currentNumber++;
        return boardDB.add(boardDto);
    }



    //전체 조회 처리 controller 가 dao 에게 모든 게시물 요청
    // 개별조회 1개 반환타입 : BoardDto vs 전체 조회 N개 반환 타입 ArrayList<BoardDto>
    public  ArrayList<BoardDto>  doget(){
        return boardDB;
    }
}
