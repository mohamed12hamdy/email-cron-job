package com.example.emailcronJob.service;

public interface EmailService {

    void sendEmail(String to, String subject,String text);
}
