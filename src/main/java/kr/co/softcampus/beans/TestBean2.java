package kr.co.softcampus.beans;

public class TestBean2 {

    private DataBean2 data11;
    private DataBean2 data22;

    public TestBean2() {
    }

    public TestBean2(DataBean2 data11, DataBean2 data22) {
        this.data11 = data11;
        this.data22 = data22;
    }

    public DataBean2 getData11() {
        return data11;
    }

    public void setData11(DataBean2 data11) {
        this.data11 = data11;
    }

    public DataBean2 getData22() {
        return data22;
    }

    public void setData22(DataBean2 data22) {
        this.data22 = data22;
    }

    public void printData() {

    }
}
