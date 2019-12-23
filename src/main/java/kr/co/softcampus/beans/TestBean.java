package kr.co.softcampus.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class TestBean {

    private int data1;
    private DataBean data2;

    @Autowired
    private DataBean data3;

    @Autowired
    @Qualifier("obj4")
    private DataBean2 data4;

    @Autowired
    @Qualifier("obj5")
    private DataBean2 data5;

    @Autowired(required = false)
    @Qualifier("obj6")
    private DataBean2 data6;

    public TestBean() {
    }

    public TestBean(int data1) {
        this.data1 = data1;
    }

    public int getData1() {
        return data1;
    }

    @Required
    public void setData1(int data1) {
        this.data1 = data1;
    }

    public DataBean getData2() {
        return data2;
    }

    @Autowired
    public void setData2(DataBean data2) {
        this.data2 = data2;
    }

    public DataBean getData3() {
        return data3;
    }

    public DataBean2 getData4() {
        return data4;
    }

    public DataBean2 getData5() {
        return data5;
    }

    public DataBean2 getData6() {
        return data6;
    }
}
