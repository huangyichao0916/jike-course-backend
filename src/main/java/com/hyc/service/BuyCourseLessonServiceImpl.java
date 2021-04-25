package com.hyc.service;

import com.hyc.dao.PurchaseCourseLessonRecordsMapper;
import com.hyc.dao.UserMapper;
import com.hyc.params.PurchaseCourseLessonParam;
import com.hyc.pojo.CourseLesson;
import com.hyc.pojo.PurchaseCourseLessonRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BuyCourseLessonServiceImpl implements BuyCourseLessonService{
    @Autowired
    @Qualifier("purchaseCourseLessonRecordsMapper")
    private PurchaseCourseLessonRecordsMapper purchaseCourseLessonRecordsMapper;

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Override
    public ResultObj buyCourseLesson(PurchaseCourseLessonParam param) throws Exception {
        /**
         * 购买课程resultCode
         * 0，未知错误
         * 1，成功购买
         * 2，余额不足
         */
        int balance = param.getBalance();
        int priceSale = param.getPriceSale();
        long userId = param.getUserId();
        int courseLessonId = param.getId();
        if (balance < priceSale) {
            return new ResultObj(2);
        }
        int j = purchaseCourseLessonRecordsMapper.insertRecord(new PurchaseCourseLessonRecord(userId, courseLessonId));
        int i = userMapper.decreaseBalance(userId,priceSale);
        if (!(i == 1 && j == 1)){
            throw new Exception("未能成功购买");
        }
        return new ResultObj(1);
    }
}
