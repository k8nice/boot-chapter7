package com.nice;


import com.nice.config.AppConfig;
import com.nice.pojo.ScopeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
      ScopeBean scopeBean =  context.getBean(ScopeBean.class);
      ScopeBean scopeBean1 =  context.getBean(ScopeBean.class);
        System.out.println(scopeBean == scopeBean1);
    }

}
