package com.roms.authentication.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthResponse {
	public AuthResponse(String username2, String compact) {
		// TODO Auto-generated constructor stub
	}
	private String userName;
	private String token;
}
