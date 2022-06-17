package com.plateer.ec1.promotion.controller;

import com.plateer.ec1.promotion.service.PromotionService;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseCartCouponVO;
import com.plateer.ec1.promotion.vo.ResponsePriceDcVO;
import com.plateer.ec1.promotion.vo.ResponseProductCouponVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PromotionController {

    private final PromotionService promotionService;

    public ResponsePriceDcVO getPriceDiscountApplyData(RequestPromotionVO requestPromotionVO){
        return promotionService.getPriceDiscountApplyData(requestPromotionVO);
    }

    public ResponseProductCouponVO getProductCouponApplyData(RequestPromotionVO requestPromotionVO){
        return promotionService.getProductCouponApplyData(requestPromotionVO);
    }

    public ResponseCartCouponVO getCartCouponApplyData(RequestPromotionVO requestPromotionVO){
        return promotionService.getCartCouponApplyData(requestPromotionVO);
    }
}
