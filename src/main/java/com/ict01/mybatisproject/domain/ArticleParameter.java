package com.ict01.mybatisproject.domain;

import lombok.Data;

/**
 * 게시판의 게시글 등록 및 수정을 위한 매개변수 클래스입니다.
 * 게시글의 기본 정보(아이디, 제목, 내용)를 포함합니다.
 *
 */

@Data // Lombok 라이브러리를 사용하여 getter, setter, toString 등을 자동 생성
public class ArticleParameter {

    private int articleId; // 게시글의 고유 아이디
    private String title; // 게시글의 제목
    private String contents; // 게시글의 내용
}
