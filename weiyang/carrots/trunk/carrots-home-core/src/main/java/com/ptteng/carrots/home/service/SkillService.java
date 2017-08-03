package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Skill;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface SkillService extends BaseDaoService {

	



   		   
		
		public Long insert(Skill skill)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Skill> insertList(List<Skill> skillList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Skill skill)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Skill> skillList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Skill getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Skill> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getSkillIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countSkillIds() throws ServiceException, ServiceDaoException;
	

}

