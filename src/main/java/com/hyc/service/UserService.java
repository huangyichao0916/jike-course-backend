package com.hyc.service;

import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;

import java.util.List;

public interface UserService {
    //登录
    ResultObj login(User user);
    //注册
    ResultObj register(User user);
    //充值
    void recharge(RechargeRecord record) throws Exception;
    //获取所有的充值记录
    List<RechargeRecord> getRecordsByUserId(long UserId);
}
