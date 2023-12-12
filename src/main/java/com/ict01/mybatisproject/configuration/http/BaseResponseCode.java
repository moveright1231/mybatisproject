package com.ict01.mybatisproject.configuration.http;


public enum BaseResponseCode {

    SUCCESS,
    // 성공되었음을 나타냄

    ERROR,
    // 오류 발생을 알려줌

    DATA_IS_NULL,
    // NULL값을 인지함

    VALIDATE_REQUIRED,
    // 데이터 유효성 검증 필요를 나타냄
    ;
}
