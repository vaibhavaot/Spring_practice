package io.ennate.complex;

import io.ennate.complex.email.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    // property based DI:  here the spring will create the constructor on its own
    @Autowired(required = false)
    private EmailService emailService;
/**
    //Constructor based DI : here you need to create the constructor and call the service
    public NotificationService(EmailService emailService){
        System.out.println("Notification service Constructor");
        this.emailService = emailService;
    }
 **/
    public void sendNotification(String to, String message){
        this.emailService.sendEmail(to, message);

    }
}
