package com.hyc.service;

import com.hyc.dao.UserMapper;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import com.hyc.utils.ConstsGetter;
import com.hyc.utils.UUIDCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public ResultObj login(User user) {
        /**
         * 登录时，resultCode有以下几种
         * 0，未知错误
         * 1，登录成功
         * 2，不存在该用户
         * 3，密码错误
         */
        User user1 = userMapper.queryUserByAccountNumber(user.getAccountNumber());
        if (user1 == null) {
            return new ResultObj(2);
        }else {
            if (user1.getPassword().equals(user.getPassword())){
                return new ResultObj(1,user1);
            }else {
                return new ResultObj(3);
            }
        }
    }

    @Override
    public ResultObj register(User user) {
        /**
         * 注册时，resultCode有以下几种
         * 0，未知错误
         * 1，注册成功
         * 2，该账号已被用户注册
         */
        User user1 = userMapper.queryUserByAccountNumber(user.getAccountNumber());
        if (user1 != null) {
            return new ResultObj(2);
        }else {
            user.setUserId(UUIDCreator.getAcountUUID(11));
            user.setBalance(0);
            user.setAvatar(ConstsGetter.getConsts("avatarBaseUrl"));
            user.setSomethingNotRead(false);
            int i = userMapper.insertUser(user);
            if (i == 1) {
                return new ResultObj(1,user);
            }else {
                return new ResultObj(0);
            }
        }
    }
}
