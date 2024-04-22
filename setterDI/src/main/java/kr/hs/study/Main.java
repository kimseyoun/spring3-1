package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean1 t1 = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1"+obj1.getData1);

       /* TestBean1 t2 = ctx.getBean("t2", TestBean1.class);
        t2.getData2();

        TestBean1 t3 = ctx.getBean("t3", TestBean1.class);

        TestBean1 t4 = ctx.getBean("t4", TestBean1.class);
*/
        TestBean2 testBean2 = (TestBean2) ctx.getBean("testBean2");

        System.out.println("DataBean2: " + testBean2.getData2().getName());
        System.out.println("DataBean3: " + testBean2.getData3().getName());
        System.out.println("DataBean4: " + testBean2.getData4().getName());

        ctx.close();
    }
}