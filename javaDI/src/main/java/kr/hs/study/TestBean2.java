package kr.hs.study;

public class TestBean2 {
    public boolean getData1;
    private int data1;
    private double data2;
    private DataBean1 data3;
    private DataBean1 data4;

    public TestBean2(boolean getData1, int data1, double data2, DataBean1 data3, DataBean1 data4) {
        this.getData1 = getData1;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public TestBean2() {

    }

    public boolean isGetData1() {
        return getData1;
    }

    public void setGetData1(boolean getData1) {
        this.getData1 = getData1;
    }

    public int getData1(int dataBean1) {
        return data1;
    }

    public void setData1(int data1) {
        this.data1 = data1;
    }

    public double getData2() {
        return data2;
    }

    public void setData2(double data2) {
        this.data2 = data2;
    }

    public DataBean1 getData3() {
        return data3;
    }

    public void setData3(DataBean1 data3) {
        this.data3 = data3;
    }

    public DataBean1 getData4() {
        return data4;
    }

    public void setData4(DataBean1 data4) {
        this.data4 = data4;
    }


}
