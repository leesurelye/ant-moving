-- auto Generated on 2019-03-15 14:59:56 
-- DROP TABLE IF EXISTS `shop_detail`; 
CREATE TABLE `shop_detail`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `title` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'title',
    `desc` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'desc',
    `rate` INT (11) NOT NULL DEFAULT -1 COMMENT 'rate',
    `is_excellent` TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'isExcellent',
    `phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'phone',
    `address` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'address',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`shop_detail`';
-- auto Generated on 2019-03-22 09:24:56 
-- DROP TABLE IF EXISTS `shop_detail`; 
CREATE TABLE `shop_detail`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `title` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'title',
    `desc` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'desc',
    `rate` INT (11) NOT NULL DEFAULT -1 COMMENT 'rate',
    `is_excellent` TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'isExcellent',
    `phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'phone',
    `address` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'address',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`shop_detail`';
