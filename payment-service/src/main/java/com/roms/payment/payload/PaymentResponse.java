package com.roms.payment.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PaymentResponse {
    public PaymentResponse(double processPayment) {
		// TODO Auto-generated constructor stub
	}

	private double currentBalance;
}
