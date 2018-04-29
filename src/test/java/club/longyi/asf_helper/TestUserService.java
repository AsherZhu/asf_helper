package club.longyi.asf_helper;

import club.longyi.asf_helper.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/24 16:11
 * https://github.com/ZhuShuai1992
 */

public class TestUserService {

    String s1 = "string01";
    public static void main(String[] args) {
        String s1 = "string02";
        System.out.println(s1+"~~这是局部变量");
        TestUserService testUserService = new TestUserService();
        System.out.println(testUserService.s1+"~~这是全局变量");
    }

}
