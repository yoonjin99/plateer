package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderValidationDto;

import java.util.function.Predicate;

public class OrderProductValidators {
    public static Predicate<OrderValidationDto> isSellingProduct(){
        return orderDto -> {
            return false;
        };
    }
}
