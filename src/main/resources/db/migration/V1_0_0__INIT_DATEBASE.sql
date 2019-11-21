SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for flyway_schema_history
-- ----------------------------
DROP TABLE IF EXISTS `flyway_schema_history`;
CREATE TABLE `flyway_schema_history` (
  `installed_rank` int(11) NOT NULL,
  `version` varchar(50) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `type` varchar(20) NOT NULL,
  `script` varchar(1000) NOT NULL,
  `checksum` int(11) DEFAULT NULL,
  `installed_by` varchar(100) NOT NULL,
  `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int(11) NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`),
  KEY `flyway_schema_history_s_idx` (`success`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` BIGINT(20) NOT NULL,
  `open_id` VARCHAR(225) NOT NULL,
  `weixin_name` VARCHAR(45) NULL DEFAULT NULL,
  `sex` BIGINT(4) NULL DEFAULT 0 COMMENT '性别 1-- 男  0--女',
  `city` VARCHAR(45) NULL DEFAULT NULL COMMENT '城市',
  `province` VARCHAR(45) NULL DEFAULT NULL COMMENT '省会',
  `status` BIGINT(4) NULL DEFAULT 0 COMMENT '状态 0--关注 1--取消关注',
  `create_time` DATETIME NULL DEFAULT NULL COMMENT '关注时间',
  `jifeng` INT NULL DEFAULT 0 COMMENT '积分',
  `birthday` DATETIME NULL DEFAULT NULL COMMENT '生日',
  `phone` VARCHAR(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
COMMENT = '关注微信用户表';