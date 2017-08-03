package com.ptteng.carrots.zangai.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "producter")
public class Producter implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4982044311543115652L;	
	
		
   	 
    private  Long id;
	
  	 
    private  Long cId;
	
  	 
    private  String name;
	
  	 
    private  String sign;
	
  	 
    private  String logo;
	
  	 
    private  String introduce;
	
  	 
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
		 	@Column(name = "c_id")
	public Long getCId() {
		return cId;
	}
	
	
	public void setCId(Long cId) {
		this.cId = cId;
	}
		 	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
		 	@Column(name = "sign")
	public String getSign() {
		return sign;
	}
	
	
	public void setSign(String sign) {
		this.sign = sign;
	}
		 	@Column(name = "logo")
	public String getLogo() {
		return logo;
	}
	
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
		 	@Column(name = "introduce")
	public String getIntroduce() {
		return introduce;
	}
	
	
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
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

