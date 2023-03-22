/*
Navicat MySQL Data Transfer

Source Server         : 10.13.1.79
Source Server Version : 50723
Source Host           : 10.13.1.79:3306
Source Database       : lottery

Target Server Type    : MYSQL
Target Server Version : 50723
File Encoding         : 65001

Date: 2023-02-24 14:29:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bet_order
-- ----------------------------
DROP TABLE IF EXISTS `bet_order`;
CREATE TABLE `bet_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `bet_num` varchar(100) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `bet_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bet_order
-- ----------------------------
INSERT INTO `bet_order` VALUES ('1', '3|7|3', '2', '2023-02-21 21:06:33');
INSERT INTO `bet_order` VALUES ('2', '3|7|3', '2', '2023-02-21 21:08:27');
INSERT INTO `bet_order` VALUES ('3', '3|7|3', '2', '2023-02-23 12:53:02');
INSERT INTO `bet_order` VALUES ('4', '3|7|3', '2', '2023-02-23 14:33:13');
INSERT INTO `bet_order` VALUES ('5', '3|7|3', '2', '2023-02-24 10:27:13');
INSERT INTO `bet_order` VALUES ('6', '3|7|3', '2', '2023-02-24 10:27:17');
INSERT INTO `bet_order` VALUES ('7', '3|7|3', '2', '2023-02-24 10:30:09');
