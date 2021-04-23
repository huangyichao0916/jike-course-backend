package com.hyc.pojo;

import java.io.Serializable;

public class ResultObj implements Serializable {
    private int resultCode;
    private Object resultObj;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public void setResultObj(Object resultObj) {
        this.resultObj = resultObj;
    }

    public ResultObj(int resultCode, Object resultObj) {
        this.resultCode = resultCode;
        this.resultObj = resultObj;
    }

    @Override
    public String toString() {
        return "ResultObj{" +
                "resultCode=" + resultCode +
                ", resultObj=" + resultObj +
                '}';
    }

    public ResultObj(int resultCode) {
        this.resultCode = resultCode;
    }

    public ResultObj() {
    }
}
