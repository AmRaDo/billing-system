package com.glam.billing.service.netbanking;

import com.glam.billing.service.Service;
import com.glam.billing.service.TransactionException;

public class NetBankingService implements Service {

	private long availableBal;
	public NetBankingService(long availableBal){
		this.availableBal = availableBal;
	}

	public boolean makePayment(long amount) throws TransactionException{
		makeTransaction(amount);
		return true;
	}
	
	private void makeTransaction(long amount) throws InsufficientBalanceException{
		if(availableBal > amount){
			this.availableBal -= amount;
		}else
			throw new InsufficientBalanceException();
	}

	public long getAvailableBalance(){
		return availableBal;
	}
}
