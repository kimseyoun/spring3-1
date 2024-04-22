package kr.hs.study;

import kr.hs.study.bean.Animal;
import kr.hs.study.bean.Cat;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Animal bad = ctx.getBean("bad", Animal.class);

        Cat.bad();
    }
}