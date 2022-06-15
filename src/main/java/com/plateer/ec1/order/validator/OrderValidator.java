package com.plateer.ec1.order.validator;

import com.plateer.ec1.order.vo.OrderDto;
import com.plateer.ec1.order.vo.OrderRequest;

import java.util.function.Predicate;

public enum OrderValidator implements Predicate<OrderDto> {
    FO_GENERAL("FO_GENERAL", OrderCommonValidators.validateMaxPurchaseCount()),
    BO_GENERAL("BO_GENERAL", OrderCommonValidators.validateMaxPurchaseCount().and(OrderTypeValidators.isEcouponOrderAbleProduct()));
//    FO_ECOUPON("FO_ECOUPON", (orderdto) -> OrderCommonValidators.validateMaxPurchaseCount(orderdto).test(orderdto)),
//    BO_ECOUPON("BO_ECOUPON", (orderdto) -> OrderCommonValidators.validateMaxPurchaseCount(orderdto).test(orderdto));

    private String type;
    private final Predicate<OrderDto> validCheck;

    OrderValidator(String type, Predicate<OrderDto> validCheck){
        this.type = type;
        this.validCheck = validCheck;
    }

    @Override
    public boolean test(OrderDto t) {
        return validCheck.test(t);
    }

    public static boolean valid(OrderDto dto){
        return false;
    }

    // 상수명 찾는 메소드
    public static OrderValidator get(OrderRequest orderRequest){
        return null;
    };
}
