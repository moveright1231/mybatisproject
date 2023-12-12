package com.ict01.mybatisproject.configuration.http;

import lombok.Data;



@Data // Lombok 라이브러리를 활용하여 기본적인 getter, setter, toString 등을 자동으로 생성
public class BaseResponse<T> {

    private BaseResponseCode code; // 응답 코드를 나타내는 멤버 변수
    private String message; // 응답 메시지를 나타내는 멤버 변수
    private T data; // 실제 응답 데이터를 담을 제네릭 타입의 멤버 변수

    /**
     * 데이터만을 인자로 받는 생성자.
     * 기본적으로 성공 응답을 나타내는 기본 코드와 함께 사용됩니다.
     *
     * @param data 응답 데이터
     */
    public BaseResponse(T data) {
        this.code = BaseResponseCode.SUCCESS;
        this.data = data;
    }

    /**
     * 응답 코드와 메시지를 인자로 받는 생성자.
     * BaseControllerAdvice에서 사용됩니다.
     *
     * @param code    응답 코드
     * @param message 응답 메시지
     */
    public BaseResponse(BaseResponseCode code, String message) {
        this.code = code;
        this.message = message;
    }
}
