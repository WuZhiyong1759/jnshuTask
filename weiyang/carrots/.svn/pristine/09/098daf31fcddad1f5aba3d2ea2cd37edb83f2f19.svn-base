package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Recommend;
import com.ptteng.carrots.home.service.RecommendService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class RecommendServiceImpl extends BaseDaoServiceImpl implements RecommendService {

 

	private static final Log log = LogFactory.getLog(RecommendServiceImpl.class);



		   
		@Override
		public Long insert(Recommend recommend)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + recommend);

		if (recommend == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		recommend.setCreateAt(currentTimeMillis);
		recommend.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(recommend);
		} catch (DaoException e) {
			log.error(" insert wrong : " + recommend);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Recommend> insertList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (recommendList == null ? "null" : recommendList.size()));
      
		List<Recommend> resultList = null;

		if (CollectionUtils.isEmpty(recommendList)) {
			return new ArrayList<Recommend>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Recommend recommend : recommendList) {
			recommend.setCreateAt(currentTimeMillis);
			recommend.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Recommend>) dao.batchSave(recommendList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + recommendList);
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
			result = dao.delete(Recommend.class, id);
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
		public boolean update(Recommend recommend)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (recommend == null ? "null" : recommend.getId()));

		boolean result = false;

		if (recommend == null) {
			return true;
		}

		recommend.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(recommend);
		} catch (DaoException e) {
			log.error(" update wrong : " + recommend);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + recommend);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (recommendList == null ? "null" : recommendList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(recommendList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Recommend recommend : recommendList) {
			recommend.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(recommendList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + recommendList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + recommendList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Recommend getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Recommend recommend = null;

		if (id == null) {
			return recommend;
		}

		try {
			recommend = (Recommend) dao.get(Recommend.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return recommend;		
		}	
		  
    	   
		@Override
		public List<Recommend> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Recommend> recommend = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Recommend>();
		}

		try {
			recommend = (List<Recommend>) dao.getList(Recommend.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (recommend == null ? "null" : recommend.size()));
    
		return recommend;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getRecommendIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getRecommendIdsAll",new Object[] {},start, limit, false);
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
	public Integer countRecommendIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getRecommendIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getRecommendIds " ) ;
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" count  : " + count);
		}
		return count;
	}


		@Override
		public List<Long> getRecommendIdsByTalentId(Long talentId, Integer start, Integer limit) throws ServiceException, ServiceDaoException {
			log.info(" get recommend ids by talentId, start, limit ===============" + talentId + ", " + start + ", " + limit);
			List<Long> idList = null;
			
			if (start == null) {
				start = 0;
			}
			
			if (limit == null) {
				limit = Integer.MAX_VALUE;
			}
			
			try {
				idList = dao.getIdList("getRecommendIdsByTalentId", new Object[] {talentId}, start, limit, false);
			} catch (DaoException e) {
				log.error(" get ids wrong by talentId, start, limit): " + talentId + ", " + start + ", " + limit);
				log.error(e);
				e.printStackTrace();
				throw new ServiceDaoException(e);
			}
			
			if (log.isInfoEnabled()) {
				log.info(" get ids success == " + (idList == null ? "null" : idList.size()));
			}
			return idList;
		}


		@Override
		public Integer countRecommendIdsByTalentId(Long talentId) throws ServiceException, ServiceDaoException {
			if (log.isInfoEnabled()) {
				log.info(" count ids by talentId: " + talentId);
			}
			Integer count = null;
			try {
				count = dao.count("getRecommendIdsByTalentId", new Object[] {talentId});
				log.info(" recommend's total is " + count);
			} catch (DaoException e) {
				log.error(" count ids wrong by talentId) : " + talentId); 
				log.error(e);
				e.printStackTrace();
				throw new ServiceDaoException();
			}
			if (log.isInfoEnabled()) {
				log.info(" count success : " + count);
			}
			return count;
		}

}

