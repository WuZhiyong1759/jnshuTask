package com.ptteng.carrots.zangai.service.impl;

import com.gemantic.common.exception.ServiceDaoException;
import com.gemantic.common.exception.ServiceException;
import com.gemantic.dal.dao.exception.DaoException;
import com.ptteng.carrots.zangai.model.Producter;
import com.ptteng.carrots.zangai.service.ProducterService;
import com.ptteng.common.dao.BaseDaoServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;


public class ProducterServiceImpl extends BaseDaoServiceImpl implements ProducterService {

 

	private static final Log log = LogFactory.getLog(ProducterServiceImpl.class);



		   
		@Override
		public Long insert(Producter producter)throws ServiceException, ServiceDaoException{
		
	
		          
    log.info(" insert data : " + producter);

		if (producter == null) {
			return null;
		}

		long currentTimeMillis = System.currentTimeMillis();
		producter.setCreateAt(currentTimeMillis);
		producter.setUpdateAt(currentTimeMillis);

		Long result = null;
		try {
			result = (Long) dao.save(producter);
		} catch (DaoException e) {
			log.error(" insert wrong : " + producter);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert data success : " + result);
    
return result;	
		}	
		  
    	   
		@Override
		public List<Producter> insertList(List<Producter> producterList)throws ServiceException, ServiceDaoException{
		
	
		          	
        log.info(" insert lists : " + (producterList == null ? "null" : producterList.size()));
      
		List<Producter> resultList = null;

		if (CollectionUtils.isEmpty(producterList)) {
			return new ArrayList<Producter>();
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Producter producter : producterList) {
			producter.setCreateAt(currentTimeMillis);
			producter.setUpdateAt(currentTimeMillis);
		}

		try {
			resultList = (List<Producter>) dao.batchSave(producterList);
		} catch (DaoException e) {
			log.error(" insert list wrong : " + producterList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" insert lists  success : " + (resultList == null ? "null" : resultList.size()));
    
		return resultList;
		
		
			
		}	
		  
    	   
		@Override
		public boolean delete(Long id)throws ServiceException, ServiceDaoException{
		
	
		            
	    log.info(" delete data : " + id);
 
		boolean result = false;

		if (id == null) {
			return true;
		}

		try {
			result = dao.delete(Producter.class, id);
		} catch (DaoException e) {
			log.error(" delete wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
 
		log.info(" delete data success : " + id);
   
		return result;
		
		}	
		  
    	   
		@Override
		public boolean update(Producter producter)throws ServiceException, ServiceDaoException{
		
	
		          
	log.info(" update data : " + (producter == null ? "null" : producter.getId()));

		boolean result = false;

		if (producter == null) {
			return true;
		}

		producter.setUpdateAt(System.currentTimeMillis());

		try {
			result = dao.update(producter);
		} catch (DaoException e) {
			log.error(" update wrong : " + producter);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
       if(log.isInfoEnabled()){
		log.info(" update data success : " + producter);
       }
		return result;	
		}	
		  
    	   
		@Override
		public boolean updateList(List<Producter> producterList)throws ServiceException, ServiceDaoException{
		
	
		          log.info(" update lists : " + (producterList == null ? "null" : producterList.size()));

		boolean result = false;

		if (CollectionUtils.isEmpty(producterList)) {
			return true;
		}

		long currentTimeMillis = System.currentTimeMillis();
		for (Producter producter : producterList) {
			producter.setUpdateAt(currentTimeMillis);
		}

		try {
			result = dao.batchUpdate(producterList);
		} catch (DaoException e) {
			log.error(" update list wrong : " + producterList);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" update lists success : " + producterList.size());
         
		return result;	
		}	
		  
    	   
		@Override
		public Producter getObjectById(Long id)throws ServiceException, ServiceDaoException{
		
	
		              
        log.info(" get data : " + id);
      
		Producter producter = null;

		if (id == null) {
			return producter;
		}

		try {
			producter = (Producter) dao.get(Producter.class, id);
		} catch (DaoException e) {
			log.error(" get wrong : " + id);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
     
		log.info(" get data success : " + id);
      
		return producter;		
		}	
		  
    	   
		@Override
		public List<Producter> getObjectsByIds(List<Long> ids)throws ServiceException, ServiceDaoException{
		
	
		          	  
	    log.info(" get lists : " + (ids == null ? "null" : ids));
     
		List<Producter> producter = null;

		if (CollectionUtils.isEmpty(ids)) {
			return new ArrayList<Producter>();
		}

		try {
			producter = (List<Producter>) dao.getList(Producter.class, ids);
		} catch (DaoException e) {
			log.error(" get wrong : " + ids);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
    
		log.info(" get data success : " + (producter == null ? "null" : producter.size()));
    
		return producter;	
		}	
		  
    	
		
	
	
		
	
		
	
	
	
		
	@Override
	public List<Long> getProducterIds(Integer start, Integer limit)
			throws ServiceException, ServiceDaoException {
		
		log.info(" get ids   by start,limit  ================== " + start + " , " + limit);
		List<Long> idList = null;
		
		
		
		if (start == null) {
			start = 0;
		}

		if (limit == null) {
			limit = Integer.MAX_VALUE;
		}
		
		try {
			idList = dao.getIdList("getProducterIdsAll",new Object[] {},start, limit, false);
		} catch (DaoException e) {
			log.error(" get ids  wrong by start,limit)  : " + start + " , " + limit);
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" get ids success == : " + (idList == null ? "null" : idList.size()));
		}
		return idList;
	}
	
	
		@Override
	public Integer countProducterIds() throws ServiceException,
			ServiceDaoException {
		Integer count =  0;
		try {
			count = dao.count("getProducterIdsAll",new Object[] {});
		} catch (DaoException e) {
			log.error(" count by getProducterIds " ) ;
			log.error(e);
			e.printStackTrace();
			throw new ServiceDaoException(e);
		}
		if (log.isInfoEnabled()) {
			log.info(" count  : " + count);
		}
		return count;
	}

	@Override
	public List<Long> getProducterIdsByCId(Long cId, Integer start, Integer limit) throws ServiceException,
			ServiceDaoException {

			if(log.isInfoEnabled()){
				log.info("get companyId,startmlimit"+cId+","+start+","+limit);
		}
		List<Long> pidList=null;

			if (null==start){
				start=0;
			}

			if(null==limit){
				limit=Integer.MAX_VALUE;
			}


        try{
				pidList=dao.getIdList("getProducterIdsByCId",new Object[]{ cId},start,limit,false);

		}catch (DaoException d){
			log.error(" get ids  wrong by Id,start,limit)  : " + cId+" , "+start+" , "+limit );
			d.printStackTrace();
			throw new ServiceDaoException(d);
		}

		if (log.isInfoEnabled()){
			log.info("get  pidList success is :"+pidList);
		}
		return pidList;



	}

}

