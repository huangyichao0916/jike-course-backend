package com.hyc.dao;

import com.hyc.pojo.Choiceness;

import java.util.List;

public interface ChoicenessMapper {
    int insertChoiceness(Choiceness choi);
    List<Choiceness> getAllChoiceness();
}
