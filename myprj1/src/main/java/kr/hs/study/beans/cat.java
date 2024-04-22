package kr.hs.study.beans;

public class cat implements Animal{

    @Override
    public void eat() {
        System.out.println("먹다");
    }

    @Override
    public void live() {
        System.out.println("살다");
    }
}
