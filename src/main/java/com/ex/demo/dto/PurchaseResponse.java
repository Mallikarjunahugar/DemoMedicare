package com.ex.demo.dto;
import lombok.Data;
@Data
public class PurchaseResponse {

    private final String orderTrackingNumber = "";

	public PurchaseResponse(String orderTrackingNumber2) {
		// TODO Auto-generated constructor stub
	}

	public String getOrderTrackingNumber() {
		return orderTrackingNumber;
	}

	@Override
	public String toString() {
		return "PurchaseResponse [orderTrackingNumber=" + orderTrackingNumber + "]";
	}

}