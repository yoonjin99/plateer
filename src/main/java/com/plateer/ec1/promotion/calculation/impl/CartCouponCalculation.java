package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVO;
import org.springframework.stereotype.Component;

@Component
public class CartCouponCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        return null;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO vo){
        return null;
    }

    private ResponseCartCouponVO calculateDcAmt(RequestPromotionVO vo, Promotion prm){
        return null;
    }

    private ResponseCartCouponVO calculateMaxBenefit(ResponseCartCouponVO vo){
        return null;
    }
}
