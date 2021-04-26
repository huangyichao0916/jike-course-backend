package com.hyc.controller;

import com.hyc.params.JoinPracticeCampParam;
import com.hyc.pojo.PracticeCamp;
import com.hyc.pojo.ResultObj;
import com.hyc.service.PracticeCampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/practice-camp")
@ResponseBody
public class PracticeCampController {
    @Autowired
    @Qualifier("practiceCampServiceImpl")
    private PracticeCampService practiceCampService;

    @PostMapping("/addCamp")
    public ResultObj addPracticeCamp(@RequestBody PracticeCamp practiceCamp){
        System.out.println(practiceCamp);
        try {
            int i = practiceCampService.addPractice(practiceCamp);
            if (i == 1) {
                return new ResultObj(1);
            }
            return new ResultObj(0);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/allPracticeCamps")
    public ResultObj getAllPracticeCamps(){
        try {
            List<PracticeCamp> allPracticeCamps = practiceCampService.getAllPracticeCamps();
            return new ResultObj(1,allPracticeCamps);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/purchasedPracticeCamps")
    public ResultObj getPracticeCampsByUserId(long userId){
        try {
            List<PracticeCamp> purchasedPracticeCamps = practiceCampService.getPracticeCampsByUserId(userId);
            return new ResultObj(1,purchasedPracticeCamps);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @GetMapping("/practiceCampByExeclude")
    public ResultObj getPracticeCampByExeclude(long userId){
        try {
            List<PracticeCamp> purchasedPracticeCamps = practiceCampService.getPracticeCampByExeclude(userId);
            return new ResultObj(1,purchasedPracticeCamps);
        }catch (Exception e){
            return new ResultObj(0);
        }
    }

    @PostMapping("/joincamp")
    public ResultObj joinPracticeCamp(@RequestBody JoinPracticeCampParam param){
        try {
            ResultObj resultObj = practiceCampService.joinPracticeCamp(param);
            return resultObj;
        } catch (Exception e) {
            return new ResultObj(0);
        }
    }
}
