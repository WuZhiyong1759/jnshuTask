package com.ptteng.carrots.zangai.service;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.ProfessionLabel;
import com.ptteng.common.dao.BaseDaoService;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

@Remotable
public interface ProfessionLabelService extends BaseDaoService {

	



   		   
		
		public Long insert(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<ProfessionLabel> insertList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public ProfessionLabel getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<ProfessionLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getProfessionLabelIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countProfessionLabelIds() throws ServiceException, ServiceDaoException;
	

}

