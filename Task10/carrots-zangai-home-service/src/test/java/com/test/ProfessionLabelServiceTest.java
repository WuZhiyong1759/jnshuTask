package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.ProfessionLabel;
import com.ptteng.carrots.zangai.service.ProfessionLabelService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Ignore
public class ProfessionLabelServiceTest {

	private static final Log log = LogFactory.getLog(ProfessionLabelServiceTest.class);
	
	private ProfessionLabelService professionLabelService;
	
	
	//@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
	        professionLabelService = (ProfessionLabelService) context.getBean("professionLabelService");
			//local server
			/**
			professionLabelService = (ProfessionLabelService)  Naming.lookup("//localhost:9012/ProfessionLabelRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 professionLabelService = (ProfessionLabelService) context.getBean("professionLabelService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	//@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  ProfessionLabel professionLabel  = new ProfessionLabel();
	   					 
			   					                professionLabel.setPId(1L);
            
			   					                professionLabel.setContent("1");
            
			   					                professionLabel.setCreateBy(1L);
            
			   					                professionLabel.setUpdateBy(1L);
            
			   					 
			   					 
			   	 
	 
	  Long id= this.professionLabelService.insert(professionLabel);

      professionLabel = this.professionLabelService.getObjectById(id);

	  ProfessionLabel professionLabel2=this.professionLabelService.getObjectById(id);
	    Assert.assertNotNull(professionLabel2);
	  
		// 2. 更改 
				 		 				 				   professionLabel.setPId(2L);
		    		 				 				   professionLabel.setContent("1");
		    		 				 				   professionLabel.setCreateBy(1L);
		    		 				 				   professionLabel.setUpdateBy(1L);
		    		 				 		 				 		 				boolean success=this.professionLabelService.update(professionLabel);		
		Assert.assertEquals(true, success);
		 ProfessionLabel professionLabel3=this.professionLabelService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.professionLabelService.delete(id);	
		Assert.assertEquals(true, success);
		ProfessionLabel professionLabel4=this.professionLabelService.getObjectById(id);
		Assert.assertNull(professionLabel4);
		
		//4.batchInsert
		 List<ProfessionLabel> list=new ArrayList<ProfessionLabel>();
	  	  ProfessionLabel professionLabel5  = new ProfessionLabel();
	   					 
			   					                professionLabel5.setPId(1L);
            
			   					                professionLabel5.setContent("1");
            
			   					                professionLabel5.setCreateBy(1L);
            
			   					                professionLabel5.setUpdateBy(1L);
            
			   					 
			   					 
			   	    list.add(professionLabel5);	   
	  	  ProfessionLabel professionLabel6  = new ProfessionLabel();
	   					 
			   					                professionLabel6.setPId(2L);
            
			   					                professionLabel6.setContent("1");
            
			   					                professionLabel6.setCreateBy(1L);
            
			   					                professionLabel6.setUpdateBy(1L);
            
			   					 
			   					 
			   	   list.add(professionLabel6);
	   List<ProfessionLabel> insertResults= this.professionLabelService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(ProfessionLabel o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<ProfessionLabel> getResults= this.professionLabelService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(ProfessionLabel o :insertResults){
			this.professionLabelService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

