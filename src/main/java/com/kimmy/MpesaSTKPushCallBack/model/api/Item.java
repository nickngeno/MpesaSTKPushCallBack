package com.kimmy.MpesaSTKPushCallBack.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Name",
        "Value"
})
public class Item {

    @JsonProperty("Name")
    public String name;
    @JsonProperty("Value")
    public String value;

}

