package com.plateer.ec1.payment.factory;

import com.plateer.ec1.payment.vo.ApproveResVO;
import com.plateer.ec1.payment.vo.NetCancelReqVO;
import com.plateer.ec1.payment.vo.OriginalOrder;
import com.plateer.ec1.payment.vo.PayInfo;

public interface PaymentService {
    public void validateAuth(PayInfo payInfo);
    public ApproveResVO approvePay(PayInfo payInfo);
    public void cancelPay(OriginalOrder originalOrder);
    public void netCancel(NetCancelReqVO netCancelReqVO);
}
