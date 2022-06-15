package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.impl.AfterStrategy;
import com.plateer.ec1.order.strategy.impl.DataStrategy;
import com.plateer.ec1.order.vo.OrderRequest;

public class OrderContext {
    private OrderHistoryService orderHistoryService;
    private PaymentService paymentService;

    OrderContext(OrderHistoryService orderHistoryService, PaymentService paymentService){
        this.orderHistoryService = orderHistoryService;
        this.paymentService = paymentService;
    }

    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest){
        // 주문 모니터링 등록
        // 
    }
}
