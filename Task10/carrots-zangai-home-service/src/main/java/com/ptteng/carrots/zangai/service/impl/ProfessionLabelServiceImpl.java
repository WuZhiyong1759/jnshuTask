package com.ptteng.carrots.zangai.service.impl;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.carrots.zangai.model.ProfessionLabel;
import com.ptteng.carrots.zangai.service.ProfessionLabelService;
import com.ptteng.common.dao.BaseDaoServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;


public class ProfessionLabelServiceImpl extends BaseDaoServiceImpl implements ProfessionLabelService {

 

	private static final Log log = LogFactory.getLog(ProfessionLabelServiceImpl.class);



		   
		@Override
		public Long insert(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + professionLabel);

		if (professionLabel == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		professionLabel.setCreateAt(currentTimeMillis);
		professionLabel.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(professionLabel);
		} catch (DaoException e) {
			log.error(" insert wrong : " + professionLabel);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<ProfessionLabel> insertList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (professionLabelList == null ? "null" : professionLabelList.size()));
      
		List<ProfessionLabel> resultList = null;

		if (CollectionUtils.isEmpty(professionLabelList)) {
			return new ArrayList<ProfessionLabel>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (ProfessionLabel professionLabel : professionLabelList) {
			professionLabel.setCreateAt(currentTimeMillis);
			professionLabel.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<ProfessionLabel>) dao.batchSave(professionLabelList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + professionLabelList);
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
			result = dao.delete(ProfessionLabel.class, id);
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
		public boolean update(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (professionLabel == null ? "null" : professionLabel.getId()));

		boolean result = false;

		if (professionLabel == null) {
			return true;
		}

		professionLabel.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(professionLabel);
		} catch (DaoException e) {
			log.error(" update wrong : " + professionLabel);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + professionLabel);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (professionLabelList == null ? "null" : professionLabelList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(professionLabelList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (ProfessionLabel professionLabel : professionLabelList) {
			professionLabel.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(professionLabelList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + professionLabelList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + professionLabelList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public ProfessionLabel getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		ProfessionLabel professionLabel = null;

		if (id == null) {
			return professionLabel;
		}

		try {
			professionLabel = (ProfessionLabel) dao.get(ProfessionLabel.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return professionLabel;		
		}	
		  
    	   
		@Override
		public List<ProfessionLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<ProfessionLabel> professionLabel = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<ProfessionLabel>();
		}

		try {
			professionLabel = (List<ProfessionLabel>) dao.getList(ProfessionLabel.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (professionLabel == null ? "null" : professionLabel.size()));
    
		return professionLabel;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getProfessionLabelIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getProfessionLabelIdsAll",new Object[] {},start, limit, false);
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
	public Integer countProfessionLabelIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getProfessionLabelIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getProfessionLabelIds " ) ;
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

