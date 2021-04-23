package com.hyc.dao;

import com.hyc.pojo.RechargeRecord;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestRechargeRecordMapper {
    @Test
    public void testGetRecordsByUserId(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RechargeRecordMapper bean = context.getBean("rechargeRecordMapper", RechargeRecordMapper.class);
        List<RechargeRecord> res = bean.getRecordsByUserId(37045072318L);
        res.forEach(System.out::println);
    }
    @Test
    public void testAddRecord(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        RechargeRecordMapper bean = context.getBean("rechargeRecordMapper", RechargeRecordMapper.class);
        RechargeRecord record = new RechargeRecord(1111,200);
        int i = bean.addRecord(record);
        System.out.println(i);
    }
}
