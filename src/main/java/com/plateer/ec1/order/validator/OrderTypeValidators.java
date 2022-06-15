package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;

import java.util.function.Predicate;

public class OrderTypeValidators {
    public static Predicate<OrderDto> isEcouponOrderAbleProduct(){
        return orderDto -> {
            return false;
        };
    }
}
