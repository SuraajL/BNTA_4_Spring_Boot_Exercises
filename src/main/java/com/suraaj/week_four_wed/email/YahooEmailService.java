package com.suraaj.week_four_wed.email;

public class YahooEmailService implements EmailSender{
    @Override
    public void send(String from, String to, String msg) {
        System.out.println("Sending email using Yahoo");
    }
}