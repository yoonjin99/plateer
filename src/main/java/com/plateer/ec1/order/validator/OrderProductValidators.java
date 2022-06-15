package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;

import java.util.function.Predicate;

public class OrderProductValidators {
    public static Predicate<OrderDto> isSellingProduct(){
        return orderDto -> {
            return false;
        };
    }
}
