package com.hyc.dao;

import com.hyc.pojo.PracticeCamp;

import java.util.List;

public interface PracticeCampMapper {
    //添加一个训练营
    int insertPracticeCamp(PracticeCamp practiceCamp);
    //查询所有训练营
    List<PracticeCamp> queryAllPracticeCamps();
    //根据用户ID查询用户购买过的训练营
    List<PracticeCamp> queryPracticeByUserId(long userId);
    //根据用户ID查询用户没有购买过的训练营
    List<PracticeCamp> queryPracticeByExeclude(long userId);
}
