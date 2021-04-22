package com.hyc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
public class PageController {
    @RequestMapping("/login")
    public String getLoginPage(){
        return "index";
    }
    @RequestMapping("/account")
    public String getPage2(){
        return "index";
    }
    @RequestMapping("/rechargeRecord")
    public String getPage3(){
        return "index";
    }
    @RequestMapping("/allDiscoverLessonEveryday")
    public String getPage4(){
        return "index";
    }
    @RequestMapping("/allDiscoverTotalChoiceness")
    public String getPage5(){
        return "index";
    }
    @RequestMapping("/home")
    public String getPage7(){
        return "index";
    }
    @RequestMapping("/home/discover")
    public String getPage8(){
        return "index";
    }
    @RequestMapping("/home/course")
    public String getPage9(){
        return "index";
    }
    @RequestMapping("/home/course/lesson")
    public String getPage10(){
        return "index";
    }
    @RequestMapping("/home/course/practiceCamp")
    public String getPage11(){
        return "index";
    }
    @RequestMapping("/home/course/lessonEveryday")
    public String getPage12(){
        return "index";
    }
    @RequestMapping("/home/mine")
    public String getPage13(){
        return "index";
    }
    @RequestMapping("/home/study")
    public String getPage14(){
        return "index";
    }
}
