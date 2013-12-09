package com.glam.billing.service;

public class DummyService implements Service {

	public boolean makePayment(long amount) throws TransactionException {
		return false;
	}

}
