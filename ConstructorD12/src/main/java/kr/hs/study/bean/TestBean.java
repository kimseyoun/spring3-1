// DataBean1 클래스
public class DataBean1 {

}

// DataBean2 클래스
public class DataBean2 {

}

// TestBean 클래스
public class TestBean {
    private int data1;
    private double data2;
    private DataBean1 data3;
    private DataBean2 data4;

    public TestBean(int data1, double data2, DataBean1 data3, DataBean2 data4) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public void printData() {
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);

    }
}
