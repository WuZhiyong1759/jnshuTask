/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.Recommend;
import com.ptteng.carrots.home.service.RecommendService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class RecommendSCAClient implements RecommendService {

    private RecommendService recommendService;

	public RecommendService getRecommendService() {
		return recommendService;
	}
	
	
	public void setRecommendService(RecommendService recommendService) {
		this.recommendService =recommendService;
	}
	
	
			   
		@Override
		public Long insert(Recommend recommend)throws ServiceException, ServiceDaoException{
		
		return recommendService.insert(recommend);
		          
		
		}	
		  
    	   
		@Override
		public List<Recommend> insertList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException{
		
		return recommendService.insertList(recommendList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return recommendService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Recommend recommend)throws ServiceException, ServiceDaoException{
		
		return recommendService.update(recommend);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Recommend> recommendList)throws ServiceException, ServiceDaoException{
		
		return recommendService.updateList(recommendList);
		          
		
		}	
		  
    	   
		@Override
		public Recommend getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return recommendService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Recommend> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return recommendService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getRecommendIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.getRecommendIds(start, limit);
	}

	@Override
	public Integer countRecommendIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.countRecommendIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   recommendService.deleteList(clz, ids);
		
	}


	@Override
	public List<Long> getRecommendIdsByTalentId(Long talentId, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.getRecommendIdsByTalentId(talentId, start, limit);
	}


	@Override
	public Integer countRecommendIdsByTalentId(Long talentId) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return recommendService.countRecommendIdsByTalentId(talentId);
	}
	
//	@Override
//	public Object getObjectByDynamicCondition(Class clz,
//			Map<String, Object> conditions, Integer start, Integer limit)
//			throws ServiceException, ServiceDaoException {
//	
//		return this.recommendService.getObjectByDynamicCondition(clz, conditions, start, limit);
//	}


 
}

