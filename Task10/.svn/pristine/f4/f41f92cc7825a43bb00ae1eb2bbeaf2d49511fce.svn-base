package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.carrots.zangai.service.CompanyLabelService;
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
public class CompanyLabelServiceTest {

	private static final Log log = LogFactory.getLog(CompanyLabelServiceTest.class);
	
	private CompanyLabelService companyLabelService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
	        companyLabelService = (CompanyLabelService) context.getBean("companyLabelService");
			//local server
			/**
			companyLabelService = (CompanyLabelService)  Naming.lookup("//localhost:9012/CompanyLabelRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 companyLabelService = (CompanyLabelService) context.getBean("companyLabelService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  CompanyLabel companyLabel  = new CompanyLabel();
	   					 
			   					                companyLabel.setCId(1L);
            
			   					                companyLabel.setContent("1");
            
			   					                companyLabel.setCreateBy(1L);
            
			   					                companyLabel.setUpdateBy(1L);
            
			   					 
			   					 
			   	 
	 
	  Long id= this.companyLabelService.insert(companyLabel);

      companyLabel = this.companyLabelService.getObjectById(id);

	  CompanyLabel companyLabel2=this.companyLabelService.getObjectById(id);
	    Assert.assertNotNull(companyLabel2);
	  
		// 2. 更改 
				 		 				 				   companyLabel.setCId(2L);
		    		 				 				   companyLabel.setContent("1");
		    		 				 				   companyLabel.setCreateBy(1L);
		    		 				 				   companyLabel.setUpdateBy(1L);
		    		 				 		 				 		 				boolean success=this.companyLabelService.update(companyLabel);		
		Assert.assertEquals(true, success);
		 CompanyLabel companyLabel3=this.companyLabelService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.companyLabelService.delete(id);	
		Assert.assertEquals(true, success);
		CompanyLabel companyLabel4=this.companyLabelService.getObjectById(id);
		Assert.assertNull(companyLabel4);
		
		//4.batchInsert
		 List<CompanyLabel> list=new ArrayList<CompanyLabel>();
	  	  CompanyLabel companyLabel5  = new CompanyLabel();
	   					 
			   					                companyLabel5.setCId(1L);
            
			   					                companyLabel5.setContent("1");
            
			   					                companyLabel5.setCreateBy(1L);
            
			   					                companyLabel5.setUpdateBy(1L);
            
			   					 
			   					 
			   	    list.add(companyLabel5);	   
	  	  CompanyLabel companyLabel6  = new CompanyLabel();
	   					 
			   					                companyLabel6.setCId(2L);
            
			   					                companyLabel6.setContent("1");
            
			   					                companyLabel6.setCreateBy(1L);
            
			   					                companyLabel6.setUpdateBy(1L);
            
			   					 
			   					 
			   	   list.add(companyLabel6);
	   List<CompanyLabel> insertResults= this.companyLabelService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(CompanyLabel o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<CompanyLabel> getResults= this.companyLabelService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(CompanyLabel o :insertResults){
			this.companyLabelService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

