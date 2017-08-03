-- ----------------------------
-- Table structure for `company`
-- ----------------------------
-- DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `name` varchar(20) NOT NULL   COMMENT '公司名字',  
    `logo` varchar(255) NOT NULL   COMMENT '公司图标',  
    `sign` varchar(50) NOT NULL   COMMENT '公司签名',  
    `number` int(10) NOT NULL   COMMENT '公司人数',  
    `email` varchar(20)    COMMENT '公司信箱',  
    `phone` bigint(11)    COMMENT '公司电话',  
    `address` varchar(200)    COMMENT '公司地址',  
    `tag_id` varchar(100)    COMMENT '职位标签',  
    `map` varchar(255)    COMMENT '公司地图',  
    `introduce` varchar(1000) NOT NULL   COMMENT '公司介绍',  
    `financing` int(2) NOT NULL   COMMENT '融资规模',  
    `city` varchar(20) NOT NULL   COMMENT '市编码',  
    `county` varchar(20) NOT NULL   COMMENT '县编码',  
    `approved` int(2) NOT NULL   COMMENT '认证状态',  
    `jobs` int(3)    COMMENT '在招职位数',  
    `industry` int(2) NOT NULL   COMMENT '行业类型',  
    `freezed` int(2) NOT NULL   COMMENT '冻结状态',  
    `released_at` bigint(20)    COMMENT '发布时间',  
    `create_at` bigint(20)    COMMENT '创建时间',  
    `create_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `profession`
-- ----------------------------
-- DROP TABLE IF EXISTS `profession`;
CREATE TABLE `profession` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `c_id` bigint(20) NOT NULL   COMMENT '公司id',  
    `name` varchar(20) NOT NULL   COMMENT '职位名称',  
    `workexp` int(2) NOT NULL   COMMENT '工作经验',  
    `catgory` int(1) NOT NULL   COMMENT '职位类别',  
    `education` int(2) NOT NULL   COMMENT '学历',  
    `salary` int(2) NOT NULL   COMMENT '薪资',  
    `status` int(2) NOT NULL   COMMENT '状态-1下架 1上架',  
    `duty` varchar(500) NOT NULL   COMMENT '职责',  
    `skill` varchar(500) NOT NULL   COMMENT '所需技能',  
    `welfare` varchar(500) NOT NULL   COMMENT '公司福利',  
    `city` varchar(20) NOT NULL   COMMENT '市编码',  
    `county` varchar(20) NOT NULL   COMMENT '县编码',  
    `industry` int(2)    COMMENT '行业',  
    `tag_id` varchar(100)    COMMENT '职位标签',  
    `recommend` int(2) NOT NULL   COMMENT '是否推荐',  
    `released_at` bigint(20)    COMMENT '发布时间',  
    `create_by` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `create_at` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `producter`
-- ----------------------------
-- DROP TABLE IF EXISTS `producter`;
CREATE TABLE `producter` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `c_id` bigint(20) NOT NULL   COMMENT '公司名称',  
    `name` varchar(200) NOT NULL   COMMENT '产品名称',  
    `sign` varchar(200)    COMMENT '产品宣言',  
    `logo` varchar(200)    COMMENT '产品logo',  
    `introduce` varchar(500)    COMMENT '产品介绍',  
    `create_by` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `create_at` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `companyLabel`
-- ----------------------------
-- DROP TABLE IF EXISTS `companyLabel`;
CREATE TABLE `companyLabel` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '标签id',  
    `c_id` bigint(20) NOT NULL   COMMENT '公司id',  
    `content` varchar(10) NOT NULL   COMMENT '标签内容',  
    `create_by` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `create_at` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `article`
-- ----------------------------
-- DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `title` varchar(200) NOT NULL   COMMENT '',  
    `url` varchar(100) NOT NULL   COMMENT '',  
    `image` varchar(100)    COMMENT '',  
    `type` int(1) NOT NULL   COMMENT '',  
    `statu` int(1)    COMMENT '',  
    `industry` int(2)    COMMENT '',  
    `index_id` bigint(20) NOT NULL   COMMENT '',  
    `create_by` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `create_at` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;




-- ----------------------------
-- Table structure for `professionLabel`
-- ----------------------------
-- DROP TABLE IF EXISTS `professionLabel`;
CREATE TABLE `professionLabel` (
    `id` bigint(20) NOT NULL   AUTO_INCREMENT  COMMENT '自增长ID',  
    `p_id` bigint(20) NOT NULL   COMMENT '',  
    `content` varchar(10)    COMMENT '',  
    `create_by` bigint(20)    COMMENT '',  
    `update_by` bigint(20)    COMMENT '',  
    `update_at` bigint(20)    COMMENT '',  
    `create_at` bigint(20)    COMMENT '',  
    PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;





