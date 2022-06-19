package com.plateer.ec1.claim.processor;

import com.plateer.ec1.claim.creator.ClaimDataCreator;
import com.plateer.ec1.claim.model.ClaimModel;
import com.plateer.ec1.claim.monitoring.MonitoringLogHelper;
import com.plateer.ec1.claim.type.ClaimType;
import com.plateer.ec1.claim.validator.ClaimValidator;
import com.plateer.ec1.claim.vo.ClaimDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Slf4j
public class CompleteProcessor extends ClaimProcessor {

    private final IFCallHelper ifCallHelper;
    private static CompleteProcessor completeProcessor;

    public CompleteProcessor(ClaimValidator claimValidator, MonitoringLogHelper monitoringLogHelper, IFCallHelper ifCallHelper) {
        super(claimValidator, monitoringLogHelper);
        this.ifCallHelper = ifCallHelper;
        log.info(completeProcessor + "completeProcessor = null ? ");
        completeProcessor = this;
        log.info("생성자 실행 후 " + completeProcessor);
    }

    @PostConstruct
    private void init() {
        log.info("초기화 실행");
        completeProcessor = this;
    }


    public static CompleteProcessor getInstance() {
        return completeProcessor;
    }

    @Override
    @EventListener
    public void doProcess(ClaimDto claimDto) {
        log.info("----------CompleteProcessor doProcess 실행--------");
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
            // update 대상 데이터 생성
            ClaimModel updateData = claimDataCreator.getUpdateClaimData();
            // 데이터 저장
            claimDataCreator.saveClaimData(null, updateData);
            // 결제 IF 호출
            ClaimModel claimModel = new ClaimModel();
            claimModel.setPaymentType("inicis");
            ifCallHelper.callPaymentIF(claimModel);
        }catch (Exception e){
            log.error( "error : " + e);
        }finally {
            // 주문 모니터링 update
            updateLog(monitoringLog, claimNo);
        }
    }

}
