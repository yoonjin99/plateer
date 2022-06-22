package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.monitoring.MonitoringLogHelper;
import com.plateer.ec1.claim.type.ProcessorType;
import com.plateer.ec1.claim.validator.ClaimValidator;
import com.plateer.ec1.claim.vo.ClaimDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public abstract class ClaimProcessor {
    public abstract ProcessorType getType();

    protected final ClaimValidator claimValidator;
    protected final MonitoringLogHelper monitoringLogHelper;

    protected void doValidationProcess(ClaimDto claimDto){
        log.info("-------------- ClaimProcessor 유효성 검사 실행 --------------------");
        claimValidator.verifyAmount(claimDto);
    }

    protected Long insertLog(String claimNo){
        return monitoringLogHelper.insertMonitoringLog(claimNo);
    }

    protected void updateLog(Long monitoringLog, String claimNo){
        monitoringLogHelper.updateMonitoringLog(monitoringLog, claimNo);
    }

    public abstract void doProcess(ClaimDto claimDto);
}
