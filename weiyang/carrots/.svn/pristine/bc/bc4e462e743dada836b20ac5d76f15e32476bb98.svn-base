package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Candidate;
import com.ptteng.carrots.home.service.CandidateService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class CandidateServiceImpl extends BaseDaoServiceImpl implements CandidateService {

 

	private static final Log log = LogFactory.getLog(CandidateServiceImpl.class);



		   
		@Override
		public Long insert(Candidate candidate)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + candidate);

		if (candidate == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		candidate.setCreateAt(currentTimeMillis);
		candidate.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(candidate);
		} catch (DaoException e) {
			log.error(" insert wrong : " + candidate);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Candidate> insertList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (candidateList == null ? "null" : candidateList.size()));
      
		List<Candidate> resultList = null;

		if (CollectionUtils.isEmpty(candidateList)) {
			return new ArrayList<Candidate>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Candidate candidate : candidateList) {
			candidate.setCreateAt(currentTimeMillis);
			candidate.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Candidate>) dao.batchSave(candidateList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + candidateList);
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
			result = dao.delete(Candidate.class, id);
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
		public boolean update(Candidate candidate)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (candidate == null ? "null" : candidate.getId()));

		boolean result = false;

		if (candidate == null) {
			return true;
		}

		candidate.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(candidate);
		} catch (DaoException e) {
			log.error(" update wrong : " + candidate);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + candidate);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (candidateList == null ? "null" : candidateList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(candidateList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Candidate candidate : candidateList) {
			candidate.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(candidateList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + candidateList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + candidateList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Candidate getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Candidate candidate = null;

		if (id == null) {
			return candidate;
		}

		try {
			candidate = (Candidate) dao.get(Candidate.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return candidate;		
		}	
		  
    	   
		@Override
		public List<Candidate> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Candidate> candidate = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Candidate>();
		}

		try {
			candidate = (List<Candidate>) dao.getList(Candidate.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (candidate == null ? "null" : candidate.size()));
    
		return candidate;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getCandidateIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getCandidateIdsAll",new Object[] {},start, limit, false);
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
	public Integer countCandidateIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getCandidateIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getCandidateIds " ) ;
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
		public List<Long> getCandidateIdsByPhone(String phone, Integer start, Integer limit)
				throws ServiceException, ServiceDaoException {
			log.info(" get candidate ids by phone, start, limit ===============" + phone + ", " + start + ", " + limit);
			List<Long> idList = null;
			
			if (start == null) {
				start = 0;
			}
			
			if (limit == null) {
				limit = Integer.MAX_VALUE;
			}
			
			try {
				idList = dao.getIdList("getCandidateIdsByPhone", new Object[] {phone}, start, limit, false);
			} catch (DaoException e) {
				log.error(" get ids wrong by phone, start, limit): " + phone + ", " + start + ", " + limit);
				log.error(e);
				e.printStackTrace();
				throw new ServiceDaoException(e);
			}
			
			if (log.isInfoEnabled()) {
				log.info(" get ids success == " + (idList == null ? "null" : idList.size()));
			}
			return idList;
		}

}

