package com.email.service.impl;

import com.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

/**
 * @author qupengfei
 */

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Resource
    private TemplateEngine templateEngine;

    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendSimpleMail(String to, String subject, String content)
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);

        try
        {
            mailSender.send(message);
            System.out.println("简单邮件已发送");
        }
        catch (Exception e)
        {
            System.out.println("简单邮件发送失败");
        }
    }

    @Override
    public void sendHtmlMail(String s, String subject, String emailContent) {
        MimeMessage message=mailSender.createMimeMessage();
        try {
            //true表示需要创建一个multipart message
            MimeMessageHelper helper=new MimeMessageHelper(message,true);
            //邮箱账号此处一定要一致否则发送不成功
            helper.setFrom("1577214918@qq.com","1577214918@qq.com");
            //接收账号
            helper.setTo(s);
            //邮箱标题
            helper.setSubject(subject);
            //创建 指定关键字   并设定值
            //Context context = new Context();
            //context.setVariable("code",emailContent);
            //指定对应html模板,并放入context对象
            //String emailContents= templateEngine.process("emailTemplate.html", context);
            //把对象放进去参数设定true
            helper.setText(emailContent,true);
            mailSender.send(message);
        }catch (Exception e){
        }
    }
}
