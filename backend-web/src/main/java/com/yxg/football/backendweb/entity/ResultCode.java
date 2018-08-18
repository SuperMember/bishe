package com.yxg.football.backendweb.entity;

/**
 * 响应码枚举，参考HTTP状态码的语义
 */
public enum ResultCode {
    SUCCESS(20000),//成功
    FAIL(50000),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    NOT_FOUND(404),//接口不存在
    INTERNAL_SERVER_ERROR(500),//服务器内部错误
    SERVICE_ERROR(500),//服务错误
    USER_LOCK(40001);//用户锁定

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
