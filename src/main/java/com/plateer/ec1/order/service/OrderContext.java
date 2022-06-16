package com.plateer.ec1.order.service;

import com.plateer.ec1.order.strategy.after.AfterStrategy;
import com.plateer.ec1.order.strategy.data.DataStrategy;
import com.plateer.ec1.order.validator.OrderCommonValidators;
import com.plateer.ec1.order.validator.OrderTypeValidators;
import com.plateer.ec1.order.validator.OrderValidator;
import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderProductView;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderContext {
    private OrderHistoryService orderHistoryService;
    private PaymentService paymentService;

    OrderContext(OrderHistoryService orderHistoryService, PaymentService paymentService){
        this.orderHistoryService = orderHistoryService;
        this.paymentService = paymentService;
    }

    public void execute(DataStrategy dataStrategy, AfterStrategy afterStrategy, OrderRequest orderRequest){
        log.info("--------------OrderContext execute start");
        // 주문 모니터링 등록
        Long historyNo = orderHistoryService.insertOrderHistory(orderRequest);
        OrderDto dto = null;
        try {
            // 유효성 검증
            OrderValidationDto validationDto = new OrderValidationDto();
            validationDto.setOrderType("general");
            OrderValidator.get(orderRequest).test(validationDto);
            OrderCommonValidators.commonValidate().and(OrderTypeValidators.orderTypeValidation()).test(validationDto);
            // 데이터 생성
            dto = dataStrategy.create(orderRequest, new OrderProductView());
            // 결제
            // 데이터 등록
            insertOrderData(dto);
            // 금액검증
            amountValidation(orderRequest.getOrderNo());
            // 재고차감
            // 후처리
            afterStrategy.call(orderRequest, dto);
        }catch (Exception e){
            log.error(e + "error");
        } finally {
            // 주문 모니터링 업데이트
            orderHistoryService.updateOrderHistory(historyNo, dto);
        }
        log.info("--------------OrderContext execute end");
    }

    private void amountValidation(String orderNo){
        log.info("--------------amountValidation start");
    }

    private void insertOrderData(OrderDto orderDto){
        log.info("--------------insertOrderData start");
    }
}
