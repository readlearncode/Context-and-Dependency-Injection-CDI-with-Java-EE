package com.readlearncode;

import javax.enterprise.inject.Alternative;
import java.util.ArrayList;
import java.util.List;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
@Alternative
public class CustomerWebserviceTest implements Webservice {

    public List<String> getRemoteData() {
        return new ArrayList<String>() {{
            add("Tyler");
            add("Rose");
            add("Jonnie");
        }};
    }

}