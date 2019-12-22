package kr.co.softcampus.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestBean {

    private DataBean data11;
    private DataBean data22;

    private List<String> list1;
    private List<Integer> list2;
    private List<DataBean> list3;

    private Set<String> set1;
    private Set<Integer> set2;
    private Set<DataBean> set3;

    private Map<String, Object> map1;

    private Properties prop1;

    private int data1;
    private double data2;
    private String data3;
    private boolean data4;
    private DataBean data5;
    private DataBean data6;


    public TestBean() {
        System.out.println("TestBean의 생성자");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = null;
    }

    public TestBean(int data1) {
        System.out.println("TestBean의 생성자 : int 변수 1개");
        this.data1 = data1;
        this.data2 = 0.0;
        this.data3 = null;
    }

    public TestBean(double data2) {
        System.out.println("TestBean의 생성자 : double 변수 1개");
        this.data1 = 0;
        this.data2 = data2;
        this.data3 = null;
    }

    public TestBean(String data3) {
        System.out.println("TestBean의 생성자 : String 변수 1개");
        this.data1 = 0;
        this.data2 = 0.0;
        this.data3 = data3;
    }

    public TestBean(int data1, double data2, String data3) {
        System.out.println("TestBean의 생성자 : 변수 3개");
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
    }

    public void printData() {
        System.out.printf("data1 : %d\n", data1);
        System.out.printf("data2 : %f\n", data2);
        System.out.printf("data3 : %s\n", data3);
    }

    public void beanInit() {
        System.out.println("TestBean의 init");
    }

    public void beanDestroy() {
        System.out.println("TestBean의 destroy메서드");
    }

    public int getData1() {
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

    public String getData3() {
        return data3;
    }

    public void setData3(String data3) {
        this.data3 = data3;
    }

    public boolean isData4() {
        return data4;
    }

    public void setData4(boolean data4) {
        this.data4 = data4;
    }

    public DataBean getData5() {
        return data5;
    }

    public void setData5(DataBean data5) {
        this.data5 = data5;
    }

    public DataBean getData6() {
        return data6;
    }

    public void setData6(DataBean data6) {
        this.data6 = data6;
    }

    public List<String> getList1() {
        return list1;
    }

    public void setList1(List<String> list1) {
        this.list1 = list1;
    }

    public List<Integer> getList2() {
        return list2;
    }

    public void setList2(List<Integer> list2) {
        this.list2 = list2;
    }

    public List<DataBean> getList3() {
        return list3;
    }

    public void setList3(List<DataBean> list3) {
        this.list3 = list3;
    }

    public Set<String> getSet1() {
        return set1;
    }

    public void setSet1(Set<String> set1) {
        this.set1 = set1;
    }

    public Set<Integer> getSet2() {
        return set2;
    }

    public void setSet2(Set<Integer> set2) {
        this.set2 = set2;
    }

    public Set<DataBean> getSet3() {
        return set3;
    }

    public void setSet3(Set<DataBean> set3) {
        this.set3 = set3;
    }

    public Map<String, Object> getMap1() {
        return map1;
    }

    public void setMap1(Map<String, Object> map1) {
        this.map1 = map1;
    }


    public Properties getProp1() {
        return prop1;
    }

    public void setProp1(Properties prop1) {
        this.prop1 = prop1;
    }

    public DataBean getData11() {
        return data11;
    }

    public void setData11(DataBean data11) {
        this.data11 = data11;
    }

    public DataBean getData22() {
        return data22;
    }

    public void setData22(DataBean data22) {
        this.data22 = data22;
    }
}
