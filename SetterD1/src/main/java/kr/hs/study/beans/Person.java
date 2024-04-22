package kr.hs.study.beans;

public class Person {
    private String name = "kim";
    private int age = 30;
    private String addr = "seoul";

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getaddr() {
        return addr;
    }

    public void eat() {
        System.out.println(name + "dma");
    }
}