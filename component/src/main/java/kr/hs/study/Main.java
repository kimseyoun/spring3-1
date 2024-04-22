package kr.hs.study;

import config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);

        TestBean1 obj1 = ctx.getBean(TestBean1.class);
        System.out.println(obj1);
        System.out.println("=================");
        TestBean2 obj2 = ctx.getBean("t1",TestBean2.class);
        System.out.println(obj2);

        TestBean1 obj3 = ctx.getBean("test", TestBean1.class);
        System.out.println(obj3);


        ctx.close();
    }
}