/*
 Navicat Premium Data Transfer

 Source Server         : szx
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : upc_demo

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 21/04/2022 22:50:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `adminId` int(11) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `adminPassword` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`adminId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for blogcom
-- ----------------------------
DROP TABLE IF EXISTS `blogcom`;
CREATE TABLE `blogcom`  (
  `blogComId` int(255) NOT NULL AUTO_INCREMENT,
  `blogPublisherUserId` int(11) NULL DEFAULT NULL,
  `blogId` int(11) NULL DEFAULT NULL,
  `blogComUserId` int(11) NULL DEFAULT NULL,
  `blogComUserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogComInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogComDate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`blogComId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogcom
-- ----------------------------
INSERT INTO `blogcom` VALUES (16, NULL, NULL, 19, '11', '啊啊啊啊啊', '2021-08-30 08:55:51');
INSERT INTO `blogcom` VALUES (17, NULL, 19, 19, '11', '啊啊啊啊啊啊啊啊啊啊啊啊啊啊', '2021-08-30 09:00:19');
INSERT INTO `blogcom` VALUES (18, NULL, 18, 19, '11', '顶顶顶顶顶', '2021-08-30 09:00:49');

-- ----------------------------
-- Table structure for blogmsg
-- ----------------------------
DROP TABLE IF EXISTS `blogmsg`;
CREATE TABLE `blogmsg`  (
  `blogId` int(11) NOT NULL AUTO_INCREMENT,
  `blogPublisherId` int(11) NULL DEFAULT NULL,
  `blogPublisherName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogPublisherPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogDate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogTitle` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `blogImg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`blogId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of blogmsg
-- ----------------------------
INSERT INTO `blogmsg` VALUES (18, 19, '11', '12345678', '2021-08-30 08:45:25', '111222', 'dsfwef', '1630284325095.jfif');
INSERT INTO `blogmsg` VALUES (19, 19, '11', '12345678', '2021-08-30 09:00:05', 'ddddd', '呃呃呃呃呃呃呃呃呃呃呃呃呃呃呃', '1630285205471.jpg');
INSERT INTO `blogmsg` VALUES (20, 20, '1', '1', '2022-03-25 20:12:24', '111', '111', '1648210344845.jpg');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `deptno` int(4) NOT NULL,
  `dname` varchar(14) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `loc` varchar(13) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`deptno`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO `dept` VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO `dept` VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO `dept` VALUES (40, 'OPERATIONS', 'BOSTON');

-- ----------------------------
-- Table structure for emp
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp`  (
  `empno` int(4) NOT NULL,
  `ename` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `job` varchar(9) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `mgr` int(4) NULL DEFAULT NULL,
  `hiredate` date NULL DEFAULT NULL,
  `sal` decimal(7, 0) NULL DEFAULT NULL,
  `comm` decimal(7, 2) NULL DEFAULT NULL,
  `deptno` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`empno`) USING BTREE,
  UNIQUE INDEX `uk_ename`(`ename`) USING BTREE,
  INDEX `fk_deptno`(`deptno`) USING BTREE,
  CONSTRAINT `fk_deptno` FOREIGN KEY (`deptno`) REFERENCES `dept` (`deptno`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES (1000, '张三', '测试', 7788, NULL, 1, NULL, 40);
INSERT INTO `emp` VALUES (7369, 'SMITH', 'CLERK', 7902, '1980-12-17', 800, NULL, 20);
INSERT INTO `emp` VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300.00, 30);
INSERT INTO `emp` VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500.00, 30);
INSERT INTO `emp` VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20);
INSERT INTO `emp` VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400.00, 30);
INSERT INTO `emp` VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30);
INSERT INTO `emp` VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10);
INSERT INTO `emp` VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-04-19', 3000, NULL, 20);
INSERT INTO `emp` VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10);
INSERT INTO `emp` VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0.00, 30);
INSERT INTO `emp` VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-05-23', 1100, NULL, 20);
INSERT INTO `emp` VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30);
INSERT INTO `emp` VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20);
INSERT INTO `emp` VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);

-- ----------------------------
-- Table structure for housecom
-- ----------------------------
DROP TABLE IF EXISTS `housecom`;
CREATE TABLE `housecom`  (
  `houseComId` int(255) NOT NULL AUTO_INCREMENT,
  `housePublisherUserId` int(255) NULL DEFAULT NULL,
  `houseId` int(255) NULL DEFAULT NULL,
  `houseComUserId` int(255) NULL DEFAULT NULL,
  `houseComUserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseComInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseComDate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseComGrade` double(255, 2) NULL DEFAULT NULL,
  `orderId` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`houseComId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for housemsg
-- ----------------------------
DROP TABLE IF EXISTS `housemsg`;
CREATE TABLE `housemsg`  (
  `houseId` int(11) NOT NULL AUTO_INCREMENT,
  `houseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseAdr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseImg` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseSellerId` int(11) NULL DEFAULT NULL,
  `houseSellerName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseSellerPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `housePrice` decimal(10, 2) NULL DEFAULT NULL,
  `houseGuest` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `houseStatus` int(255) NULL DEFAULT 0,
  `housePbTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`houseId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of housemsg
-- ----------------------------
INSERT INTO `housemsg` VALUES (33, '雅加达', 'aaaaaaaaaaaaaaaaa', '漳州市鑫荣小区', '1630285701821.jpg', 19, '11', '12345678', 150.00, '1', 1, '2021-08-30 09:08:21');

-- ----------------------------
-- Table structure for imgs_info
-- ----------------------------
DROP TABLE IF EXISTS `imgs_info`;
CREATE TABLE `imgs_info`  (
  `imgName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `imgPath` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of imgs_info
-- ----------------------------
INSERT INTO `imgs_info` VALUES ('bg1.jpg', 'imags/1629815351024.jpg');
INSERT INTO `imgs_info` VALUES ('1321343240978.jpg', 'imags/1629815699243.jpg');
INSERT INTO `imgs_info` VALUES ('bg3.jpg', 'imags/1629817449854.jpg');
INSERT INTO `imgs_info` VALUES ('enter1.jpg', 'imags/1629881613354.jpg');
INSERT INTO `imgs_info` VALUES ('bg3.jpg', 'imags/1629881868101.jpg');
INSERT INTO `imgs_info` VALUES ('bg.jpg', 'imags/1629882494068.jpg');
INSERT INTO `imgs_info` VALUES ('logo.jpg', 'imags/1629883886391.jpg');
INSERT INTO `imgs_info` VALUES ('logo.jpg', 'imags/1629884120656.jpg');
INSERT INTO `imgs_info` VALUES ('logo.jpg', 'imags/1629884176681.jpg');
INSERT INTO `imgs_info` VALUES ('login1.jpeg', 'imags/1629884346195.jpeg');

-- ----------------------------
-- Table structure for ordermsg
-- ----------------------------
DROP TABLE IF EXISTS `ordermsg`;
CREATE TABLE `ordermsg`  (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `houseId` int(255) NULL DEFAULT NULL,
  `orderUserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderUserPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderHouseName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderHouseAdr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderHouseSellerName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderSellerPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderPrice` decimal(10, 2) NULL DEFAULT NULL,
  `orderTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderStartTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderFinishTime` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderStatus` int(255) NULL DEFAULT 0,
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for salgrade
-- ----------------------------
DROP TABLE IF EXISTS `salgrade`;
CREATE TABLE `salgrade`  (
  `grade` int(1) NULL DEFAULT NULL,
  `losal` decimal(7, 2) NULL DEFAULT NULL,
  `hisal` decimal(7, 2) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of salgrade
-- ----------------------------
INSERT INTO `salgrade` VALUES (1, 700.00, 1200.00);
INSERT INTO `salgrade` VALUES (2, 1201.00, 1400.00);
INSERT INTO `salgrade` VALUES (3, 1401.00, 2000.00);
INSERT INTO `salgrade` VALUES (4, 2001.00, 3000.00);
INSERT INTO `salgrade` VALUES (5, 3001.00, 9999.00);
INSERT INTO `salgrade` VALUES (6, 10000.00, 20000.00);
INSERT INTO `salgrade` VALUES (6, 10000.00, 20000.00);

-- ----------------------------
-- Table structure for tbl_stu
-- ----------------------------
DROP TABLE IF EXISTS `tbl_stu`;
CREATE TABLE `tbl_stu`  (
  `stuId` int(11) NOT NULL AUTO_INCREMENT,
  `stuName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stuPwd` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `stuTel` char(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `stuStatus` int(11) NULL DEFAULT 1,
  PRIMARY KEY (`stuId`) USING BTREE,
  UNIQUE INDEX `stuTel`(`stuTel`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `count` int(16) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('66666666', '甄姬', '15829059038', '123456', 0);
INSERT INTO `user` VALUES ('77777777', '孙悟空', '129384有478', '123456', 0);
INSERT INTO `user` VALUES ('88888888', '王昭君', '15829059039', '123456', 10);
INSERT INTO `user` VALUES ('99999999', '刘备', '15829059040', '123456', 0);

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPwd` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userRealName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userSex` int(11) NULL DEFAULT NULL,
  `userEmail` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userStatus` int(11) NULL DEFAULT 1,
  PRIMARY KEY (`userId`) USING BTREE,
  UNIQUE INDEX `userName`(`userName`) USING BTREE,
  UNIQUE INDEX `userEmail`(`userEmail`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for usercomplaint
-- ----------------------------
DROP TABLE IF EXISTS `usercomplaint`;
CREATE TABLE `usercomplaint`  (
  `usercomplaintId` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userRespondentName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userRespondentPhoneNumber` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userComplaintInfo` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userComplaintDate` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`usercomplaintId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for usermsg
-- ----------------------------
DROP TABLE IF EXISTS `usermsg`;
CREATE TABLE `usermsg`  (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userIdcard` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPhoneNumber` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userPwd` char(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userAdr` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `userWallet` double(255, 2) NULL DEFAULT 0.00,
  `userQuestion` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userAnswer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userStatus` int(255) NULL DEFAULT 0,
  PRIMARY KEY (`userId`, `userPhoneNumber`) USING BTREE,
  UNIQUE INDEX `userName`(`userName`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of usermsg
-- ----------------------------
INSERT INTO `usermsg` VALUES (19, '11', '12345678', '12345678', '6512bd43d9caa6e02c990b0a82652dca', '漳州市芗城区电子城', 0.00, '你大学就读于哪里？', 'upc', 1);
INSERT INTO `usermsg` VALUES (20, '1', '1', '1', 'c4ca4238a0b923820dcc509a6f75849b', '1', 0.00, '你的妈妈叫什么？', '11', 0);

SET FOREIGN_KEY_CHECKS = 1;
