package com.genlot.demo.common.model;

import java.io.Serializable;

/**
 * <p> 通用返回 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/21 18:18
 */
public class Response<T> implements Serializable {

    private int code;
    private String msg;
    private T data;

    public static Response SUCCESS = new Response();

    public static Response FAILURE = new Response(ResultCode.FAILURE);

    public Response() {
        this(ResultCode.SUCCESS, null);
    }

    public Response(int code){
        this(code, "", null);
    }

    public Response(T data){
        this(ResultCode.SUCCESS, data);
    }

    public Response(int code, String message) {
        this(code, message, null);
    }

    public Response(IResultCode resultCode){
        this(resultCode, null);
    }

    public Response(IResultCode resultCode, T data){
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public Response(int code, String message, T data) {
        this.code = code;
        this.msg = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
