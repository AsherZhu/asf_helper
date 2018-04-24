package club.longyi.asf_helper;

import club.longyi.asf_helper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/24 16:11
 * https://github.com/ZhuShuai1992
 */

public class TestUserService{

//    @Autowired
//    private UserService userService;

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.existsByEmail("123456789"));
    }

}
