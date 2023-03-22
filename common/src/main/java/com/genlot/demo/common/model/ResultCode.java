package com.genlot.demo.common.model;

/**
 * <p> 通用返回代码 </p>
 *
 * @author zc
 * @version 1.0
 * @date 2023/2/21 19:18
 */
public enum ResultCode implements IResultCode {
    /**
     * 失败状态码
     */
    FAILURE(9999, "失败"),
    /**
     * 成功状态码
     */
    SUCCESS(0, "成功"),

    AUTHORIZATION_HEADER_IS_NULL(1020, "签名为空"),

    AUTHORIZATION_FAILED(1021, "认证失败"),

    ;

    private int code;

    private String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return this.code;
    }

    @Override
    public String getMsg() {
        return this.message;
    }
}
