package com.readlearncode;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class BootStrap {

    public static void main(String... args) {

        SeContainer container = SeContainerInitializer
                .newInstance()
                .enableInterceptors(LoggerInterceptor.class)
                .enableInterceptors(TimerInterceptor.class)
                .initialize();

        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().suspendCustomerAccount("John Smith", "Has not paid outstanding balance");
        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().internalAccountAudit("John Smith");
        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().suspendCustomerAccount("Jone Brown", "Fraud detected on account");
        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().suspendCustomerAccount("Lucy Long", "Account appears inactive");
        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().internalAccountAudit("Lucy Long");
        System.out.println("------------------------------------------------");
        container.select(CustomerService.class).get().suspendCustomerAccount("Jo Blonk", "Customer requested suspension");
        System.out.println("------------------------------------------------");

        container.close();
    }
}