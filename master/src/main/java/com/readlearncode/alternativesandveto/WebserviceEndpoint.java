package com.readlearncode.alternativesandveto;

import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class WebserviceEndpoint implements Webservice {

    public List<String> getRemoteData() {
        return new ArrayList<String>() {{
            add("John");
            add("Mary");
            add("Lynn");
        }};
    }

}