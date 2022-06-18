package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResponseProductCouponVO extends ResponseBaseVO{
    private List<ProductCouponVO> productPromotionList;
}
