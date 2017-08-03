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





