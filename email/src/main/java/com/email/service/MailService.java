package com.email.service;

public interface MailService {

    void sendSimpleMail(String to, String subject, String content);

    void sendHtmlMail(String s, String subject, String emailContent);
}
