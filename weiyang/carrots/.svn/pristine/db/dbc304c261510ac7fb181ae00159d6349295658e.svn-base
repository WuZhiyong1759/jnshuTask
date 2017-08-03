package com.ptteng.carrots.home.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.service.TalentService;
import com.ptteng.common.dao.BaseDaoServiceImpl;


public class TalentServiceImpl extends BaseDaoServiceImpl implements TalentService {

 

	private static final Log log = LogFactory.getLog(TalentServiceImpl.class);



		   
		@Override
		public Long insert(Talent talent)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + talent);

		if (talent == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		talent.setCreateAt(currentTimeMillis);
		talent.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(talent);
		} catch (DaoException e) {
			log.error(" insert wrong : " + talent);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Talent> insertList(List<Talent> talentList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (talentList == null ? "null" : talentList.size()));
      
		List<Talent> resultList = null;

		if (CollectionUtils.isEmpty(talentList)) {
			return new ArrayList<Talent>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Talent talent : talentList) {
			talent.setCreateAt(currentTimeMillis);
			talent.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Talent>) dao.batchSave(talentList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + talentList);
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
			result = dao.delete(Talent.class, id);
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
		public boolean update(Talent talent)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (talent == null ? "null" : talent.getId()));

		boolean result = false;

		if (talent == null) {
			return true;
		}

		talent.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(talent);
		} catch (DaoException e) {
			log.error(" update wrong : " + talent);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + talent);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Talent> talentList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (talentList == null ? "null" : talentList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(talentList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Talent talent : talentList) {
			talent.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(talentList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + talentList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + talentList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Talent getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Talent talent = null;

		if (id == null) {
			return talent;
		}

		try {
			talent = (Talent) dao.get(Talent.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return talent;		
		}	
		  
    	   
		@Override
		public List<Talent> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Talent> talent = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Talent>();
		}

		try {
			talent = (List<Talent>) dao.getList(Talent.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (talent == null ? "null" : talent.size()));
    
		return talent;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getTalentIds(Integer start, Integer limit)
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
			idList = dao.getIdList("getTalentIdsAll",new Object[] {},start, limit, false);
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
	public Integer countTalentIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getTalentIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getTalentIds " ) ;
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
		public List<Long> getTalentIdsByPhone(String phone, Integer start, Integer limit)
				throws ServiceException, ServiceDaoException {
			log.info(" get talent ids by phone, start, limit ===============" + phone + ", " + start + ", " + limit);
			List<Long> idList = null;
			
			if (start == null) {
				start = 0;
			}
			
			if (limit == null) {
				limit = Integer.MAX_VALUE;
			}
			
			try {
				idList = dao.getIdList("getTalentIdsByPhone", new Object[] {phone}, start, limit, false);
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


		@Override
		public Integer countTalentIdsByTalentLevelAndIsShelve(String talentLevel, String isShelve)
				throws ServiceException, ServiceDaoException {
			if (log.isInfoEnabled()) {
				log.info(" count ids by talentLevel and isShelve : " + talentLevel + ", " + isShelve);
			}
			Integer count = null;
			try {
				count = dao.count("getTalentIdsByTalentLevelAndIsShelve", new Object[] {talentLevel, isShelve});
				log.info(" talent's total is " + count);
			} catch (DaoException e) {
				log.error(" count ids wrong by talentLevel and isShelve) : " + talentLevel + ", " + isShelve); 
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

