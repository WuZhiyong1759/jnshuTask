package com.jnshu.client;




//import org.apache.tuscany.sca.host.embedded.SCADomain;

import java.io.IOException;
/**
 * tuscany 1.6.2 service
 * Created by Tom on 2017/5/29.
 */
public class CalculatorRMIServer {
    public static void main(String[] args) throws IOException {
        System.out.println("将SCA组件作为RMI接口供外界访问.......");
        SCADomain domain = SCADomain.newInstance("Calculator.composite");
        System.out.println("回车键推车.......");
        System.in.read();
        domain.close();
        System.out.println("退出.......");
        System.exit(0);
    }
}
