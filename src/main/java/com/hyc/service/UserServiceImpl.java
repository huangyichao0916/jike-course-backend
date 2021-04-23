package com.hyc.service;

import com.hyc.dao.RechargeRecordMapper;
import com.hyc.dao.UserMapper;
import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import com.hyc.utils.ConstsGetter;
import com.hyc.utils.UUIDCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Autowired
    @Qualifier("rechargeRecordMapper")
    private RechargeRecordMapper rechargeRecordMapper;

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
        } else {
            if (user1.getPassword().equals(user.getPassword())) {
                user1.hidePassword();
                return new ResultObj(1, user1);
            } else {
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
        } else {
            user.setUserId(UUIDCreator.getAcountUUID(11));
            user.setBalance(0);
            user.setAvatar(ConstsGetter.getConsts("avatarBaseUrl"));
            user.setSomethingNotRead(false);
            int i = userMapper.addUser(user);
            if (i == 1) {
                user.hidePassword();
                return new ResultObj(1, user);
            } else {
                return new ResultObj(0);
            }
        }
    }

    @Override
    public void recharge(RechargeRecord record) throws Exception {
        int i = rechargeRecordMapper.addRecord(record);
        int j = userMapper.recharge(record);
        if (i != 1 || j != 1) {
            throw new Exception("出错了");
        }
    }

    @Override
    public List<RechargeRecord> getRecordsByUserId(long userId) {
        List<RechargeRecord> records = rechargeRecordMapper.getRecordsByUserId(userId);
        return records;
    }

}
