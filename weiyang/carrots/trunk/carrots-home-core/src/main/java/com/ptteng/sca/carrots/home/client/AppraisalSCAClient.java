/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.home.model.Appraisal;
import com.ptteng.carrots.home.service.AppraisalService;

public class AppraisalSCAClient implements AppraisalService {

    private AppraisalService appraisalService;

	public AppraisalService getAppraisalService() {
		return appraisalService;
	}
	
	
	public void setAppraisalService(AppraisalService appraisalService) {
		this.appraisalService =appraisalService;
	}
	
	
			   
		@Override
		public Long insert(Appraisal appraisal)throws ServiceException, ServiceDaoException{
		
		return appraisalService.insert(appraisal);
		          
		
		}	
		  
    	   
		@Override
		public List<Appraisal> insertList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException{
		
		return appraisalService.insertList(appraisalList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return appraisalService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Appraisal appraisal)throws ServiceException, ServiceDaoException{
		
		return appraisalService.update(appraisal);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Appraisal> appraisalList)throws ServiceException, ServiceDaoException{
		
		return appraisalService.updateList(appraisalList);
		          
		
		}	
		  
    	   
		@Override
		public Appraisal getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return appraisalService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Appraisal> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return appraisalService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getAppraisalIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return appraisalService.getAppraisalIds(start, limit);
	}

	@Override
	public Integer countAppraisalIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return appraisalService.countAppraisalIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return appraisalService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return appraisalService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   appraisalService.deleteList(clz, ids);
		
	}


	/**
	 * 
	 * @param 
	 * @return 
	 * @throws ServiceException
	 * @throws ServiceDaoException
	 */
	@Override
	public List<Long> getAppraisalIdsByTalentId(Long talentId, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return appraisalService.getAppraisalIdsByTalentId(talentId, start, limit);
	}
	
	/*@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.appraisalService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}*/


 
}

