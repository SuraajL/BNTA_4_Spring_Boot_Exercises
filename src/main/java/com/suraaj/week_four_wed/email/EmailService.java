package com.suraaj.week_four_wed.email;

public class EmailService {
    private EmailSender emailSender;

    public EmailService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmail(String from, String to, String msg){
        if (from.isBlank() || to.isBlank() || msg.isBlank()){
            throw new IllegalStateException("Cannot be blank");
        }
        emailSender.send(from, to, msg);
    }
}
