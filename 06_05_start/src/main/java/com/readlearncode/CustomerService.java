package com.readlearncode;

import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Logged
public class CustomerService {

    public CustomerService() {
    }

    public void suspendCustomerAccount(String customerName, String reason) {
        // Perform logic that suspends the customer's account
    }

    public void internalAccountAudit(String customerName) {
        // perform internal audit logic
        simulateWork();
    }

    private void simulateWork() {
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}