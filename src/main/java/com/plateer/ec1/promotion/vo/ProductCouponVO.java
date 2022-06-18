package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductCouponVO {
    private Product product;
    private List<Promotion> promotionList;
    private String maxBenefitYn;
}
