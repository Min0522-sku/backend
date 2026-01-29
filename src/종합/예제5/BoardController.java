package 종합.예제5;

public class BoardController {
    private static final Board[] boards = new Board[100];

    public static boolean doPost(String content, String writer){
       Board board = new Board(content, writer);
        for (int i = 0; i < boards.length; i++) {
            if (boards[i] == null) {
                boards[i] = board;
                return true;
            }
        }
        return false;
    }

  public static Board[] doGet(){
        return boards; // boards 반환 했으므로 리턴 타입은 Board[] 배열이다.
    }
}
