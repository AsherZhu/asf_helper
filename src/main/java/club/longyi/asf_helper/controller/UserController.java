package club.longyi.asf_helper.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by:
 * zhushuai.net@gmail.com
 * 2018/4/17 15:13
 * https://github.com/ZhuShuai1992
 */
@RestController
public class UserController {
    @RequestMapping("/")
    String home() {
        return "hello world";
    }
}
