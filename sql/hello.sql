/*
Navicat MySQL Data Transfer

Source Server         : 10.13.1.79
Source Server Version : 50723
Source Host           : 10.13.1.79:3306
Source Database       : hello

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2023-02-24 14:28:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for access_log
-- ----------------------------
DROP TABLE IF EXISTS `access_log`;
CREATE TABLE `access_log` (
  `id` bigint(20) NOT NULL,
  `source_ip` varchar(50) DEFAULT NULL,
  `access_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of access_log
-- ----------------------------
INSERT INTO `access_log` VALUES ('1623954358119354370', '127.0.0.1', '2023-02-10 15:57:45');
INSERT INTO `access_log` VALUES ('1623977715675631617', '127.0.0.1', '2023-02-10 17:30:34');
INSERT INTO `access_log` VALUES ('1624971383882416129', '127.0.0.1', '2023-02-13 11:19:03');
INSERT INTO `access_log` VALUES ('1624971391499272194', '127.0.0.1', '2023-02-13 11:19:05');
INSERT INTO `access_log` VALUES ('1624971398134661121', '127.0.0.1', '2023-02-13 11:19:06');
INSERT INTO `access_log` VALUES ('1624971403612422145', '127.0.0.1', '2023-02-13 11:19:08');
INSERT INTO `access_log` VALUES ('1625022548133605377', '127.0.0.1', '2023-02-13 14:42:22');
INSERT INTO `access_log` VALUES ('1625425673663123458', '127.0.0.1', '2023-02-14 17:24:14');
INSERT INTO `access_log` VALUES ('1625425674720088065', '127.0.0.1', '2023-02-14 17:24:14');
INSERT INTO `access_log` VALUES ('1625690709279178753', '127.0.0.1', '2023-02-15 10:57:24');
INSERT INTO `access_log` VALUES ('1627608093208580098', '127.0.0.1', '2023-02-20 17:56:24');
INSERT INTO `access_log` VALUES ('1627647700365099010', '127.0.0.1', '2023-02-20 20:33:47');
INSERT INTO `access_log` VALUES ('1627656451231035393', '127.0.0.1', '2023-02-20 21:08:33');
INSERT INTO `access_log` VALUES ('1627656579056644097', '127.0.0.1', '2023-02-20 21:09:04');
INSERT INTO `access_log` VALUES ('1628018346765049857', '127.0.0.1', '2023-02-21 21:06:36');
INSERT INTO `access_log` VALUES ('1628018816288014338', '127.0.0.1', '2023-02-21 21:08:28');
INSERT INTO `access_log` VALUES ('1628618920548089857', '127.0.0.1', '2023-02-23 12:53:04');
INSERT INTO `access_log` VALUES ('1628644138196910082', '127.0.0.1', '2023-02-23 14:33:16');
INSERT INTO `access_log` VALUES ('1628700366482817025', '127.0.0.1', '2023-02-23 18:16:42');
