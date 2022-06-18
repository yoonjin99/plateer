package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class CouponProductVO {
    private Promotion promotion;
    private List<Product> productList;
    private String maxBenefitYn;
}
