package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderValidationDto;

import java.util.function.Predicate;

public class OrderTypeValidators {
    public static Predicate<OrderValidationDto> isEcouponOrderAbleProduct(){
        return orderDto -> {
            return false;
        };
    }
}
