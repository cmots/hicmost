/**
 * @author: cmots
 * @date: 2020/1/10 0:39
 * @description: handle all of exception here
 */
package com.cmots.hicmost.util;

import com.cmots.hicmost.vo.MsgCode;
import com.cmots.hicmost.vo.ResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionAdvisor {
    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionAdvisor.class);

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo validExceptionHandler(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        LOG.info(fieldError.getField() + ":" + fieldError.getDefaultMessage());
        return new ResultVo(MsgCode.Fail, null, fieldError.getField() + ":" + fieldError.getDefaultMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public ResultVo parameterTypeException(BusinessException e) {
        LOG.info(e.getMessage());
        return new ResultVo(MsgCode.BusinessFail, null, e.getMessage());
    }

}
