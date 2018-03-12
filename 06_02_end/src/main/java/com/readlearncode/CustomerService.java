package com.readlearncode;

import javax.interceptor.ExcludeClassInterceptors;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Logged
public class CustomerService {

    public CustomerService() throws InterruptedException {
        Thread.sleep(1000);
    }

    public void suspendCustomerAccount(String customerName, String reason){
        // Perform logic that suspends the customer's account
    }

    @ExcludeClassInterceptors
    public void internalAccountAudit(String customerName){
        // perform internal audit logic
    }

}