package com.zhhp.chapter2.Config;

import com.zhhp.chapter2.CDPlayer;
import com.zhhp.chapter2.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig3 {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}

/**
 * javaConfig配置方式，混合配置，通过@Import注解加入配置类
 * @Import({CDConfig.class，CDPlayerConfig3.class}),也可以采用这种方式合并
 * */