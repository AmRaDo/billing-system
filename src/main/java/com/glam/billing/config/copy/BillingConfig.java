package com.glam.billing.config.copy;

import org.skife.config.Config;
import org.skife.config.Default;

public interface BillingConfig {
	@Config("glam.billing.paymentmethod")
	@Default("CreditCard")
	String getPaymentMethod();
	
	@Config("glam.billing.cc.transactionlimit")
	@Default("1000")
	long getCCTransactionLimit();

	@Config("glam.billing.netbanking.availableBalance")
	@Default("1000")
	long getNetBankingBalance();
}
