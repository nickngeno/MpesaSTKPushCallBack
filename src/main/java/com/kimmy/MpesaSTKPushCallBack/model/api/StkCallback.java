package com.kimmy.MpesaSTKPushCallBack.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "MerchantRequestID",
        "CheckoutRequestID",
        "ResultCode",
        "ResultDesc",
        "CallbackMetadata"
})
public class StkCallback {

    @JsonProperty("MerchantRequestID")
    public String merchantRequestID;
    @JsonProperty("CheckoutRequestID")
    public String checkoutRequestID;
    @JsonProperty("ResultCode")
    public Integer resultCode;
    @JsonProperty("ResultDesc")
    public String resultDesc;
    @JsonProperty("CallbackMetadata")
    public CallbackMetadata callbackMetadata;

}
