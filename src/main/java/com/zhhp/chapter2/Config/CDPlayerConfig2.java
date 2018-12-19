package com.zhhp.chapter2.Config;

import com.zhhp.chapter2.CDPlayer;
import com.zhhp.chapter2.CompactDisc;
import com.zhhp.chapter2.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig2 {

    @Bean(name = "sgtPeppers")
    public CompactDisc sgtPeppers(){
        return new SgtPeppers();
    }

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}


/**javaConfig的配置方式
 *无须配置扫描的注解
 * 通过@Bean注解的方式实例化Bean，并可以完成DI
 * **/