package com.hyc.service;

import com.hyc.dao.EverydayLessonMapper;
import com.hyc.pojo.EverydayLesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EverydayLessonServiceImpl implements EverydayLessonService{
    @Autowired
    @Qualifier("everydayLessonMapper")
    private EverydayLessonMapper everydayLessonMapper;

    @Override
    public int insertEverydayLesson(EverydayLesson lesson) {
        return everydayLessonMapper.insertEverydayLesson(lesson);
    }

    @Override
    public List<EverydayLesson> getAllEverydayLessons() {
        return everydayLessonMapper.getAllEverydayLessons();
    }
}
