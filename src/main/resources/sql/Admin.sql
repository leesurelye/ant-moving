-- auto Generated on 2019-03-14 18:02:57 
-- DROP TABLE IF EXISTS `admin`; 
CREATE TABLE `admin`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `shop_id` BIGINT (15) NOT NULL DEFAULT -1 COMMENT 'shopId',
    `account` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'account',
    `password` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'password',
    `level` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'level',
    `email` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'email',
    `phone` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'phone',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`admin`';
