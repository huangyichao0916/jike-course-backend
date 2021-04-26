package com.hyc.service;

import com.hyc.pojo.EverydayLesson;

import java.util.List;

public interface EverydayLessonService {
    int insertEverydayLesson(EverydayLesson lesson);
    List<EverydayLesson> getAllEverydayLessons();
}
