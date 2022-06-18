package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class ResponseCartCouponVO extends ResponseBaseVO{
    private List<CouponProductVO> promotionProductList;
}
