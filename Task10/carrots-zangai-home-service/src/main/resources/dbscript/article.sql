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





