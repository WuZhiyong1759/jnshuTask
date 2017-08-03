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





