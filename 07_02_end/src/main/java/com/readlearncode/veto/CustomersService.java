package com.readlearncode.veto;

import javax.enterprise.inject.Vetoed;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Vetoed
public class CustomersService {

    public void serviceName(){
        System.out.println("Customer Service");
    }

}