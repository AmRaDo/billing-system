package com.glam.billing.service;

import com.glam.billing.config.BillingConfig;
import com.glam.billing.service.cc.CreditCardService;
import com.glam.billing.service.netbanking.NetBankingService;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class ServiceProvider implements Provider<Service> {
	
	private BillingConfig config;
	@Inject
	public ServiceProvider(BillingConfig config){
		this.config = config;
	}

	public Service get() {
		String method = config.getPaymentMethod();
		if("NetBanking".equalsIgnoreCase(method)){
			return new NetBankingService(config.getNetBankingBalance());
		} 
		if("CreditCard".equals(method)){
			return new CreditCardService(config.getCCTransactionLimit());
		} 
		
		return new DummyService();
	}

}
