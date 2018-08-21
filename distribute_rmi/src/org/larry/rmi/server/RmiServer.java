package org.larry.rmi.server;

import org.larry.rmi.service.ISayHelloService;
import org.larry.rmi.service.SayHelloServiceImpl;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * Created by suning on 2018/8/21.
 */
public class RmiServer {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, InterruptedException {

        ISayHelloService sayHelloService = new SayHelloServiceImpl();

        LocateRegistry.createRegistry(6789) ;

        Naming.bind("rmi://localhost:6789/sayHello",sayHelloService);
        System.out.println("服务端启动");
        Thread.sleep(10000);
    }
}
