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





