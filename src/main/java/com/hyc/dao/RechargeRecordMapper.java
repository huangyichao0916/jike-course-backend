package com.hyc.dao;

import com.hyc.pojo.RechargeRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RechargeRecordMapper {
    //增加一条充值记录
    int addRecord(RechargeRecord record);
    //根据userId获取充值记录
    List<RechargeRecord> getRecordsByUserId (@Param("userId") long userId);
}
