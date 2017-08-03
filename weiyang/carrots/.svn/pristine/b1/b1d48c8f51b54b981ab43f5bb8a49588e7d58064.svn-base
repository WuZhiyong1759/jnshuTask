package com.ptteng.carrots.home.service.impl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Skill;
import com.ptteng.carrots.home.service.SkillService;



import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.Dao;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class SkillServiceImpl extends BaseDaoServiceImpl implements SkillService {

 

	private static final Log log = LogFactory.getLog(SkillServiceImpl.class);



		   
		@Override
		public Long insert(Skill skill)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + skill);

		if (skill == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		skill.setCreateAt(currentTimeMillis);
		skill.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(skill);
		} catch (DaoException e) {
			log.error(" insert wrong : " + skill);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Skill> insertList(List<Skill> skillList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (skillList == null ? "null" : skillList.size()));
      
		List<Skill> resultList = null;

		if (CollectionUtils.isEmpty(skillList)) {
			return new ArrayList<Skill>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Skill skill : skillList) {
			skill.setCreateAt(currentTimeMillis);
			skill.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Skill>) dao.batchSave(skillList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + skillList);
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
			result = dao.delete(Skill.class, id);
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
		public boolean update(Skill skill)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (skill == null ? "null" : skill.getId()));

		boolean result = false;

		if (skill == null) {
			return true;
		}

		skill.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(skill);
		} catch (DaoException e) {
			log.error(" update wrong : " + skill);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + skill);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Skill> skillList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (skillList == null ? "null" : skillList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(skillList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Skill skill : skillList) {
			skill.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(skillList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + skillList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + skillList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Skill getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Skill skill = null;

		if (id == null) {
			return skill;
		}

		try {
			skill = (Skill) dao.get(Skill.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return skill;		
		}	
		  
    	   
		@Override
		public List<Skill> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Skill> skill = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Skill>();
		}

		try {
			skill = (List<Skill>) dao.getList(Skill.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (skill == null ? "null" : skill.size()));
    
		return skill;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getSkillIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getSkillIdsAll",new Object[] {},start, limit, false);
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
	public Integer countSkillIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getSkillIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getSkillIds " ) ;
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

