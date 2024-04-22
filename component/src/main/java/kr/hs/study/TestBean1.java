package kr.hs.study;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component("t1")
/*@Lazy
@Scope("protoType")*/
public class TestBean1 {
    @PostConstruct
    void test(){
        System.out.println("ee");
    }
    public TestBean1(){
        System.out.println("dd");
    }

}
