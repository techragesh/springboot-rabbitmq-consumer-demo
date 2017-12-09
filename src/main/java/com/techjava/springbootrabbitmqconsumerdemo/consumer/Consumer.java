package com.techjava.springbootrabbitmqconsumerdemo.consumer;

import com.techjava.springbootrabbitmqconsumerdemo.model.Category;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues="jsa.queue", containerFactory="jsaFactory")
    public void recievedMessage(Category category) {
        System.out.println("Recieved Message: " + category);
    }
}
