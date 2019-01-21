package com.WebService;

import javax.xml.ws.Endpoint;

public class WebserviceServer {

    public static void main(String[] args){
        Endpoint.publish("http://127.0.0.1:12345/webserviceTest", new WebServiceServerImpl());
    }
}
