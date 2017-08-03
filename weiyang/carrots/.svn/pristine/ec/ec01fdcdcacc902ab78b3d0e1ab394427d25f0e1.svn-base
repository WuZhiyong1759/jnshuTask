-- ----------------------------
-- Table structure for `candidate`
-- ----------------------------
-- DROP TABLE IF EXISTS `candidate`;
CREATE TABLE `candidate` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增ID',  
    `name` varchar(50)    COMMENT '姓名',  
    `occupation_type` varchar(2)    COMMENT '应聘职位',  
    `phone` varchar(11)    COMMENT '联系电话',  
    `status` varchar(1)    COMMENT '状态',  
    `reserve_time` bigint(20)    COMMENT '面试时间',  
    `resume` varchar(100)    COMMENT '简历',  
    `create_by` bigint(20)    COMMENT '创建人',  
    `update_by` bigint(20)    COMMENT '更新人',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `recommend`
-- ----------------------------
-- DROP TABLE IF EXISTS `recommend`;
CREATE TABLE `recommend` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增ID',  
    `company_id` Bigint(20)    COMMENT '公司ID',  
    `talent_id` Bigint(20)    COMMENT '人才ID',  
    `profession_id` Bigint(20)    COMMENT '职位ID',  
    `name` Varchar(50)    COMMENT '姓名',  
    `occupation_type` Varchar(2)    COMMENT '职位名称',  
    `company_name` Varchar(50)    COMMENT '公司名称',  
    `salary` Varchar(1)    COMMENT '薪资',  
    `contact_person` Varchar(50)    COMMENT '公司联系人',  
    `contact_number` Varchar(11)    COMMENT '联系电话',  
    `recommendatory` Bigint(20)    COMMENT '推荐时间',  
    `status` Varchar(1)    COMMENT '状态',  
    `reserve_time` Bigint(20)    COMMENT '面试时间',  
    `hire_date` Bigint(20)    COMMENT '入职时间',  
    `effective_date` Bigint(20)    COMMENT '转正时间',  
    `officially_salary` Bigint(20)    COMMENT '入职薪资',  
    `service_charge` Bigint(20)    COMMENT '服务费',  
    `tips` text    COMMENT '备注',  
    `create_by` Bigint(20)    COMMENT '创建人',  
    `update_by` Bigint(20)    COMMENT '更新人',  
    `create_at` Bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` Bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;


-- ----------------------------
-- Table structure for `talent`
-- ----------------------------
-- DROP TABLE IF EXISTS `talent`;
CREATE TABLE `talent` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增ID',  
    `candidate_id` bigint(20)    COMMENT '候选人ID',  
    `occupation_type` varchar(2)    COMMENT '职业类别',  
    `appraisal` varchar(1)    COMMENT '测评报告',  
    `talent_level` varchar(1)    COMMENT '人才等级',  
    `recommend_num` bigint(20)    COMMENT '推荐职位数',  
    `is_recommend` varchar(1)    COMMENT '需要推荐',  
    `is_shelve` varchar(1)    COMMENT '状态',  
    `name` varchar(50)    COMMENT '姓名',  
    `gender` varchar(1)    COMMENT '性别',  
    `marital_status` varchar(2)    COMMENT '婚育状况',  
    `birth` bigint(20)    COMMENT '出生年月',  
    `email` varchar(50)    COMMENT '电子邮箱',  
    `phone` varchar(11)    COMMENT '联系电话',  
    `address` varchar(255)    COMMENT '现有地址',  
    `degree` varchar(2)    COMMENT '学历',  
    `graduate` varchar(50)    COMMENT '毕业学校',  
    `major` varchar(50)    COMMENT '专业',  
    `english_skill` varchar(2)    COMMENT '英语水平',  
    `ex_company` varchar(50)    COMMENT '上家公司',  
    `ex_job` varchar(50)    COMMENT '上家职位',  
    `ex_salary` bigint(20)    COMMENT '上家薪资',  
    `work_experience` varchar(2)    COMMENT '工作经验',  
    `is_bat` varchar(1)    COMMENT 'BAT从业经验',  
    `is_bigdata` varchar(1)    COMMENT '大数据高并发经验',  
    `work_industry` varchar(2)    COMMENT '所属行业',  
    `work_finance_round` varchar(2)    COMMENT '融资规模',  
    `work_group_scale` varchar(2)    COMMENT '团队规模',  
    `work_profit_status` varchar(2)    COMMENT '盈利情况',  
    `work_user_numbers` varchar(2)    COMMENT '用户量',  
    `work_job_type` varchar(2)    COMMENT '架构',  
    `work_intensity` varchar(2)    COMMENT '工作强度',  
    `province` varchar(6)    COMMENT '省编码',  
    `city` varchar(6)    COMMENT '市编码',  
    `county` varchar(6)    COMMENT '县编码',  
    `work_salary` varchar(2)    COMMENT '期望薪资',  
    `work_status` varchar(2)    COMMENT '工作状态',  
    `work_leader_background` text    COMMENT 'leader背景',  
    `work_tips` text    COMMENT '备注',  
    `comment_study_ability` varchar(2)    COMMENT '学习能力',  
    `comment_skill_type` varchar(2)    COMMENT '技术水平',  
    `comment_work_stable` varchar(2)    COMMENT '工作稳定',  
    `comment_resume_reliability` varchar(2)    COMMENT '简历是否真实',  
    `comment_talent_tabs` varchar(50)    COMMENT '人才标签',  
    `comment_tips` text    COMMENT '备注',  
    `resume` varchar(100)    COMMENT '个人简历',  
    `avatar` varchar(100)    COMMENT '个人头像',  
    `create_by` bigint(20)    COMMENT '创建人ID',  
    `update_by` bigint(20)    COMMENT '更新人ID',  
    `create_at` bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `talent_profession`
-- ----------------------------
-- DROP TABLE IF EXISTS `talent_profession`;
CREATE TABLE `talent_profession` (
    `id` Bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增ID',  
    `talent_id` Bigint(20)    COMMENT '推荐ID',  
    `profession_id` Bigint(20)    COMMENT '公司ID',  
    `create_by` Bigint(20)    COMMENT '创建人',  
    `update_by` Bigint(20)    COMMENT '更新人',  
    `create_at` Bigint(20) NOT NULL   COMMENT '创建时间',  
    `update_at` Bigint(20) NOT NULL   COMMENT '更新时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `company`
-- ----------------------------
-- DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(100) NOT NULL   COMMENT '公司名称',  
    `province` varchar(100) NOT NULL   COMMENT '省编码',  
    `city` varchar(100) NOT NULL   COMMENT '市编码',  
    `county` varchar(100) NOT NULL   COMMENT '县编码',  
    `financing` bigint(20) NOT NULL   COMMENT '融资规模',  
    `approved` bigint(20) NOT NULL   COMMENT '认证状态',  
    `freezed` bigint(20) NOT NULL   COMMENT '冻结状态',  
    `logo` varchar(100) NOT NULL   COMMENT '公司logo',  
    `slogan` varchar(100) NOT NULL   COMMENT '公司标语',  
    `total_num` bigint(20) NOT NULL   COMMENT '公司规模',  
    `summary` varchar(255) NOT NULL   COMMENT '公司介绍',  
    `phone` varchar(100) NULL   COMMENT '手机',  
    `address` varchar(100) NULL   COMMENT '详细地址',  
    `map` varchar(100) NULL   COMMENT '地图',  
    `mail` varchar(100) NULL   COMMENT '邮箱',
    `product` varchar(100) NULL   COMMENT '产品名称',
    `profession_update_at` bigint(20) NULL   COMMENT '职位更新时间',
    `profession_num` bigint(20) NULL   COMMENT '职位名称总数',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `company_industry`
-- ----------------------------
-- DROP TABLE IF EXISTS `company_industry`;
CREATE TABLE `company_industry` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `company_id` bigint(20) NOT NULL   COMMENT '公司ID',  
    `industry` bigint(20) NOT NULL   COMMENT '公司行业',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `company_tags`
-- ----------------------------
-- DROP TABLE IF EXISTS `company_tags`;
CREATE TABLE `company_tags` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `company_id` bigint(20) NOT NULL   COMMENT '公司ID',  
    `tag` varchar(20) NOT NULL   COMMENT '公司标签',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `product`
-- ----------------------------
-- DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `company_id` bigint(20) NOT NULL   COMMENT '公司ID',  
    `name` varchar(20)    COMMENT '产品名称',  
    `slogan` varchar(100)    COMMENT '产品标语',  
    `logo` varchar(100)    COMMENT '产品LOGO',  
    `summary` varchar(255)    COMMENT '产品介绍',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `profession`
-- ----------------------------
-- DROP TABLE IF EXISTS `profession`;
CREATE TABLE `profession` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `company_id` bigint(20) NOT NULL   COMMENT '公司ID',
    `company_name` varchar(100) NOT NULL   COMMENT '公司名称',
    `name` varchar(100) NOT NULL   COMMENT '职位名称',  
    `province` varchar(100) NOT NULL   COMMENT '省编码',  
    `city` varchar(100) NOT NULL   COMMENT '市编码',  
    `county` varchar(100) NOT NULL   COMMENT '县编码',  
    `category` bigint(20) NOT NULL   COMMENT '职业类别',  
    `sub_category` bigint(20) NOT NULL   COMMENT '职业子类',  
    `education` bigint(20) NOT NULL   COMMENT '学历要求',  
    `experience` bigint(20) NOT NULL   COMMENT '工作经验',  
    `recommend` bigint(20) NOT NULL   COMMENT '推荐类型',  
    `compensation` bigint(20) NOT NULL   COMMENT '薪资',  
    `responsibility` varchar(100) NOT NULL   COMMENT '岗位职责',  
    `requisite` varchar(100) NOT NULL   COMMENT '必要条件',  
    `boon` varchar(1000) NOT NULL   COMMENT '公司福利',  
    `status` bigint(20) NOT NULL   COMMENT '上架状态',
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `profession_tags`
-- ----------------------------
-- DROP TABLE IF EXISTS `profession_tags`;
CREATE TABLE `profession_tags` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',
    `company_id` bigint(20) NOT NULL   COMMENT '公司ID', 
    `profession_id` bigint(20) NOT NULL   COMMENT '职位ID',  
    `tag` varchar(20) NOT NULL   COMMENT '公司标签',  
    `create_by` bigint(20) NOT NULL   COMMENT '创建人ID',  
    `update_by` bigint(20) NOT NULL   COMMENT '更新人ID',  
    `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',  
    `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `article`
-- ----------------------------
-- DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT 'id',  
  `type` int(11) DEFAULT NULL   COMMENT '类型',   
  `img` varchar(255) NOT NULL   COMMENT '封面',    
  `title` text NOT NULL   COMMENT '标题',
  `orderBy` int(11) DEFAULT NULL   COMMENT '顺序',
  `author` varchar(50) DEFAULT NULL   COMMENT '作者',
  `source` varchar(100) DEFAULT NULL   COMMENT '来源', 
  `url` varchar(1000) DEFAULT NULL   COMMENT '链接',
  `content` text   COMMENT '内容', 
  `summary` text   COMMENT '摘要',
  `create_by` bigint(20) DEFAULT NULL   COMMENT '创建人ID', 
  `update_by` bigint(20) DEFAULT NULL   COMMENT '更新人ID',
  `publish_at` bigint(20) DEFAULT NULL   COMMENT '发布时间',
  `update_at` bigint(20) NOT NULL   COMMENT '数据更新时间',
  `create_at` bigint(20) NOT NULL   COMMENT '数据创建时间',
  `status` bigint(20) NOT NULL   COMMENT '是否上线',
  `industry` bigint(20) NOT NULL   COMMENT '行业编号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8;





