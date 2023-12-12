package com.ict01.mybatisproject.domain;

import lombok.Data;



@Data // Lombok 라이브러리를 사용하여 getter, setter, toString 등을 자동 생성
public class Article {

    private int articleId; // 아이디
    private String title; // 제목
    private String contents; // 내용
    private String regDate; // 등록 날짜
}
