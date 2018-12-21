package com.zhhp.chapter3.config;

import com.zhhp.chapter3.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppleConfig {


    @Bean
    @Profile("dev")
    public Apple devApple(){
        return new Apple("dev");
    }


    @Bean
    @Profile("prov")
    public Apple provApple(){
        return new Apple("prov");
    }
}

/**
 * spring高级配置，通过@Profile注解，配置在不同的环境中采用不同的配置
 * 激活属性的方式：
 *
 * 有多种方式来设置这两个属性：
 * 作为DispatcherServlet的初始化参数；
 * 作为Web应用的上下文参数；
 * 作为JNDI条目；
 * 作为环境变量；
 * 作为JVM的系统属性；
 * 在集成测试类上，使用@ActiveProfiles注解设置。
 * */