package kr.hs.study;

import conifg.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        System.out.println(obj1);

        TestBean2 obj2 = ctx.getBean("java2",TestBean2.class);
        System.out.println(obj2.getData1);


    }
}