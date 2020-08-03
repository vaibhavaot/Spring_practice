package io.ennate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Lets start");
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Application.class);
        System.out.println("after the context");
        HelloWorld Hi = context.getBean(HelloWorld.class);
        Hi.sayHello();
        System.out.println("hello world function is called");
        context.close();
        /**
        System.out.println("Spring Application");
        HelloWorld Hello = new HelloWorld();
        Hello.sayHello();
         **/
    }
}
