package com.roms.componentprocessing.payload;

import lombok.Data;

@Data
public class ReturnRequestPayload {
    private String userName;
    private long contactNumber;
    private long cardNumber;
    private boolean isPriorityRequest;

    private String componentType;
    private String componentName;
    private int quantity;
	public String getComponentType() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean isPriorityRequest() {
		// TODO Auto-generated method stub
		return false;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
}
