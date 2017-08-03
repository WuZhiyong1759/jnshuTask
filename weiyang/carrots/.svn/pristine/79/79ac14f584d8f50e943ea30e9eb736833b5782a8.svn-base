/**
 * 
 */
package com.ptteng.sca.carrots.home.client;

import java.util.List;
import java.util.Map;

import com.ptteng.carrots.home.model.Candidate;
import com.ptteng.carrots.home.service.CandidateService;
import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;

public class CandidateSCAClient implements CandidateService {

    private CandidateService candidateService;

	public CandidateService getCandidateService() {
		return candidateService;
	}
	
	
	public void setCandidateService(CandidateService candidateService) {
		this.candidateService =candidateService;
	}
	
	
			   
		@Override
		public Long insert(Candidate candidate)throws ServiceException, ServiceDaoException{
		
		return candidateService.insert(candidate);
		          
		
		}	
		  
    	   
		@Override
		public List<Candidate> insertList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException{
		
		return candidateService.insertList(candidateList);
		          
		
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
		return candidateService.delete(id);
		          
		
		}	
		  
    	   
		@Override
		public boolean update(Candidate candidate)throws ServiceException, ServiceDaoException{
		
		return candidateService.update(candidate);
		          
		
		}	
		  
    	   
		@Override
		public boolean updateList(List<Candidate> candidateList)throws ServiceException, ServiceDaoException{
		
		return candidateService.updateList(candidateList);
		          
		
		}	
		  
    	   
		@Override
		public Candidate getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
		return candidateService.getObjectById(id);
		          
		
		}	
		  
    	   
		@Override
		public List<Candidate> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
		return candidateService.getObjectsByIds(ids);
		          
		
		}	
		  
    	
	
	
	
	
		
	
	
    		
	
		@Override
	public List<Long> getCandidateIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return candidateService.getCandidateIds(start, limit);
	}

	@Override
	public Integer countCandidateIds() throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return candidateService.countCandidateIds();
	}
	
	
	@Override
	public List<Long> getIdsByDynamicCondition(Class clz, Map<String, Object> conditions, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return candidateService.getIdsByDynamicCondition(clz, conditions, start, limit);
	}


	@Override
	public boolean fakeDelete(Class clz, Long id) throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return candidateService.fakeDelete(clz, id);
	}
	
	
	
	@Override
	public void deleteList(Class clz, List<Long> ids) throws ServiceException, ServiceDaoException {
		   candidateService.deleteList(clz, ids);
		
	}


	@Override
	public List<Long> getCandidateIdsByPhone(String phone, Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		// TODO Auto-generated method stub
		return candidateService.getCandidateIdsByPhone(phone, start, limit);
	}
	
//	@Override
//	public Object getObjectByDynamicCondition(Class clz,
//			Map<String, Object> conditions, Integer start, Integer limit)
//			throws ServiceException, ServiceDaoException {
//	
//		return this.candidateService.getObjectByDynamicCondition(clz, conditions, start, limit);
//	}


 
}

