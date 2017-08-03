package com.ptteng.carrots.home.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


@Entity
@Table(name = "skill")
public class Skill implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4168841672856892416L;	
	
		
   	 
    private  Long id;//
	
    private  String parentId;
	
  	 
    private  String name;
	
  	 
    private  String content;
	
  	 
    private  Integer priority;
	
  	 
    private  Integer sort;
	
  	 
    private  Long createBy;
	
  	 
    private  Long updateBy;
	
  	 
    private  Long updateAt;
	
  	 
    private  Long createAt;
	
    private Long occupationId; 
    
  
	
		 			@Column(name = "occupation_id")
         	 	   public Long getOccupationId() {
		return occupationId;
	}


	public void setOccupationId(Long occupationId) {
		this.occupationId = occupationId;
	}


				@Id
     	   @GeneratedValue(strategy = GenerationType.AUTO)
              	@Column(name = "id")
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
		 
		 	@Column(name = "parent_id")
	public String getParentId() {
		return parentId;
	}
	
	
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
		 	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
		 	@Column(name = "content")
	public String getContent() {
		return content;
	}
	
	
	public void setContent(String content) {
		this.content = content;
	}
		 	@Column(name = "priority")
	public Integer getPriority() {
		return priority;
	}
	
	
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
		 	@Column(name = "sort")
	public Integer getSort() {
		return sort;
	}
	
	
	public void setSort(Integer sort) {
		this.sort = sort;
	}
		 	@Column(name = "create_by")
	public Long getCreateBy() {
		return createBy;
	}
	
	
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
		 	@Column(name = "update_by")
	public Long getUpdateBy() {
		return updateBy;
	}
	
	
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
		 	@Column(name = "update_at")
	public Long getUpdateAt() {
		return updateAt;
	}
	
	
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
		 	@Column(name = "create_at")
	public Long getCreateAt() {
		return createAt;
	}
	
	
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
		
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}

