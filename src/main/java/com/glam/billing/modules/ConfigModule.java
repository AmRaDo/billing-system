package com.glam.billing.modules;

import com.glam.billing.config.BillingConfig;
import com.glam.billing.config.ConfigProvider;
import com.google.inject.Binder;
import com.google.inject.Module;

public class ConfigModule implements Module {

	public void configure(Binder binder) {
		binder.bind(BillingConfig.class).toProvider(ConfigProvider.class);
	}

}
