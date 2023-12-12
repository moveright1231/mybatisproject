package com.ict01.mybatisproject.configuration.exception;

import com.ict01.mybatisproject.configuration.http.BaseResponseCode;


public class BaseException extends AbstractBaseException {

    private static final long serialVersionUID = -8367707264653731470L;

    /**
     * 기본 생성자
     */
    public BaseException() {
        // Default constructor
        // 기본 생성자
    }

    /**
     * responseCode를 파라미터로 받는 생성자
     *
     * @param responseCode HTTP 응답 코드
     */
    public BaseException(BaseResponseCode responseCode) {
        this.responseCode = responseCode;
    }

    /**
     * responseCode와 args를 파라미터로 받는 생성자
     *
     * @param responseCode HTTP 응답 코드
     * @param args         추가 파라미터 배열
     */
    public BaseException(BaseResponseCode responseCode, String[] args) {
        this.responseCode = responseCode;
        this.args = args;
    }
}
