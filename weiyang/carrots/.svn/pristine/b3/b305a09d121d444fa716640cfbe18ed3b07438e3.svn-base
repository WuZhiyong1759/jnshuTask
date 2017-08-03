/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.Skill;
import com.ptteng.carrots.home.service.SkillService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class SkillSCAClient implements SkillService {

    private SkillService skillService;

	public SkillService getSkillService() {
		return skillService;
	}
	
	
	public void setSkillService(SkillService skillService) {
		this.skillService =skillService;
	}
	
	
			   
		@Override
		public Long insert(Skill skill)throws ServiceException, ServiceDaoException{
		
		return skillService.insert(skill);
		          
		
		}	
		  
    	   
		@Override
		public List<Skill> insertList(List<Skill> skillList)throws ServiceException, ServiceDaoException{
		
		return skillService.insertList(skillList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return skillService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Skill skill)throws ServiceException, ServiceDaoException{
		
		return skillService.update(skill);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Skill> skillList)throws ServiceException, ServiceDaoException{
		
		return skillService.updateList(skillList);
		          
		
		}	
		  
    	   
		@Override
		public Skill getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return skillService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Skill> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return skillService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getSkillIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return skillService.getSkillIds(start, limit);
	}

	@Override
	public Integer countSkillIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return skillService.countSkillIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return skillService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return skillService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   skillService.deleteList(clz, ids);
		
	}
	
/*	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.skillService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}*/


 
}

