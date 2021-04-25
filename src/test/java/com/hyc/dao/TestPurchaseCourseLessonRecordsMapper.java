package com.hyc.dao;

import com.hyc.pojo.PurchaseCourseLessonRecord;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPurchaseCourseLessonRecordsMapper {
    @Test
    public void testInsertRecord(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PurchaseCourseLessonRecordsMapper bean = context.getBean("purchaseCourseLessonRecordsMapper", PurchaseCourseLessonRecordsMapper.class);
        int i = bean.insertRecord(new PurchaseCourseLessonRecord(37045072318L, 100007001));
        System.out.println(i);
    }
    @Test
    public void testQueryAllRecords(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PurchaseCourseLessonRecordsMapper bean = context.getBean("purchaseCourseLessonRecordsMapper", PurchaseCourseLessonRecordsMapper.class);
        List<PurchaseCourseLessonRecord> records = bean.queryAllRecords(37045072318L);
        records.forEach(System.out::println);
    }
}
