package com.roms.payment.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CREDITS")
public class CreditCard {
    @Id
    private Long cardNumber;
    private double cardBalance;
    private int cvv;
	public int getCvv() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getCardBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCardBalance(double balance) {
		// TODO Auto-generated method stub
		
	}

}
