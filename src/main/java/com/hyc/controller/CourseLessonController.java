package com.hyc.controller;

import com.hyc.pojo.CourseLesson;
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

    @PostMapping("/add")
    public String addCourseLesson(@RequestBody CourseLesson courseLesson) {
        try {
            courseLessonsService.addCourseLesson(courseLesson);
        } catch (Exception e) {
            e.printStackTrace();
            return JsonUtils.getFailFlag();
        }
        return JsonUtils.getSuccessFlag();
    }

    @GetMapping("/getAll")
    public List<CourseLesson> getAllCourseLessons() {
        return courseLessonsService.getAllCourseLessons();
    }

    @GetMapping("/getByLimit")
    public List<CourseLesson> getCourseLessonsByLimit(int start, int counts) {
        return courseLessonsService.getCourseLessonsByLimit(start, counts);
    }
}
