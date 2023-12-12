package com.ict01.mybatisproject.repository;

import com.ict01.mybatisproject.domain.Article;
import com.ict01.mybatisproject.domain.ArticleParameter;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 게시글 데이터에 접근하는 데 사용되는 Repository 인터페이스입니다.
 * 다양한 게시글 조회, 등록, 수정, 삭제 등의 기능을 정의하고 있습니다.
 * 해당 인터페이스를 상속받아 구현 클래스를 작성합니다.
 * 구현 클래스에서는 실제 데이터베이스와의 상호 작용을 수행합니다.
 * @see ArticleRepositoryImpl
 * @author : S.H.CHA
 */
@Repository // 이 인터페이스가 데이터 접근 계층의 구성 요소임을 나타냄
public interface ArticleRepository {

    /**
     * 모든 게시글을 조회하는 메소드
     * @return 모든 게시글을 담은 리스트
     */
    List<Article> getList();

    /**
     * 특정 아이디를 가진 게시글을 조회하는 메소드
     * @param articleId 조회할 게시글의 아이디
     * @return 특정 아이디를 가진 게시글
     */
    Article get(int articleId);

    /**
     * 새 게시글을 저장하는 메소드
     * @param article 저장할 게시글 정보
     */
    void save(ArticleParameter article);

    /**
     * 기존 게시글을 수정하는 메소드
     * @param article 수정할 게시글 정보
     */
    void update(ArticleParameter article);

    /**
     * 특정 아이디를 가진 게시글을 삭제하는 메소드
     * @param articleId 삭제할 게시글의 아이디
     */
    void delete(int articleId);
}
