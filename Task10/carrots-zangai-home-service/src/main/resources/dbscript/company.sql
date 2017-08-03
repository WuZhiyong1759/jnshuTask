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





