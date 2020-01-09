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
     * @author: cmots
     */
    Continue(100,"client should continue its request"),
    OK(200,"request success"),
    Fail(400,"message from client has error"),
    BusinessFail(401,"business operation failed");


    /*************** construct of msg code ***************/
    private int code;
    private String msg;

    MsgCode(int code,String msg){
        this.code=code;
        this.msg=msg;
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
}