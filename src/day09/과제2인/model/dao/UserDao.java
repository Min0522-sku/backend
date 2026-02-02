package day09.과제2인.model.dao;

import day09.과제2인.controller.MemberController;
import day09.과제2인.model.dto.UserDto;

import java.util.ArrayList;

public class UserDao {

    private UserDao(){}
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance(){
        return instance;
    }
    private final ArrayList<UserDto> userList = new ArrayList<UserDto>();
    private static int currentNo =1;
    public boolean singin(String id, String pw, String nickname, String phone){
        UserDto userDto = new UserDto(currentNo, id, pw, nickname, phone);
        boolean result = userList.add(userDto);
        currentNo++;
        return result;
    }
    public int login(String id, String pw){
        for (UserDto userDto : userList){
            if (id.equals(userDto.getId())&&pw.equals(userDto.getPw())){
                return userDto.getUserNo();
            }
        }
        return 0;
    }
    public ArrayList<UserDto> userListGet(){return userList;}

}
