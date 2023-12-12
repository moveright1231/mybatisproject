package com.ict01.mybatisproject.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import java.util.Locale;

/**
 * 웹 구성을 위한 Spring 구성 클래스입니다.
 * 이 클래스는 메시지 소스를 설정하여 다국어 지원을 위한 기본 환경을 제공합니다.
 */
@Configuration // 이 클래스를 Spring 구성 클래스로 지정
public class WebConfiguration {

    /**
     * ReloadableResourceBundleMessageSource를 정의하는 빈입니다.
     *
     * @return 생성된 ReloadableResourceBundleMessageSource
     */
    @Bean // Spring 컨테이너에 의해 관리되는 빈(Bean)을 정의
    public ReloadableResourceBundleMessageSource messageSource() {
        ReloadableResourceBundleMessageSource source = new ReloadableResourceBundleMessageSource();
        source.setBasename("classpath:/messages/message"); // 메시지 소스 파일의 기본 경로 설정
        source.setDefaultEncoding("UTF-8"); // 기본 문자 인코딩 설정
        source.setCacheSeconds(60); // 메시지 소스 캐시 시간 설정
        source.setDefaultLocale(Locale.KOREAN); // 기본 로케일 설정
        source.setUseCodeAsDefaultMessage(true); // 메시지 코드가 메시지 키로 사용될지 여부 설정
        return source;
    }
}
