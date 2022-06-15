package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.impl.AfterStrategy;
import com.plateer.ec1.order.strategy.impl.DataStrategy;
import com.plateer.ec1.order.validator.OrderValidator;
import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;

public class OrderContext {
    private OrderHistoryService orderHistoryService;
    private PaymentService paymentService;

    OrderContext(OrderHistoryService orderHistoryService, PaymentService paymentService){
        this.orderHistoryService = orderHistoryService;
        this.paymentService = paymentService;
    }

    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest, OrderProductView orderProductView){
        // 주문 모니터링 등록
        Long historyNo = orderHistoryService.insertOrderHistory(orderRequest);
        OrderDto dto = null;
        try {
            // 유효성 검증
            OrderValidator.get(orderRequest).test(new OrderValidationDto());
            // 데이터 생성
            dto = dataStrategy.create(orderRequest, orderProductView);
            // 결제
            // 데이터 등록
            insertOrderData(dto);
            // 금액검증
            amountValidation(orderRequest.getOrderNo());
            // 재고차감
            // 후처리
            afterStrategy.call(orderRequest, dto);
        }catch (Exception e){

        } finally {
            // 주문 모니터링 업데이트
            orderHistoryService.updateOrderHistory(historyNo, dto);
        }
    }

    private void amountValidation(String orderNo){

    }

    private void insertOrderData(OrderDto orderDto){

    }


}
