package com.leesure;

import com.leesure.utils.MessageSendUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AntMoveApplication.class)
@WebAppConfiguration
public class AntMoveApplicationTests {

    @Autowired
    private MessageSendUtils utils = new MessageSendUtils();

	@Test
	public void contextLoads() {
	    utils.sendValidateCode("1559331512@qq.com","1234");
	}
}

