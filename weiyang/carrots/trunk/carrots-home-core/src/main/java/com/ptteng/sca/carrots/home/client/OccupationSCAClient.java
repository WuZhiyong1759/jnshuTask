/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.Occupation;
import com.ptteng.carrots.home.service.OccupationService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class OccupationSCAClient implements OccupationService {

    private OccupationService occupationService;

	public OccupationService getOccupationService() {
		return occupationService;
	}
	
	
	public void setOccupationService(OccupationService occupationService) {
		this.occupationService =occupationService;
	}
	
	
			   
		@Override
		public Long insert(Occupation occupation)throws ServiceException, ServiceDaoException{
		
		return occupationService.insert(occupation);
		          
		
		}	
		  
    	   
		@Override
		public List<Occupation> insertList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException{
		
		return occupationService.insertList(occupationList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return occupationService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Occupation occupation)throws ServiceException, ServiceDaoException{
		
		return occupationService.update(occupation);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Occupation> occupationList)throws ServiceException, ServiceDaoException{
		
		return occupationService.updateList(occupationList);
		          
		
		}	
		  
    	   
		@Override
		public Occupation getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return occupationService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Occupation> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return occupationService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getOccupationIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return occupationService.getOccupationIds(start, limit);
	}

	@Override
	public Integer countOccupationIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return occupationService.countOccupationIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return occupationService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return occupationService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   occupationService.deleteList(clz, ids);
		
	}
	
/*	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.occupationService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}
*/

 
}

