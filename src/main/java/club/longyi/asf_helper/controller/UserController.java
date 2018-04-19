package club.longyi.asf_helper.controller;

import club.longyi.asf_helper.entity.UserEntity;
import club.longyi.asf_helper.service.UserService;
import club.longyi.asf_helper.type.ReturnType;
import club.longyi.asf_helper.utils.RealIpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/17 15:13
 * https://github.com/ZhuShuai1992
 */
@Controller
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/sign-up")
    public String registUser() {
        return "sign-up";
    }

    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(UserEntity userEntity , HttpServletRequest request) {
        String message = ReturnType.UNKNOW_ERROR.name();
        userEntity.setCreateIP(RealIpUtils.getIpAddress(request));
        userService.save(userEntity);
        return message;
    }

}
