package com.smsservice.consumer;

import com.smsservice.config.MQConfig;
import com.smsservice.model.CreditApprovedEvent;
import com.smsservice.service.SMSService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditApprovedEventConsumer {

    @Autowired
    private SMSService smsService;

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CreditApprovedEvent message){
        String messsage = "Dear "+ message.getFirstNameLastName() + ",\nYour credit request is approved.\n" +
                "Your Credit Limit is " + message.getCreditLimit() +".";
        smsService.sendSMSMessage(messsage);

    }

}
