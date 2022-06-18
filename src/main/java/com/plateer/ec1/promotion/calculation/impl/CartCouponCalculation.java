package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVO;
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
