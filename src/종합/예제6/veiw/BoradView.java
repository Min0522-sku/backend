package 종합.예제6.veiw;

import 종합.예제6.controller.BoardController;

public class BoradView {
    private BoradView(){}
    private static final BoradView instance = new BoradView();
    public static BoradView getInstance(){
        return instance;
    }


    private BoardController bc = BoardController.getInstance();
}
