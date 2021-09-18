package cn.vincent.controller;

import cn.vincent.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "主接口")
@Controller
public class MainController {
    @ResponseBody
    @GetMapping("/getJson")
    @ApiOperation("返回一个用户 Json格式")
    public User getUser(@ApiParam("用户名") String userName){
        return new User("小红", 22, User.Gender.woman);
    }

    @ResponseBody
    @PostMapping("getInfo")
    @ApiOperation("返回信息")
    public String postInfo(@ApiParam("消息信息") String msgInfo){
        return msgInfo;
    }
}