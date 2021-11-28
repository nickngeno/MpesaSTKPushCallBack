package com.kimmy.MpesaSTKPushCallBack.repository;

import com.kimmy.MpesaSTKPushCallBack.model.payload.StkPushTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StkResponseRepository extends CrudRepository<StkPushTransaction, UUID> {

    StkPushTransaction findByCheckoutRequestID(String checkoutRequestID);
}
