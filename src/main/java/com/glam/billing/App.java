package com.glam.billing;

import com.glam.billing.modules.BillingModule;
import com.glam.billing.modules.ConfigModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Injector injector = Guice.createInjector(new BillingModule(), new ConfigModule());
    	 ShoppingCart instance = injector.getInstance(ShoppingCart.class);
    	 instance.checkout(400);
    }
}
