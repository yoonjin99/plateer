package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderValidationDto> {
    FO_GENERAL("FO", "general",OrderCommonValidators.validateMaxPurchaseCount()),
    BO_GENERAL("BO", "general", OrderCommonValidators.validateMaxPurchaseCount().and(OrderTypeValidators.isEcouponOrderAbleProduct())),
    FO_ECOUPON("FO", "ecoupon",OrderCommonValidators.validateMaxPurchaseCount()),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidators.validateMaxPurchaseCount().and(OrderTypeValidators.isEcouponOrderAbleProduct()));

    private String systemCode;
    private String orderCode;
    private final Predicate<OrderValidationDto> validCheck;

    OrderValidator(String systemCode,String orderCode, Predicate<OrderValidationDto> validCheck){
        this.systemCode = systemCode;
        this.orderCode = orderCode;
        this.validCheck = validCheck;
    }

    @Override
    public boolean test(OrderValidationDto t) {
        return validCheck.test(t);
    }

    public static OrderValidator get(OrderRequest orderRequest){
        return Arrays.stream(OrderValidator.values())
                    .filter((t) -> t.systemCode.equals(orderRequest.getSystemType()) && t.orderCode.equals(orderRequest.getOrderType()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(""));
    };
}
