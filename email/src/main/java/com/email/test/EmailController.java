package com.email.test;

import com.email.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;

@RestController
public class EmailController {

    @Autowired
    private MailService mailService;

    @Resource
    private TemplateEngine templateEngine;


    @RequestMapping("sendSimpleMail")
    public void sendSimpleMail()
    {
        mailService.sendSimpleMail("1577214918@qq.com","简单邮件","Hello World");
    }

    @RequestMapping("sendTemplateMail")
    public  void sendTemplateMail(){
        Context context = new Context();
        context.setVariable("id", "001");
        String emailContent = templateEngine.process("emailTemplate", context);

        mailService.sendHtmlMail("1577214918@qq.com", "模板邮件", emailContent);
    }
}
