package com.readlearncode;

import java.util.concurrent.TimeUnit;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Logged
public class CustomerService {

    public CustomerService() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
    }

    public void suspendCustomerAccount(String customerName, String reason){
        // Perform logic that suspends the customer's account
    }

    public void internalAccountAudit(String customerName){
        // perform internal audit logic
    }

}