package com.hyc.utils;

public class UUIDCreator {
    public static long getAcountUUID (int length){
        String str = "";
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random()*10);
            String temStr = "" + randomNumber;
            str = str + temStr;
        }
        return Long.parseLong(str);
    }
}
