package com.plateer.ec1.claim.monitoring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Configuration
public class MonitoringLogHelper {

    public Long insertMonitoringLog(String claimNo){
        log.info("주문 모니터링 등록 - 클레임");
        return 1L;
    }

    public void updateMonitoringLog(Long monitoringNo, String claimNo){
        log.info("주문 모니터링 업데이트 - 클레임");
    }
}
