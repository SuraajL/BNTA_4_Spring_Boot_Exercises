package com.suraaj.week_four_wed.email;

public interface EmailSender {
    void send(String from, String to, String msg);
}
