package org.larry.rmi.client;

import org.larry.rmi.service.ISayHelloService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by suning on 2018/8/21.
 */
public class RmiClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        ISayHelloService sayHelloService = (ISayHelloService) Naming.lookup("rmi://localhost:6789/sayHello");

        System.out.println(sayHelloService.sayHello("larry"));
    }
}
