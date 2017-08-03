package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Producter;
import com.ptteng.carrots.zangai.service.ProducterService;
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
public class ProducterServiceTest {

	private static final Log log = LogFactory.getLog(ProducterServiceTest.class);
	
	private ProducterService producterService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
	        producterService = (ProducterService) context.getBean("producterService");
			//local server
			/**
			producterService = (ProducterService)  Naming.lookup("//localhost:9012/ProducterRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 producterService = (ProducterService) context.getBean("producterService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Producter producter  = new Producter();
	   					 
			   					                producter.setCId(1L);
            
			   					                producter.setName("志勇外卖");
            
			   					                producter.setSign("1");
            
			   					                producter.setLogo("1");
            
			   					                producter.setIntroduce("1");
            
			   					                producter.setCreateBy(1L);
            
			   					                producter.setUpdateBy(1L);
            
			   					 
			   					 
			   	 
	 
	  Long id= this.producterService.insert(producter);

      producter = this.producterService.getObjectById(id);

	  Producter producter2=this.producterService.getObjectById(id);
	    Assert.assertNotNull(producter2);
	  
		// 2. 更改 
				 		 				 				   producter.setCId(2L);
		    		 				 				   producter.setName("志勇外卖");
		    		 				 				   producter.setSign("1");
		    		 				 				   producter.setLogo("1");
		    		 				 				   producter.setIntroduce("1");
		    		 				 				   producter.setCreateBy(1L);
		    		 				 				   producter.setUpdateBy(1L);
		    		 				 		 				 		 				boolean success=this.producterService.update(producter);		
		Assert.assertEquals(true, success);
		 Producter producter3=this.producterService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.producterService.delete(id);	
		Assert.assertEquals(true, success);
		Producter producter4=this.producterService.getObjectById(id);
		Assert.assertNull(producter4);
		
		//4.batchInsert
		 List<Producter> list=new ArrayList<Producter>();
	  	  Producter producter5  = new Producter();
	   					 
			   					                producter5.setCId(1L);
            
			   					                producter5.setName("志勇外卖");
            
			   					                producter5.setSign("1");
            
			   					                producter5.setLogo("1");
            
			   					                producter5.setIntroduce("1");
            
			   					                producter5.setCreateBy(1L);
            
			   					                producter5.setUpdateBy(1L);
            
			   					 
			   					 
			   	    list.add(producter5);	   
	  	  Producter producter6  = new Producter();
	   					 
			   					                producter6.setCId(2L);
            
			   					                producter6.setName("志勇外卖");
            
			   					                producter6.setSign("1");
            
			   					                producter6.setLogo("1");
            
			   					                producter6.setIntroduce("1");
            
			   					                producter6.setCreateBy(1L);
            
			   					                producter6.setUpdateBy(1L);
            
			   					 
			   					 
			   	   list.add(producter6);
	   List<Producter> insertResults= this.producterService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Producter o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Producter> getResults= this.producterService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Producter o :insertResults){
			this.producterService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

