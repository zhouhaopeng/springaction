package com.zhhp.chapter2.test;

import com.zhhp.chapter2.Config.CDPlayerConfig;
import com.zhhp.chapter2.CompactDisc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Autowired
    private CompactDisc compactDisc;


    @Test
    public void cdShouldNotBeNull(){
        if (compactDisc != null)
            System.out.println("success");
    }
}
