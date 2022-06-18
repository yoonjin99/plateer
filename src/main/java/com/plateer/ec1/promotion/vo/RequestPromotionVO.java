package com.plateer.ec1.promotion.vo;

import lombok.Data;

import java.util.List;

@Data
public class RequestPromotionVO {
    private String memberNo;
    private List<Product> productList;
    private Long couponIssueNo;
}
