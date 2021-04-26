package com.hyc.utils;

public class UUIDCreator {
    public static long getLongUUID(int length){
        String str = "";
        for (int i = 0; i < length; i++) {
            int randomNumber = (int) (Math.random()*10);
            String temStr = "" + randomNumber;
            str = str + temStr;
        }
        return Long.parseLong(str);
    }
    public static int getShortUUID(int len){
        if (len > 9){
            return 0;
        }
        String str = "";
        for (int i = 0; i < len; i++) {
            int randomNumber = (int) (Math.random()*10);
            String temStr = "" + randomNumber;
            str = str + temStr;
        }
        return Integer.parseInt(str);
    }
}
