/**
 * 
 */
package com.ptteng.sca.carrots.zangai.client;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.ProfessionLabel;
import com.ptteng.carrots.zangai.service.ProfessionLabelService;

import java.util.List;
import java.util.Map;

public class ProfessionLabelSCAClient implements ProfessionLabelService {

    private ProfessionLabelService professionLabelService;

	public ProfessionLabelService getProfessionLabelService() {
		return professionLabelService;
	}
	
	
	public void setProfessionLabelService(ProfessionLabelService professionLabelService) {
		this.professionLabelService =professionLabelService;
	}
	
	
			   
		@Override
		public Long insert(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.insert(professionLabel);
		          
		
		}	
		  
    	   
		@Override
		public List<ProfessionLabel> insertList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.insertList(professionLabelList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(ProfessionLabel professionLabel)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.update(professionLabel);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<ProfessionLabel> professionLabelList)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.updateList(professionLabelList);
		          
		
		}	
		  
    	   
		@Override
		public ProfessionLabel getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<ProfessionLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return professionLabelService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getProfessionLabelIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return professionLabelService.getProfessionLabelIds(start, limit);
	}

	@Override
	public Integer countProfessionLabelIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return professionLabelService.countProfessionLabelIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return professionLabelService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return professionLabelService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   professionLabelService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.professionLabelService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

