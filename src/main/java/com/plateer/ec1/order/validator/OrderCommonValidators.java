package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderValidationDto;

import java.util.function.Predicate;

public class OrderCommonValidators {
    public static Predicate<OrderValidationDto> validateMaxPurchaseCount(){
        return orderDto -> {
            return false;
        };
    }

    public static Predicate<OrderValidationDto> validateMinPurchaseCount(){
        return orderDto -> {
            return false;
        };
    }

}
