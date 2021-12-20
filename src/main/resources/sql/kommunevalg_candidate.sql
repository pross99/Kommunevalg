-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: kommunevalg
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `candidate`
--

DROP TABLE IF EXISTS `candidate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `candidate` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_Name` varchar(225) DEFAULT NULL,
  `last_Name` varchar(225) DEFAULT NULL,
  `party_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `party_id_idx` (`party_id`),
  CONSTRAINT `party_id` FOREIGN KEY (`party_id`) REFERENCES `party` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `candidate`
--

LOCK TABLES `candidate` WRITE;
/*!40000 ALTER TABLE `candidate` DISABLE KEYS */;
INSERT INTO `candidate` VALUES (1,'Simon','Hansen',1),(12,'Hanne ','Bagge',1),(14,'Britta','Lange',1),(15,'Martin ','Pedersen',1),(16,'Signe','Skovgaard',2),(17,'Line','Reinhardt',2),(18,'Patrick ','Lincoln',2),(19,'JOhannes','Kristensen',3),(20,'Emma','Holm',3),(21,'Anders ','Stausholm',3),(22,'Paw','Hallandson',4),(23,'Jan ','Bigum Warming',4),(24,'MIchael ','Christensen',4),(25,'Annemette','Schønberg Johnsen',5),(26,'Lene ','Hatt',5),(27,'Joan','Kragh',5),(28,'Lisbeth','Rask Nielsen',6),(29,'Henning ','Østergaard',6),(30,'John ','Brædder',7),(31,'Martin ','Lohse',7),(32,'Rene','Sørensen',7),(33,'Rene','Christensen',9),(34,'Mona','Jensby',9),(35,'Birgit','Holse',9),(36,'Ole','K Larsen',10),(37,'Ditte','Rust',10),(38,'Henrik','Andersen',10),(39,'Bente','Lerche Thomsen',11),(40,'Christian','Tastrup',11),(41,'Frederik','Lerche Thomsen',11),(42,'Flemming','Engler',12),(43,'Ulla','Munksgaard',12);
/*!40000 ALTER TABLE `candidate` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-12-20 18:29:54
