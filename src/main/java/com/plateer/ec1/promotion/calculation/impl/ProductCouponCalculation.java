package com.plateer.ec1.promotion.calculation.impl;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.vo.Promotion;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVO;
import org.springframework.stereotype.Component;

@Component
public class ProductCouponCalculation implements Calculation {
    @Override
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo) {
        return null;
    }

    private Promotion getAvailablePromotionData(RequestPromotionVO reqVO){
        return null;
    }

    private ResponseProductCouponVO calculate(RequestPromotionVO vo, Promotion prm){
        return null;
    }

    private ResponseProductCouponVO calculateMaxBenefit(ResponseProductCouponVO vo){
        return null;
    }
}
