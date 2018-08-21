package org.larry.rmi.service;

import java.io.Serializable;

/**
 * Created by suning on 2018/8/21.
 */
public class SayHelloServiceImpl implements ISayHelloService,Serializable{
    @Override
    public String sayHello(String content) {
        return "hello " + content ;
    }
}
