package com.hyc.service;

import com.hyc.pojo.CourseLesson;

import java.util.List;

public interface CourseLessonsService {
    //添加一个课程
    int addCourseLesson(CourseLesson courseLesson);
    //查询所有课程
    List<CourseLesson> getAllCourseLessons();
    //查询限定数量的课程
    List<CourseLesson> getCourseLessonsByLimit(int start,int counts);
    //查询用户购买的所有课程
    List<CourseLesson> getCourseLessonsByUserId(long userId);
    //查询用户没有购买过的、限定数量的课程
    List<CourseLesson> getCourseLessonByExeclude(long userId,int start,int counts);
}
