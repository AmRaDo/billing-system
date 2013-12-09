package com.glam.billing.service;

public interface Service {
	public boolean makePayment(long amount) throws TransactionException;
}
