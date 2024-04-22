package kr.hs.study.advice;

//실행될 메서드들이 (advice)들이 있는 클래스
public class AdvisorClass {
    public void beforeMethod(){
        System.out.println("beforeMethod먼저 실행");
    }
    public void  afterMethod(){
        System.out.println("afterMethod후에 실행");
    }
}
