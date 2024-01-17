-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: english_quiz
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `easy`
--

DROP TABLE IF EXISTS `easy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `easy` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  `A` varchar(255) DEFAULT NULL,
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `key` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `easy`
--

LOCK TABLES `easy` WRITE;
/*!40000 ALTER TABLE `easy` DISABLE KEYS */;
INSERT INTO `easy` VALUES (1,'I came _____ America.','at','from','to','from'),(2,'I ___ cold.','am','had','is','am'),(3,'________ car is very old fashioned.','Fatima\'s','Fatima is','Fatimas\'','Fatima\'s'),(4,' Nowadays everyone ______ internet.','had used','uses','used','uses'),(5,'Which book is ______?','yours','your is','your\'s','your\'s'),(6,'This girl is____ beautiful than her.','most','more','very','more'),(7,'He is interested____ learning.','from','in','on','in'),(8,'Where_____ John and Marry yesterday?','had been','was','were','were'),(9,'My birthday is_____ 18 June.','on','in','at','on'),(10,'There_____ many people in the office.','am','is','are','are');
/*!40000 ALTER TABLE `easy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hard`
--

DROP TABLE IF EXISTS `hard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hard` (
  `id` int NOT NULL AUTO_INCREMENT,
  `question` varchar(255) NOT NULL,
  `A` varchar(255) DEFAULT NULL,
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `key` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hard`
--

LOCK TABLES `hard` WRITE;
/*!40000 ALTER TABLE `hard` DISABLE KEYS */;
INSERT INTO `hard` VALUES (1,'If success _____, we need to prepare ourselves for every possible scenario.','is to be achieved','is achieved','will be achieved','is to be achieved'),(2,' He LOOKS at himself in the glass','sees','stares','stands','stares'),(3,'Ships and AIRCRAFTS are often equipped with radio telephones.','planes','railroads','highways','planes'),(4,'If the fire alarm is sounded, all residents are requested to ________\nin the courtyard.','combine','assemble','crowd','assemble'),(5,'One rainy night the old bridge ______ into the river without warning.','collapsed','relapsed','submerged','collapsed'),(6,'Nursery schools can be enormously ________ to socially handicapped\nchildren.','admirable','praiseworthy','beneficial','praiseworthy'),(7,' He said he couldn\'t _____ to retire from work and live only on his pension.','afford','accept','risk','afford'),(8,' As soon as the exams were over, the students all went their ________\nways.','respective','diverted','relative','respective'),(9,'He ______ his old car for a new model as soon as he had won the money','converted','exchanged','interchanged','exchanged'),(10,' Even a small dog in a house can ________ a thief','waylay','deter','arrest','deter');
/*!40000 ALTER TABLE `hard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medium`
--

DROP TABLE IF EXISTS `medium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medium` (
  `id` int NOT NULL,
  `question` varchar(255) NOT NULL,
  `A` varchar(255) DEFAULT NULL,
  `B` varchar(255) DEFAULT NULL,
  `C` varchar(255) DEFAULT NULL,
  `key` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medium`
--

LOCK TABLES `medium` WRITE;
/*!40000 ALTER TABLE `medium` DISABLE KEYS */;
INSERT INTO `medium` VALUES (1,'______do you work for?','which','where','whom','whom'),(2,'Is there _____ in the room?','no one','someone','anyone ','anyone '),(3,'I\'m very happy _____ in India. I really miss being there.','to live','to have lived','to be living','to have lived'),(4,'They didn\'t reach an agreement ______ their differences.','because','due','on account of','on account of'),(5,'I wish I _____ those words. But now it\'s too late.','not having said','never said','had never said','had never said'),(6,'The woman, who has been missing for 10 days, is believed _____.','to be abducted','to have been abducting','to have been abducted','to have been abducted'),(7,'She was working on her computer with her baby next to _____.','her','her own','hers','her'),(8,'_____ to offend anyone, she said both cakes were equally good.','Not wanting','As not wanting','She didn\'t want','Not wanting'),(9,'_____ in trying to solve this problem. It\'s clearly unsolvable.','It\'s no point','There\'s no point','There isn\'t point','There\'s no point'),(10,'He _____ robbed as he was walking out of the bank.','had','were','got','got');
/*!40000 ALTER TABLE `medium` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_easy`
--

DROP TABLE IF EXISTS `score_easy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `score_easy` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Mark` int NOT NULL,
  `Time` int NOT NULL,
  `Score` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_easy`
--

LOCK TABLES `score_easy` WRITE;
/*!40000 ALTER TABLE `score_easy` DISABLE KEYS */;
INSERT INTO `score_easy` VALUES (1,'Loyd',10,120,100),(2,'John',10,120,100),(3,'Harley',9,60,5600),(4,'Taylor',9,33,8700),(5,'Kent',5,25,3600),(6,'Bonny',7,151,2800);
/*!40000 ALTER TABLE `score_easy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_hard`
--

DROP TABLE IF EXISTS `score_hard`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `score_hard` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Mark` int NOT NULL,
  `Time` int NOT NULL,
  `Score` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_hard`
--

LOCK TABLES `score_hard` WRITE;
/*!40000 ALTER TABLE `score_hard` DISABLE KEYS */;
/*!40000 ALTER TABLE `score_hard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score_medium`
--

DROP TABLE IF EXISTS `score_medium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `score_medium` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) NOT NULL,
  `Mark` int NOT NULL,
  `Time` int NOT NULL,
  `Score` int NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_medium`
--

LOCK TABLES `score_medium` WRITE;
/*!40000 ALTER TABLE `score_medium` DISABLE KEYS */;
INSERT INTO `score_medium` VALUES (1,'Prince',7,314,2800),(2,'yahoo',2,14,900);
/*!40000 ALTER TABLE `score_medium` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-18  1:47:42
