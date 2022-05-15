package com.roms.portal.payload;

import lombok.Data;

import java.util.Date;

@Data
public class ReturnResponsePayload {
    private String requestId;
    private double processingCharge;
    private double packageAndDeliveryCharge;
    private Date dateOfDelivery;
	public String getRequestId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getProcessingCharge() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getPackageAndDeliveryCharge() {
		// TODO Auto-generated method stub
		return null;
	}
	public Date getDateOfDelivery() {
		// TODO Auto-generated method stub
		return null;
	}
}
