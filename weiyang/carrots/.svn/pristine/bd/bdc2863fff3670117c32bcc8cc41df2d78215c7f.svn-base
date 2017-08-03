package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Talent;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface TalentService extends BaseDaoService {

	



   		   
		
		public Long insert(Talent talent)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Talent> insertList(List<Talent> talentList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Talent talent)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Talent> talentList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Talent getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Talent> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getTalentIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countTalentIds() throws ServiceException, ServiceDaoException;
	
	/**
	 * 
	 * @param phone
	 * @param start
	 * @param limit
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getTalentIdsByPhone(String phone, Integer start, Integer limit) throws ServiceException, ServiceDaoException;
	
	/**
	 * 
	 * @param talentLevel
	 * @param isShelve
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countTalentIdsByTalentLevelAndIsShelve(String talentLevel, String isShelve) throws ServiceException, ServiceDaoException;
	
}

