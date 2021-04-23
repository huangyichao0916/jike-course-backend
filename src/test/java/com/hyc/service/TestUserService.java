package com.hyc.service;

import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUserService {
    @Test
    public void testRegister(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        User user = new User();
        user.setUserName("黄毅超");
        user.setAccountNumber(123);
        user.setPassword("123");
        ResultObj res = userServiceImpl.register(user);
        System.out.println(res);
//        System.out.println(register);
    }
    @Test
    public void testLogin(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userServiceImpl = context.getBean("userServiceImpl", UserService.class);
        User user = new User();
        user.setAccountNumber(123);
        user.setPassword("123");
        ResultObj login = userServiceImpl.login(user);
        System.out.println(login);
    }
    @Test
    public void testRecharge(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService bean = context.getBean("userServiceImpl", UserService.class);
        RechargeRecord record = new RechargeRecord(37045072318L, 100);
        try {
            bean.recharge(record);
        } catch (Exception e) {
            System.out.println("出错了");
            e.printStackTrace();
        }
    }
}
