CREATE DATABASE IF NOT EXISTS `db2020` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci ;

USE `db2020`;

DROP TABLE IF EXISTS `payment`;

CREATE TABLE `payment` (
                           `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
                           `serial` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;