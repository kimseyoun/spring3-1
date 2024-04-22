package kr.hs.study;

import kr.hs.study.bean.DataBean2;
import kr.hs.study.bean.TestBean;
import kr.hs.study.bean.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

//       TestBean data1 = ctx.getBean("data1",TestBean.class);
//        System.out.println(data1);
//
//        TestBean data2 = ctx.getBean("data1",TestBean.class);
//        System.out.println(data2);
//
//        TestBean data3 = ctx.getBean("data1",TestBean.class);
//        System.out.println(data3);

        TestBean t1 = ctx.getBean("t1",TestBean.class);
        t1.getData();

        TestBean t3 = ctx.getBean("t3",TestBean.class);
        t3.getData();

        TestBean t4 = ctx.getBean("t4", TestBean.class);
        t4.getData();


        TestBean testBean = new TestBean(66, 66.66, "Mike66넣기");
        testBean.getData();

        TestBean2 t6 = ctx.getBean("t6", TestBean2.class);
        DataBean2 d1 = ctx.getBean("d1", DataBean2.class);

        ctx.close();
    }
}