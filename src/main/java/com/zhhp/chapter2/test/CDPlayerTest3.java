package com.zhhp.chapter2.test;

import com.zhhp.chapter2.CDPlayer;
import com.zhhp.chapter2.Config.CDPlayerConfig3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig3.class)
public class CDPlayerTest3 {

    @Autowired
    private CDPlayer cdPlayer;

    @Test
    public void test(){
        if (cdPlayer != null){
            cdPlayer.play();
        }
    }
}
