package com.suraaj.week_four_wed.email;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new GmailEmailService(); //can use yahoo implementation instead

        EmailService emailService = new EmailService(emailSender);
        emailService.sendEmail("Suj", "Max", "hi");
    }
}
