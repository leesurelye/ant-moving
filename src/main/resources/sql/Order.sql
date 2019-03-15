-- auto Generated on 2019-03-15 14:32:02 
-- DROP TABLE IF EXISTS `order`; 
CREATE TABLE `order`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `user_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'userId',
    `service_id` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'serviceId',
    `address` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'address',
    `destination` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'destination',
    `create_time` DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT 'createTime',
    `total_pay` INT (11) NOT NULL DEFAULT -1 COMMENT 'totalPay',
    `is_deleted` TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'isDeleted',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`order`';
