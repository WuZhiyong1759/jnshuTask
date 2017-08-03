package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Occupation;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface OccupationService extends BaseDaoService {

	



   		   
		
		public Long insert(Occupation occupation)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Occupation> insertList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Occupation occupation)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Occupation getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Occupation> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getOccupationIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countOccupationIds() throws ServiceException, ServiceDaoException;
	

}

