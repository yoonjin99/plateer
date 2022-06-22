package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CartCouponCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        log.info("-------CartCouponCalculation getCalculationData start");
        Promotion promotion = getAvailablePromotionData(vo);
        ResponseCartCouponVO responseCartCouponVO = calculateDcAmt(vo, promotion);
        return calculateMaxBenefit(responseCartCouponVO);
    }

    @Override
    public PromotionType getType() {
        return PromotionType.cartCoupon;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO vo){
        log.info("-------CartCouponCalculation getAvailablePromotionData start");
        return null;
    }

    private ResponseCartCouponVO calculateDcAmt(RequestPromotionVO vo, Promotion prm){
        log.info("-------CartCouponCalculation calculateDcAmt start");
        return null;
    }

    private ResponseCartCouponVO calculateMaxBenefit(ResponseCartCouponVO vo){
        log.info("-------CartCouponCalculation calculateMaxBenefit start");
        return null;
    }
}
