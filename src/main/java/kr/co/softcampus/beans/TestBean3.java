package kr.co.softcampus.beans;

public class TestBean3 {
    private int data11;
    private String data22;
    private DataBean2 data33;
    private DataBean2 data44;

    public TestBean3(DataBean2 data33, DataBean2 data44) {
        this.data33 = data33;
        this.data44 = data44;
    }

    public TestBean3(int data11, String data22, DataBean2 data33, DataBean2 data44) {
        this.data11 = data11;
        this.data22 = data22;
        this.data33 = data33;
        this.data44 = data44;
    }

    public TestBean3() {
        System.out.println("TestBean3의 생성자");
    }

    public void defaultInit() {
        System.out.println("TestBean3 default init");
    }

    public void defaultDestroy(){
        System.out.println("TestBean3 default destroy");
    }

    public void bean3Init() {
        System.out.println("TestBean3 init method");
    }

    public void bean3Destroy() {
        System.out.println("TestBean3 destroy method");
    }

    public int getData11() {
        return data11;
    }

    public void setData11(int data11) {
        this.data11 = data11;
    }

    public String getData22() {
        return data22;
    }

    public void setData22(String data22) {
        this.data22 = data22;
    }

    public DataBean2 getData33() {
        return data33;
    }

    public void setData33(DataBean2 data33) {
        this.data33 = data33;
    }

    public DataBean2 getData44() {
        return data44;
    }

    public void setData44(DataBean2 data44) {
        this.data44 = data44;
    }
}
