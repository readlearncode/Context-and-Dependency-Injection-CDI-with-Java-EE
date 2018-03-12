package com.readlearncode;

import javax.annotation.Priority;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Timed
@Interceptor
@Priority(Interceptor.Priority.APPLICATION + 10)
public class TimerInterceptor {

    @AroundInvoke
    private Object doMethodLogging(InvocationContext ic) throws Exception {
        long start = System.currentTimeMillis();
        Object rtn = ic.proceed();
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start));
        return rtn;
    }

}