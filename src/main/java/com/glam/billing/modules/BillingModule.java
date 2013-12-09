package com.glam.billing.modules;

import com.glam.billing.service.Service;
import com.glam.billing.service.ServiceProvider;
import com.google.inject.Binder;
import com.google.inject.Module;

public class BillingModule implements Module {

	public void configure(Binder binder) {
		binder.bind(Service.class).toProvider(ServiceProvider.class);
	}

}
