package com.kimmy.MpesaSTKPushCallBack.model.payload;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "stk_push_transactions")
public class StkPushTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;
    private String merchantRequestID;
    private String checkoutRequestID;
    private Integer resultCode;
    private String resultDesc;
    private double amount;
    private String mpesaReceiptNumber;
    private String transactionDate;
    private String phoneNumber;

    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;


}
