package com.WebService;

import javax.jws.WebService;

@WebService
public class WebServiceServerImpl implements IWebservice {

    @Override
    public String sysout(String sysinput) {
        System.out.println(sysinput);
        return sysinput;
    }
}
