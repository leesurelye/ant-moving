package com.leesure.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
@Component
public class MessageSendUtils{

    private static  String FROM_ACCOUNT="1559331512@qq.com";

    private static  String EMAIL_SUBJECT ="蚂蚁搬家平台验证码";

    @Autowired
    private JavaMailSender mailSender;

    private     SimpleMailMessage message = new SimpleMailMessage();


    /**
     * 发送邮件
     * @param from 发送人
     * @param to 接收人
     * @param subject 邮件主题
     * @param content 邮件内容
     */
    public  void sendEmail(String from ,String to,String subject,String content)
            throws Exception{

        message.setFrom(FROM_ACCOUNT);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
       // mailSender.send(message);
    }

    /**
     * 发送邮件检验码
     * @param to 对方邮件
     */
    public SimpleMailMessage  sendValidateCode(String to,String vsCode){
        message.setFrom(FROM_ACCOUNT);
        message.setTo(to);
        message.setSubject(EMAIL_SUBJECT);
        message.setText("【蚂蚁搬家】欢迎使用蚂蚁在线搬家平台,您的验证码为："+vsCode+"," +
                "请在15分钟内填写");
//       mailSender.send(message);
       return this.message;
    }
}
