package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Occupation;
import com.ptteng.carrots.home.service.OccupationService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class OccupationServiceImpl extends BaseDaoServiceImpl implements OccupationService {

 

	private static final Log log = LogFactory.getLog(OccupationServiceImpl.class);



		   
		@Override
		public Long insert(Occupation occupation)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + occupation);

		if (occupation == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		occupation.setCreateAt(currentTimeMillis);
		occupation.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(occupation);
		} catch (DaoException e) {
			log.error(" insert wrong : " + occupation);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Occupation> insertList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (occupationList == null ? "null" : occupationList.size()));
      
		List<Occupation> resultList = null;

		if (CollectionUtils.isEmpty(occupationList)) {
			return new ArrayList<Occupation>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Occupation occupation : occupationList) {
			occupation.setCreateAt(currentTimeMillis);
			occupation.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Occupation>) dao.batchSave(occupationList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + occupationList);
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
			result = dao.delete(Occupation.class, id);
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
		public boolean update(Occupation occupation)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (occupation == null ? "null" : occupation.getId()));

		boolean result = false;

		if (occupation == null) {
			return true;
		}

		occupation.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(occupation);
		} catch (DaoException e) {
			log.error(" update wrong : " + occupation);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + occupation);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (occupationList == null ? "null" : occupationList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(occupationList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Occupation occupation : occupationList) {
			occupation.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(occupationList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + occupationList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + occupationList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Occupation getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Occupation occupation = null;

		if (id == null) {
			return occupation;
		}

		try {
			occupation = (Occupation) dao.get(Occupation.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return occupation;		
		}	
		  
    	   
		@Override
		public List<Occupation> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Occupation> occupation = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Occupation>();
		}

		try {
			occupation = (List<Occupation>) dao.getList(Occupation.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (occupation == null ? "null" : occupation.size()));
    
		return occupation;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getOccupationIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getOccupationIdsAll",new Object[] {},start, limit, false);
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
	public Integer countOccupationIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getOccupationIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getOccupationIds " ) ;
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

