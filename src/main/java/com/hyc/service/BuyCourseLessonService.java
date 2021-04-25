package com.hyc.service;

import com.hyc.params.PurchaseCourseLessonParam;
import com.hyc.pojo.CourseLesson;
import com.hyc.pojo.PurchaseCourseLessonRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;

public interface BuyCourseLessonService {
    //购买一个课程
    ResultObj buyCourseLesson(PurchaseCourseLessonParam param) throws Exception;
}
