package club.longyi.asf_helper.controller;

import club.longyi.asf_helper.entity.UserEntity;
import club.longyi.asf_helper.service.UserService;
import club.longyi.asf_helper.type.ReturnType;
import club.longyi.asf_helper.utils.RealIpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/17 15:13
 * https://github.com/ZhuShuai1992
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "register")
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/register.action", method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(UserEntity userEntity, HttpServletRequest request) {
        String message = ReturnType.UNKNOW_ERROR.name();
        if (!userService.existsByUserName(userEntity.getUserName()) && !userService.existsByEmail(userEntity.getEmail())) {
            userEntity.setCreateIP(RealIpUtils.getIpAddress(request));
            userService.save(userEntity);
            message = ReturnType.SUCCESS.name();
        }
        return message;
    }

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    /**
     * 检查用户名或邮箱是否存在
     *
     * @param type    类型
     * @param content 内容
     * @return 是否存在
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public boolean testExist(String type, String content) {
        switch (type) {
            case "userName":
                return userService.existsByUserName(content);
            case "email":
                return userService.existsByEmail(content);
        }
        return false;
    }

}
