package kr.hs.study.beans;

public class TestBean {
    public TestBean(){
        System.out.println("TestBean 기본 생성자");
    }
    public void initMethod(){
        System.out.println("생성자 실행 후에 자동으로 실행되는 TestBean의 initMethod");
    }
    public void destroy(){
        System.out.println("destroy");
    }

}
