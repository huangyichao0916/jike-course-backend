package com.hyc.dao;

import com.hyc.dao.UserMapper;
import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserMapper {
    @Test
    public void testGetUserByAcountNumber(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = userMapper.queryUserByAccountNumber(13);
        System.out.println(user);
    }
    @Test
    public void testRecharge(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        RechargeRecord record = new RechargeRecord(37045072318L,200);
        int i = userMapper.recharge(record);
        System.out.println(i);
    }
}
