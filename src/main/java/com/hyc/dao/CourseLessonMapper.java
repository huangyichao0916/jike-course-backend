package com.hyc.dao;

import com.hyc.pojo.CourseLesson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseLessonMapper {
    //添加课程
    int insertCourseLesson(CourseLesson courseLesson);

    //查询所有课程
    List<CourseLesson> queryAllCourseLessons();

    //限定课程数量的查询
    List<CourseLesson> queryCourseLessonsByLimit(@Param("start") int start,@Param("counts") int counts);

    //查询用户没有购买过的课程，并限定数量
    List<CourseLesson> getCourseLessonByExeclude(@Param("userId") long userId,@Param("start") int start,@Param("counts") int counts);

    //查询用户购买过的所有课程
    List<CourseLesson> getLessonsByUser(@Param("userId") long userId);
}
