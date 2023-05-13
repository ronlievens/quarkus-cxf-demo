package com.github.ronlievens.quarkus.demo.cxf;

import io.quarkiverse.cxf.it.server.HelloService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(serviceName = "HelloService")
public class HelloServiceImpl implements HelloService {

    @WebMethod
    @Override
    public String hello(final String text) {
        return "Hello " + text + "!";
    }
}
