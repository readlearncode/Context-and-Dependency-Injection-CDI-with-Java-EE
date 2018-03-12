package com.readlearncode;

import javax.enterprise.inject.Instance;
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
    private Instance<ArrayList<Integer>> randomNumber;

    public void print(){
        System.out.println(randomNumber.get());
    }

}