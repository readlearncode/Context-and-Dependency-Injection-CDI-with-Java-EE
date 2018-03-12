package com.readlearncode.interceptors;

import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Interceptors(LoggerInterceptor.class)
public class CustomerService {

    public CustomerService() { }

    public void suspendCustomerAccount(String customerName, String reason){
        // Perform logic that suspends the customer's account
    }

    @ExcludeClassInterceptors
    public void internalAccountAudit(String customerName){
        // perform internal audit logic
    }

}