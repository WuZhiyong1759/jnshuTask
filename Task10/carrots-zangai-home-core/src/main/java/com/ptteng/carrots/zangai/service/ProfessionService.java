package com.ptteng.carrots.zangai.service;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Profession;
import com.ptteng.common.dao.BaseDaoService;
import org.osoa.sca.annotations.Remotable;

import java.util.List;

@Remotable
public interface ProfessionService extends BaseDaoService {

	



   		   
		
		public Long insert(Profession profession)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Profession> insertList(List<Profession> professionList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean delete(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean update(Profession profession)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public boolean updateList(List<Profession> professionList)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public Profession getObjectById(Long id)throws ServiceException, ServiceDaoException;
		  
    	   
		
		public List<Profession> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException;
		  
    	
	


				
	
	
	
	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public List<Long> getProfessionIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException;

	/**
	 * 
	 * @param
	 * @return
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	public Integer countProfessionIds() throws ServiceException, ServiceDaoException;


    List<Long> getProfessionByCompanyId(Long cId, Integer start, Integer limit) throws ServiceException,ServiceDaoException;

	List<Long> getProfessionByCId(Long cid, Integer start, Integer limit)throws ServiceDaoException,ServiceException;
}

