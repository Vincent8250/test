package cn.vincent.controller;

import cn.vincent.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api("测试控制器")
@Controller
public class MainController {
    @ResponseBody
    @GetMapping("/getJson")
    @ApiOperation("返回一个用户 Json格式")
    public User getJson(){
        return new User("小红", 22, User.Gender.woman);
    }
}