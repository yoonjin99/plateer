package com.plateer.ec1.order.controller;

import com.plateer.ec1.order.service.OrderService;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class OrderControllerTest {

    @Autowired
    OrderService orderService;

    @Test
    void order() {
        log.info("--------------------Test 실행---------------------");
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setSystemType("FO");
        orderRequest.setOrderType("general");
        orderRequest.setOrderNo("O1");
        orderRequest.setPaymentType("inicis");
        orderService.order(orderRequest);
        log.info("--------------------Test 종료---------------------");
    }
}