package com.java5.features.enums;

public enum UserStatus {
	PENDING("P"), ACTIVE("A"), INACTIVE("I"), DELETED("D");

	private String statusCode;

	private UserStatus(String s) {
		statusCode = s;
	}

	public String getStatusCode() {
		return statusCode;
	}

}
