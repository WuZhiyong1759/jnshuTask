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





