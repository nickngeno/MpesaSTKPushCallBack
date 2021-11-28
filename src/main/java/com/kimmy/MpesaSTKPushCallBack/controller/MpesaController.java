package com.kimmy.MpesaSTKPushCallBack.controller;

import com.kimmy.MpesaSTKPushCallBack.model.api.StkCallbackResponse;
import com.kimmy.MpesaSTKPushCallBack.model.payload.SuccessStatus;
import com.kimmy.MpesaSTKPushCallBack.service.StkResponseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class MpesaController {

    private final StkResponseService stkResponseService;

    public MpesaController(StkResponseService stkResponseService) {
        this.stkResponseService = stkResponseService;
    }

    @GetMapping("/")
    public String getMpesaTransactions() {
        return "received!";
    }

    @PostMapping("/stkcallback")
    public ResponseEntity<SuccessStatus> stkCallback(@RequestBody StkCallbackResponse response) {
        return stkResponseService.saveResponse(response);

    }


}
