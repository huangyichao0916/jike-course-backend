package com.hyc.controller;

import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import com.hyc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RequestMapping("login-or-register")
@RestController
@CrossOrigin
public class LoginOrRegisterController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping("/")
    public ResultObj loginOrRegister(@RequestBody User user,int type){
        if (type == 0){
            //登录
            try {
                ResultObj res = userService.login(user);
                return res;
            }catch (Exception e){
                return new ResultObj(0);
            }
        }else {
            //注册
            try {
                ResultObj res = userService.register(user);
                return res;
            }catch (Exception e){
                return new ResultObj(0);
            }
        }
    }
}
