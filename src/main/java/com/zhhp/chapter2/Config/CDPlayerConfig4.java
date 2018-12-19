package com.zhhp.chapter2.Config;

import com.zhhp.chapter2.CDPlayer;
import com.zhhp.chapter2.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:chapter2/CDPlayerconfig4.xml")
public class CDPlayerConfig4 {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc){
        return new CDPlayer(compactDisc);
    }
}
