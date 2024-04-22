package kr.hs.study;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext();
/*
        Testbean obj1 = ctx.getBean(Testbean.class);
        System.out.println("obj1"+obj1);

        Testbean obj2 = ctx.getBean(Testbean.class);
        System.out.println("obj2"+obj2);
*/
        Testbean obj1 = ctx
        System.out.println("===========================================");

        ctx.close();
    }
}