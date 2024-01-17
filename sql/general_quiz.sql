-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: general_quiz
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
INSERT INTO `easy` VALUES (1,'What is the longest river in the world?','Nile River','Congo River','Yellow River','Nile River'),(2,'Which country is the footballer Cristiano Ronaldo from?','Spain','Portugal','Brazil','Portugal'),(3,'Which famous inventor invented the telephone?','Alexander Graham Bell','Nikola Tesla','Thomas Edison','Alexander Graham Bell'),(4,'What is the largest continent in size?','Europe','Africa','Asia','Asia'),(5,'What is the largest canyon in the world?','King\'s Canyon, Australia','Grand Canyon, USA','Fjaðrárgljúfur Canyon, Iceland','Grand Canyon, USA'),(6,'Apart from water, what is the most popular drink in the world?','Tea','Beer','Coffee','Tea'),(7,'Which one of the following companies has a mermaid in its logo?','Twitter','Starbucks','HSBC','Starbucks'),(8,'Which chemical element has Ag as a symbol?','Gold','Silver','Iron','Silver'),(9,'Complete the name of this song \"I Saw _______Kissing Santa Claus\".','Her','Mommy','Grandma','Mommy'),(10,'What\'s Garfield\'s favourite food?','Pizza','Lasagna','Burger','Lasagna');
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
INSERT INTO `hard` VALUES (1,'What does the Richter scale measure?','Wind Speed','Earthquake intensity','Tornado Strength','Earthquake intensity'),(2,'What is the highest mountain in Japan?','Mount Fuji','Mount Kita','Mount Yari','Mount Fuji'),(3,'At what temperature Celsius and Fahrenheit equal?','-32','-38','-40','-40'),(4,'The Union Jack is the name of which country?s flag?','USA','UK','New Zealand','UK'),(5,'How many bones are there in an adult human body?','186','206','216','206'),(6,'What do the stripes represent on the American flag?','The thirteen colonies','The founders','The US states','The thirteen colonies'),(7,'Where was the earliest documented case of the Spanish flu?','USA','Spain','UK','USA'),(8,'What was Euclid?','A philosopher','A poet','A mathematician','A mathematician'),(9,'Which country was not part of the Axis Powers during WWII?','Germany','Soviet Union','Italy','Soviet Union'),(10,'The fear of insects is known as what?','Entomophobia','Arachnophobia ','Ailurophobia','Entomophobia');
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
INSERT INTO `medium` VALUES (1,'In which Italian city can you find the Colosseum?','Venice','Rome','Naples','Rome'),(2,'What is the capital of New Zealand?','Wellington','Auckland','Christchurch','Wellington'),(3,'In which country is the baht the currency?','Vietnam','Indonesia','Thailand','Thailand'),(4,'How many elements are there on the periodic table?','126','118','124','118'),(5,'What is Saudi Arabia the biggest producer of?','Oil','Coal','Gold','Oil'),(6,'Where was tea invented?','England','China','USA','China'),(7,'How long did dinosaurs live on the earth?','100-150 million years','150-200 million years','200+ million years','150-200 million years'),(8,'Which app has the most total users?','Instagram','Snapchat','TikTok','Instagram'),(9,'Which of the following languages has the longest alphabet?','Greek','Russian','Arabic','Russian'),(10,'First world war was held in?','1944','1907','1914','1914');
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_easy`
--

LOCK TABLES `score_easy` WRITE;
/*!40000 ALTER TABLE `score_easy` DISABLE KEYS */;
INSERT INTO `score_easy` VALUES (1,'Jean',8,40,5200);
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
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score_medium`
--

LOCK TABLES `score_medium` WRITE;
/*!40000 ALTER TABLE `score_medium` DISABLE KEYS */;
INSERT INTO `score_medium` VALUES (1,'Madge',1,11,300),(2,'Jacob',4,13,2600),(3,'Marc',1,8,300),(4,'John',4,9,3000),(5,'Marl',6,7,6300),(6,'Martin',1,7,300),(7,'Kennet',4,24,2000),(8,'Limao',7,33,5600),(9,'limao',5,39,2400),(10,'se',2,20,600),(11,'Oreo',7,35,5700),(12,'Jane',5,29,3100);
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

-- Dump completed on 2024-01-18  1:48:09
