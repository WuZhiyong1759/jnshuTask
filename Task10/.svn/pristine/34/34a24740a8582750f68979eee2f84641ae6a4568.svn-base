package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Profession;
import com.ptteng.carrots.zangai.service.ProfessionService;
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
public class ProfessionServiceTest {

	private static final Log log = LogFactory.getLog(ProfessionServiceTest.class);
	
	private ProfessionService professionService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
	        professionService = (ProfessionService) context.getBean("professionService");
			//local server
			/**
			professionService = (ProfessionService)  Naming.lookup("//localhost:9012/ProfessionRMIService");
			**/
			
			/** test client
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-sca.xml");
	    	 professionService = (ProfessionService) context.getBean("professionService");
			
			**/
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Profession profession  = new Profession();
	   					 
			   					                profession.setCId(1L);
            
			   					                profession.setName("java工程师");
            
			   					                profession.setWorkexp(1);
            
			   					                profession.setCatgory(1);
            
			   					                profession.setEducation(1);
            
			   					                profession.setSalary(1);
            
			   					                profession.setStatus(1);
            
			   					                profession.setDuty("sss");
            
			   					                profession.setSkill("sss");
            
			   					                profession.setWelfare("sss");
            
			   					                profession.setCity("1");
            
			   					                profession.setCounty("1");
            
			   					                profession.setIndustry(1);
            
			   					                profession.setTagId("1");
            
			   					                profession.setRecommend(1);
            
			   					                profession.setReleasedAt(1L);
            
			   					                profession.setCreateBy(1L);
            
			   					                profession.setUpdateBy(1L);
            
			   					 
			   					 
			   	 
	 
	  Long id= this.professionService.insert(profession);

      profession = this.professionService.getObjectById(id);

	  Profession profession2=this.professionService.getObjectById(id);
	    Assert.assertNotNull(profession2);
	  
		// 2. 更改 
				 		 				 				   profession.setCId(2L);
		    		 				 				   profession.setName("java架构师");
		    		 				 				   profession.setWorkexp(1);
		    		 				 				   profession.setCatgory(1);
		    		 				 				   profession.setEducation(1);
		    		 				 				   profession.setSalary(1);
		    		 				 				   profession.setStatus(1);
		    		 				 				   profession.setDuty("sss");
		    		 				 				   profession.setSkill("sss");
		    		 				 				   profession.setWelfare("sss");
		    		 				 				   profession.setCity("1");
		    		 				 				   profession.setCounty("1");
		    		 				 				   profession.setIndustry(1);
		    		 				 				   profession.setTagId("1");
		    		 				 				   profession.setRecommend(1);
		    		 				 				   profession.setReleasedAt(1L);
		    		 				 				   profession.setCreateBy(1L);
		    		 				 				   profession.setUpdateBy(1L);
		    		 				 		 				 		 				boolean success=this.professionService.update(profession);		
		Assert.assertEquals(true, success);
		 Profession profession3=this.professionService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.professionService.delete(id);	
		Assert.assertEquals(true, success);
		Profession profession4=this.professionService.getObjectById(id);
		Assert.assertNull(profession4);
		
		//4.batchInsert
		 List<Profession> list=new ArrayList<Profession>();
	  	  Profession profession5  = new Profession();
	   					 
			   					                profession5.setCId(1L);
            
			   					                profession5.setName("java工程师");
            
			   					                profession5.setWorkexp(1);
            
			   					                profession5.setCatgory(1);
            
			   					                profession5.setEducation(1);
            
			   					                profession5.setSalary(1);
            
			   					                profession5.setStatus(1);
            
			   					                profession5.setDuty("sss");
            
			   					                profession5.setSkill("sss");
            
			   					                profession5.setWelfare("sss");
            
			   					                profession5.setCity("1");
            
			   					                profession5.setCounty("1");
            
			   					                profession5.setIndustry(1);
            
			   					                profession5.setTagId("1");
            
			   					                profession5.setRecommend(1);
            
			   					                profession5.setReleasedAt(1L);
            
			   					                profession5.setCreateBy(1L);
            
			   					                profession5.setUpdateBy(1L);
            
			   					 
			   					 
			   	    list.add(profession5);	   
	  	  Profession profession6  = new Profession();
	   					 
			   					                profession6.setCId(2L);
            
			   					                profession6.setName("java架构师");
            
			   					                profession6.setWorkexp(1);
            
			   					                profession6.setCatgory(1);
            
			   					                profession6.setEducation(1);
            
			   					                profession6.setSalary(1);
            
			   					                profession6.setStatus(1);
            
			   					                profession6.setDuty("sss");
            
			   					                profession6.setSkill("sss");
            
			   					                profession6.setWelfare("sss");
            
			   					                profession6.setCity("1");
            
			   					                profession6.setCounty("1");
            
			   					                profession6.setIndustry(1);
            
			   					                profession6.setTagId("1");
            
			   					                profession6.setRecommend(1);
            
			   					                profession6.setReleasedAt(1L);
            
			   					                profession6.setCreateBy(1L);
            
			   					                profession6.setUpdateBy(1L);
            
			   					 
			   					 
			   	   list.add(profession6);
	   List<Profession> insertResults= this.professionService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Profession o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Profession> getResults= this.professionService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Profession o :insertResults){
			this.professionService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

