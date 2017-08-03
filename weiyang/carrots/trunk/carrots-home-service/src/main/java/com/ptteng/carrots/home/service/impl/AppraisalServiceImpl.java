package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.service.AppraisalService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class AppraisalServiceImpl extends BaseDaoServiceImpl implements AppraisalService {

 

	private static final Log log = LogFactory.getLog(AppraisalServiceImpl.class);



		   
		@Override
		public Long insert(Appraisal appraisal)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + appraisal);

		if (appraisal == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		appraisal.setCreateAt(currentTimeMillis);
		appraisal.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(appraisal);
		} catch (DaoException e) {
			log.error(" insert wrong : " + appraisal);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Appraisal> insertList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (appraisalList == null ? "null" : appraisalList.size()));
      
		List<Appraisal> resultList = null;

		if (CollectionUtils.isEmpty(appraisalList)) {
			return new ArrayList<Appraisal>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Appraisal appraisal : appraisalList) {
			appraisal.setCreateAt(currentTimeMillis);
			appraisal.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Appraisal>) dao.batchSave(appraisalList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + appraisalList);
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
			result = dao.delete(Appraisal.class, id);
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
		public boolean update(Appraisal appraisal)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (appraisal == null ? "null" : appraisal.getId()));

		boolean result = false;

		if (appraisal == null) {
			return true;
		}

		appraisal.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(appraisal);
		} catch (DaoException e) {
			log.error(" update wrong : " + appraisal);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + appraisal);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (appraisalList == null ? "null" : appraisalList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(appraisalList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Appraisal appraisal : appraisalList) {
			appraisal.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(appraisalList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + appraisalList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + appraisalList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Appraisal getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Appraisal appraisal = null;

		if (id == null) {
			return appraisal;
		}

		try {
			appraisal = (Appraisal) dao.get(Appraisal.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return appraisal;		
		}	
		  
    	   
		@Override
		public List<Appraisal> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Appraisal> appraisal = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Appraisal>();
		}

		try {
			appraisal = (List<Appraisal>) dao.getList(Appraisal.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (appraisal == null ? "null" : appraisal.size()));
    
		return appraisal;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getAppraisalIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getAppraisalIdsAll",new Object[] {},start, limit, false);
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
	public Integer countAppraisalIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getAppraisalIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getAppraisalIds " ) ;
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
		public List<Long> getAppraisalIdsByTalentId(Long talentId, Integer start, Integer limit)
				throws ServiceException, ServiceDaoException {
			// TODO Auto-generated method stub
			if (log.isInfoEnabled()) {
				log.info("get ids by talentId, start, limit : " + talentId + ", " + start + ", " + limit);
			}
			
			List<Long> idList = null;
			
			if (start == null) {
				start = 0;
			}
			if (limit == null) {
				limit = Integer.MAX_VALUE;
			}
			try {
				idList = dao.getIdList("getAppraisalIdsByTalentId", new Object[] {talentId}, start, limit, false);
			} catch (DaoException e) {
				// TODO: handle exception
				log.error("get ids wrong by talentId, start, limit):" + talentId + ", " + start + ", " + limit);
				log.error(e);
				e.printStackTrace();
				throw new ServiceDaoException(e);
			}
			if (log.isInfoEnabled()) {
				log.info("get ids success : " + (idList == null ? "null" : idList.size()));
			}
			return idList;
		}

}

