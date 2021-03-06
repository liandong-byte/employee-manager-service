package cn.employee.manager.controller.advice;


import cn.employee.manager.config.Resp;
import cn.employee.manager.enums.ErrorCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 统一异常处理类
 *
 * @author liandong
 * Date: 2019/08/18
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionAdvice {


//    @ExceptionHandler(Exception.class)
//    public Resp exceptionHandler(Exception e) {
//        log.info("e:{}",e.getMessage());
//        return new Resp(ErrorCodeEnum.SERVER_ERR);
//    }
//
//
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public Resp handleBindException(MethodArgumentNotValidException e) {
//        FieldError fieldError = e.getBindingResult().getFieldError();
//        log.info("e:{}",e.getMessage());
//        return new Resp(ErrorCodeEnum.BIZ_PARAM_ERR, fieldError.getDefaultMessage());
//    }
//
//    @ExceptionHandler(BindException.class)
//    public Resp handleBindException(BindException e) {
//        FieldError fieldError = e.getBindingResult().getFieldError();
//        log.info("e:{}",e.getMessage());
//        return new Resp(ErrorCodeEnum.BIZ_PARAM_ERR, fieldError.getDefaultMessage());
//    }
}
