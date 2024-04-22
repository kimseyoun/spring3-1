package kr.hs.study;

import config.BeanConfigClass;
import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        //data1 값을 출력시켜라 ..
        TestBean1 obj1 =ctx.getBean(TestBean1.class);
        //obj1.setData1(new DataBean1());
        System.out.println("data"+obj1.getData1());

        ctx.close();
    }
}