package com.klodilla.kodillajms.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

    @JmsListener(containerFactory = "jmsFact", destination = "verification-test")
    public void receive(int orderId) {
        System.out.println("New order with id: " + orderId + " has been made.");
    }

    @JmsListener(containerFactory = "jmsFact", destination = "verification-test")
    public void receiveValueAndId(double val) {
        System.out.println("value of recent order = " + val);
    }
}
