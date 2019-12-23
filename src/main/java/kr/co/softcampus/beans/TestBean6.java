package kr.co.softcampus.beans;

import javax.annotation.Resource;

public class TestBean6 {

    @Resource(name = "data1")
    private DataBean data100;

    @Resource(name = "data2")
    private DataBean2 data200;

    public DataBean getData100() {
        return data100;
    }

    public void setData100(DataBean data100) {
        this.data100 = data100;
    }

    public DataBean2 getData200() {
        return data200;
    }

    public void setData200(DataBean2 data200) {
        this.data200 = data200;
    }
}
