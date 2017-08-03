package com.ptteng.carrots.zangai.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "article")
public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6460912338452750099L;	
	
		
   	 
    private  Long id;
	
  	 
    private  String title;
	
  	 
    private  String url;
	
  	 
    private  String image;
	
  	 
    private  Integer type;
	
  	 
    private  Integer statu;
	
  	 
    private  Integer industry;
	
  	 
    private  String indexId;
	
  	 
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
		 	@Column(name = "title")
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
		 	@Column(name = "url")
	public String getUrl() {
		return url;
	}
	
	
	public void setUrl(String url) {
		this.url = url;
	}
		 	@Column(name = "image")
	public String getImage() {
		return image;
	}
	
	
	public void setImage(String image) {
		this.image = image;
	}
		 	@Column(name = "type")
	public Integer getType() {
		return type;
	}
	
	
	public void setType(Integer type) {
		this.type = type;
	}
		 	@Column(name = "statu")
	public Integer getStatu() {
		return statu;
	}
	
	
	public void setStatu(Integer statu) {
		this.statu = statu;
	}
		 	@Column(name = "industry")
	public Integer getIndustry() {
		return industry;
	}
	
	
	public void setIndustry(Integer industry) {
		this.industry = industry;
	}
		 	@Column(name = "index_id")
	public String getIndexId() {
		return indexId;
	}
	
	
	public void setIndexId(String indexId) {
		this.indexId = indexId;
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

