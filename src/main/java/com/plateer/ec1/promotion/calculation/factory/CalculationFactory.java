package com.plateer.ec1.promotion.calculation.factory;

import com.plateer.ec1.promotion.calculation.Calculation;
import com.plateer.ec1.promotion.calculation.impl.CartCouponCalculation;
import com.plateer.ec1.promotion.calculation.impl.PriceDiscountCalculation;
import com.plateer.ec1.promotion.calculation.impl.ProductCouponCalculation;
import com.plateer.ec1.promotion.vo.PromotionType;
import com.plateer.ec1.promotion.vo.RequestPromotionVO;
import com.plateer.ec1.promotion.vo.ResponseBaseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Slf4j
public class CalculationFactory {

    private final Map<PromotionType, Calculation> map = new HashMap();

    public CalculationFactory(List<Calculation> calculations) {
        calculations.forEach(calculation -> map.put(calculation.getType(), calculation));
    }

    public ResponseBaseVO getPromotionCalculationData(RequestPromotionVO vo, PromotionType type){
        log.info("-------CalculationFactory start-------");
        return map.get(type).getCalculationData(vo);
    }
}
