package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.TalentProfession;
import com.ptteng.carrots.home.service.TalentProfessionService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class TalentProfessionServiceImpl extends BaseDaoServiceImpl implements TalentProfessionService {

 

	private static final Log log = LogFactory.getLog(TalentProfessionServiceImpl.class);



		   
		@Override
		public Long insert(TalentProfession talentProfession)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + talentProfession);

		if (talentProfession == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		talentProfession.setCreateAt(currentTimeMillis);
		talentProfession.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(talentProfession);
		} catch (DaoException e) {
			log.error(" insert wrong : " + talentProfession);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<TalentProfession> insertList(List<TalentProfession> talentProfessionList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (talentProfessionList == null ? "null" : talentProfessionList.size()));
      
		List<TalentProfession> resultList = null;

		if (CollectionUtils.isEmpty(talentProfessionList)) {
			return new ArrayList<TalentProfession>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TalentProfession talentProfession : talentProfessionList) {
			talentProfession.setCreateAt(currentTimeMillis);
			talentProfession.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<TalentProfession>) dao.batchSave(talentProfessionList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + talentProfessionList);
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
			result = dao.delete(TalentProfession.class, id);
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
		public boolean update(TalentProfession talentProfession)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (talentProfession == null ? "null" : talentProfession.getId()));

		boolean result = false;

		if (talentProfession == null) {
			return true;
		}

		talentProfession.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(talentProfession);
		} catch (DaoException e) {
			log.error(" update wrong : " + talentProfession);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + talentProfession);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<TalentProfession> talentProfessionList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (talentProfessionList == null ? "null" : talentProfessionList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(talentProfessionList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TalentProfession talentProfession : talentProfessionList) {
			talentProfession.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(talentProfessionList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + talentProfessionList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + talentProfessionList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public TalentProfession getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		TalentProfession talentProfession = null;

		if (id == null) {
			return talentProfession;
		}

		try {
			talentProfession = (TalentProfession) dao.get(TalentProfession.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return talentProfession;		
		}	
		  
    	   
		@Override
		public List<TalentProfession> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<TalentProfession> talentProfession = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<TalentProfession>();
		}

		try {
			talentProfession = (List<TalentProfession>) dao.getList(TalentProfession.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (talentProfession == null ? "null" : talentProfession.size()));
    
		return talentProfession;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getTalentProfessionIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getTalentProfessionIdsAll",new Object[] {},start, limit, false);
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
	public Integer countTalentProfessionIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getTalentProfessionIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getTalentProfessionIds " ) ;
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

