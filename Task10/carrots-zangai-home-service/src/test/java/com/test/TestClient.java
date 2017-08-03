package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.carrots.zangai.service.ArticleService;
import com.ptteng.carrots.zangai.service.CompanyLabelService;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by Tom on 2017/7/7.
 */
@Ignore
public class TestClient {

    private CompanyLabelService companyLabelService;
    @Test
    public void getTest() throws RemoteException, NotBoundException, MalformedURLException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
        companyLabelService = (CompanyLabelService) context.getBean("companyLabelService");
//        companyLabelService = (CompanyLabelService)  Naming.lookup("//localhost:9012/CompanyLabelRMIService");
        CompanyLabel companyLabel=new CompanyLabel();
//        companyLabel.setId(1l);
        companyLabel.setCId(3l);
        companyLabel.setContent("五险一金");
        companyLabel.setCreateBy(1l);
        companyLabel.setUpdateBy(2l);

        try {
            companyLabelService.insert(companyLabel);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (ServiceDaoException e) {
            e.printStackTrace();
        }

    }

}
