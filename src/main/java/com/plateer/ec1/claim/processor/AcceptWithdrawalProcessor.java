package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.monitoring.MonitoringLogHelper;
import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.validator.ClaimValidator;
import com.plateer.ec1.claim.vo.ClaimDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class AcceptWithdrawalProcessor extends ClaimProcessor{

    private static AcceptWithdrawalProcessor acceptWithdrawalProcessor;

    @PostConstruct
    private void initialize() {
        acceptWithdrawalProcessor = this;
    }

    public static AcceptWithdrawalProcessor getInstance() {
        return acceptWithdrawalProcessor;
    }

    public AcceptWithdrawalProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper) {
        super(claimValidator, monitoringLogHelper);
    }

    @Override
    public void doProcess(ClaimDto claimDto) {
        log.info("----------AcceptWithdrawalProcessor doProcess 실행--------");
        Long monitoringLog = null;
        String claimNo = "";
        try {
            // 데이터 생성
            ClaimDataCreator claimDataCreator = ClaimType.findClaimDataCreator(claimDto.getClaimType().name());
            // 클레임 번호 채번
            claimNo = claimDataCreator.getClaimNo(claimDto);
            // 주문 모니터링 로그 등록
            monitoringLog = insertLog(claimNo);
            // 유효성 검증
            doValidationProcess(claimDto);
            // insert 대상 데이터 생성
            ClaimModel insertData = claimDataCreator.getInsertClaimData();
            // update 대상 데이터 생성
            ClaimModel updateData = claimDataCreator.getUpdateClaimData();
            // 데이터 저장
            claimDataCreator.saveClaimData(insertData, updateData);
        }catch (Exception e){
            log.error("error : {}", e);
        }finally {
            // 주문 모니터링 update
            updateLog(monitoringLog, claimNo);
        }
    }
}
