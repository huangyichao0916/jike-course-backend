package com.hyc.service;

import com.hyc.pojo.Choiceness;

import java.util.List;

public interface ChoicenessService {
    int insertChoiceness(Choiceness choi);
    List<Choiceness> getAllChoiceness();
}
