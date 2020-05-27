package com.email.test;


import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * @author qupengfei
 */
public class MailServiceImplTest  {
    public static void main(String[] args) throws MessagingException, javax.mail.MessagingException {
        Properties properties = new Properties();
        properties.setProperty("mail.host", "smtp.qq.com");
        properties.setProperty("mail.transport.protocol", "smtp");
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        properties.setProperty("mail.smtp.port", "465");
        Session session = Session.getDefaultInstance(properties);
        session.setDebug(true);

        MimeMessage mimeMessage = new MimeMessage(session);
        mimeMessage.addRecipients(Message.RecipientType.TO, "1577214918@qq.com");//设置收信人
        mimeMessage.addRecipients(Message.RecipientType.CC, "1577214918@qq.com");//抄送
       // mimeMessage.setFrom("1577214918@qq.com");//邮件发送人
        mimeMessage.setSubject("测试邮件主题");//邮件主题
        mimeMessage.setContent("Hello,这是一封测试邮件", "text/html;charset=utf-8");//正文

        Transport transport = session.getTransport();
        transport.connect("smtp.qq.com", "1577214918@qq.com", "kahwjrpqtwqshcie");
        transport.sendMessage(mimeMessage, mimeMessage.getAllRecipients());//发送邮件，第二个参数为收件人
        transport.close();

    }
}
