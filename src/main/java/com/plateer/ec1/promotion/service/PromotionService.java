package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.calculation.factory.CalculationFactory;
import com.plateer.ec1.promotion.vo.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculationFactory calculationFactory;

    public ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVO vo){
        return (ResponsePriceDcVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.priceDisCount);
    }

    public ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVO vo){
        return (ResponseProductCouponVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.productCoupon);
    }

    public ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVO vo){
        return (ResponseCartCouponVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.cartCoupon);
    }
}
