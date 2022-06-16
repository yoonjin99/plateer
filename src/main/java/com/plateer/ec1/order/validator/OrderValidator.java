package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderValidationDto> {
    FO_GENERAL("FO", "general", OrderCommonValidators.commonValidate().and(OrderTypeValidators.orderTypeValidation())),
    BO_GENERAL("BO", "general", OrderCommonValidators.commonValidate().and(OrderTypeValidators.orderTypeValidation())),
    FO_ECOUPON("FO", "ecoupon", OrderCommonValidators.commonValidate().and(OrderTypeValidators.orderTypeValidation())),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidators.commonValidate().and(OrderTypeValidators.orderTypeValidation()));

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
