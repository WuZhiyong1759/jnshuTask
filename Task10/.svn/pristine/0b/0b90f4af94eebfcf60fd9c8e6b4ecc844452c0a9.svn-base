package com.test;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Article;
import com.ptteng.carrots.zangai.service.ArticleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

@Ignore
public class ArticleServiceTest {

	private static final Log log = LogFactory.getLog(ArticleServiceTest.class);
	
	private ArticleService articleService;
	
	
	@Before
	    public void setUp() throws Exception{
		
		
		    //dao
//	        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-server.xml");
//	        articleService = (ArticleService) context.getBean("articleService");
			//local server

//			articleService = (ArticleService)  Naming.lookup("//localhost:9012/ArticleRMIService");
//
			
			/** test client**/
			ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/carrots-zangai-home-service/applicationContext-client.xml");
	    	 articleService = (ArticleService) context.getBean("articleService");

//		articleService = (ArticleService)  Naming.lookup("//localhost:9012/ArticleRMIService");
			
			
			
	    }
	
	
		
		
		
	

		
	@Test
	public void testCRUD() throws ServiceException, ServiceDaoException{
	
	 // 1.增加
	 
	  	  Article article  = new Article();
	   					 
			   					                article.setTitle("1");
            
			   					                article.setUrl("1");
            
			   					                article.setImage("1");
            
			   					                article.setType(1);
            
			   					                article.setStatu(1);
            
			   					                article.setIndustry(1);
            
			   					                article.setIndexId("1");
            
			   					                article.setCreateBy(1L);
            
			   					                article.setUpdateBy(1L);
            
			   					 
			   					 
			   	 
	 
	  Long id= this.articleService.insert(article);

      article = this.articleService.getObjectById(id);

	  Article article2=this.articleService.getObjectById(id);
	    Assert.assertNotNull(article2);
	  
		// 2. 更改 
				 		 				 				   article.setTitle("1");
		    		 				 				   article.setUrl("1");
		    		 				 				   article.setImage("1");
		    		 				 				   article.setType(1);
		    		 				 				   article.setStatu(1);
		    		 				 				   article.setIndustry(1);
		    		 				 				   article.setIndexId("1");
		    		 				 				   article.setCreateBy(1L);
		    		 				 				   article.setUpdateBy(1L);
		    		 				 		 				 		 				boolean success=this.articleService.update(article);		
		Assert.assertEquals(true, success);
		 Article article3=this.articleService.getObjectById(id);
				 		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				             		 				 		 				 		 				//3.删除
		boolean successDelete=this.articleService.delete(id);	
		Assert.assertEquals(true, success);
		Article article4=this.articleService.getObjectById(id);
		Assert.assertNull(article4);
		
		//4.batchInsert
		 List<Article> list=new ArrayList<Article>();
	  	  Article article5  = new Article();
	   					 
			   					                article5.setTitle("1");
            
			   					                article5.setUrl("1");
            
			   					                article5.setImage("1");
            
			   					                article5.setType(1);
            
			   					                article5.setStatu(1);
            
			   					                article5.setIndustry(1);
            
			   					                article5.setIndexId("1");
            
			   					                article5.setCreateBy(1L);
            
			   					                article5.setUpdateBy(1L);
            
			   					 
			   					 
			   	    list.add(article5);	   
	  	  Article article6  = new Article();
	   					 
			   					                article6.setTitle("1");
            
			   					                article6.setUrl("1");
            
			   					                article6.setImage("1");
            
			   					                article6.setType(1);
            
			   					                article6.setStatu(1);
            
			   					                article6.setIndustry(1);
            
			   					                article6.setIndexId("1");
            
			   					                article6.setCreateBy(1L);
            
			   					                article6.setUpdateBy(1L);
            
			   					 
			   					 
			   	   list.add(article6);
	   List<Article> insertResults= this.articleService.insertList(list);
	   Assert.assertEquals(2,insertResults.size());	
	   //5.batchGet
	   List<Long> ids=new ArrayList<Long>();
		for(Article o: insertResults){
		   ids.add(o.getId());
		}
				
	    List<Article> getResults= this.articleService.getObjectsByIds(ids);
		Assert.assertEquals(2,getResults.size());
		
		
		 for(Article o :insertResults){
			this.articleService.delete(o.getId());
}
			
		//6.batchUpdate
	   
		}
	
	
	
		
		@Test
	public void  testNULL()throws ServiceException, ServiceDaoException{
		
		
		
		};
}

