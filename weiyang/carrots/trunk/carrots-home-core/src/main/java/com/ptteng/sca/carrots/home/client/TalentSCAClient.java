/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.Talent;
import com.ptteng.carrots.home.service.TalentService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class TalentSCAClient implements TalentService {

    private TalentService talentService;

	public TalentService getTalentService() {
		return talentService;
	}
	
	
	public void setTalentService(TalentService talentService) {
		this.talentService =talentService;
	}
	
	
			   
		@Override
		public Long insert(Talent talent)throws ServiceException, ServiceDaoException{
		
		return talentService.insert(talent);
		          
		
		}	
		  
    	   
		@Override
		public List<Talent> insertList(List<Talent> talentList)throws ServiceException, ServiceDaoException{
		
		return talentService.insertList(talentList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return talentService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Talent talent)throws ServiceException, ServiceDaoException{
		
		return talentService.update(talent);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Talent> talentList)throws ServiceException, ServiceDaoException{
		
		return talentService.updateList(talentList);
		          
		
		}	
		  
    	   
		@Override
		public Talent getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return talentService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Talent> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return talentService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getTalentIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.getTalentIds(start, limit);
	}

	@Override
	public Integer countTalentIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.countTalentIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   talentService.deleteList(clz, ids);
		
	}


	@Override
	public List<Long> getTalentIdsByPhone(String phone, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.getTalentIdsByPhone(phone, start, limit);
	}


	@Override
	public Integer countTalentIdsByTalentLevelAndIsShelve(String talentLevel, String isShelve)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentService.countTalentIdsByTalentLevelAndIsShelve(talentLevel, isShelve);
	}


 
}

