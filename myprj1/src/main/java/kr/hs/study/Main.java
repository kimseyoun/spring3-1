package kr.hs.study;

import kr.hs.study.beans.Animal;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*1. class   beans폴더에 만들고

2. config.xml  : 객체만들라고 해

3. main에서 만든 객체를 가지고 와서 사용getBean()*/

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
        Animal c = ctx.getBean("cat", Animal.class);
        System.out.println("cat"+c);


        Animal d = ctx.getBean("dog", Animal.class);
        System.out.println("dog"+d);

        Animal s = ctx.getBean("sheep",Animal.class);
        System.out.println("sheep"+s);

    }
}