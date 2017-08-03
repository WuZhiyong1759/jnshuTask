package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Recommend;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface RecommendService extends BaseDaoService {

	



   		   
		
		public Long insert(Recommend recommend)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Recommend> insertList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Recommend recommend)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Recommend getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Recommend> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getRecommendIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countRecommendIds() throws ServiceException, ServiceDaoException;
	

	/**
	 * 
	 * @param talentId
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getRecommendIdsByTalentId(Long talentId, Integer start, Integer limit) throws ServiceException, ServiceDaoException;
	
	
	/**
	 * 
	 * @param talentId
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countRecommendIdsByTalentId(Long talentId) throws ServiceException, ServiceDaoException;

}

