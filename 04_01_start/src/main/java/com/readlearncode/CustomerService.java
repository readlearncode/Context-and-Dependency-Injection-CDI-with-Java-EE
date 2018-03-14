package com.readlearncode;

import javax.inject.Inject;
import java.util.logging.Logger;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class CustomerService {

    @Inject
    private Logger logger;

    public void refundCustomer(){
        logger.info("refund customer");
    }

}