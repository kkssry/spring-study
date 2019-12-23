package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class TestBean4 {

    public TestBean4() {
        System.out.println("TestBean4 생성자");
    }

    @Autowired
    @Qualifier("data1")
    private DataBean data1;

    @Autowired
    @Qualifier("data2")
    private DataBean2 data2;

    public DataBean getData1() {
        return data1;
    }

    public void setData1(DataBean data1) {
        this.data1 = data1;
    }

    public DataBean2 getData2() {
        return data2;
    }

    public void setData2(DataBean2 data2) {
        this.data2 = data2;
    }
}
