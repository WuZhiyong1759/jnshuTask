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
@Table(name = "talent_skill_relation")
public class TalentSkillRelation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 369637136060145664L;	
	
		
   	 
    private  Long id;
	
  	 
    private  Long skillId;
	
  	 
    private  Long talentId;
    
    private Long appraisalId;

	private  Integer degree;
	
  	 
    private  Long createBy;
	
  	 
    private  Long updateBy;
	
  	 
    private  Long updateAt;
	
  	 
    private  Long createAt;
	
  
	
		 	
         	 	   @Id
     	   @GeneratedValue(strategy = GenerationType.AUTO)
              	@Column(name = "id")
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
		 	@Column(name = "skill_id")
	public Long getSkillId() {
		return skillId;
	}
	
	
	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}
		 	@Column(name = "talent_id")
	public Long getTalentId() {
		return talentId;
	}
	
	
	public void setTalentId(Long talentId) {
		this.talentId = talentId;
	}
		 	@Column(name = "degree")
	public Integer getDegree() {
		return degree;
	}
	
	
	public void setDegree(Integer degree) {
		this.degree = degree;
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
	
	
	 			@Column(name = "appraisal_id")
	    public Long getAppraisalId() {
			return appraisalId;
		}


		public void setAppraisalId(Long appraisalId) {
			this.appraisalId = appraisalId;
		}
		
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}

