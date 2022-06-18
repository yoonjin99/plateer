package com.plateer.ec1.promotion.service;

import com.plateer.ec1.promotion.calculation.factory.CalculationFactory;
import com.plateer.ec1.promotion.vo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PromotionService {

    private final CalculationFactory calculationFactory;

    public ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVO vo){
        log.info("----------PromotionService getPriceDiscountApplyData start");
        return (ResponsePriceDcVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.priceDiscount);
    }

    public ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVO vo){
        log.info("----------PromotionService getProductCouponApplyData start");
        return (ResponseProductCouponVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.productCoupon);
    }

    public ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVO vo){
        log.info("----------PromotionService getCartCouponApplyData start");
        return (ResponseCartCouponVO) calculationFactory.getPromotionCalculationData(vo, PromotionType.cartCoupon);
    }
}
