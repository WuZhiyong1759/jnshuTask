package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.TalentSkillRelationService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class TalentSkillRelationServiceImpl extends BaseDaoServiceImpl implements TalentSkillRelationService {

 

	private static final Log log = LogFactory.getLog(TalentSkillRelationServiceImpl.class);



		   
		@Override
		public Long insert(TalentSkillRelation talentSkillRelation)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + talentSkillRelation);

		if (talentSkillRelation == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		talentSkillRelation.setCreateAt(currentTimeMillis);
		talentSkillRelation.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(talentSkillRelation);
		} catch (DaoException e) {
			log.error(" insert wrong : " + talentSkillRelation);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<TalentSkillRelation> insertList(List<TalentSkillRelation> talentSkillRelationList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (talentSkillRelationList == null ? "null" : talentSkillRelationList.size()));
      
		List<TalentSkillRelation> resultList = null;

		if (CollectionUtils.isEmpty(talentSkillRelationList)) {
			return new ArrayList<TalentSkillRelation>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TalentSkillRelation talentSkillRelation : talentSkillRelationList) {
			talentSkillRelation.setCreateAt(currentTimeMillis);
			talentSkillRelation.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<TalentSkillRelation>) dao.batchSave(talentSkillRelationList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + talentSkillRelationList);
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
			result = dao.delete(TalentSkillRelation.class, id);
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
		public boolean update(TalentSkillRelation talentSkillRelation)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (talentSkillRelation == null ? "null" : talentSkillRelation.getId()));

		boolean result = false;

		if (talentSkillRelation == null) {
			return true;
		}

		talentSkillRelation.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(talentSkillRelation);
		} catch (DaoException e) {
			log.error(" update wrong : " + talentSkillRelation);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + talentSkillRelation);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<TalentSkillRelation> talentSkillRelationList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (talentSkillRelationList == null ? "null" : talentSkillRelationList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(talentSkillRelationList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (TalentSkillRelation talentSkillRelation : talentSkillRelationList) {
			talentSkillRelation.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(talentSkillRelationList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + talentSkillRelationList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + talentSkillRelationList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public TalentSkillRelation getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		TalentSkillRelation talentSkillRelation = null;

		if (id == null) {
			return talentSkillRelation;
		}

		try {
			talentSkillRelation = (TalentSkillRelation) dao.get(TalentSkillRelation.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return talentSkillRelation;		
		}	
		  
    	   
		@Override
		public List<TalentSkillRelation> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<TalentSkillRelation> talentSkillRelation = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<TalentSkillRelation>();
		}

		try {
			talentSkillRelation = (List<TalentSkillRelation>) dao.getList(TalentSkillRelation.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (talentSkillRelation == null ? "null" : talentSkillRelation.size()));
    
		return talentSkillRelation;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getTalentSkillRelationIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getTalentSkillRelationIdsAll",new Object[] {},start, limit, false);
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
	public Integer countTalentSkillRelationIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getTalentSkillRelationIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getTalentSkillRelationIds " ) ;
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

