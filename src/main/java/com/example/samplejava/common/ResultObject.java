package com.example.samplejava.common;

import java.io.Serializable;

import lombok.Data;

/**
 * ResultObject
 */
@Data
public class ResultObject<T> implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    private T data;

    public static ResultObject<Object> success() {
        return new ResultObject<>(SUCCESS);
    }

    public static ResultObject<Object> error(String message) {
        return new ResultObject<>(ERROR, message);
    }

    public static <T> ResultObject<T> instance(String code, T data) {
        return new ResultObject<T>(code, data);
    }

    public static final String SUCCESS = "200";

    public static final String ERROR = "-1";

    public ResultObject(String code) {
        this.code = code;
    }

    public ResultObject(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultObject(String code, T data) {
        this.code = code;
        this.data = data;
    }
}