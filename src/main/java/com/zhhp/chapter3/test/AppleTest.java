package com.zhhp.chapter3.test;

import com.zhhp.chapter3.Apple;
import com.zhhp.chapter3.config.AppleConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppleConfig.class)
@ActiveProfiles("prov")
public class AppleTest {

    @Autowired
    private Apple apple;

    @Test
    public void test(){
        if (apple != null){
            System.out.println(apple.getColor());
        }
    }
}
