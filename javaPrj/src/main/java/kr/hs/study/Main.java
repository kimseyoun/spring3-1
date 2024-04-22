package kr.hs.study;

import kr.hs.study.beans.*;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        //->  config.xml를 읽어서 객체를 만들고 스프링컨테이너(Ioc Container)에 보관한다.

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        //BeanConfigClass.class파일을 읽어서 객체를 만들고 스프링 컨테이너(Ioc Container)에 보관
        //ApplicationContext c = new AnnotationConfigApplicationContext();
        //부모(ApplicationContext)의 참조변수(c)로 자식(AnnotationConfigApplicationContext())객체(new)를 만들것
        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        System.out.println(obj1);

        TestBean2 obj2 = ctx.getBean("new", TestBean2.class);
        System.out.println(obj2);

        TestBean3 obj3 = ctx.getBean("a3", TestBean3.class);
        System.out.println(obj3);

        TestBean4 obj4_1 = ctx.getBean("bean4_1", TestBean4.class);
        TestBean4 obj4_2 = ctx.getBean("bean4_2", TestBean4.class);


        ctx.close();
    }
}