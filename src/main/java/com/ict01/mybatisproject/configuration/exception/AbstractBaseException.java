package com.ict01.mybatisproject.configuration.exception;

import com.ict01.mybatisproject.configuration.http.BaseResponseCode;

/**
 * Abstract base exception class for custom exceptions in the application.
 * 애플리케이션에서 발생하는 사용자 정의 예외에 대한 추상 기본 예외 클래스입니다.
 */
public class AbstractBaseException extends RuntimeException {
    private static final long serialVersionUID = -5681021438179867146L;

    /**
     * The base response code associated with the exception.
     * 예외와 관련된 기본 응답 코드입니다.
     */
    protected BaseResponseCode responseCode;

    /**
     * Additional arguments used for formatting the exception message.
     * 예외 메시지 서식 지정에 사용되는 추가 인자입니다.
     */
    protected Object[] args;

    /**
     * Default constructor.
     * 기본 생성자입니다.
     */
    public AbstractBaseException() {
        // Default constructor
        // 기본 생성자
    }

    /**
     * Constructor that takes a BaseResponseCode as an argument.
     * BaseResponseCode를 인자로 받는 생성자입니다.
     *
     * @param responseCode The base response code associated with the exception.
     *                     예외와 관련된 기본 응답 코드입니다.
     */
    public AbstractBaseException(BaseResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * Gets the base response code.
     * 기본 응답 코드를 반환합니다.
     *
     * @return The base response code.
     */
    public BaseResponseCode getResponseCode() {
        return responseCode;
    }

    /**
     * Gets the additional arguments used for formatting the exception message.
     * 예외 메시지 서식 지정에 사용되는 추가 인자를 반환합니다.
     *
     * @return Additional arguments.
     */
    public Object[] getArgs() {
        return args;
    }
}
