package com.zhhp.chapter3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.zhhp.chapter3")
@PropertySource("classpath:com/zhhp/chapter3/stu.properties")
public class StudentConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

}

/****
 * properties 属性通过@Value注解，注入到属性中
 */
