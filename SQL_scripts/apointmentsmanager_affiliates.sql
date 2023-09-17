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
-- Table structure for table `affiliates`
--

DROP TABLE IF EXISTS `affiliates`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `affiliates` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) NOT NULL,
  `age` int NOT NULL,
  `mail` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `affiliates`
--

LOCK TABLES `affiliates` WRITE;
/*!40000 ALTER TABLE `affiliates` DISABLE KEYS */;
INSERT INTO `affiliates` VALUES (1,'Nikolos Gonnely',1,'ngonnely0@bloglovin.com'),(2,'Norri Guppey',2,'nguppey1@comsenz.com'),(3,'Randee Gerant',3,'rgerant2@vinaora.com'),(4,'Titus Christene',4,'tchristene3@mapy.cz'),(5,'Irv Stearnes',5,'istearnes4@qq.com'),(6,'Gianni Gayden',6,'ggayden5@jigsy.com'),(7,'Pedro Arango',22,'parangos@eafit.edu.co'),(9,'Tim Stansall',9,'tstansall8@amazon.co.jp'),(10,'2121',-2,''),(11,'Aloysius Mosen',11,'amosena@barnesandnoble.com'),(12,'Saunder Websdale',12,'swebsdaleb@narod.ru'),(13,'Horatia Gerholz',13,'hgerholzc@nbcnews.com'),(14,'Sarge Jacobson',14,'sjacobsond@homestead.com'),(15,'Rhiamon Gresley',15,'rgresleye@economist.com'),(16,'Mendel Phizaclea',16,'mphizacleaf@techcrunch.com'),(17,'Aila Nias',17,'aniasg@angelfire.com'),(18,'Cecil Georgievski',18,'cgeorgievskih@jiathis.com'),(19,'Sheri Fust',19,'sfusti@disqus.com'),(20,'Mab Ellings',20,'mellingsj@wiley.com'),(21,'Cora Priscott',21,'cpriscottk@cdbaby.com'),(22,'Evy Volkers',22,'evolkersl@oaic.gov.au'),(23,'Ash Moneti',23,'amonetim@google.fr'),(24,'Giff Canning',24,'gcanningn@sphinn.com'),(25,'Nathaniel Reyner',25,'nreynero@baidu.com'),(26,'Euell Briscow',26,'ebriscowp@businessweek.com'),(27,'Julee Baelde',27,'jbaeldeq@tinypic.com'),(28,'Sileas Wakeford',28,'swakefordr@netlog.com'),(29,'Maddy Debill',29,'mdebills@archive.org'),(30,'Deonne Dunckley',30,'ddunckleyt@harvard.edu'),(31,'Alwyn Taber',31,'ataberu@simplemachines.org'),(32,'45',783,'druglar city'),(33,'Annetta Kingsnod',33,'akingsnodw@prweb.com'),(34,'Clarissa Pengilley',34,'cpengilleyx@ow.ly'),(35,'Giraud Losano',35,'glosanoy@bigcartel.com'),(36,'Daniella Lowes',36,'dlowesz@abc.net.au'),(37,'Joycelin Cauley',37,'jcauley10@sitemeter.com'),(38,'Cullie Raysdale',38,'craysdale11@wp.com'),(39,'Cathyleen Kringe',39,'ckringe12@yale.edu'),(40,'Kimberley Bloschke',40,'kbloschke13@goo.gl'),(41,'Renie Teaze',41,'rteaze14@g.co'),(42,'Stevana Tidball',42,'stidball15@dyndns.org'),(43,'Clotilda Lipscomb',43,'clipscomb16@webeden.co.uk'),(44,'Diandra Ingarfill',44,'dingarfill17@cdc.gov'),(45,'',45,''),(46,'Arlette Chattaway',46,'achattaway19@ocn.ne.jp'),(47,'Sydel Baildon',47,'sbaildon1a@deviantart.com'),(48,'Olenka Dooly',48,'odooly1b@reference.com'),(49,'Elisha Empringham',49,'eempringham1c@typepad.com'),(51,'Giraud Kampshell',51,'gkampshell1e@nps.gov'),(52,'Elmira Kalinsky',52,'ekalinsky1f@geocities.com'),(53,'Augustine Weed',53,'aweed1g@indiatimes.com'),(54,'Karl Epple',54,'kepple1h@oaic.gov.au'),(55,'Valida Yelding',55,'vyelding1i@discuz.net'),(56,'Reinald Shurville',56,'rshurville1j@qq.com'),(57,'Judye Gartsyde',57,'jgartsyde1k@gravatar.com'),(58,'Cinnamon Laxtonne',58,'claxtonne1l@amazon.co.uk'),(59,'Falito Weild',59,'fweild1m@nps.gov'),(60,'Kimmy Walthall',60,'kwalthall1n@cmu.edu'),(61,'Dolf McAw',61,'dmcaw1o@gravatar.com'),(62,'Darda Lanchbury',62,'dlanchbury1p@google.ru'),(63,'Oren Bointon',63,'obointon1q@oracle.com'),(64,'Natalie Gaudin',64,'ngaudin1r@g.co'),(65,'Wayne Lassell',65,'wlassell1s@squidoo.com'),(66,'Lizabeth Rojas',66,'lrojas1t@skype.com'),(67,'Lilyan Bathurst',67,'lbathurst1u@tmall.com'),(68,'Rip Welbelove',68,'rwelbelove1v@live.com'),(69,'Stefania Terlinden',69,'sterlinden1w@tmall.com'),(70,'Aviva Glazier',70,'aglazier1x@sakura.ne.jp'),(71,'Vaughan Lidierth',71,'vlidierth1y@wix.com'),(72,'Adi Hardiker',72,'ahardiker1z@amazon.co.uk'),(73,'Walker Dudenie',73,'wdudenie20@hud.gov'),(74,'Walt Gullan',74,'wgullan21@umn.edu'),(75,'Indira O\'Heffernan',75,'ioheffernan22@google.ca'),(76,'Jaclyn Ephgrave',76,'jephgrave23@instagram.com'),(77,'Dav Beahan',77,'dbeahan24@tiny.cc'),(78,'Torre Aronstein',78,'taronstein25@furl.net'),(79,'Prisca Sybe',79,'psybe26@archive.org'),(80,'Elly Hubach',80,'ehubach27@nationalgeographic.com'),(81,'Marci Sebert',81,'msebert28@sbwire.com'),(82,'Sonnie Gallard',82,'sgallard29@pen.io'),(83,'Caro Comini',83,'ccomini2a@sfgate.com'),(84,'Chelsy Cheyne',84,'ccheyne2b@ow.ly'),(85,'Latrena Adamo',85,'ladamo2c@ucoz.ru'),(86,'Avery Hallgate',86,'ahallgate2d@squidoo.com'),(87,'Milli Bassano',87,'mbassano2e@cargocollective.com'),(88,'Violante Sparrowhawk',88,'vsparrowhawk2f@statcounter.com'),(89,'Felice Weatherall',89,'fweatherall2g@amazon.co.jp'),(90,'Timotheus Landy',90,'tlandy2h@msn.com'),(91,'Kit Loosley',91,'kloosley2i@phpbb.com'),(92,'Myrlene Housden',92,'mhousden2j@nationalgeographic.com'),(93,'Quincey Vasilkov',93,'qvasilkov2k@alexa.com'),(94,'Killy Nairns',94,'knairns2l@wired.com'),(95,'Flinn Naris',95,'fnaris2m@addtoany.com'),(96,'Yurik Geockle',96,'ygeockle2n@wikimedia.org'),(97,'Cornelius Steuhlmeyer',97,'csteuhlmeyer2o@live.com'),(98,'Cleo Metzing',98,'cmetzing2p@cnn.com'),(99,'Baron Scarlin',99,'bscarlin2q@guardian.co.uk'),(101,'Pedro Arango Sanchez',22,'parangos@eafit.edu.co'),(102,'Pedro Arango Sanchez',223,'parangos@eafit.edu.co'),(103,'-78',78,'parangos@eafit.edu.co'),(104,'-78',78,'parangos@eafit.edu.co'),(105,'45',783,'druglar city'),(106,'-78',78,'457'),(107,'-78',78,'457'),(108,'pedrito alimaña',78,'parangos@eafit.edu.co'),(109,'pedrito alimaña',78,'parangos@eafit.edu.co'),(110,'pedro drugs',22,'druglar city'),(111,'45',45,'druglar city'),(112,'45',0,'druglar city'),(113,'45',78,'druglar city'),(114,'45',78,'druglar city'),(115,'45',78,'druglar city'),(116,'45',78,'druglar city'),(117,'45',78,'druglar city'),(118,'45',78,'druglar city'),(119,'45',78,'druglar city'),(120,'45',78,'druglar city'),(121,'45',78,'druglar city'),(122,'45',78,'druglar city'),(123,'45',78,'druglar city'),(124,'45',78,'druglar city'),(125,'45',783,'druglar city'),(126,'45',783,'druglar city'),(127,'45',783,'druglar city'),(128,'pedro',22,'parangos'),(129,'pedro',222,'parangos'),(130,'pedro',222,'parangos'),(131,'pedro',4,'paranogs@'),(132,'pedro',123,'paranogs@'),(133,'pedro',123,'124@'),(134,'Celeste Mangion',8,'cmangion7@salon.com'),(135,'Pedro Arango',123,'parangos@eafit.edu.co'),(136,'Nikolos Gonnely',1,'ngonnely0@bloglovin.com');
/*!40000 ALTER TABLE `affiliates` ENABLE KEYS */;
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
