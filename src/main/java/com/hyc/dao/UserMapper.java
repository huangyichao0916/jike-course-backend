package com.hyc.dao;

import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //增加一个用户
    int addUser(User user);

    //根据用户账号获取一个用户
    User queryUserByAccountNumber(@Param("accountNumber") long accountNumber);

    //用户充值
    int recharge(RechargeRecord record);
}
