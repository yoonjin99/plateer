package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProductCouponCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        log.info("-------ProductCouponCalculation getCalculationData start");
        Promotion promotion = getAvailablePromotionData(vo);
        ResponseProductCouponVO productCouponVO = calculateDcAmt(vo, promotion);
        return calculateMaxBenefit(productCouponVO);
    }

    @Override
    public PromotionType getType() {
        return PromotionType.productCoupon;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        log.info("-------ProductCouponCalculation getAvailablePromotionData start");
        return new Promotion();
    }

    private ResponseProductCouponVO calculateDcAmt(RequestPromotionVO vo, Promotion prm){
        log.info("-------ProductCouponCalculation calculate start");
        return new ResponseProductCouponVO();
    }

    private ResponseProductCouponVO calculateMaxBenefit(ResponseProductCouponVO vo){
        log.info("-------ProductCouponCalculation calculateMaxBenefit start");
        return new ResponseProductCouponVO();
    }
}
