package com.smsservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SMSService {

    /**
     * The method to send SMS for customers
     * @param message
     */
    public void sendSMSMessage(String message){
        log.info(message);
    }
}
