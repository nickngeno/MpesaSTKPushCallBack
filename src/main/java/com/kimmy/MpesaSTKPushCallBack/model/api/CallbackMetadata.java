package com.kimmy.MpesaSTKPushCallBack.model.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Item"
})
public class CallbackMetadata {

    @JsonProperty("Item")
    public List<Item> item = null;

}
