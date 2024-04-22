package kr.hs.study.bean;

public class TestBean {
    //자바코드로 public TestBean(
    int data1;
    double data2;
    String data3;

    public TestBean(){ //11,11.11,Mike11넣기 //생성자
        System.out.println("TestBean의 기본 생성자");
            this.data1 = 11;
            this.data2 = 11.11;
            this.data3 = "Mike11";
    }
    public TestBean(int data1){
        System.out.println("obj2: int받는 생성자");
        this.data1 = data1;
        this.data2 = 22.22;
        this.data3 = "Mike1";
    }

    public TestBean(double data2){
        System.out.println("obj3: double을 받는 생성자");
        this.data1 = data1;
        this.data2 = 33.33;
        this.data3 = "Mike33";
    }

    public TestBean(String data3){
        System.out.println("obj4: string 받는 생성자");
        this.data1 = data1;
        this.data2 = 44.44;
        this.data3 = "Mike44";
    }

    public TestBean(int data1, double data2, String data3){
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

   public void getData(){ //메서드
        System.out.println("data1"+data1);
        System.out.println("data2"+data2);
        System.out.println("data3"+data3);
        //사용해서 값을 출력하시오 66, 66.66, mike66
    }
}
