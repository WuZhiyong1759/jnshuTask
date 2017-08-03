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
@Table(name = "talent")
public class Talent implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6660666823425790976L;


	//需要推荐状态
	public static final String RECOMMEND = "0";


	//人才上架状态
	public static final String SHELEVE_UP = "0";	
	
	
	//人才下架状态
	public static final String SHELEVE_DOWN = "1";


	//默认职位推荐数
	public static final Long DEFAULT_RECOMMEND_NUM = 0L;


	//无测评报告
	public static final String NOT_HAVE_APPRAISAL = "1";



	
   	 
    private  Long id;
	
  	 
    private  Long candidateId;
	
  	 
    private  String occupationType;
	
  	 
    private  String appraisal;
	
  	 
    private  String talentLevel;
	
  	 
    private  Long recommendNum;
	
  	 
    private  String isRecommend;
	
  	 
    private  String isShelve;
	
  	 
    private  String name;
	
  	 
    private  String gender;
	
  	 
    private  String maritalStatus;
	
  	 
    private  Long birth;
	
  	 
    private  String email;
	
  	 
    private  String phone;
	
  	 
    private  String address;
	
  	 
    private  String degree;
	
  	 
    private  String graduate;
	
  	 
    private  String major;
	
  	 
    private  String englishSkill;
	
  	 
    private  String exCompany;
	
  	 
    private  String exJob;
	
  	 
    private  Long exSalary;
	
  	 
    private  String workExperience;
	
  	 
    private  String isBat;
	
  	 
    private  String isBigdata;
	
  	 
    private  String workIndustry;
	
  	 
    private  String workFinanceRound;
	
  	 
    private  String workGroupScale;
	
  	 
    private  String workProfitStatus;
	
  	 
    private  String workUserNumbers;
	
  	 
    private  String workJobType;
	
  	 
    private  String workIntensity;
	
  	 
    private  String province;
	
  	 
    private  String city;
	
  	 
    private  String county;
	
  	 
    private  String workSalary;
	
  	 
    private  String workStatus;
	
  	 
    private  String workLeaderBackground;
	
  	 
    private  String workTips;
	
  	 
    private  String commentStudyAbility;
	
  	 
    private  String commentSkillType;
	
  	 
    private  String commentWorkStable;
	
  	 
    private  String commentResumeReliability;
	
  	 
    private  String commentTalentTabs;
	
  	 
    private  String commentTips;
	
  	 
    private  String resume;
	
  	 
    private  String avatar;
	
  	 
    private  Long createBy;
	
  	 
    private  Long updateBy;
	
  	 
    private  Long createAt;
	
  	 
    private  Long updateAt;
	
    private String resultScore;

    private int totalScore;

    private Long resultExceed;
  
	
		 	
         	 	   @Id
     	   @GeneratedValue(strategy = GenerationType.AUTO)
              	@Column(name = "id")
	public Long getId() {
		return id;
	}
	
	
	public void setId(Long id) {
		this.id = id;
	}
		 	@Column(name = "candidate_id")
	public Long getCandidateId() {
		return candidateId;
	}
	
	
	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}
		 	@Column(name = "occupation_type")
	public String getOccupationType() {
		return occupationType;
	}
	
	
	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}
		 	@Column(name = "appraisal")
	public String getAppraisal() {
		return appraisal;
	}
	
	
	public void setAppraisal(String appraisal) {
		this.appraisal = appraisal;
	}
		 	@Column(name = "talent_level")
	public String getTalentLevel() {
		return talentLevel;
	}
	
	
	public void setTalentLevel(String talentLevel) {
		this.talentLevel = talentLevel;
	}
		 	@Column(name = "recommend_num")
	public Long getRecommendNum() {
		return recommendNum;
	}
	
	
	public void setRecommendNum(Long recommendNum) {
		this.recommendNum = recommendNum;
	}
		 	@Column(name = "is_recommend")
	public String getIsRecommend() {
		return isRecommend;
	}
	
	
	public void setIsRecommend(String isRecommend) {
		this.isRecommend = isRecommend;
	}
		 	@Column(name = "is_shelve")
	public String getIsShelve() {
		return isShelve;
	}
	
	
	public void setIsShelve(String isShelve) {
		this.isShelve = isShelve;
	}
		 	@Column(name = "name")
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
		 	@Column(name = "gender")
	public String getGender() {
		return gender;
	}
	
	
	public void setGender(String gender) {
		this.gender = gender;
	}
		 	@Column(name = "marital_status")
	public String getMaritalStatus() {
		return maritalStatus;
	}
	
	
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
		 	@Column(name = "birth")
	public Long getBirth() {
		return birth;
	}
	
	
	public void setBirth(Long birth) {
		this.birth = birth;
	}
		 	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
		 	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}
	
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
		 	@Column(name = "address")
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
		 	@Column(name = "degree")
	public String getDegree() {
		return degree;
	}
	
	
	public void setDegree(String degree) {
		this.degree = degree;
	}
		 	@Column(name = "graduate")
	public String getGraduate() {
		return graduate;
	}
	
	
	public void setGraduate(String graduate) {
		this.graduate = graduate;
	}
		 	@Column(name = "major")
	public String getMajor() {
		return major;
	}
	
	
	public void setMajor(String major) {
		this.major = major;
	}
		 	@Column(name = "english_skill")
	public String getEnglishSkill() {
		return englishSkill;
	}
	
	
	public void setEnglishSkill(String englishSkill) {
		this.englishSkill = englishSkill;
	}
		 	@Column(name = "ex_company")
	public String getExCompany() {
		return exCompany;
	}
	
	
	public void setExCompany(String exCompany) {
		this.exCompany = exCompany;
	}
		 	@Column(name = "ex_job")
	public String getExJob() {
		return exJob;
	}
	
	
	public void setExJob(String exJob) {
		this.exJob = exJob;
	}
		 	@Column(name = "ex_salary")
	public Long getExSalary() {
		return exSalary;
	}
	
	
	public void setExSalary(Long exSalary) {
		this.exSalary = exSalary;
	}
		 	@Column(name = "work_experience")
	public String getWorkExperience() {
		return workExperience;
	}
	
	
	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}
		 	@Column(name = "is_bat")
	public String getIsBat() {
		return isBat;
	}
	
	
	public void setIsBat(String isBat) {
		this.isBat = isBat;
	}
		 	@Column(name = "is_bigdata")
	public String getIsBigdata() {
		return isBigdata;
	}
	
	
	public void setIsBigdata(String isBigdata) {
		this.isBigdata = isBigdata;
	}
		 	@Column(name = "work_industry")
	public String getWorkIndustry() {
		return workIndustry;
	}
	
	
	public void setWorkIndustry(String workIndustry) {
		this.workIndustry = workIndustry;
	}
		 	@Column(name = "work_finance_round")
	public String getWorkFinanceRound() {
		return workFinanceRound;
	}
	
	
	public void setWorkFinanceRound(String workFinanceRound) {
		this.workFinanceRound = workFinanceRound;
	}
		 	@Column(name = "work_group_scale")
	public String getWorkGroupScale() {
		return workGroupScale;
	}
	
	
	public void setWorkGroupScale(String workGroupScale) {
		this.workGroupScale = workGroupScale;
	}
		 	@Column(name = "work_profit_status")
	public String getWorkProfitStatus() {
		return workProfitStatus;
	}
	
	
	public void setWorkProfitStatus(String workProfitStatus) {
		this.workProfitStatus = workProfitStatus;
	}
		 	@Column(name = "work_user_numbers")
	public String getWorkUserNumbers() {
		return workUserNumbers;
	}
	
	
	public void setWorkUserNumbers(String workUserNumbers) {
		this.workUserNumbers = workUserNumbers;
	}
		 	@Column(name = "work_job_type")
	public String getWorkJobType() {
		return workJobType;
	}
	
	
	public void setWorkJobType(String workJobType) {
		this.workJobType = workJobType;
	}
		 	@Column(name = "work_intensity")
	public String getWorkIntensity() {
		return workIntensity;
	}
	
	
	public void setWorkIntensity(String workIntensity) {
		this.workIntensity = workIntensity;
	}
		 	@Column(name = "province")
	public String getProvince() {
		return province;
	}
	
	
	public void setProvince(String province) {
		this.province = province;
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
		 	@Column(name = "work_salary")
	public String getWorkSalary() {
		return workSalary;
	}
	
	
	public void setWorkSalary(String workSalary) {
		this.workSalary = workSalary;
	}
		 	@Column(name = "work_status")
	public String getWorkStatus() {
		return workStatus;
	}
	
	
	public void setWorkStatus(String workStatus) {
		this.workStatus = workStatus;
	}
		 	@Column(name = "work_leader_background")
	public String getWorkLeaderBackground() {
		return workLeaderBackground;
	}
	
	
	public void setWorkLeaderBackground(String workLeaderBackground) {
		this.workLeaderBackground = workLeaderBackground;
	}
		 	@Column(name = "work_tips")
	public String getWorkTips() {
		return workTips;
	}
	
	
	public void setWorkTips(String workTips) {
		this.workTips = workTips;
	}
		 	@Column(name = "comment_study_ability")
	public String getCommentStudyAbility() {
		return commentStudyAbility;
	}
	
	
	public void setCommentStudyAbility(String commentStudyAbility) {
		this.commentStudyAbility = commentStudyAbility;
	}
		 	@Column(name = "comment_skill_type")
	public String getCommentSkillType() {
		return commentSkillType;
	}
	
	
	public void setCommentSkillType(String commentSkillType) {
		this.commentSkillType = commentSkillType;
	}
		 	@Column(name = "comment_work_stable")
	public String getCommentWorkStable() {
		return commentWorkStable;
	}
	
	
	public void setCommentWorkStable(String commentWorkStable) {
		this.commentWorkStable = commentWorkStable;
	}
		 	@Column(name = "comment_resume_reliability")
	public String getCommentResumeReliability() {
		return commentResumeReliability;
	}
	
	
	public void setCommentResumeReliability(String commentResumeReliability) {
		this.commentResumeReliability = commentResumeReliability;
	}
		 	@Column(name = "comment_talent_tabs")
	public String getCommentTalentTabs() {
		return commentTalentTabs;
	}
	
	
	public void setCommentTalentTabs(String commentTalentTabs) {
		this.commentTalentTabs = commentTalentTabs;
	}
		 	@Column(name = "comment_tips")
	public String getCommentTips() {
		return commentTips;
	}
	
	
	public void setCommentTips(String commentTips) {
		this.commentTips = commentTips;
	}
		 	@Column(name = "resume")
	public String getResume() {
		return resume;
	}
	
	
	public void setResume(String resume) {
		this.resume = resume;
	}
		 	@Column(name = "avatar")
	public String getAvatar() {
		return avatar;
	}
	
	
	public void setAvatar(String avatar) {
		this.avatar = avatar;
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
		 	@Column(name = "create_at")
	public Long getCreateAt() {
		return createAt;
	}
	
	
	public void setCreateAt(Long createAt) {
		this.createAt = createAt;
	}
		 	@Column(name = "update_at")
	public Long getUpdateAt() {
		return updateAt;
	}
	
	
	public void setUpdateAt(Long updateAt) {
		this.updateAt = updateAt;
	}
	
	
	@Transient	
	public String getResultScore() {
		return resultScore;
	}


	public void setResultScore(String resultScore) {
		this.resultScore = resultScore;
	}

	@Transient
	public int getTotalScore() {
		return totalScore;
	}


	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	@Transient
	public Long getResultExceed() {
		return resultExceed;
	}


	public void setResultExceed(Long resultExceed) {
		this.resultExceed = resultExceed;
	}


	public String toString() {
		return ToStringBuilder.reflectionToString(this,
				ToStringStyle.MULTI_LINE_STYLE);
	}

}

