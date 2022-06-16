package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;
import com.plateer.ec1.order.vo.OrderValidationDto;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Predicate;

@Slf4j
public class OrderTypeValidators {

    // 모바일 쿠폰 상품확인
    public static Predicate<OrderValidationDto> isEcouponOrderAbleProduct(){
        log.info("-------------------isEcouponOrderAbleProduct start");
        return orderDto -> {
            return true;
        };
    }

    // 모바일 쿠폰 필수 데이터 확인
    public static Predicate<OrderValidationDto> ecouponDataValidation(){
        log.info("-------------------ecouponDataValidation start");
        return orderDto -> {
            return true;
        };
    }

    // 일반주문 상품확인
    public static Predicate<OrderValidationDto> isGeneralOrderAbleProduct(){
        log.info("-------------------isGeneralOrderAbleProduct start");
        return orderDto -> {
            return true;
        };
    }

    // 일반주문 필수 데이터 확인
    public static Predicate<OrderValidationDto> generalDataValidation(){
        log.info("-------------------generalDataValidation start");
        return orderDto -> {
            return true;
        };
    }
}
