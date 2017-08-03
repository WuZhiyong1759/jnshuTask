/**
 * 
 */
package com.ptteng.sca.carrots.zangai.client;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.ptteng.carrots.zangai.model.CompanyLabel;
import com.ptteng.carrots.zangai.service.CompanyLabelService;

import java.util.List;
import java.util.Map;

public class CompanyLabelSCAClient implements CompanyLabelService {

    private CompanyLabelService companyLabelService;

	public CompanyLabelService getCompanyLabelService() {
		return companyLabelService;
	}
	
	
	public void setCompanyLabelService(CompanyLabelService companyLabelService) {
		this.companyLabelService =companyLabelService;
	}
	
	
			   
		@Override
		public Long insert(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.insert(companyLabel);
		          
		
		}	
		  
    	   
		@Override
		public List<CompanyLabel> insertList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.insertList(companyLabelList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(CompanyLabel companyLabel)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.update(companyLabel);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<CompanyLabel> companyLabelList)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.updateList(companyLabelList);
		          
		
		}	
		  
    	   
		@Override
		public CompanyLabel getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<CompanyLabel> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return companyLabelService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getCompanyLabelIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return companyLabelService.getCompanyLabelIds(start, limit);
	}

	@Override
	public Integer countCompanyLabelIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return companyLabelService.countCompanyLabelIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return companyLabelService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return companyLabelService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   companyLabelService.deleteList(clz, ids);
		
	}
	
	@Override
	public Object getObjectByDynamicCondition(Class clz,
			Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
	
		return this.companyLabelService.getObjectByDynamicCondition(clz, conditions, start, limit);
	}


 
}

