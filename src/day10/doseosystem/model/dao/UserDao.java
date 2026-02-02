package day10.doseosystem.model.dao;

import day10.doseosystem.model.dto.UserDto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UserDao {
    private UserDao(){}
    private static final UserDao instance = new UserDao();
    public static UserDao getInstance(){return instance;}
    private final ArrayList<UserDto> userList = new ArrayList<>();
    private  static int currentNo = 1;
    public boolean singin(String id, String pw, String nickname){
        UserDto userDto = new UserDto(currentNo++, id,pw,nickname);
        boolean reuslt = userList.add(userDto);
        return reuslt;
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
