package com.plateer.ec1.promotion.calculation.factory;

import com.plateer.ec1.payment.factory.Inicis;
import com.plateer.ec1.payment.factory.PaymentService;
import com.plateer.ec1.payment.factory.PaymentType;
import com.plateer.ec1.payment.factory.Point;
import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.calculation.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.calculation.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.calculation.impl.ProductCouponCalculation;
import com.plateer.ec1.promotion.vo.PromotionType;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class CalculationFactory {

    private final Map<PromotionType, Calculation> map = new HashMap();

    public CalculationFactory(PriceDiscountCalculation priceDiscountCalculation, ProductCouponCalculation productCouponCalculation, CartCouponCalculation cartCouponCalculation) {
        map.put(PromotionType.priceDisCount, priceDiscountCalculation);
        map.put(PromotionType.productCoupon, productCouponCalculation);
        map.put(PromotionType.cartCoupon, cartCouponCalculation);
    }

    public Calculation getPromotionCalculationData(RequestPromotionVO vo, PromotionType type){
        log.info("-------CalculationFactory start-------");
        return map.get(type);
    }
}
