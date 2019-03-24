package com.leesure.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by yue on 2019/3/22.
 * @author yue
 */
public class MessageSendUtils {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private SimpleMailMessage message;

    public static void SendEmail(String from ,String to,String subject){


    }

}
