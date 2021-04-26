package com.hyc.dao;

import com.hyc.pojo.EverydayLesson;

import java.util.List;

public interface EverydayLessonMapper {
    int insertEverydayLesson(EverydayLesson lesson);
    List<EverydayLesson> getAllEverydayLessons();
}
