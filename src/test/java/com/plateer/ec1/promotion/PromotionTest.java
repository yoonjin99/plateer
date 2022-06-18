package com.plateer.ec1.promotion;

import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponsePriceDcVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PromotionTest {

    @Autowired
    PromotionService promotionService;

    @Test
    void priceDiscount(){
        log.info("가격조정할인 금액 계산");
        RequestPromotionVO requestPromotionVO = new RequestPromotionVO();
        promotionService.getPriceDiscountApplyData(requestPromotionVO);
    }


    @Test
    void productCoupon(){
        log.info("상품쿠폰 금액 계산");
        RequestPromotionVO requestPromotionVO = new RequestPromotionVO();
        promotionService.getProductCouponApplyData(requestPromotionVO);
    }

    @Test
    void cartCoupon(){
        log.info("장바구니쿠폰 금액 계산");
        RequestPromotionVO requestPromotionVO = new RequestPromotionVO();
        promotionService.getCartCouponApplyData(requestPromotionVO);
    }
}
