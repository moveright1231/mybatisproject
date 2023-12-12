package com.ict01.mybatisproject.configuration;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@Configuration // 이 클래스를 Spring 구성 클래스로 지정
@MapperScan(basePackages = "com.ict01.mybatisproject.repository") // 지정된 패키지 내의 MyBatis 매퍼 인터페이스를 스캔
public class MybatisConfiguration {

    /**
     * SqlSessionFactory를 정의하는 빈입니다.
     *
     * @param dataSource             데이터 소스
     * @param applicationContext    애플리케이션 컨텍스트
     * @return                       생성된 SqlSessionFactory
     * @throws Exception             SqlSessionFactory 생성 중 발생하는 예외
     */
    @Bean // Spring 컨테이너에 의해 관리되는 빈(Bean)을 정의
    public SqlSessionFactory sqlSessionFactory(@Autowired DataSource dataSource,
                                               ApplicationContext applicationContext) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean(); // (1) SqlSessionFactoryBean 인스턴스 생성
        factoryBean.setDataSource(dataSource); // (2) DataSource 설정
        factoryBean.setMapperLocations(applicationContext.getResource(
                "classpath:/mybatis/mapper/Article.xml")); // (3) 매퍼 파일 위치 설정

        SqlSessionFactory factory = factoryBean.getObject(); // (4) SqlSessionFactory 생성
        factory.getConfiguration().setMapUnderscoreToCamelCase(true); // 언더스코어 네이밍과 카멜케이스 자동 매핑 활성화
        return factoryBean.getObject();
    }

    /**
     * SqlSessionTemplate을 정의하는 빈입니다.
     *
     * @param sqlSessionFactory      SqlSessionFactory
     * @return                       생성된 SqlSessionTemplate
     */
    @Bean // MyBatis의 SqlSession을 관리하는 SqlSessionTemplate 빈 정의
    public SqlSessionTemplate sqlSessionTemplate(@Autowired SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory); // SqlSessionTemplate 인스턴스 생성 및 반환
    }
}
