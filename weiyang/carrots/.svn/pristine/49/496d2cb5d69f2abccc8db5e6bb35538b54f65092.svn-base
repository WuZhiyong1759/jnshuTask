package com.ptteng.carrots.home.service;

import java.util.List;
import java.util.Map;

import org.osoa.sca.annotations.Remotable;

import com.ptteng.carrots.home.model.Candidate;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.common.dao.BaseDaoService;

@Remotable
public interface CandidateService extends BaseDaoService {

	



   		   
		
		public Long insert(Candidate candidate)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Candidate> insertList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Candidate candidate)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Candidate getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Candidate> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getCandidateIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countCandidateIds() throws ServiceException, ServiceDaoException;
	
	
	/**
	 * 
	 * @param phone
	 * @param start
	 * @param limit
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getCandidateIdsByPhone(String phone, Integer start, Integer limit) throws ServiceException, ServiceDaoException;
	

}

