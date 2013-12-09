package com.glam.billing;

import com.glam.billing.service.Service;
import com.glam.billing.service.TransactionException;
import com.google.inject.Inject;

public class ShoppingCart {
	Service paymentService;
	
	@Inject
	public ShoppingCart(Service service){
		this.paymentService = service;
	}
	
	public boolean checkout(long amount){
		try {
			System.out.println("Attempting the payment using : " +  paymentService.getClass());
			return this.paymentService.makePayment(amount);
			
		} catch (TransactionException e) {
			System.out.println("Payment failed using Service " + paymentService.getClass() + " due to " + e);
		}
		return false;
	}
}
