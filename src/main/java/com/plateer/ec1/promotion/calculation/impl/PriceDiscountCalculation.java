package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;
import com.plateer.ec1.promotion.vo.ResponsePriceDcVO;
import org.springframework.stereotype.Component;

@Component
public class PriceDiscountCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        return null;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO vo){
        return null;
    }

    private ResponsePriceDcVO calculateDcAmt(RequestPromotionVO reqVo, Promotion prm){
        return null;
    }
}
