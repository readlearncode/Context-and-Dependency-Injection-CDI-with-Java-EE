package com.readlearncode;

import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.Random;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RandomNumberGenerator {

    private Random ran = new Random();

    @Produces
    private ArrayList<Integer> get() {
        return new ArrayList<Integer>() {{
            add(ran.nextInt(100));
            add(ran.nextInt(100));
            add(ran.nextInt(100));
            add(ran.nextInt(100));
        }};
    }


}