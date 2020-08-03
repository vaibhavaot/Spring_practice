package io.ennate.simple;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements InitializingBean , DisposableBean {
    public HelloWorld(){
        System.out.println("Inside the bean constructor");
    }
    public void sayHello(){
        System.out.println("Hello");

    }
    //@PostConstruct : can use this annotation instead of implementing implement method InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside the afterPropertiesSet");
    }
    //@PreDestory  : can use this annotation instead of implementing implement method DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("Inside the destroy function");
    }
}
