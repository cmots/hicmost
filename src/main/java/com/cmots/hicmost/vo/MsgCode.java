/**
 * @author: cmots
 * @date: 2020/1/10 0:43
 * @description: custome code of response
 */
package com.cmots.hicmost.vo;

public enum MsgCode {
    /**
     * 此处是状态码枚举，等待补充
     * 状态码包含着在前后端交互的返回体中
     * 1xx: 信息，服务器收到请求，需要请求者继续执行操作
     * 2xx: 成功，操作被接受并处理
     * 3xx: 重定向，继续操作以完成请求
     * 4xx: 客户端错误，请求不合法或无法完成请求
     * 5xx: 服务器错误，服务器在处理请求时发生了错误
     * 1xxx: 参数错误
     * 2xxx: 用户错误
     * 3xxx: 接口异常
     *
     * @author: cmots
     */
    Continue(100,"继续发送请求", "client should continue its request"),
    OK(200, "请求成功","request success"),
    Fail(400, "请求失败","message from client has error"),
    BusinessFail(401, "事务异常","business operation failed"),

    ParamInvalid(1001,"参数无效","parameters are invalid"),
    ParamEmpty(1002,"参数为空","parameter is empty"),
    ParamTypeError(1003,"参数类型错误","type of parameter is wrong"),
    ParamMiss(1004,"参数缺失","missed some requested parameters"),

    NotLogin(2001,"用户未登录","user hasn't login yet"),
    LoginExpired(2002,"登录过期","login account is expired"),
    CredentialsError(2003,"密码错误","user credential is wrong"),
    CredentialsExpired(2004,"密码过期","user credential is expired"),
    AccountDisabled(2005,"账号不可用","account is disabled"),
    AccountLocked(2006,"账号被锁定","account is locked"),
    AccountNotExist(2007,"用户不存在","account isn't existed"),
    AccountAlreadyExist(2008,"用户已存在","account is already existed"),
    AccountUsedByOther(2009,"账号在其他地点登录","account is used by others"),

    NoPermission(3001,"没有权限","user access denied");



    /*************** construct of msg code ***************/
    private int code;
    private String msg;
    private String info;

    MsgCode(int code, String msg, String info) {
        this.code = code;
        this.msg = msg;
        this.info = info;
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

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}