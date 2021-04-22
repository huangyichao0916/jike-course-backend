package com.hyc.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.hyc.pojo.ResultObj;

import java.text.SimpleDateFormat;

public class JsonUtils {
    public static String DEFAULT_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";

    public static String getJson(Object obj, String dataFormat) {
        ObjectMapper objectMapper = new ObjectMapper();
        //取消默认使用时间戳
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        objectMapper.setDateFormat(sdf);
        String s = null;
        try {
            s = objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String getJson(Object obj) {
        return getJson(obj, DEFAULT_FORMAT_STRING);
    }

    public static String getSuccessFlag() {
        return getJson(new ResultObj(1));
    }

    public static String getFailFlag() {
        return getJson(new ResultObj(0));
    }

    public static String getResultJson(int resultCode,Object obj){
        return getJson(new ResultObj(resultCode,obj));
    }
}

