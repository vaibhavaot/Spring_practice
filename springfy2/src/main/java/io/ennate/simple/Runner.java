package io.ennate.simple;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Lets start");
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Application.class);
        System.out.println("after the context");
        HelloWorld Hi = context.getBean(HelloWorld.class);
        Hi.sayHello();
        System.out.println("hello world function is called");


        HelloWorld hello1 = context.getBean(HelloWorld.class);
        HelloWorld hello2 = context.getBean(HelloWorld.class);
        System.out.println(hello1 == hello2);
        System.out.println("before closing the context");
        context.close();
        System.out.println("after closing the context");
        /**
         System.out.println("Spring Application");
         HelloWorld Hello = new HelloWorld();
         Hello.sayHello();
         **/
    }
}
