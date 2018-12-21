package com.zhhp.chapter3.test;

import com.zhhp.chapter3.Note;
import com.zhhp.chapter3.config.NoteConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = NoteConfig.class)
public class NoteTest {

    @Autowired
    private Note note1;

    @Autowired
    private Note note2;

    @Test
    public void test(){
        if (note1 != null){
            System.out.println(note1.getNum());
        }

        if (note2 != null){
            System.out.println(note2.getNum());
        }
    }

    /***
     * Spring Bean的生命周期分为4种
     * 1、单例 single  在Spring上下文种只有一个实例
     * 2、原型 prototype 在Spring中，每次需要的时候都会实例化一个新的
     * 3、会话
     * 4、请求
     *
     * 通过@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)注解，可以设置bean的生命周改
     */
}
