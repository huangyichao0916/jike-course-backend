package com.hyc.controller;

import com.hyc.utils.JsonUtils;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@ResponseBody
@RestController
public class TestController {
    @RequestMapping("/test")
    public String testController() {
        return JsonUtils.getSuccessFlag();
    }

    @RequestMapping("/jjj")
    public Stu testController2(String time1,int id) {
        System.out.println(time1);
        System.out.println(id);
        return new Stu();
    }
}

class Stu {
    private int id = 3;
    private String name = "黄毅超";

    @Override
    public String toString() {
        return "Stu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stu(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Stu() {
    }
}