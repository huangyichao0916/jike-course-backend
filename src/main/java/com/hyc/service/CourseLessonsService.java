package com.hyc.service;

import com.hyc.pojo.CourseLesson;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseLessonsService {
    //添加一个课程
    int addCourseLesson(CourseLesson courseLesson);
    //查询所有课程
    List<CourseLesson> getAllCourseLessons();
    //查询限定数量的课程
    List<CourseLesson> getCourseLessonsByLimit(int start,int counts);
}
