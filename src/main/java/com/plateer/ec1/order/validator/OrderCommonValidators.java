package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;

import java.util.function.Predicate;

public class OrderCommonValidators {
    public static Predicate<OrderDto> validateMaxPurchaseCount(){
        return orderDto -> {
            return false;
        };
    }

    public static Predicate<OrderDto> validateMinPurchaseCount(){
        return orderDto -> {
            return false;
        };
    }

}
