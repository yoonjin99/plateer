package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PriceDiscountCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        log.info("-------PriceDiscountCalculation getCalculationData start");
        Promotion promotion = getAvailablePromotionData(vo);
        return calculateDcAmt(vo,promotion);
    }

    @Override
    public PromotionType getType() {
        return PromotionType.priceDiscount;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO vo){
        log.info("-------PriceDiscountCalculation getAvailablePromotionData start");
        return null;
    }

    private ResponsePriceDcVO calculateDcAmt(RequestPromotionVO reqVo, Promotion prm){
        log.info("-------PriceDiscountCalculation calculateDcAmt start");
        return null;
    }
}
