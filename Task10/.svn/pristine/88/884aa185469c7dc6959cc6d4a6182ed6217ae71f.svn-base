package com.ptteng.carrots.zangai.service.impl;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.carrots.zangai.service.CompanyLabelService;
import com.ptteng.common.dao.BaseDaoServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;


public class CompanyLabelServiceImpl extends BaseDaoServiceImpl implements CompanyLabelService {

 

	private static final Log log = LogFactory.getLog(CompanyLabelServiceImpl.class);



		   
		@Override
		public Long insert(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + companyLabel);

		if (companyLabel == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		companyLabel.setCreateAt(currentTimeMillis);
		companyLabel.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(companyLabel);
		} catch (DaoException e) {
			log.error(" insert wrong : " + companyLabel);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<CompanyLabel> insertList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (companyLabelList == null ? "null" : companyLabelList.size()));
      
		List<CompanyLabel> resultList = null;

		if (CollectionUtils.isEmpty(companyLabelList)) {
			return new ArrayList<CompanyLabel>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (CompanyLabel companyLabel : companyLabelList) {
			companyLabel.setCreateAt(currentTimeMillis);
			companyLabel.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<CompanyLabel>) dao.batchSave(companyLabelList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + companyLabelList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert lists  success : " + (resultList == null ? "null" : resultList.size()));
    
		return resultList;
		
		
			
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
	
		            
	    log.info(" delete data : " + id);
 
		boolean result = false;

		if (id == null) {
			return true;
		}

		try {
			result = dao.delete(CompanyLabel.class, id);
		} catch (DaoException e) {
			log.error(" delete wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
 
		log.info(" delete data success : " + id);
   
		return result;
		
		}	
		  
    	   
		@Override
		public boolean update(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (companyLabel == null ? "null" : companyLabel.getId()));

		boolean result = false;

		if (companyLabel == null) {
			return true;
		}

		companyLabel.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(companyLabel);
		} catch (DaoException e) {
			log.error(" update wrong : " + companyLabel);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + companyLabel);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (companyLabelList == null ? "null" : companyLabelList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(companyLabelList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (CompanyLabel companyLabel : companyLabelList) {
			companyLabel.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(companyLabelList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + companyLabelList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + companyLabelList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public CompanyLabel getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		CompanyLabel companyLabel = null;

		if (id == null) {
			return companyLabel;
		}

		try {
			companyLabel = (CompanyLabel) dao.get(CompanyLabel.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return companyLabel;		
		}	
		  
    	   
		@Override
		public List<CompanyLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<CompanyLabel> companyLabel = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<CompanyLabel>();
		}

		try {
			companyLabel = (List<CompanyLabel>) dao.getList(CompanyLabel.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (companyLabel == null ? "null" : companyLabel.size()));
    
		return companyLabel;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getCompanyLabelIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		
		log.info(" get ids   by start,limit  ================== " + start + " , " + limit);
		List<Long> idList = null;
		
		
		
		if (start == null) {
			start = 0;
		}

		if (limit == null) {
			limit = Integer.MAX_VALUE;
		}
		
		try {
			idList = dao.getIdList("getCompanyLabelIdsAll",new Object[] {},start, limit, false);
		} catch (DaoException e) {
			log.error(" get ids  wrong by start,limit)  : " + start + " , " + limit);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" get ids success == : " + (idList == null ? "null" : idList.size()));
		}
		return idList;
	}
	
	
		@Override
	public Integer countCompanyLabelIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getCompanyLabelIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getCompanyLabelIds " ) ;
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" count  : " + count);
		}
		return count;
	}

}

