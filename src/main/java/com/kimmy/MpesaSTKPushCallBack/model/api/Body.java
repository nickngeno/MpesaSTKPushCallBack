package com.kimmy.MpesaSTKPushCallBack.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "stkCallback"
})
public class Body {

    @JsonProperty("stkCallback")
    public StkCallback stkCallback;

}