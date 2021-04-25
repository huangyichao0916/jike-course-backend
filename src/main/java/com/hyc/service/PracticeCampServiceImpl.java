package com.hyc.service;

import com.hyc.dao.JoinPracticeCampsRecordsMapper;
import com.hyc.dao.PracticeCampMapper;
import com.hyc.dao.UserMapper;
import com.hyc.params.JoinPracticeCampParam;
import com.hyc.pojo.PracticeCamp;
import com.hyc.pojo.PurchasePracticeCampRecord;
import com.hyc.pojo.ResultObj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PracticeCampServiceImpl implements PracticeCampService{
    @Autowired
    @Qualifier("practiceCampMapper")
    private PracticeCampMapper practiceCampMapper;

    @Autowired
    @Qualifier("userMapper")
    private UserMapper userMapper;

    @Autowired
    @Qualifier("joinPracticeCampsRecordsMapper")
    private JoinPracticeCampsRecordsMapper joinPracticeCampsRecordsMapper;

    @Override
    public int addPractice(PracticeCamp practiceCamp) {
        return practiceCampMapper.insertPracticeCamp(practiceCamp);
    }

    @Override
    public List<PracticeCamp> getAllPracticeCamps() {
        return practiceCampMapper.queryAllPracticeCamps();
    }

    @Override
    public List<PracticeCamp> getPracticeCampsByUserId(long userId) {
        return practiceCampMapper.queryPracticeByUserId(userId);
    }

    @Override
    public List<PracticeCamp> getPracticeCampByExeclude(long userId) {
        return practiceCampMapper.queryPracticeByExeclude(userId);
    }

    @Override
    public ResultObj joinPracticeCamp(JoinPracticeCampParam param) throws Exception {
        /**
         * 0，未知错误
         * 1，参加成功
         * 2，余额不足
         */
        int campId = param.getCampId();
        int balance = param.getBalance();
        long userId = param.getUserId();
        int price = param.getPrice();

        if (balance < price){
            return new ResultObj(2);
        }
        int i = userMapper.decreaseBalance(userId, price);
        int j = joinPracticeCampsRecordsMapper.insertRecord(new PurchasePracticeCampRecord(userId, campId));
        if (i == 1 && j == 1) {
            return new ResultObj(1);
        }
        throw new Exception("查询数据库出错了");
    }
}
