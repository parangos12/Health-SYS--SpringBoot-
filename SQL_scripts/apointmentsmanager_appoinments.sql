-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: apointmentsmanager
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `appoinments`
--

DROP TABLE IF EXISTS `appoinments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appoinments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `date` date NOT NULL,
  `hour` time NOT NULL,
  `id_test` int NOT NULL,
  `id_affiliate` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_test_idx` (`id_test`),
  KEY `id_affiliate_idx` (`id_affiliate`),
  CONSTRAINT `id_affiliate` FOREIGN KEY (`id_affiliate`) REFERENCES `affiliates` (`id`),
  CONSTRAINT `id_test` FOREIGN KEY (`id_test`) REFERENCES `tests` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appoinments`
--

LOCK TABLES `appoinments` WRITE;
/*!40000 ALTER TABLE `appoinments` DISABLE KEYS */;
INSERT INTO `appoinments` VALUES (4,'2022-01-02','10:10:00',5,3),(5,'2022-01-02','10:20:00',7,4),(7,'2022-01-02','10:10:00',7,5),(12,'2022-12-03','12:10:00',5,6),(13,'2022-12-03','12:10:00',5,6),(14,'2022-12-03','12:10:00',5,6),(15,'2022-12-03','12:10:00',5,6),(16,'2022-12-03','12:10:00',2,52),(17,'2022-12-03','12:10:00',26,52),(18,'2022-12-03','12:10:00',26,52),(19,'2022-12-03','12:10:00',26,52),(20,'2022-12-03','12:10:00',26,52),(21,'2022-12-03','12:10:00',6,52),(22,'2022-12-03','12:10:00',6,32),(23,'2022-12-03','12:10:00',7,32),(26,'2022-12-03','12:10:00',11,32),(27,'2022-12-03','12:10:00',11,11),(28,'2022-12-03','12:10:00',11,11),(29,'2022-01-02','10:20:00',4,4),(31,'2022-01-02','10:20:00',7,4),(32,'2022-12-03','12:10:00',5,15);
/*!40000 ALTER TABLE `appoinments` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-01-03  8:09:32
