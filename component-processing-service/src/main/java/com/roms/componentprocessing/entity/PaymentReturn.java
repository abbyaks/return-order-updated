package com.roms.componentprocessing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payments")
public class PaymentReturn {
    public PaymentReturn(String requestId2, long cardNumber2, double processingCharge2) {
		// TODO Auto-generated constructor stub
	}
	@Id
    private String requestId;
    private long cardNumber;
    private double processingCharge;
}
