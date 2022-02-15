package com.klodilla.kodillajms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    //no app value; practice
    /*@Autowired
    private OrderService service;

    @Autowired
    private OrderMapper mapper;*/

    @Autowired
    private JmsTemplate template;


    //not work from obvious reason, only practice
    /*@GetMapping(path = "/verify")
    public SimpleOrderDto sendMessageIfNewOrder(@RequestParam int id) {

        if(service.findById(id) != null) {
            template.convertAndSend("verification-test", service.findById(id));
        }
        return mapper.mapToOrderDto(service.findById(id));
    }*/

    @GetMapping(path = "/value")
    public void showValueOfRecentOrder(@RequestParam double value) {
        template.convertAndSend("verification-test", value);
    }

}
