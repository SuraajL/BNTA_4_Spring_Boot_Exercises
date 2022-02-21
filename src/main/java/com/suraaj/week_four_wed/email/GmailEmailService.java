package com.suraaj.week_four_wed.email;

public class GmailEmailService implements EmailSender{
    @Override
    public void send(String from, String to, String msg) {
        System.out.println("Sending email using gmail");
    }
}
