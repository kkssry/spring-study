package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class TestBean2 {

    private int data;
    private String data2;
    private DataBean3 data3;
    private DataBean4 data4;

    public TestBean2() {
    }

    @Autowired
    public TestBean2(@Value("100")int data1, @Value("문자열")String data2, DataBean3 data3, DataBean4 data4) {
        this.data = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
    }

    public int getData() {
        return data;
    }

    public String getData2() {
        return data2;
    }

    public DataBean3 getData3() {
        return data3;
    }

    public DataBean4 getData4() {
        return data4;
    }
}
