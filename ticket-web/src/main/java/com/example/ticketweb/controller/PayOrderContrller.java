package com.example.ticketweb.controller;

//import com.example.ticketcommon.entity.PayOrder;
import com.example.ticketcommon.entity.PayOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author caizhenya
 * @Date 2020/8/25
 * @Descrition
 **/
@RestController
@RequestMapping("/")
public class PayOrderContrller {

    @GetMapping("test")
    public PayOrder getPayOrder() {
        PayOrder payOrder = new PayOrder();
        payOrder.setOrderId(1111111);
        payOrder.setPayUser("caizhenya");
        return payOrder;
    }
}
