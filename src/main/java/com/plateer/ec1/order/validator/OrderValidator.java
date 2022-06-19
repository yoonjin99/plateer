package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;
import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Predicate;

@AllArgsConstructor
public enum OrderValidator implements Predicate<OrderValidationDto> {
    FO_GENERAL("FO", "general", OrderCommonValidators.validateMinPurchaseCount.and(OrderTypeValidators.generalDataValidation)),
    BO_GENERAL("BO", "general", OrderCommonValidators.validateMinPurchaseCount.and(OrderTypeValidators.generalDataValidation)),
    FO_ECOUPON("FO", "ecoupon", OrderCommonValidators.validateMinPurchaseCount.and(OrderTypeValidators.ecouponDataValidation)),
    BO_ECOUPON("BO", "ecoupon", OrderCommonValidators.validateMinPurchaseCount.and(OrderTypeValidators.ecouponDataValidation));

    private String systemCode;
    private String orderCode;
    private final Predicate<OrderValidationDto> validCheck;

    @Override
    public boolean test(OrderValidationDto t) {
        return validCheck.test(t);
    }

    public static OrderValidator get(OrderRequest orderRequest){
        return Arrays.stream(values())
                    .filter((t) -> t.systemCode.equals(orderRequest.getSystemType()) && t.orderCode.equals(orderRequest.getOrderType()))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(""));
    };
}
