package com.hyc.controller;

import com.hyc.params.PurchaseCourseLessonParam;
import com.hyc.pojo.CourseLesson;
import com.hyc.pojo.PurchaseCourseLessonRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import com.hyc.service.BuyCourseLessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping("/purchaseCourseLessonRecord")
public class PurchaseCourseLessonRecordController {
    @Autowired
    @Qualifier("buyCourseLessonServiceImpl")
    private BuyCourseLessonService buyCourseLessonService;

    @PostMapping("/purchase")
    public ResultObj purchase(@RequestBody PurchaseCourseLessonParam param){
        try {
            ResultObj resultObj = buyCourseLessonService.buyCourseLesson(param);
            return resultObj;
        }catch (Exception e){
            return new ResultObj(0);
        }
    }
}
