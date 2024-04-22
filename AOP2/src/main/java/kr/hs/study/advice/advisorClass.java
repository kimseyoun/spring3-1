package kr.hs.study.advice;

//충고가 들어가는 클래스
public class advisorClass {
    public void before(){
        System.out.println("before Method");
    }
    public void afterReturn(){
        System.out.println("after Method");
    }
}
