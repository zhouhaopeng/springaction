package com.zhhp.chapter3.test;


import com.zhhp.chapter3.Student;
import com.zhhp.chapter3.config.StudentConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = StudentConfig.class)
public class StudentTest {


    @Autowired
    private Student student;

    @Test
    public void  test(){
        if (student != null){
            System.out.println(student.getName());
        }
    }
}
