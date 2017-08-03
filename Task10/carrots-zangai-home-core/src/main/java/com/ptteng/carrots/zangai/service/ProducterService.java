package com.ptteng.carrots.zangai.service;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Producter;
import com.ptteng.common.dao.BaseDaoService;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

@Remotable
public interface ProducterService extends BaseDaoService {

	



   		   
		
		public Long insert(Producter producter)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Producter> insertList(List<Producter> producterList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Producter producter)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Producter> producterList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Producter getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Producter> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getProducterIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countProducterIds() throws ServiceException, ServiceDaoException;


    public List<Long> getProducterIdsByCId(Long cId, Integer start, Integer count) throws  ServiceDaoException,ServiceException;
}

