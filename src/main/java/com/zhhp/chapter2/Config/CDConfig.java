package com.zhhp.chapter2.Config;

import com.zhhp.chapter2.CompactDisc;
import com.zhhp.chapter2.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDConfig {

    @Bean
    public CompactDisc compactDisc(){
        return new SgtPeppers();
    }
}
