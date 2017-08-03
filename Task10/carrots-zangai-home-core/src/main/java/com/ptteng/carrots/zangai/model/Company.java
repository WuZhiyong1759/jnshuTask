package com.ptteng.carrots.zangai.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "company")
public class Company implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4341311015309203296L;	
	
		
   	 
    private  Long id;
	
  	 
    private  String name;
	
  	 
    private  String logo;
	
  	 
    private  String sign;
	
  	 
    private  Integer number;
	
  	 
    private  String email;
	
  	 
    private  Long phone;
	
  	 
    private  String address;
	
  	 
    private  String tagId;
	
  	 
    private  String map;
	
  	 
    private  String introduce;
	
  	 
    private  Integer financing;
	
  	 
    private  String city;
	
  	 
    private  String county;
	
  	 
    private  Integer approved;
	
  	 
    private  Integer jobs;
	
  	 
    private  Integer industry;
	
  	 
    private  Integer freezed;
	
  	 
    private  Long releasedAt;
	
  	 
    private  Long createAt;
	
  	 
    private  Long createBy;
	
  	 
    private  Long updateAt;
	
  	 
    private  Long updateBy;
	
  
	
		 	
         	 	   @Id
     	   @GeneratedValue(strategy = GenerationType.AUTO)
              	@Column(name = "id")
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
		 	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
		 	@Column(name = "logo")
	public String getLogo() {
		return logo;
	}
	
	
	public void setLogo(String logo) {
		this.logo = logo;
	}
		 	@Column(name = "sign")
	public String getSign() {
		return sign;
	}
	
	
	public void setSign(String sign) {
		this.sign = sign;
	}
		 	@Column(name = "number")
	public Integer getNumber() {
		return number;
	}
	
	
	public void setNumber(Integer number) {
		this.number = number;
	}
		 	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
		 	@Column(name = "phone")
	public Long getPhone() {
		return phone;
	}

	
	public void setPhone(Long phone) {
		this.phone = phone;
	}
		 	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
		 	@Column(name = "tag_id")
	public String getTagId() {
		return tagId;
	}
	
	
	public void setTagId(String tagId) {
		this.tagId = tagId;
	}
		 	@Column(name = "map")
	public String getMap() {
		return map;
	}
	
	
	public void setMap(String map) {
		this.map = map;
	}
		 	@Column(name = "introduce")
	public String getIntroduce() {
		return introduce;
	}
	
	
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
		 	@Column(name = "financing")
	public Integer getFinancing() {
		return financing;
	}
	
	
	public void setFinancing(Integer financing) {
		this.financing = financing;
	}
		 	@Column(name = "city")
	public String getCity() {
		return city;
	}
	
	
	public void setCity(String city) {
		this.city = city;
	}
		 	@Column(name = "county")
	public String getCounty() {
		return county;
	}
	
	
	public void setCounty(String county) {
		this.county = county;
	}
		 	@Column(name = "approved")
	public Integer getApproved() {
		return approved;
	}
	
	
	public void setApproved(Integer approved) {
		this.approved = approved;
	}
		 	@Column(name = "jobs")
	public Integer getJobs() {
		return jobs;
	}
	
	
	public void setJobs(Integer jobs) {
		this.jobs = jobs;
	}
		 	@Column(name = "industry")
	public Integer getIndustry() {
		return industry;
	}
	
	
	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
		 	@Column(name = "freezed")
	public Integer getFreezed() {
		return freezed;
	}
	
	
	public void setFreezed(Integer freezed) {
		this.freezed = freezed;
	}
		 	@Column(name = "released_at")
	public Long getReleasedAt() {
		return releasedAt;
	}
	
	
	public void setReleasedAt(Long releasedAt) {
		this.releasedAt = releasedAt;
	}
		 	@Column(name = "create_at")
	public Long getCreateAt() {
		return createAt;
	}
	
	
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
		 	@Column(name = "create_by")
	public Long getCreateBy() {
		return createBy;
	}
	
	
	public void setCreateBy(Long createBy) {
		this.createBy = createBy;
	}
		 	@Column(name = "update_at")
	public Long getUpdateAt() {
		return updateAt;
	}
	
	
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
		 	@Column(name = "update_by")
	public Long getUpdateBy() {
		return updateBy;
	}
	
	
	public void setUpdateBy(Long updateBy) {
		this.updateBy = updateBy;
	}
		
	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}

