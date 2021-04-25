package com.hyc.service;

import com.hyc.params.JoinPracticeCampParam;
import com.hyc.pojo.PracticeCamp;
import com.hyc.pojo.ResultObj;

import java.util.List;

public interface PracticeCampService {
    //添加一个训练营
    int addPractice(PracticeCamp practiceCamp);
    //获取全部的训练营
    List<PracticeCamp> getAllPracticeCamps();
    //获取用户购买过的训练营
    List<PracticeCamp> getPracticeCampsByUserId(long userId);
    //获取用户没有购买过的训练营
    List<PracticeCamp> getPracticeCampByExeclude(long userId);
    //参加训练营
    ResultObj joinPracticeCamp(JoinPracticeCampParam param) throws Exception;
}
