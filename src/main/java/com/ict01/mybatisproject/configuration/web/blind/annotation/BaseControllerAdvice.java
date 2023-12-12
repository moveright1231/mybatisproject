package com.ict01.mybatisproject.configuration.web.blind.annotation;

import com.ict01.mybatisproject.configuration.exception.BaseException;
import com.ict01.mybatisproject.configuration.http.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

/**
 * @author : S.H.CHA
 */
@Controller
public class BaseControllerAdvice {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(value = { BaseException.class })
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    private BaseResponse<String> handleBaseException(BaseException e, WebRequest request) {
        return new BaseResponse<String>(e.getResponseCode(),
                messageSource.getMessage(e.getResponseCode().name(), e.getArgs(), null));
    }
}
