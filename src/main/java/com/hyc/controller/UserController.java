package com.hyc.controller;

import com.hyc.pojo.RechargeRecord;
import com.hyc.pojo.ResultObj;
import com.hyc.pojo.User;
import com.hyc.service.UserService;
import com.hyc.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;

    @PostMapping("/login-or-register")
    public ResultObj loginOrRegister(@RequestBody User user, int type, HttpServletRequest request) {
        if (type == 0) {
            //登录
            try {
                ResultObj res = userService.login(user);
                if (res.getResultCode() == 1) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", 123);
                }
                return res;
            } catch (Exception e) {
                return new ResultObj(0);
            }
        } else {
            //注册
            try {
                ResultObj res = userService.register(user);
                if (res.getResultCode() == 1) {
                    HttpSession session = request.getSession();
                    session.setAttribute("user", 123);
                }
                return res;
            } catch (Exception e) {
                return new ResultObj(0);
            }
        }
    }

    @GetMapping("/userInfo")
    public ResultObj getUserInfo(int accountNumber) {
        return new ResultObj(1, userService.getUserInfoByAccountNumber(accountNumber));
    }

    @PostMapping("/recharge")
    public ResultObj recharge(@RequestBody RechargeRecord record) {
        try {
            userService.recharge(record);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResultObj(0);
        }
        return new ResultObj(1);
    }

    @GetMapping("/rechargeRecords")
    public ResultObj getRechargeRecords(long userId) {
        try {
            List<RechargeRecord> records = userService.getRecordsByUserId(userId);
            return new ResultObj(1, records);
        } catch (Exception e) {
            return new ResultObj(0);
        }
    }
}
