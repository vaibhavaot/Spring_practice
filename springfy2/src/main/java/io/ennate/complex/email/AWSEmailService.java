package io.ennate.complex.email;

import org.springframework.stereotype.Component;

@Component
public class AWSEmailService implements EmailService{

    public AWSEmailService(){
        System.out.println("AWSEmailService Constructor");
    }

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("--------------- AWS SERVICE --------------");
        System.out.println("Sending to :"+toAddress);
        System.out.println("Body :" +body);
        System.out.println("-------------------------------------------");
    }
}
