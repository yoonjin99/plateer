package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderProductValidators {
    public static Predicate<OrderValidationDto> isSellingProduct = (dto) -> {
        log.info("OrderProductValidators.isSellingProduct: {}", dto);
        return true;
    };
}
