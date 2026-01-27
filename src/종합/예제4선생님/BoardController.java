package 종합.예제4선생님;


public class BoardController {
    Board[] boards = new Board[3];
    Boolean doPost(String content, String writer){
        Board board = new Board();
        board.content = content;
        board. writer = writer;
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }
        }
        return false;
    }

    Board[] doGet(){
        return boards; // boards 반환 했으므로 리턴 타입은 Board[] 배열이다.
    }
}
