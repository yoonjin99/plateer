package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderCommonValidators {
    public static Predicate<OrderValidationDto> commonValidate(){
        return orderDto -> {
            return validateMaxPurchaseCount().and(validateMinPurchaseCount()).test(orderDto);
        };
    }

    public static Predicate<OrderValidationDto> validateMaxPurchaseCount(){
        log.info("-------------------validateMaxPurchaseCount start");
        return orderDto -> {
            return true;
        };
    }

    public static Predicate<OrderValidationDto> validateMinPurchaseCount(){
        log.info("-------------------validateMinPurchaseCount start");
        return orderDto -> {
            return true;
        };
    }

}
