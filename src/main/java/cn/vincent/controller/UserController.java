package cn.vincent.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RestController
public class UserController {
    @GetMapping("/getUserName")
    @ApiOperation("取用户名称")
    public String getUserName(Integer userId){
        return  "";
    }
}
