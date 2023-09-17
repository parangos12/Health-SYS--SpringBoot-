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
-- Table structure for table `tests`
--

DROP TABLE IF EXISTS `tests`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tests` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `description` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tests`
--

LOCK TABLES `tests` WRITE;
/*!40000 ALTER TABLE `tests` DISABLE KEYS */;
INSERT INTO `tests` VALUES (2,'pedro','sdas'),(3,'Potassium Chloride','Foreign body granuloma of soft tissue, NEC, left thigh'),(4,'Acetaminofén ultra HD real no fake','Con este se te quita hasta la risa'),(5,'','Burn of first degree of chest wall'),(6,'Triclosan','Follicular lymphoma grade III, unsp, intrathorac lymph nodes'),(7,'Bismuth subsalicylate','Complete traumatic trnsphal amputation of r little finger'),(8,'Gabapentin','Milt op involving intentional restriction of air and airway'),(9,'Red Oak','Nondisp fx of mid 3rd of navic bone of r wrs, 7thP'),(11,'Fluoride Ions','Central pain syndrome'),(12,'pedriño','siuu'),(13,'isopropyl alcohol','Dislocation of T7/T8 thoracic vertebra, subsequent encounter'),(14,'Mometasone Furoate','Perf due to fb acc left in body fol kidney dialysis, init'),(15,'levothyroxine sodium tablets','Traum subdr hem w/o loss of consciousness, subs'),(16,'mucor racemosus','Driver of hv veh injured in collision w hv veh in traf, init'),(17,'fluticasone propionate','Inhalant abuse, uncomplicated'),(18,'fluocinolone acetonide','Traum rupt of collat ligmt of l idx fngr at MCP/IP jt, sqla'),(19,'pedro','parangos'),(20,'123',''),(21,'','parangos'),(22,'','parangos'),(23,'','parangos'),(24,'','parangos'),(26,'ds','45'),(27,'dsas','sadas'),(28,'dsas 43','sadas'),(29,'pedro','34232'),(30,'pedro','34232'),(31,'pedro','4232'),(32,'pedro','4232'),(33,'pedro arango 12','procedimiento con 444cc'),(34,'pedro arango 12','123'),(35,'pedro arango 12','123'),(36,'pedro arango 12','123'),(37,'pedro arango 12','123'),(38,'pedro','123'),(39,'pedro','sdsf'),(40,'123','sdsf'),(41,'123','sdsf'),(42,'123','sdsf'),(43,'123','sdsf'),(44,'123','sdsf'),(45,'123','sdsf'),(46,'123','sdsf'),(47,'123','123'),(48,'123','124'),(49,'as','124'),(51,'dasd','hgh23'),(52,'pedro arango','sanchez'),(54,'Acetaminofén','Droga pal dolor mi rey');
/*!40000 ALTER TABLE `tests` ENABLE KEYS */;
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
