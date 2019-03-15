 -- auto Generated on 2019-03-15 14:27:18 
-- DROP TABLE IF EXISTS `t_evaluate`; 
CREATE TABLE `t_evaluate`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `order_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'orderId',
    `info` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'info',
    `create_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    `rate` INT (11) NOT NULL DEFAULT -1 COMMENT 'rate',
    `is_delete` TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'isDelete',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`t_evaluate`';
