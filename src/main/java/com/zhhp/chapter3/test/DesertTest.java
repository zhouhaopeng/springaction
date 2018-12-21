package com.zhhp.chapter3.test;


import com.zhhp.chapter3.Desert;
import com.zhhp.chapter3.config.DesertConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DesertConfig.class)
public class DesertTest {

    //@Qualifier("cake")
    @Autowired
    private Desert desert;


    @Test
    public void test(){
        if (desert != null){
            System.out.println("success");
        }
    }

    /****
     * 当一个接口有多个实现的时候spring自动装配会出现分歧
     * 解决分歧的办法：
     * 1、添加@Primary 配置优先选定
     * 2、在自动注入注解上添加 @Qualifier 配置，注入特定的bean
     */
}
