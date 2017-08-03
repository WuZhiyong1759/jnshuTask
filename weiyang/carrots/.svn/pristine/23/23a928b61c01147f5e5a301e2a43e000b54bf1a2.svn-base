/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.TalentSkillRelation;
import com.ptteng.carrots.home.service.TalentSkillRelationService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class TalentSkillRelationSCAClient implements TalentSkillRelationService {

    private TalentSkillRelationService talentSkillRelationService;

	public TalentSkillRelationService getTalentSkillRelationService() {
		return talentSkillRelationService;
	}
	
	
	public void setTalentSkillRelationService(TalentSkillRelationService talentSkillRelationService) {
		this.talentSkillRelationService =talentSkillRelationService;
	}
	
	
			   
		@Override
		public Long insert(TalentSkillRelation talentSkillRelation)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.insert(talentSkillRelation);
		          
		
		}	
		  
    	   
		@Override
		public List<TalentSkillRelation> insertList(List<TalentSkillRelation> talentSkillRelationList)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.insertList(talentSkillRelationList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(TalentSkillRelation talentSkillRelation)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.update(talentSkillRelation);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<TalentSkillRelation> talentSkillRelationList)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.updateList(talentSkillRelationList);
		          
		
		}	
		  
    	   
		@Override
		public TalentSkillRelation getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<TalentSkillRelation> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return talentSkillRelationService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getTalentSkillRelationIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentSkillRelationService.getTalentSkillRelationIds(start, limit);
	}

	@Override
	public Integer countTalentSkillRelationIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentSkillRelationService.countTalentSkillRelationIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentSkillRelationService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return talentSkillRelationService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   talentSkillRelationService.deleteList(clz, ids);
		
	}
	
/*	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.talentSkillRelationService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}*/


 
}

