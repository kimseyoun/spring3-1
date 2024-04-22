package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("t1")
public class TestBean1 {
    @Autowired
    @Qualifier("d1")
    private DataBean1 data1; //setData()

    @Autowired
    private DataBean1 data2;

    public DataBean1 getData1() {
        return data1;
    }

    public DataBean1 getData2() {
        return data2;
    }
}
