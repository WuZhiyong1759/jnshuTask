package com.ptteng.carrots.zangai.service;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.common.dao.BaseDaoService;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

@Remotable
public interface CompanyLabelService extends BaseDaoService {

	



   		   
		
		public Long insert(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<CompanyLabel> insertList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public CompanyLabel getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<CompanyLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getCompanyLabelIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countCompanyLabelIds() throws ServiceException, ServiceDaoException;
	

}

