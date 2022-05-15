package com.roms.payment.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {

    public ExceptionResponse(Date date, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	private Date timestamp;
    private String message;
    private String details;


}
