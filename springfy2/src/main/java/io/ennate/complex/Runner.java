package io.ennate.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(io.ennate.complex.Application.class);
        System.out.println("After Context Creation");
        NotificationService notificationService= context.getBean(NotificationService.class);
        notificationService.sendNotification("vaibhavaot@gmail.com","This is Spring");
        context.close();
    }
}
