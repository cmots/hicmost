/**
 * @author: cmots
 * @date: 2020/1/10 0:15
 * @description: define a custome exception of bussiness
 */
package com.cmots.hicmost.util;

public class BusinessException extends RuntimeException{
    public BusinessException(){
        super("事务处理出现问题，数据回滚");
    }
}
