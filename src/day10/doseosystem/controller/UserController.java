package day10.doseosystem.controller;
import day10.doseosystem.model.dao.UserDao;
import day10.doseosystem.model.dto.UserDto;

import java.util.ArrayList;

public class UserController {
    private UserController(){}
    private static final UserController instance = new UserController();
    public static UserController getInstance(){return instance;}
    private int currentUserNo = 0;

    public int getCurrentUserNo() {
        return currentUserNo;
    }

    public void setCurrentUserNo(int currentUserNo) {
        this.currentUserNo = currentUserNo;
    }

    private UserDao UD = UserDao.getInstance();

    public boolean singin(String id, String pw, String nickname){
        boolean result = UD.singin(id,pw,nickname);
        return result;
    }
    public boolean login(String id, String pw){
        int result =  UD.login(id,pw);
        if (result >= 1){
            UserController.getInstance().setCurrentUserNo(result);
            return true;
        }
        return false;
    }
    public void logout(){
        UserController.getInstance().setCurrentUserNo(0);
    }
    public String returnNickname(String id){
        String nickname = "";
        ArrayList<UserDto> userList = UD.userListGet();
        for (UserDto user : userList) {
            if (currentUserNo == user.getUserNo()) {
                nickname = user.getNickname();
            }
        }
        return nickname;
    }
}
