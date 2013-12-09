package com.glam.billing.service.cc;

import com.glam.billing.service.Service;
import com.glam.billing.service.TransactionException;

public class CreditCardService implements Service {
	private final long transactionLimit;
	private long totalTransactionAmount;
	
	public CreditCardService(long limit){
		transactionLimit = limit;
	}

	public boolean makePayment(long amount) throws TransactionException {
		System.out.println("Using the CreditCard payment Gateway");
		makeTransaction(amount);
		return true;
	}

	private void makeTransaction(long amount) throws TransactionLimitExceededException{
		if(amount + totalTransactionAmount < transactionLimit){
			totalTransactionAmount += amount;
		}else
			throw new TransactionLimitExceededException();
	}

}
