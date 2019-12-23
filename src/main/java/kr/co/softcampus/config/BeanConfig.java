package kr.co.softcampus.config;

import kr.co.softcampus.beans.DataBean;
import kr.co.softcampus.beans.DataBean2;
import kr.co.softcampus.beans.TestBean;
import kr.co.softcampus.beans.TestBean2;
import org.springframework.context.annotation.*;

@Configuration
public class BeanConfig {

    @Bean
    public TestBean java1() {
        return new TestBean(100);
    }

    @Bean
    public DataBean data1() {
        return new DataBean();
    }

    @Bean
    public DataBean2 obj4() {
        return new DataBean2();
    }

    @Bean
    public DataBean2 obj5() {
        return new DataBean2();
    }

    @Bean
    public TestBean2 java2() {
        return new TestBean2();
    }

}
