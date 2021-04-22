package com.hyc.service;

import com.hyc.dao.CourseLessonMapper;
import com.hyc.pojo.CourseLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CourseLessonsServiceImpl implements CourseLessonsService{
    @Autowired
    @Qualifier("courseLessonMapper")
    private CourseLessonMapper courseLessonMapper;

    @Override
    public int addCourseLesson(CourseLesson courseLesson) {
        int i = courseLessonMapper.insertCourseLesson(courseLesson);
        return i;
    }

    @Override
    public List<CourseLesson> getAllCourseLessons() {
        return courseLessonMapper.queryAllCourseLessons();
    }

    @Override
    public List<CourseLesson> getCourseLessonsByLimit(int start, int counts) {
        return courseLessonMapper.queryCourseLessonsByLimit(start,counts);
    }
}
