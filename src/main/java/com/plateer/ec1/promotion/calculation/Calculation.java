package com.plateer.ec1.promotion.calculation;

import com.plateer.ec1.promotion.vo.PromotionType;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;

public interface Calculation {
    public ResponseBaseVO getCalculationData(RequestPromotionVO vo);
    PromotionType getType();
}
