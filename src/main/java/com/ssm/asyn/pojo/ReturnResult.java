package com.ssm.asyn.pojo;

import lombok.Data;

/**
 * Return Message
 *
 * @author Di Guan on 8/1/2021 3:07 PM
 */
@Data
public class ReturnResult {
    private boolean status;
    private String message;
    private Object returnData;

    public ReturnResult(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public ReturnResult(boolean status, String message, Object returnData) {
        this.status = status;
        this.message = message;
        this.returnData = returnData;
    }
}
