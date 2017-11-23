package com.wqh.blog.enums;

/**
 * @author wqh
 * @Date 2017/10/30 21:55
 * @Description: 返回异常结果的枚举
 */
public enum  ResultEnum {

    UNKNOWN_ERROR(0,"未知错误"),
    PARAM_ERROR(1,"参数不正确"),

    LOGIN_ERROR(2,"登陆错误，请重新登陆"),
    UNKNOWN_USER_ERROR(3,"该用户不存在")

    ;
    /**状态码*/
    private Integer code;
    /**错误信息*/
    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
