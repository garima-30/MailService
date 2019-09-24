package com.example.MS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping("/email")
    public class RegController{

        @Autowired
        private JavaMailSender javaMailSender;

        @GetMapping(value = "/sendEmail")
        public String sendMsg()
        {
            SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
            simpleMailMessage.setTo("anshugari07@gmail.com");
            simpleMailMessage.setSubject("callBack mail for ur problem");
            simpleMailMessage.setText("call on this no 1234567890 to resolve your queires");

            javaMailSender.send(simpleMailMessage);
            return "success.......................";
        }
    }
