package kr.hs.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class TestBean1 {
    private int data1;
    private  String data2;
    private DataBean1 data3;

    public TestBean1(int data1, String data2, DataBean1 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }


}

