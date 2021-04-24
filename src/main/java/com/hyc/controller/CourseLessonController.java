package com.hyc.controller;

import com.hyc.pojo.CourseLesson;
import com.hyc.pojo.ResultObj;
import com.hyc.service.CourseLessonsService;
import com.hyc.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/course-lesson")
@ResponseBody
public class CourseLessonController {
    @Autowired
    @Qualifier("courseLessonsServiceImpl")
    private CourseLessonsService courseLessonsService;

    @PostMapping("/addCourseLesson")
    public String addCourseLesson(@RequestBody CourseLesson courseLesson) {
        try {
            courseLessonsService.addCourseLesson(courseLesson);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.getFailFlag();
        }
        return JsonUtils.getSuccessFlag();
    }

    @GetMapping("/allCourseLessons")
    public ResultObj getAllCourseLessons() {
        try {
            List<CourseLesson> allCourseLessons = courseLessonsService.getAllCourseLessons();
            return new ResultObj(1,allCourseLessons);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/courseLessonsByLimit")
    public ResultObj getCourseLessonsByLimit(int start, int counts) {
        try {
            List<CourseLesson> courseLessonsByLimit = courseLessonsService.getCourseLessonsByLimit(start, counts);
            return new ResultObj(1,courseLessonsByLimit);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/courseLessonByExeclude")
    public ResultObj getCourseLessonByExeclude(long userId, int start, int counts){
        try {
            List<CourseLesson> courseLessonByExeclude = courseLessonsService.getCourseLessonByExeclude(userId, start, counts);
            return new ResultObj(1,courseLessonByExeclude);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/courseLessonsByUser")
    public ResultObj getCourseLessonsByUser(long userId){
        try {
            List<CourseLesson> courseLessonsByUserId = courseLessonsService.getCourseLessonsByUserId(userId);
            return new ResultObj(1,courseLessonsByUserId);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }
}
