package com.hyc.service;

import com.hyc.pojo.PracticeCamp;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestPracticeCampServiceImpl {
    @Test
    public void testGetPracticeCampByExeclude(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PracticeCampService bean = context.getBean("practiceCampServiceImpl", PracticeCampService.class);
        List<PracticeCamp> camps = bean.getPracticeCampByExeclude(92572683099L);
        camps.forEach(System.out::println);
    }
}
