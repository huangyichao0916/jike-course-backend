package com.hyc.service;

import com.hyc.dao.UserMapper;
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
}
