package kr.hs.study.beans;

import org.springframework.stereotype.Component;



@Component
public class TestBean1 {
    private DataBean1 data1;
    public TestBean1(){
        System.out.println("TestBean생성자");
    }

    public DataBean1 getData1() {
        return data1;
    }


}
