package com.kimmy.MpesaSTKPushCallBack.service;

import com.kimmy.MpesaSTKPushCallBack.model.api.StkCallbackResponse;
import com.kimmy.MpesaSTKPushCallBack.model.payload.StkPushTransaction;
import com.kimmy.MpesaSTKPushCallBack.model.payload.SuccessStatus;
import com.kimmy.MpesaSTKPushCallBack.repository.StkResponseRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StkResponseService {

    private final StkResponseRepository stkResponseRepository;

    public StkResponseService(StkResponseRepository stkResponseRepository) {
        this.stkResponseRepository = stkResponseRepository;
    }

    public ResponseEntity<SuccessStatus> saveResponse(StkCallbackResponse response) {
        StkPushTransaction transaction = new StkPushTransaction();
        transaction.setCheckoutRequestID(response.body.stkCallback.merchantRequestID);
        transaction.setCheckoutRequestID(response.body.stkCallback.checkoutRequestID);
        transaction.setResultCode(response.body.stkCallback.resultCode);
        transaction.setResultDesc(response.body.stkCallback.resultDesc);
        transaction.setAmount(Double.parseDouble(response.body.stkCallback.callbackMetadata.item.get(0).value));
        transaction.setMpesaReceiptNumber(response.body.stkCallback.callbackMetadata.item.get(1).value);
        transaction.setTransactionDate(response.body.stkCallback.callbackMetadata.item.get(2).value);
        transaction.setPhoneNumber(response.body.stkCallback.callbackMetadata.item.get(3).value);

        StkPushTransaction similarTransaction = stkResponseRepository.findByCheckoutRequestID(transaction.getCheckoutRequestID());
        if(similarTransaction != null){
            SuccessStatus status = new SuccessStatus(false);
            return new ResponseEntity<>(status, HttpStatus.BAD_REQUEST);
        }
        stkResponseRepository.save(transaction);
        SuccessStatus status = new SuccessStatus(true);
        return new ResponseEntity<>(status, HttpStatus.OK);

        }


}
