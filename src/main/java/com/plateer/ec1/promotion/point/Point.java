package com.plateer.ec1.promotion.point;

import com.plateer.ec1.promotion.point.vo.PointVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Point {
    private String memberNo;
    private String saveUseCcd;
    private int pointAmt;

    private PointVO getPointInfo(String clnNo){
        log.info("적립포인트 가져오기");
        return null;
    }

    public PointVO savePoint(String clnNo, int pointAmt){
        log.info("포인트 저장");
        return null;
    }

    public PointVO usePoint(String clnNo, int pointAmt){
        log.info("포인트 사용");
        return null;
    }

    public PointVO cancelPoint(String clnNo, int pointAmt){
        log.info("포인트 취소");
        return null;
    }
}
