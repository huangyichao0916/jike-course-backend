package com.hyc.service;

import com.hyc.params.PurchaseCourseLessonParam;
import com.hyc.pojo.ResultObj;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBuyCourseLessonServiceImpl {
    @Test
    public void testBuyCourseLesson(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BuyCourseLessonService bean = context.getBean("buyCourseLessonServiceImpl", BuyCourseLessonService.class);
        ResultObj resultObj = null;
        PurchaseCourseLessonParam param = new PurchaseCourseLessonParam(92572683099L, 100, 100036001, 65);
        try {
            resultObj = bean.buyCourseLesson(param);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(resultObj);
    }
}
