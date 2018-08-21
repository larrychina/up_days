package org.larry.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by suning on 2018/8/21.
 */
public interface ISayHelloService extends Remote {


    public String sayHello(String content) throws RemoteException;

}
