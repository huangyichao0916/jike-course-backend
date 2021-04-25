package com.hyc.dao;

import com.hyc.pojo.CourseLesson;
import com.hyc.pojo.PurchaseCourseLessonRecord;
import com.hyc.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PurchaseCourseLessonRecordsMapper {
    //插入一条购买课程的记录
    int insertRecord(PurchaseCourseLessonRecord record);
    //根据用户id查询所有购买的课程
    List<PurchaseCourseLessonRecord> queryAllRecords(@Param("userId") long userId);
}
