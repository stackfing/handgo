-- MySQL dump 10.13  Distrib 5.7.18, for Linux (x86_64)
--
-- Host: localhost    Database: handgo
-- ------------------------------------------------------
-- Server version	5.7.18-1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT,
  `now_price` float NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_photo` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `sold` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `product_type_type_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`pid`),
  KEY `FK74i1cg9mw0lw6bfnem4apsxpq` (`product_type_type_id`),
  CONSTRAINT `FK74i1cg9mw0lw6bfnem4apsxpq` FOREIGN KEY (`product_type_type_id`) REFERENCES `product_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_description`
--

DROP TABLE IF EXISTS `product_description`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_description` (
  `productId` bigint(20) DEFAULT NULL,
  `description` text,
  KEY `product_description_product_pid_fk` (`productId`),
  CONSTRAINT `product_description_product_pid_fk` FOREIGN KEY (`productId`) REFERENCES `product` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_description`
--

LOCK TABLES `product_description` WRITE;
/*!40000 ALTER TABLE `product_description` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_description` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_photo`
--

DROP TABLE IF EXISTS `product_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_photo` (
  `productUrl` varchar(255) DEFAULT NULL,
  `productId` bigint(20) DEFAULT NULL,
  KEY `product_photo_product_pid_fk` (`productId`),
  CONSTRAINT `product_photo_product_pid_fk` FOREIGN KEY (`productId`) REFERENCES `product` (`pid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_photo`
--

LOCK TABLES `product_photo` WRITE;
/*!40000 ALTER TABLE `product_photo` DISABLE KEYS */;
/*!40000 ALTER TABLE `product_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_type`
--

DROP TABLE IF EXISTS `product_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product_type` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `pId` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `parent` bigint(20) DEFAULT NULL,
  `myparent` bigint(20) DEFAULT NULL,
  `isRoot` tinyint(1) DEFAULT '0',
  PRIMARY KEY (`id`),
  KEY `parent` (`parent`),
  CONSTRAINT `parent` FOREIGN KEY (`parent`) REFERENCES `product_type` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_type`
--

LOCK TABLES `product_type` WRITE;
/*!40000 ALTER TABLE `product_type` DISABLE KEYS */;
INSERT INTO `product_type` VALUES (1,2,'服装',NULL,NULL,0),(2,2,'科技数码',NULL,NULL,0),(3,2,'生活用品',NULL,NULL,0),(4,2,'男装',1,NULL,0),(5,2,'女装',1,NULL,0),(6,2,'手机',2,NULL,0),(7,2,'电脑',2,NULL,0),(8,2,'吹风机',3,NULL,0),(10,2,'sdfjsfjsodjfsi',1,NULL,0);
/*!40000 ALTER TABLE `product_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `provider`
--

DROP TABLE IF EXISTS `provider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `provider` (
  `pid` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `permission` int(11) NOT NULL DEFAULT '1',
  `status` int(11) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `provider`
--

LOCK TABLES `provider` WRITE;
/*!40000 ALTER TABLE `provider` DISABLE KEYS */;
/*!40000 ALTER TABLE `provider` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `site_setting`
--

DROP TABLE IF EXISTS `site_setting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `site_setting` (
  `siteName` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `site_setting`
--

LOCK TABLES `site_setting` WRITE;
/*!40000 ALTER TABLE `site_setting` DISABLE KEYS */;
INSERT INTO `site_setting` VALUES ('电子商城');
/*!40000 ALTER TABLE `site_setting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `uid` bigint(20) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) NOT NULL,
  `createDate` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `headPhoto` varchar(255) DEFAULT NULL,
  `lastLogin` date DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `permission` int(11) NOT NULL,
  `phoneNumber` varchar(255) NOT NULL,
  `status` int(11) NOT NULL,
  `isDeleted` int(11) DEFAULT '0',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=10017 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'1222','2017-12-21','213@22','1','2017-12-21','213',3123,'321',1,0),(2,'2','2017-12-22','213@22','1','2017-12-21','321',132,'321',1,0),(3,'1233','2017-12-21','123@qq','321','2017-12-21','21',321,'321',1,0),(4,'12','2017-12-21','213@22','231','2017-12-21','21',321321,'321',1,1),(10002,'123','2018-01-10','123@12','12','2018-01-10','123',123,'123',1,0),(10003,'34','2017-12-21','1@2','1','2018-01-10','2',132,'1',1,0),(10004,'123','2018-01-10','123','1','2018-01-10','123',123,'123',1,0),(10005,'account','2018-01-10','123','1','2018-01-10','password',123,'123',1,0),(10006,'213','2018-01-10','213','123','2018-01-10','123',123,'123',1,0),(10007,'123','2018-01-04','312','121','2018-01-25','123',123,'231',1,0),(10008,'1','2018-01-11','5','1','2018-01-11','3',6,'4',1,0),(10009,'1','2018-01-11','5','1','2018-01-11','3',6,'4',1,0),(10010,'1','2018-01-11','5','1','2018-01-11','3',6,'4',1,0),(10011,'12222222222','2018-01-11','22222','111111','2018-01-11','2',2,'3',1,0),(10012,'2','2018-01-11','5','1','2018-01-11','3',6,'4',1,0),(10013,'1','2018-01-11','1','1','2018-01-11','1',1,'1',1,0),(10014,'acount','2018-01-11','1','1','2018-01-11','acount',1,'1',1,0),(10015,'1','2018-01-11','5','1','2018-01-11','3',6,'4',1,0),(10016,'123','1111-11-11','123','1','1111-11-12','123',123,'123',1,0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_locate`
--

DROP TABLE IF EXISTS `user_locate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_locate` (
  `locate_id` int(11) NOT NULL AUTO_INCREMENT,
  `is_primary` int(11) NOT NULL,
  `locate` varchar(255) NOT NULL,
  `user_uid` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`locate_id`),
  KEY `FKi6ud3025b9563jxu3yu7tl2nu` (`user_uid`),
  CONSTRAINT `FKi6ud3025b9563jxu3yu7tl2nu` FOREIGN KEY (`user_uid`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_locate`
--

LOCK TABLES `user_locate` WRITE;
/*!40000 ALTER TABLE `user_locate` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_locate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-11 13:04:31
