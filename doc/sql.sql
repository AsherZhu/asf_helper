CREATE TABLE `user_tab` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_ip` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_ip` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `valid_flag` int(11) DEFAULT NULL,
  `bot_tab_id` bigint(20) default null,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `bot_tab` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `create_ip` varchar(255) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_ip` varchar(255) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `farm_offline` bit(1) DEFAULT NULL,
  `steam_login` varchar(255) DEFAULT NULL,
  `steam_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;