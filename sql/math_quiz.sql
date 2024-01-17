-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: math_quiz
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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `easy`
--

LOCK TABLES `easy` WRITE;
/*!40000 ALTER TABLE `easy` DISABLE KEYS */;
INSERT INTO `easy` VALUES (1,'What is 3 + 2?','4','5','6','5'),(2,'What is 7 - 4?','2','3','4','3'),(3,'What is 6 + 1?','5','6','7','7'),(4,'What is 9 - 3?','4','5','6','6'),(5,'What is 2 + 4?','4','6','5','6'),(6,'What is 8 - 2?','4','5','6','6'),(7,'What is 10 + 3?','11','12','13','13'),(8,'What is 5 - 1?','2','3','4','4'),(9,'What is 4 + 3?','5','6','7','7'),(10,'What is 7 - 2?','3','4','5','5');
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
INSERT INTO `hard` VALUES (1,'What is 3 + (-2) - 1?','0','-4','-6','0'),(2,'What is 7 - (-4) + 2?','11','13','15','13'),(3,'What is (-6) + 1 - 3?','-6','-8','-10','-8'),(4,'What is 9 - (-3) + 2?','14','16','18','14'),(5,'What is (-2) + (-4) - 1?','-7','-5','-3','-7'),(6,'What is 8 - (-2) + 1?','11','13','15','11'),(7,'What is 10 + 3 - 5?','6','8','10','8'),(8,'What is 5 - 1 + 3?','5','7','9','7'),(9,'What is 4 + 3 - (-2)?','1','3','5','5'),(10,'What is 7 - 2 + 4?','5','9','11','9');
/*!40000 ALTER TABLE `hard` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medium`
--

DROP TABLE IF EXISTS `medium`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medium` (
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
-- Dumping data for table `medium`
--

LOCK TABLES `medium` WRITE;
/*!40000 ALTER TABLE `medium` DISABLE KEYS */;
INSERT INTO `medium` VALUES (1,'What is 3 + (-2)?','1','-1','-5','1'),(2,'What is 7 - (-4)?','3','11','-1','11'),(3,'What is (-6) + 1?','-5','6','-7','-5'),(4,'What is 9 - (-3)?','6','12','-6','12'),(5,'What is (-2) + (-4)?','-6','2','-8','-6'),(6,'What is 8 - (-2)?','6','-6','10','10'),(7,'What is 10 + (-3)?','7','-13','13','7'),(8,'What is 5 - (-1)?','2','6','-4','6'),(9,'What is 4 + (-3)?','7','-7','1','1'),(10,'What is 7 - (-2)?','5','9','-5','9');
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
INSERT INTO `score_easy` VALUES (2,'Loyd ',10,120,120),(3,'Lmao',10,120,120),(4,'Aloy',10,28,11300),(5,'test',5,17,3100),(6,'yahh',5,14,3300);
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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_medium`
--

LOCK TABLES `score_medium` WRITE;
/*!40000 ALTER TABLE `score_medium` DISABLE KEYS */;
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

-- Dump completed on 2024-01-18  1:48:28
