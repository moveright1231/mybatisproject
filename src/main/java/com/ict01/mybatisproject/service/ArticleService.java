package com.ict01.mybatisproject.service;

import com.ict01.mybatisproject.domain.Article;
import com.ict01.mybatisproject.domain.ArticleParameter;
import com.ict01.mybatisproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 게시글 관련 비즈니스 로직을 처리하는 서비스 클래스입니다.
 * 게시글의 조회, 등록, 수정, 삭제 기능을 제공합니다.
 *
 * @author : S.H.CHA
 */
@Service // 이 클래스가 서비스 레이어의 구성 요소임을 나타냄
public class ArticleService {

    @Autowired // 의존성 자동 주입
    private ArticleRepository articleRepository;

    // [1] 전체 게시글 목록 조회
    public List<Article> getList(){
        return articleRepository.getList(); // 리포지토리를 통해 모든 게시글 목록을 조회
    }

    // [2] 특정 게시글 조회
    public Article get(int articleId) {
        return articleRepository.get(articleId); // 리포지토리를 통해 특정 아이디의 게시글을 조회
    }

    // [3] 게시글 등록/수정
    public void save(ArticleParameter parameter){
        Article article = articleRepository.get(parameter.getArticleId());
        if(article == null) {
            articleRepository.save(parameter); // 새 게시글 등록
        } else {
            articleRepository.update(parameter); // 기존 게시글 수정
        }
    }

    // [5] 게시글 삭제
    public void delete(int articleId) {
        articleRepository.delete(articleId); // 리포지토리를 통해 특정 아이디의 게시글 삭제
    }
}
