package com.hyc.service;

import com.hyc.dao.ChoicenessMapper;
import com.hyc.pojo.Choiceness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChoicenessServiceImpl implements ChoicenessService{
    @Autowired
    @Qualifier("choicenessMapper")
    private ChoicenessMapper choicenessMapper;

    @Override
    public int insertChoiceness(Choiceness choi) {
        return choicenessMapper.insertChoiceness(choi);
    }

    @Override
    public List<Choiceness> getAllChoiceness() {
        return choicenessMapper.getAllChoiceness();
    }
}
