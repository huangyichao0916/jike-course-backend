package com.hyc.dao;

import com.hyc.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //插入一个用户
    int insertUser(User user);

    //根据用户账号获取一个用户
    User queryUserByAccountNumber(@Param("accountNumber") long accountNumber);

}
