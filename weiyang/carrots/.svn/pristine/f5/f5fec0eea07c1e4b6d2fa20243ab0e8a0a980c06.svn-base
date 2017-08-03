/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.TalentProfession;
import com.ptteng.carrots.home.service.TalentProfessionService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class TalentProfessionSCAClient implements TalentProfessionService {

    private TalentProfessionService talentProfessionService;

	public TalentProfessionService getTalentProfessionService() {
		return talentProfessionService;
	}
	
	
	public void setTalentProfessionService(TalentProfessionService talentProfessionService) {
		this.talentProfessionService =talentProfessionService;
	}
	
	
			   
		@Override
		public Long insert(TalentProfession talentProfession)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.insert(talentProfession);
		          
		
		}	
		  
    	   
		@Override
		public List<TalentProfession> insertList(List<TalentProfession> talentProfessionList)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.insertList(talentProfessionList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(TalentProfession talentProfession)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.update(talentProfession);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<TalentProfession> talentProfessionList)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.updateList(talentProfessionList);
		          
		
		}	
		  
    	   
		@Override
		public TalentProfession getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<TalentProfession> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return talentProfessionService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getTalentProfessionIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentProfessionService.getTalentProfessionIds(start, limit);
	}

	@Override
	public Integer countTalentProfessionIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentProfessionService.countTalentProfessionIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentProfessionService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentProfessionService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   talentProfessionService.deleteList(clz, ids);
		
	}


 
}

