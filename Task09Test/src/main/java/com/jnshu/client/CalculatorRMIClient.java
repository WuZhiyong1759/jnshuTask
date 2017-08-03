package com.jnshu.client;
import com.jnshu.service.ICalculator;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
/**
 * tuscany 1.6.2 客户端
 * Created by Tom on 2017/5/29.
 */
public class CalculatorRMIClient {
//    public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
//        ICalculator c= (ICalculator) Naming.lookup("//localhost:8099/Calculator");
//        System.out.println("3 + 2 = "+c.add(3, 2));
//        System.out.println("3 - 2 = "+c.subtract(3, 2));
//        System.out.println("3 * 2 = "+c.multiply(3, 2));
//        System.out.println("3 / 2 = "+c.divide(3, 2));
//    }
}
