package kr.hs.study.config;

import kr.hs.study.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfigClass {
    //스프링에서 명령을 내리는 설정파일
    @Bean
    public TestBean1 java1(){
        TestBean1 t1 = new TestBean1();
        return t1;
    }
    @Bean(name ="new")
    public TestBean2 java2(){
        return new TestBean2();
    }



    @Bean(name = "a3")
    @Lazy
    @Scope
    public TestBean3 java3(){
        return new TestBean3();
    }

    @Bean(name = "bean4_1")
    public TestBean4 java4_1(){
        return new TestBean4();
    }

    @Bean(name = "bean4_2")
    public TestBean4 java4_2(){
        return new TestBean4();
    }

    @Bean
    public TestBean5 java5(){
        return new TestBean5();
    }

    @Bean(initMethod = )

}
