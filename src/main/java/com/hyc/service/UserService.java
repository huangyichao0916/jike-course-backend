package com.hyc.service;

import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;

public interface UserService {
    //登录
    ResultObj login(User user);
    //注册
    ResultObj register(User user);
}
