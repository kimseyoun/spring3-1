package kr.hs.study;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class TestBean2 {
    public TestBean2(){
        System.out.println("2");
    }
}
