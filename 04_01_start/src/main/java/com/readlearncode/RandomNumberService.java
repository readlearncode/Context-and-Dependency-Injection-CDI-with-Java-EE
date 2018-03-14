package com.readlearncode;

import javax.inject.Inject;
import java.util.ArrayList;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class RandomNumberService {

    @Inject
    private ArrayList<Integer> randomNumber;

    public void print(){
        System.out.println(randomNumber);
    }

}