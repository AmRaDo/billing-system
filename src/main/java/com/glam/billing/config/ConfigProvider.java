package com.glam.billing.config;

import java.io.IOException;
import java.util.Properties;

import org.skife.config.ConfigurationObjectFactory;

import com.google.inject.Provider;

public class ConfigProvider implements Provider<BillingConfig> {

	public BillingConfig get() {
		Properties configProps = getBillingCongiguration();
		ConfigurationObjectFactory factory = new ConfigurationObjectFactory(configProps);
		BillingConfig conf = factory.build(BillingConfig.class);
		return conf;
	}

	private Properties getBillingCongiguration() {
		
		Properties properties = new Properties();
		try {
			properties.load(this.getClass().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			return new Properties();
		}
		return properties;
	}

}
