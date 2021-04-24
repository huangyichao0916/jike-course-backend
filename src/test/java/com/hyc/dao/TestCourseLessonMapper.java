package com.hyc.dao;

import com.hyc.pojo.CourseLesson;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestCourseLessonMapper {
    @Test
    public void testGetCourseLessonByExeclude(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourseLessonMapper bean = context.getBean("courseLessonMapper", CourseLessonMapper.class);
        List<CourseLesson> lessons = bean.getCourseLessonByExeclude(37045072318L, 0, 6);
        lessons.forEach(System.out::println);
    }
    @Test
    public void testGetLessonsByUser(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CourseLessonMapper bean = context.getBean("courseLessonMapper", CourseLessonMapper.class);
        List<CourseLesson> lessons = bean.getLessonsByUser(37045072318L);
        lessons.forEach(System.out::println);
    }
}
