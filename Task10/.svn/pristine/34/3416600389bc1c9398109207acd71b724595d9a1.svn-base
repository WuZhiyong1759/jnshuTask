package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Company;
import com.ptteng.carrots.zangai.service.CompanyService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Ignore
public class CompanyServiceTest {

	private static final Log log = LogFactory.getLog(CompanyServiceTest.class);
	
	private CompanyService companyService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
	        companyService = (CompanyService) context.getBean("companyService");
			//local server
			/**
			companyService = (CompanyService)  Naming.lookup("//localhost:9012/CompanyRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 companyService = (CompanyService) context.getBean("companyService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Company company  = new Company();
	   					 
			   					                company.setName("小米公司");
            
			   					                company.setLogo("1");
            
			   					                company.setSign("我们不做大米");
            
			   					                company.setNumber(1);
            
			   					                company.setEmail("515376335@qq.com");
            
			   					                company.setPhone(1L);
            
			   					                company.setAddress("1");
            
			   					                company.setTagId("1");
            
			   					                company.setMap("1");
            
			   					                company.setIntroduce("我们不做大米");
            
			   					                company.setFinancing(1);
            
			   					                company.setCity("1");
            
			   					                company.setCounty("1");
            
			   					                company.setApproved(0);
            
			   					                company.setJobs(1);
            
			   					                company.setIndustry(1);
            
			   					                company.setFreezed(0);
            
			   					                company.setReleasedAt(1L);
            
			   					 
			   					                company.setCreateBy(1L);
            
			   					 
			   					                company.setUpdateBy(1L);
            
			   	 
	 
	  Long id= this.companyService.insert(company);

      company = this.companyService.getObjectById(id);

	  Company company2=this.companyService.getObjectById(id);
	    Assert.assertNotNull(company2);
	  
		// 2. 更改 
				 		 				 				   company.setName("百度");
		    		 				 				   company.setLogo("1");
		    		 				 				   company.setSign("我们不做外卖");
		    		 				 				   company.setNumber(300);
		    		 				 				   company.setEmail("515376335@qq.com");
		    		 				 				   company.setPhone(1L);
		    		 				 				   company.setAddress("1");
		    		 				 				   company.setTagId("1");
		    		 				 				   company.setMap("1");
		    		 				 				   company.setIntroduce("我们不做外卖");
		    		 				 				   company.setFinancing(1);
		    		 				 				   company.setCity("1");
		    		 				 				   company.setCounty("1");
		    		 				 				   company.setApproved(0);
		    		 				 				   company.setJobs(1);
		    		 				 				   company.setIndustry(1);
		    		 				 				   company.setFreezed(0);
		    		 				 				   company.setReleasedAt(1L);
		    		 				 		 				 				   company.setCreateBy(1L);
		    		 				 		 				 				   company.setUpdateBy(1L);
		    		 				boolean success=this.companyService.update(company);		
		Assert.assertEquals(true, success);
		 Company company3=this.companyService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				             		 				 		 				             		 				//3.删除
		boolean successDelete=this.companyService.delete(id);	
		Assert.assertEquals(true, success);
		Company company4=this.companyService.getObjectById(id);
		Assert.assertNull(company4);
		
		//4.batchInsert
		 List<Company> list=new ArrayList<Company>();
	  	  Company company5  = new Company();
	   					 
			   					                company5.setName("小米公司");
            
			   					                company5.setLogo("1");
            
			   					                company5.setSign("我们不做大米");
            
			   					                company5.setNumber(1);
            
			   					                company5.setEmail("515376335@qq.com");
            
			   					                company5.setPhone(1L);
            
			   					                company5.setAddress("1");
            
			   					                company5.setTagId("1");
            
			   					                company5.setMap("1");
            
			   					                company5.setIntroduce("我们不做大米");
            
			   					                company5.setFinancing(1);
            
			   					                company5.setCity("1");
            
			   					                company5.setCounty("1");
            
			   					                company5.setApproved(0);
            
			   					                company5.setJobs(1);
            
			   					                company5.setIndustry(1);
            
			   					                company5.setFreezed(0);
            
			   					                company5.setReleasedAt(1L);
            
			   					 
			   					                company5.setCreateBy(1L);
            
			   					 
			   					                company5.setUpdateBy(1L);
            
			   	    list.add(company5);	   
	  	  Company company6  = new Company();
	   					 
			   					                company6.setName("百度");
            
			   					                company6.setLogo("1");
            
			   					                company6.setSign("我们不做外卖");
            
			   					                company6.setNumber(300);
            
			   					                company6.setEmail("515376335@qq.com");
            
			   					                company6.setPhone(1L);
            
			   					                company6.setAddress("1");
            
			   					                company6.setTagId("1");
            
			   					                company6.setMap("1");
            
			   					                company6.setIntroduce("我们不做外卖");
            
			   					                company6.setFinancing(1);
            
			   					                company6.setCity("1");
            
			   					                company6.setCounty("1");
            
			   					                company6.setApproved(0);
            
			   					                company6.setJobs(1);
            
			   					                company6.setIndustry(1);
            
			   					                company6.setFreezed(0);
            
			   					                company6.setReleasedAt(1L);
            
			   					 
			   					                company6.setCreateBy(1L);
            
			   					 
			   					                company6.setUpdateBy(1L);
            
			   	   list.add(company6);
	   List<Company> insertResults= this.companyService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Company o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Company> getResults= this.companyService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Company o :insertResults){
			this.companyService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

