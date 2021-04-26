package com.hyc.controller;

import com.hyc.pojo.Choiceness;
import com.hyc.pojo.EverydayLesson;
import com.hyc.pojo.ResultObj;
import com.hyc.service.ChoicenessService;
import com.hyc.service.ChoicenessServiceImpl;
import com.hyc.service.EverydayLessonService;
import com.hyc.utils.ConstsGetter;
import com.hyc.utils.UUIDCreator;
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

    @Autowired
    @Qualifier("choicenessServiceImpl")
    private ChoicenessService choicenessService;

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

    @GetMapping("/allChoiceness")
    public ResultObj getAllChoiceness(){
        try {
            List<Choiceness> allChoiceness = choicenessService.getAllChoiceness();
            return new ResultObj(1,allChoiceness);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @PostMapping("/insertChoiceness")
    public ResultObj insertChoiceness(@RequestBody Choiceness choiceness){
        int choicenessLen = Integer.parseInt(ConstsGetter.getConsts("choicenessLen"));
        try {
            choiceness.setChoicenessId(UUIDCreator.getShortUUID(choicenessLen));
            int i = choicenessService.insertChoiceness(choiceness);
            if (i == 1) {
                return new ResultObj(1);
            }
            return new ResultObj(0);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }
}
