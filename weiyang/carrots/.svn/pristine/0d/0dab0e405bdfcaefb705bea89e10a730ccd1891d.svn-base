package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Appraisal;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface AppraisalService extends BaseDaoService {

	



   		   
		
		public Long insert(Appraisal appraisal)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Appraisal> insertList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Appraisal appraisal)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Appraisal getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Appraisal> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getAppraisalIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countAppraisalIds() throws ServiceException, ServiceDaoException;
	

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getAppraisalIdsByTalentId(Long talentId, Integer start, Integer limit) throws ServiceException, ServiceDaoException;
}

