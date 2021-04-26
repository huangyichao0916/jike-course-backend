package com.hyc.controller;

import com.hyc.pojo.EverydayLesson;
import com.hyc.pojo.ResultObj;
import com.hyc.service.EverydayLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/discoverData")
@CrossOrigin
@ResponseBody
public class DisCoverController {
    @Autowired
    @Qualifier("everydayLessonServiceImpl")
    private EverydayLessonService everydayLessonService;

    @GetMapping("/allEveryDayLesson")
    public ResultObj getAllEveryDayLessons(){
        try {
            List<EverydayLesson> allEverydayLessons = everydayLessonService.getAllEverydayLessons();
            return new ResultObj(1,allEverydayLessons);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @PostMapping("/insertEveryDayLesson")
    public ResultObj insertEveryDayLesson(@RequestBody EverydayLesson lesson){
        try {
            int i = everydayLessonService.insertEverydayLesson(lesson);
            if (i == 1) {
                return new ResultObj(1);
            }
            return new ResultObj(0);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }
}
