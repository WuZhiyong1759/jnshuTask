/**
 * 
 */
package com.ptteng.sca.carrots.zangai.client;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.Producter;
import com.ptteng.carrots.zangai.service.ProducterService;

import java.util.List;
import java.util.Map;

public class ProducterSCAClient implements ProducterService {

    private ProducterService producterService;

	public ProducterService getProducterService() {
		return producterService;
	}
	
	
	public void setProducterService(ProducterService producterService) {
		this.producterService =producterService;
	}
	
	
			   
		@Override
		public Long insert(Producter producter)throws ServiceException, ServiceDaoException{
		
		return producterService.insert(producter);
		          
		
		}	
		  
    	   
		@Override
		public List<Producter> insertList(List<Producter> producterList)throws ServiceException, ServiceDaoException{
		
		return producterService.insertList(producterList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return producterService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Producter producter)throws ServiceException, ServiceDaoException{
		
		return producterService.update(producter);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Producter> producterList)throws ServiceException, ServiceDaoException{
		
		return producterService.updateList(producterList);
		          
		
		}	
		  
    	   
		@Override
		public Producter getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return producterService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Producter> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return producterService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getProducterIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return producterService.getProducterIds(start, limit);
	}

	@Override
	public Integer countProducterIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return producterService.countProducterIds();
	}

	@Override
	public List<Long> getProducterIdsByCId(Long cId, Integer start, Integer limit) throws ServiceDaoException, ServiceException {
		return producterService.getProducterIdsByCId(cId,start,limit);
	}


	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return producterService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return producterService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   producterService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.producterService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

