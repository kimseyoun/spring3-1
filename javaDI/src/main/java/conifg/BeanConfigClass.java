package conifg;

import kr.hs.study.DataBean1;
import kr.hs.study.TestBean1;
import kr.hs.study.TestBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class
BeanConfigClass {
    @Bean
    public TestBean1 java1(){
        TestBean1 t = new TestBean1(11,"mark",new DataBean1());
        return t;
    }

    @Bean
    public TestBean2 java2(){
        TestBean2 t2 = new TestBean2();
        t2.setData1(22);
        t2.setData2(22.22);
        t2.setData3(new DataBean1());
        t2.setData4(new DataBean1());
        return t2;
    }
}
