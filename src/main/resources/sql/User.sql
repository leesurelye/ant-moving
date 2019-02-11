-- auto Generated on 2019-02-11 23:35:09 
-- DROP TABLE IF EXISTS `user`; 
CREATE TABLE `user`(
    `id` BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `name` VARCHAR (50) NOT NULL COMMENT 'name',
    `password` VARCHAR (50) NOT NULL COMMENT 'password',
    `phone` VARCHAR (50) UNIQUE NOT NULL COMMENT 'phone',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '`user`';
