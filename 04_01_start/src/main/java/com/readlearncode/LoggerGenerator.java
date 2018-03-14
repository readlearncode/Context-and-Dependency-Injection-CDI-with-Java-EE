package com.readlearncode;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class LoggerGenerator {

    @Produces
    public Logger produceLogger(InjectionPoint injectionPoint) {
        Class clazz = injectionPoint.getBean().getBeanClass();
        return Logger.getLogger(clazz.getCanonicalName());
    }

}