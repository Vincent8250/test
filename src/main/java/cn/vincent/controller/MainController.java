package cn.vincent.controller;

import cn.vincent.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @ResponseBody
    @GetMapping("/getJson")
    public User getJson(){
        return new User("ABC", 22, User.Gender.man);
    }
}
