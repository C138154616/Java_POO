-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: gestion_vacc
-- ------------------------------------------------------
-- Server version	5.7.30-log

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
-- Table structure for table `personne`
--

DROP TABLE IF EXISTS `personne`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personne` (
  `idPersonne` int(11) NOT NULL AUTO_INCREMENT,
  `CIN` varchar(10) NOT NULL,
  `Nom` varchar(45) DEFAULT NULL,
  `Prenom` varchar(45) DEFAULT NULL,
  `Sexe` varchar(50) DEFAULT NULL,
  `DateNaissance` date DEFAULT NULL,
  `Adresse` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPersonne`),
  UNIQUE KEY `CIN_UNIQUE` (`CIN`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personne`
--

LOCK TABLES `personne` WRITE;
/*!40000 ALTER TABLE `personne` DISABLE KEYS */;
INSERT INTO `personne` VALUES (1,'JJ','Sa','lah','Homme','2022-04-13','jhg'),(2,'JEAAYU','BARHOUNE','HAMZA','Homme','2022-04-19','KAJHKJAH'),(5,'slhddvv','gb','aouatef','Homme','2022-04-21','aouatifgb'),(6,'F','JH','A','Homme','2022-04-13','S'),(7,'','','','Homme','2022-04-14',''),(8,'Jklm','jgzjh','dbjhsb','Homme','2022-04-13','kdjkjdnd'),(9,'L557547','CHEKROUNE ','ABDELOUAHID','Homme','2004-01-08','AV SOUISS AP8 ET 4 N7'),(10,'L12345678','Chekroune ','Abdelouahid','Homme','2004-01-08','AV paris N19 ETG5'),(11,'H1234567','Harmouch','Zine edine ','Homme','2002-01-31','ybyazertyui'),(12,'J123456','YAHOUNI','Safinaz','Femme','2022-04-07','AZERTYUI'),(13,'H123','HMITI','Salma','Femme','2022-04-28','sdfghjkl'),(14,'O12345678','HABYBY','Tamim','Homme','1988-02-26','QSDFGHJKL'),(15,'G123456','NAMOUH','HAMZA','Femme','2022-05-03','AZERTUI'),(16,'Q1234567','BenSa3id','Anas','Homme','2022-05-09','qsdfghj'),(17,'GG','ABDRAHIM','SOHAIL','Homme','2022-05-10','QSDGHJK'),(18,'J123','AZERTYU','GISFHJ','Homme','2022-05-23','QSDFGHJK'),(19,'EEEEE','AZERTY','AZERTY','Homme','2022-05-24','AZERTY');
/*!40000 ALTER TABLE `personne` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-24 19:43:05
