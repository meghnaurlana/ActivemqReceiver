package com.ActivemqReceiver.Service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiverService {
    @JmsListener(destination = "A new Message")
    public void listener(String message) {
        System.out.println("The message sent from the Queue - " + message);
    }
}
