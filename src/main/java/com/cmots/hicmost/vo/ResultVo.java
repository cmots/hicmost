/**
 * @author: cmots
 * @date: 2020/1/10 0:42
 * @description: encapsulate result of response
 */
package com.cmots.hicmost.vo;

public class ResultVo {
    private int code;
    private Object data;
    private String msg;
    private String detail;

    public ResultVo(MsgCode code) {
        this.code = code.getCode();
        this.msg = code.getMsg();
    }

    public ResultVo(MsgCode code, Object data) {
        this(code);
        this.data = data;
    }

    public ResultVo(MsgCode code, Object data, String detail) {
        this(code, data);
        this.detail=detail;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
