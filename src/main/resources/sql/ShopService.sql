-- auto Generated on 2019-03-15 14:53:48 
-- DROP TABLE IF EXISTS `shop_service`; 
CREATE TABLE `shop_service`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `shop_id` INT (11) NOT NULL DEFAULT -1 COMMENT 'shopId',
    `title` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'title',
    `desc` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'desc',
    `rate` INT (11) NOT NULL DEFAULT -1 COMMENT 'rate',
    `price` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'price',
    `is_delete` TINYINT (3) NOT NULL DEFAULT 0 COMMENT 'isDelete',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`shop_service`';
