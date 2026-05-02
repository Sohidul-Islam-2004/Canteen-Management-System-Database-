CREATE DATABASE  IF NOT EXISTS `canteen_management_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `canteen_management_system`;
-- MySQL dump 10.13  Distrib 8.0.44, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: canteen_management_system
-- ------------------------------------------------------
-- Server version	8.0.44

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `Category_ID_` int NOT NULL,
  `Category_Name_` varchar(100) NOT NULL,
  PRIMARY KEY (`Category_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Rice Items'),(2,'Curry & Side Dishes'),(3,'Bread & Rice'),(4,'Beverages'),(5,'Fast Food & Snacks'),(6,'Street Food'),(7,'Desserts'),(8,'Breakfast Items'),(9,'Combo Meals'),(10,'Seasonal Specials');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `Inventory_ID_` int NOT NULL,
  `Item_Name` varchar(100) NOT NULL,
  `Quantity_` int NOT NULL,
  `Unit` varchar(50) NOT NULL,
  PRIMARY KEY (`Inventory_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,'Rice',10,'kg'),(2,'Chicken',100,'kg'),(3,'Onion',150,'kg'),(4,'Oil',100,'liter'),(5,'Mutton',80,'kg'),(6,'Potato',300,'kg'),(7,'Carrot',100,'kg'),(8,'Peas',80,'kg'),(9,'Soy Sauce',50,'liter'),(10,'Egg',500,'pieces'),(11,'Tomato',120,'kg'),(12,'Garlic',60,'kg'),(13,'Beef',150,'kg'),(14,'Ginger',50,'kg'),(15,'Turmeric',30,'kg'),(16,'Fish',100,'kg'),(17,'Coriander',40,'kg'),(18,'Cumin',35,'kg'),(19,'Yogurt',80,'liter'),(20,'Chili Powder',25,'kg'),(21,'Salt',100,'kg'),(22,'Sugar',120,'kg'),(23,'Lentil',200,'kg'),(24,'Flour',150,'kg'),(25,'Butter',60,'kg'),(26,'Milk',100,'liter'),(27,'Cabbage',80,'kg'),(28,'Cauliflower',70,'kg'),(29,'Brinjal',90,'kg'),(30,'Pumpkin',60,'kg'),(31,'Shrimp',50,'kg'),(32,'Coconut',100,'pieces'),(33,'Lemon',200,'pieces'),(34,'Vinegar',40,'liter'),(35,'Bread',100,'loaves'),(36,'Cheese',40,'kg'),(37,'Mayonnaise',30,'kg'),(38,'Ketchup',50,'kg'),(39,'Pasta',80,'kg'),(40,'Noodles',90,'kg'),(41,'Mushroom',40,'kg'),(42,'Capsicum',60,'kg'),(43,'Paneer',40,'kg'),(44,'Honey',25,'kg'),(45,'Jam',30,'kg'),(46,'Baking Powder',15,'kg'),(47,'Cinnamon',10,'kg'),(48,'Cardamom',8,'kg'),(49,'Cloves',5,'kg'),(50,'Bay Leaves',10,'kg'),(51,'Ice Cream',100,'liter'),(52,'Chocolate Syrup',20,'liter'),(53,'Sprinkles',15,'kg'),(54,'Nuts',25,'kg'),(55,'Tea Leaves',40,'kg'),(56,'Coffee Powder',30,'kg'),(57,'Soft Drinks',200,'bottles'),(58,'Mineral Water',300,'bottles'),(59,'Fruit Juice',150,'liter'),(60,'Borhani',80,'liter'),(61,'Lassi',70,'liter'),(62,'Pizza Sauce',40,'kg'),(63,'Oregano',5,'kg'),(64,'Chili Flakes',5,'kg'),(65,'Sausage',50,'kg'),(66,'Bacon',30,'kg'),(67,'Cream',40,'liter'),(68,'Vanilla Essence',10,'liter'),(69,'Food Color',5,'kg'),(70,'Ghee',40,'kg'),(71,'Paneer',30,'kg'),(72,'Mint',15,'kg'),(73,'Curry Leaves',10,'kg'),(74,'Mustard Seeds',100,'kg');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `menu_item_`
--

DROP TABLE IF EXISTS `menu_item_`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `menu_item_` (
  `Item_ID` int NOT NULL,
  `Item_Name_` varchar(100) NOT NULL,
  `Price_` decimal(10,2) NOT NULL,
  `Availability_Status` varchar(20) NOT NULL,
  `Preparation_Time` int NOT NULL,
  `Category_ID_` int NOT NULL,
  PRIMARY KEY (`Item_ID`),
  KEY `Category_ID_` (`Category_ID_`),
  CONSTRAINT `menu_item__ibfk_1` FOREIGN KEY (`Category_ID_`) REFERENCES `category` (`Category_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu_item_`
--

LOCK TABLES `menu_item_` WRITE;
/*!40000 ALTER TABLE `menu_item_` DISABLE KEYS */;
INSERT INTO `menu_item_` VALUES (1,'Chicken Biryani',120.00,'Available',20,1),(2,'Mutton Biryani',180.00,'Available',25,1),(3,'Vegetable Fried Rice',80.00,'Available',15,1),(4,'Egg Fried Rice',90.00,'Available',15,1),(5,'Chicken Roast',150.00,'Available',18,2),(6,'Beef Vuna',160.00,'Available',20,2),(7,'Egg Curry',70.00,'Available',12,2),(8,'Dal Fry',50.00,'Available',10,2),(9,'Mixed Vegetable',60.00,'Available',12,2),(10,'Chicken Bhuna',140.00,'Available',18,2),(11,'Paratha',15.00,'Available',5,3),(12,'Naan',20.00,'Available',6,3),(13,'Plain Roti',12.00,'Available',5,3),(14,'Luchi',10.00,'Available',4,3),(15,'White Rice',25.00,'Available',8,3),(16,'Tehari',110.00,'Available',22,1),(17,'Chicken Chap',130.00,'Available',17,2),(18,'Borhani',40.00,'Available',3,4),(19,'Lassi',50.00,'Available',4,4),(20,'Soft Drinks',25.00,'Available',2,4),(21,'Mineral Water',15.00,'Available',1,4),(22,'Fruit Juice',60.00,'Available',5,4),(23,'Coffee',40.00,'Available',4,4),(24,'Tea',15.00,'Available',3,4),(25,'Chicken Sandwich',65.00,'Available',8,5),(26,'Egg Sandwich',50.00,'Available',7,5),(27,'Club Sandwich',85.00,'Available',10,5),(28,'Chicken Burger',90.00,'Available',10,5),(29,'French Fries',45.00,'Available',6,5),(30,'Chicken Pizza',150.00,'Available',15,5),(31,'Vegetable Pizza',120.00,'Available',14,5),(32,'Pasta',100.00,'Available',12,5),(33,'Noodles',85.00,'Available',10,5),(34,'Halim',70.00,'Available',5,6),(35,'Fuska',30.00,'Available',3,6),(36,'Chatpati',35.00,'Available',4,6),(37,'Jhalmuri',20.00,'Available',2,6),(38,'Samosa',15.00,'Available',4,6),(39,'Singara',12.00,'Available',4,6),(40,'Puri',25.00,'Available',6,3),(41,'Chicken Curry',130.00,'Available',18,2),(42,'Fish Curry',140.00,'Available',17,2),(43,'Shutki',120.00,'Not Available',20,2),(44,'Bhorta',50.00,'Available',8,2),(45,'Pickle',20.00,'Available',2,2),(46,'Curd',40.00,'Available',2,7),(47,'Rosogolla',30.00,'Available',2,7),(48,'Sandesh',35.00,'Available',3,7),(49,'Gulab Jamun',40.00,'Available',3,7),(50,'Ice Cream',50.00,'Available',2,7),(51,'Momo',50.00,'Available',2,6),(52,'dim bunna',20.00,'Available',5,2),(1010,'Bangi',10.00,'Available',0,1),(10000,'coffee',5.00,'Avaiable',0,1);
/*!40000 ALTER TABLE `menu_item_` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_item`
--

DROP TABLE IF EXISTS `order_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `order_item` (
  `OrderItem_ID` int NOT NULL,
  `Quantity` int NOT NULL,
  `Item_price` decimal(10,2) NOT NULL,
  `Item_ID` int NOT NULL,
  `Order_ID` int NOT NULL,
  PRIMARY KEY (`OrderItem_ID`),
  KEY `Item_ID` (`Item_ID`),
  KEY `Order_ID` (`Order_ID`),
  CONSTRAINT `order_item_ibfk_1` FOREIGN KEY (`Item_ID`) REFERENCES `menu_item_` (`Item_ID`),
  CONSTRAINT `order_item_ibfk_2` FOREIGN KEY (`Order_ID`) REFERENCES `orders` (`Order_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_item`
--

LOCK TABLES `order_item` WRITE;
/*!40000 ALTER TABLE `order_item` DISABLE KEYS */;
INSERT INTO `order_item` VALUES (1,2,120.00,1,1),(2,1,110.00,16,1),(3,1,180.00,2,2),(4,2,80.00,3,2),(5,1,40.00,18,2),(6,2,90.00,4,3),(7,1,70.00,7,3),(8,3,150.00,5,4),(9,2,160.00,6,4),(10,1,50.00,44,4),(11,1,130.00,17,5),(12,2,65.00,25,5),(13,2,25.00,20,5),(14,2,140.00,10,6),(15,1,90.00,28,6),(16,1,60.00,22,6),(17,1,50.00,8,7),(18,2,25.00,15,7),(19,3,150.00,30,8),(20,2,120.00,31,8),(21,2,40.00,23,8),(22,1,80.00,3,9),(23,2,130.00,41,9),(24,1,120.00,1,10),(25,2,180.00,2,10),(26,1,40.00,24,10),(27,2,90.00,28,11),(28,1,45.00,29,11),(29,2,150.00,5,11),(30,3,70.00,34,12),(31,2,160.00,6,12),(32,1,50.00,19,12),(33,1,65.00,25,13),(34,1,85.00,27,13),(35,2,40.00,23,13),(36,2,120.00,1,14),(37,1,180.00,2,14),(38,3,70.00,7,14),(39,1,90.00,28,15),(40,2,150.00,30,15),(41,1,120.00,31,16),(42,2,80.00,3,16),(43,1,45.00,29,16),(44,2,110.00,16,17),(45,1,140.00,10,17),(46,1,50.00,44,17),(47,3,120.00,1,18),(48,1,160.00,6,18),(49,2,25.00,21,18),(50,2,90.00,4,19),(51,1,130.00,41,19),(52,1,65.00,25,20),(53,2,180.00,2,20),(54,3,50.00,8,20),(55,1,150.00,30,21),(56,2,85.00,27,21),(57,1,60.00,22,21),(58,2,70.00,34,22),(59,1,130.00,17,22),(60,2,40.00,18,22),(61,1,180.00,2,23),(62,2,90.00,28,23),(63,1,50.00,19,23),(64,2,120.00,1,24),(65,1,70.00,7,24),(66,1,80.00,3,25),(67,2,150.00,5,25),(68,3,40.00,24,25),(69,1,160.00,6,26),(70,1,90.00,4,26),(71,2,110.00,16,27),(72,1,140.00,42,27),(73,2,25.00,20,27),(74,3,120.00,1,28),(75,1,85.00,27,28),(76,2,50.00,44,29),(77,1,180.00,2,29),(78,1,65.00,25,29),(79,2,90.00,28,30),(80,1,70.00,34,30),(81,2,130.00,41,31),(82,1,150.00,30,31),(83,1,45.00,29,31),(84,3,120.00,1,32),(85,1,140.00,10,32),(86,1,60.00,22,33),(87,2,90.00,4,33),(88,1,160.00,6,33),(89,2,80.00,3,34),(90,1,130.00,17,34),(91,2,50.00,19,35),(92,1,180.00,2,35),(93,1,40.00,23,35),(94,2,120.00,1,36),(95,1,85.00,27,36),(96,3,70.00,34,37),(97,1,150.00,5,37),(98,1,90.00,28,37),(99,2,110.00,16,38),(100,1,140.00,42,38),(101,2,65.00,25,39),(102,1,180.00,2,39),(103,1,50.00,8,39),(104,3,120.00,1,40),(105,1,160.00,6,40),(106,2,45.00,29,41),(107,1,130.00,41,41),(108,2,40.00,18,41),(109,2,90.00,4,42),(110,1,150.00,30,42),(111,1,85.00,27,43),(112,2,120.00,1,43),(113,1,70.00,7,43),(114,3,80.00,3,44),(115,1,180.00,2,44),(116,1,60.00,22,45),(117,2,140.00,10,45),(118,1,50.00,44,45),(119,2,130.00,17,46),(120,1,90.00,28,46),(121,2,40.00,24,47),(122,1,160.00,6,47),(123,1,65.00,25,47),(124,3,120.00,1,48),(125,2,150.00,30,48),(126,1,45.00,29,49),(127,2,110.00,16,49),(128,1,85.00,27,49),(129,2,90.00,4,50),(130,1,180.00,2,50),(131,1,50.00,19,51),(132,2,130.00,41,51),(133,1,70.00,34,51),(134,3,120.00,1,52),(135,1,140.00,42,52),(136,1,60.00,22,53),(137,2,150.00,5,53),(138,1,40.00,23,53),(139,2,90.00,28,54),(140,1,160.00,6,54),(141,1,85.00,27,55),(142,2,120.00,1,55),(143,2,50.00,8,55),(144,1,180.00,2,56),(145,2,80.00,3,56),(146,1,65.00,25,57),(147,2,130.00,17,57),(148,1,45.00,29,57),(149,3,120.00,1,58),(150,1,150.00,30,58),(151,2,90.00,4,59),(152,1,140.00,10,59),(153,1,70.00,7,59),(154,2,110.00,16,60),(155,1,180.00,2,60),(156,1,50.00,44,60),(157,2,120.00,1,1013),(158,1,120.00,1,1014),(159,2,120.00,1,1015),(160,1,120.00,1,1016),(161,1,120.00,1,1017),(162,6,150.00,5,1018),(163,1,120.00,1,1019),(164,2,180.00,2,1019),(165,3,80.00,3,1019),(166,2,35.00,36,1020),(167,5,160.00,6,1020),(168,10,120.00,1,1021),(169,5,20.00,52,1022),(170,3,15.00,24,1023);
/*!40000 ALTER TABLE `order_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `Order_ID` int NOT NULL,
  `Order_Date_` date NOT NULL,
  `Total_Amount` decimal(10,2) NOT NULL,
  `Order_Status` varchar(20) NOT NULL,
  `Payment_Method` varchar(20) NOT NULL,
  `ID` int NOT NULL,
  PRIMARY KEY (`Order_ID`),
  KEY `ID` (`ID`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2024-03-01',350.00,'Delivered','Cash',18),(2,'2024-03-01',520.00,'Delivered','Card',19),(3,'2024-03-02',280.00,'Delivered','Cash',20),(4,'2024-03-02',750.00,'Delivered','Canteen Card',21),(5,'2024-03-03',450.00,'Served','Cash',22),(6,'2024-03-03',620.00,'Delivered','Card',23),(7,'2024-03-04',180.00,'Delivered','Cash',24),(8,'2024-03-04',890.00,'Delivered','Canteen Card',25),(9,'2024-03-05',340.00,'Delivered','Cash',26),(10,'2024-03-05',560.00,'Delivered','Card',27),(11,'2024-03-06',420.00,'Delivered','Cash',28),(12,'2024-03-06',680.00,'Delivered','Canteen Card',29),(13,'2024-03-07',230.00,'Delivered','Cash',30),(14,'2024-03-07',710.00,'Delivered','Card',31),(15,'2024-03-08',390.00,'Delivered','Cash',32),(16,'2024-03-08',550.00,'Delivered','Canteen Card',33),(17,'2024-03-09',470.00,'Delivered','Cash',34),(18,'2024-03-09',630.00,'Delivered','Card',35),(19,'2024-03-10',290.00,'Delivered','Cash',36),(20,'2024-03-10',820.00,'Delivered','Canteen Card',37),(21,'2024-03-11',380.00,'Preparing','Cash',38),(22,'2024-03-11',490.00,'Preparing','Card',39),(23,'2024-03-12',560.00,'Ready','Cash',40),(24,'2024-03-12',340.00,'Ready','Canteen Card',41),(25,'2024-03-13',710.00,'Preparing','Cash',42),(26,'2024-03-13',260.00,'Ready','Card',43),(27,'2024-03-14',590.00,'Preparing','Cash',44),(28,'2024-03-14',430.00,'Ready','Canteen Card',45),(29,'2024-03-15',680.00,'Delivered','Cash',46),(30,'2024-03-15',370.00,'Delivered','Card',47),(31,'2024-03-16',540.00,'Delivered','Cash',48),(32,'2024-03-16',460.00,'Delivered','Canteen Card',49),(33,'2024-03-17',620.00,'Delivered','Cash',50),(34,'2024-03-17',380.00,'Delivered','Card',51),(35,'2024-03-18',510.00,'Delivered','Cash',52),(36,'2024-03-18',290.00,'Delivered','Canteen Card',53),(37,'2024-03-19',730.00,'Delivered','Cash',54),(38,'2024-03-19',440.00,'Delivered','Card',55),(39,'2024-03-20',580.00,'Delivered','Cash',56),(40,'2024-03-20',350.00,'Delivered','Canteen Card',57),(41,'2024-03-21',670.00,'Delivered','Cash',58),(42,'2024-03-21',420.00,'Delivered','Card',59),(43,'2024-03-22',530.00,'Delivered','Cash',60),(44,'2024-03-22',390.00,'Delivered','Canteen Card',61),(45,'2024-03-23',610.00,'Delivered','Cash',62),(46,'2024-03-23',480.00,'Delivered','Card',63),(47,'2024-03-24',350.00,'Delivered','Cash',64),(48,'2024-03-24',720.00,'Delivered','Canteen Card',65),(49,'2024-03-25',560.00,'Delivered','Cash',66),(50,'2024-03-25',410.00,'Delivered','Card',67),(51,'2024-03-26',640.00,'Delivered','Cash',68),(52,'2024-03-26',380.00,'Delivered','Canteen Card',69),(53,'2024-03-27',520.00,'Delivered','Cash',70),(54,'2024-03-27',470.00,'Delivered','Card',71),(55,'2024-03-28',690.00,'Delivered','Cash',72),(56,'2024-03-28',330.00,'Delivered','Canteen Card',18),(57,'2024-03-29',580.00,'Delivered','Cash',19),(58,'2024-03-29',450.00,'Delivered','Card',20),(59,'2024-03-30',720.00,'Delivered','Cash',21),(60,'2024-03-30',390.00,'Delivered','Canteen Card',22),(1011,'2026-04-18',80.00,'Preparing','cash',21),(1012,'2026-04-18',720.00,'Preparing','Cash',100),(1013,'2026-04-18',600.00,'Preparing','card',100),(1014,'2026-04-18',120.00,'Preparing','1',100),(1015,'2026-04-18',600.00,'Preparing','1',100),(1016,'2026-04-18',300.00,'Preparing','1',100),(1017,'2026-04-18',120.00,'Preparing','cash',100),(1018,'2026-04-18',1460.00,'Preparing','cash',100),(1019,'2026-04-18',720.00,'Preparing','card',100),(1020,'2026-04-19',870.00,'Preparing','Card',100),(1021,'2026-04-21',1200.00,'Preparing','card',21),(1022,'2026-04-22',100.00,'Ready','Card',1000),(1023,'2026-04-22',45.00,'served','card',21);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recipe`
--

DROP TABLE IF EXISTS `recipe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe` (
  `Recipe_ID` int NOT NULL,
  `Item_ID` int DEFAULT NULL,
  PRIMARY KEY (`Recipe_ID`),
  KEY `Item_ID` (`Item_ID`),
  CONSTRAINT `recipe_ibfk_1` FOREIGN KEY (`Item_ID`) REFERENCES `menu_item_` (`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipe`
--

LOCK TABLES `recipe` WRITE;
/*!40000 ALTER TABLE `recipe` DISABLE KEYS */;
INSERT INTO `recipe` VALUES (1,1),(2,2),(3,3),(4,4),(5,5),(6,6),(7,7),(8,8),(9,9),(10,10),(11,11),(12,12),(13,13),(14,14),(15,15),(16,16),(17,17),(18,18),(19,19),(20,20);
/*!40000 ALTER TABLE `recipe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `recipe_ingredient`
--

DROP TABLE IF EXISTS `recipe_ingredient`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `recipe_ingredient` (
  `Quantity_Req` int NOT NULL,
  `Unit` varchar(50) NOT NULL,
  `Recipe_ID` int NOT NULL,
  `Inventory_ID_` int NOT NULL,
  KEY `Recipe_ID` (`Recipe_ID`),
  KEY `Inventory_ID_` (`Inventory_ID_`),
  CONSTRAINT `recipe_ingredient_ibfk_1` FOREIGN KEY (`Recipe_ID`) REFERENCES `recipe` (`Recipe_ID`),
  CONSTRAINT `recipe_ingredient_ibfk_2` FOREIGN KEY (`Inventory_ID_`) REFERENCES `inventory` (`Inventory_ID_`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `recipe_ingredient`
--

LOCK TABLES `recipe_ingredient` WRITE;
/*!40000 ALTER TABLE `recipe_ingredient` DISABLE KEYS */;
INSERT INTO `recipe_ingredient` VALUES (2,'kg',1,1),(1,'kg',1,2),(500,'gram',1,3),(250,'ml',1,4),(3,'kg',2,1),(2,'kg',2,5),(1,'kg',2,6),(500,'gram',2,3),(1,'kg',3,1),(500,'gram',3,7),(250,'gram',3,8),(200,'ml',3,9),(2,'kg',4,1),(6,'pieces',4,10),(500,'gram',4,11),(100,'gram',4,12),(3,'kg',5,13),(2,'kg',5,5),(1,'kg',5,14),(500,'gram',5,15),(2,'kg',6,16),(1,'kg',6,17),(500,'gram',6,18),(250,'ml',6,19),(1,'kg',7,10),(500,'gram',7,20),(250,'gram',7,21),(100,'ml',7,22),(2,'kg',8,23),(1,'kg',8,24),(500,'gram',8,25),(50,'gram',8,26),(3,'kg',9,27),(2,'kg',9,28),(1,'kg',9,29),(500,'gram',9,30),(2,'kg',10,31),(1,'kg',10,32),(500,'gram',10,33),(250,'ml',10,34),(1,'kg',11,35),(500,'gram',11,36),(250,'gram',11,37),(100,'ml',11,38),(2,'kg',12,39),(1,'kg',12,40),(500,'gram',12,41),(200,'gram',12,42),(3,'kg',13,43),(2,'kg',13,44),(1,'kg',13,45),(500,'gram',13,46),(1,'kg',14,47),(500,'gram',14,48),(250,'gram',14,49),(100,'ml',14,50),(2,'kg',15,51),(1,'kg',15,52),(500,'gram',15,53),(50,'gram',15,54),(3,'kg',16,55),(2,'kg',16,56),(1,'kg',16,57),(500,'gram',16,58),(1,'kg',17,59),(500,'gram',17,60),(250,'ml',17,61),(100,'gram',17,62),(2,'kg',18,63),(1,'kg',18,64),(500,'gram',18,65),(200,'ml',18,66),(1,'kg',19,67),(500,'gram',19,68),(250,'gram',19,69),(100,'gram',19,70),(2,'kg',20,71),(1,'kg',20,72),(500,'gram',20,73),(50,'ml',20,74);
/*!40000 ALTER TABLE `recipe_ingredient` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `Review_ID` int NOT NULL,
  `Rating` decimal(3,1) NOT NULL,
  `Comment` varchar(1000) NOT NULL,
  `ID` int NOT NULL,
  `Item_ID` int NOT NULL,
  PRIMARY KEY (`Review_ID`),
  KEY `ID` (`ID`),
  KEY `Item_ID` (`Item_ID`),
  CONSTRAINT `review_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `users` (`ID`),
  CONSTRAINT `review_ibfk_2` FOREIGN KEY (`Item_ID`) REFERENCES `menu_item_` (`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,4.5,'Excellent biryani! Best in town',18,1),(2,5.0,'Mutton biryani was outstanding',19,2),(3,4.0,'Good quality food',20,3),(4,3.5,'Average taste, could be better',21,4),(5,5.0,'Amazing chicken roast',22,5),(6,4.5,'Beef vuna is delicious',23,6),(7,4.0,'Egg curry was good',24,7),(8,3.0,'Dal was too salty today',25,8),(9,4.5,'Mixed vegetable was fresh',26,9),(10,5.0,'Best chicken bhuna ever',27,10),(11,4.0,'Paratha was soft and hot',28,11),(12,4.5,'Naan was perfect',29,12),(13,3.5,'Roti could be softer',30,13),(14,5.0,'Luchi is awesome',31,14),(15,4.0,'Good value for money',32,15),(16,5.0,'Tehari is fantastic',33,16),(17,4.5,'Chicken chap is tasty',34,17),(18,5.0,'Borhani is refreshing',35,18),(19,4.5,'Lassi is thick and sweet',36,19),(20,4.0,'Cold drinks are chilled',37,20),(21,5.0,'Best canteen in town',38,1),(22,4.0,'Quick service',39,5),(23,3.0,'Portion size is small',40,2),(24,4.5,'Affordable prices',41,3),(25,5.0,'Clean environment',42,6),(26,4.0,'Friendly staff',43,8),(27,4.5,'Taste is consistent',44,10),(28,3.5,'Waiting time is long',45,1),(29,5.0,'Love the food here',46,16),(30,4.0,'Good for students',47,28),(31,4.5,'Fuska is crispy',48,35),(32,5.0,'Chatpati is spicy and tasty',49,36),(33,4.0,'Jhalmuri is perfect snack',50,37),(34,4.5,'Samosa is crispy',51,38),(35,5.0,'Singara is delicious',52,39),(36,4.0,'Chicken curry is flavorful',53,41),(37,4.5,'Fish curry is fresh',54,42),(38,3.0,'Not available today',55,43),(39,5.0,'Bhorta is authentic',56,44),(40,4.5,'Rosogolla is soft',57,47),(41,5.0,'Gulab jamun is sweet',58,49),(42,4.0,'Ice cream is creamy',59,50),(43,4.5,'Chicken burger is juicy',60,28),(44,5.0,'French fries are crispy',61,29),(45,4.0,'Pizza is cheesy',62,30),(46,4.5,'Pasta is creamy',63,32),(47,3.5,'Noodles are okay',64,33),(48,5.0,'Halim is hearty',65,34),(49,4.0,'Good canteen overall',66,1),(50,4.5,'Will come again',67,2),(51,5.0,'Recommended for all',68,5),(52,4.0,'Value for money',69,10),(53,4.5,'Fast delivery',70,16),(54,3.5,'Taste is average',71,25),(55,5.0,'Excellent service',72,30),(56,4.0,'Food is fresh',18,41),(57,4.5,'Spices are perfect',19,6),(58,5.0,'Best canteen ever',20,1),(59,4.0,'Satisfied with quality',21,28),(60,4.5,'Keep up the good work',22,16),(61,5.0,'onk bhalo chilo dim bunna ta',1000,52),(62,5.0,'onk bhalo chilo',1000,51);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `ID` int DEFAULT NULL,
  `Working_Hour` int NOT NULL,
  `Salary` decimal(10,2) DEFAULT NULL,
  KEY `ID` (`ID`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
INSERT INTO `staff` VALUES (3,8,35000.00),(4,6,28000.00),(5,8,32000.00),(6,5,22000.00),(7,9,40000.00),(8,6,25000.00),(9,8,31000.00),(10,7,27000.00),(11,8,38000.00),(12,6,29000.00),(13,8,33000.00),(14,5,26000.00),(15,8,34000.00),(16,9,37000.00),(17,7,30000.00),(51,2,100000.00),(101,5,100.00),(154,5,100.00);
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL,
  `Name` varchar(20) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Registration_Date_` date DEFAULT NULL,
  `Birth_Date_` date DEFAULT NULL,
  `Present_Address` varchar(255) DEFAULT NULL,
  `Permanent_Address` varchar(255) DEFAULT NULL,
  `Role` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Rafiqul Islam','admin1@canteen.com','admin123','2024-01-01','1985-05-15','Admin Building, Dhaka University','35/B, Dhanmondi, Dhaka','admin'),(2,'Nasrin Akhter','admin2@canteen.com','admin123','2024-01-01','1988-08-20','Admin Office, BUET','House 12, Road 5, Gulshan, Dhaka','admin'),(3,'Mizanur Rahman','staff1@canteen.com','staff123','2024-01-15','1990-03-10','Staff Quarter, JU Campus','Village: Konabari, Gazipur','staff'),(4,'Shahida Begum','staff2@canteen.com','staff123','2024-01-15','1992-07-22','Staff Hostel, RUET','23, Shahbag, Dhaka','staff'),(5,'Kamal Hossain','staff3@canteen.com','staff123','2024-01-16','1988-11-05','Staff Quarter, CUET','Village: Boro Bari, Comilla','staff'),(6,'Rokeya Khatun','staff4@canteen.com','staff123','2024-01-16','1995-02-18','Staff Quarter, SUST','House 45, Sobhanbag, Sylhet','staff'),(7,'Jahangir Alam','staff5@canteen.com','staff123','2024-01-17','1987-09-30','Staff Quarter, DU','12/A, Green Road, Dhaka','staff'),(8,'Mousumi Akter','staff6@canteen.com','staff123','2024-01-17','1993-12-12','Staff Quarter, NSU','Uttara, Sector 7, Dhaka','staff'),(9,'Shahinur Islam','staff7@canteen.com','staff123','2024-01-18','1991-04-25','Staff Quarter, AIUB','Mirpur DOHS, Dhaka','staff'),(10,'Fatema Tuz Zohra','staff8@canteen.com','staff123','2024-01-18','1994-06-14','Staff Quarter, BRACU','Mohakhali, Dhaka','staff'),(11,'Abdur Rahim','staff9@canteen.com','staff123','2024-01-19','1989-08-08','Staff Quarter, IUT','Gazipur Sadar, Gazipur','staff'),(12,'Halima Begum','staff10@canteen.com','staff123','2024-01-19','1986-10-03','Staff Quarter, MIST','Cantonment, Dhaka','staff'),(13,'Shahidul Islam','staff11@canteen.com','staff123','2024-01-20','1992-01-17','Staff Quarter, KU','Thana: Kotwali, Khulna','staff'),(14,'Rina Akter','staff12@canteen.com','staff123','2024-01-20','1990-05-29','Staff Quarter, JUST','Jessore Sadar, Jessore','staff'),(15,'Ashraful Hasan','staff13@canteen.com','staff123','2024-01-21','1988-07-19','Staff Quarter, PUST','Pabna Sadar, Pabna','staff'),(16,'Taslima Begum','staff14@canteen.com','staff123','2024-01-21','1995-09-11','Staff Quarter, RU','Boalia, Rajshahi','staff'),(17,'Habibur Rahman','staff15@canteen.com','staff123','2024-01-22','1993-11-23','Staff Quarter, MBSTU','Tangail Sadar, Tangail','staff'),(18,'Rakib Hossain','customer1@email.com','cust123','2024-02-01','2000-01-15','Shaheedullah Hall, DU','Village: Charigram, Narsingdi','customer'),(19,'Sumaiya Akter','customer2@email.com','cust123','2024-02-01','1999-03-22','Rokeya Hall, DU','House 23, Natore Sadar, Natore','customer'),(20,'Tanvir Ahmed','customer3@email.com','cust123','2024-02-02','2001-05-10','Fazlul Haque Hall, BUET','Village: Dhamrai, Dhaka','customer'),(21,'Nusrat Jahan','customer4@email.com','cust123','2024-02-02','2000-07-18','Begum Khaleda Zia Hall, JU','Thana: Sadar, Mymensingh','customer'),(22,'Mehedi Hasan','customer5@email.com','cust123','2024-02-03','1998-09-25','Sher-e-Bangla Hall, CU','Village: Bhabanipur, Barisal','customer'),(23,'Tahmina Akter','customer6@email.com','cust123','2024-02-03','2001-11-30','Priyom Hall, SUST','House 5, Modhuhonpur, Sylhet','customer'),(24,'Shakil Ahmed','customer7@email.com','cust123','2024-02-04','1999-02-14','Lalon Shah Hall, RU','Village: Bagmara, Rajshahi','customer'),(25,'Farzana Akter','customer8@email.com','cust123','2024-02-04','2000-04-05','Banga Bandhu Hall, KU','Thana: Sadar, Khulna','customer'),(26,'Imran Khan','customer9@email.com','cust123','2024-02-05','2001-06-19','Moulana Bhasani Hall, RUET','Village: Shibpur, Narsingdi','customer'),(27,'Sabina Yesmin','customer10@email.com','cust123','2024-02-05','1998-08-27','Sonargaon Hall, CUET','House 12, Chandpur Sadar, Chandpur','customer'),(28,'Shakib Al Hasan','customer11@email.com','cust123','2024-02-06','2000-10-12','Jahangir Hall, BUET','Village: Magura Sadar, Magura','customer'),(29,'Mim Akter','customer12@email.com','cust123','2024-02-06','1999-12-01','Shamsunnahar Hall, RU','Thana: Sadar, Pabna','customer'),(30,'Rubel Hossain','customer13@email.com','cust123','2024-02-07','2001-01-28','Titumir Hall, DU','Village: Belabo, Narsingdi','customer'),(31,'Shila Akter','customer14@email.com','cust123','2024-02-07','2000-03-17','Begum Fazilatunnesa Hall, JU','House 8, Jhenaidah Sadar, Jhenaidah','customer'),(32,'Mashrafe Bin Mortaza','customer15@email.com','cust123','2024-02-08','1998-05-09','Suhrawardy Hall, DU','Village: Narail Sadar, Narail','customer'),(33,'Tasnia Farin','customer16@email.com','cust123','2024-02-08','2001-07-21','Ayesha Hall, CU','House 15, Kushtia Sadar, Kushtia','customer'),(34,'Riyad Hossain','customer17@email.com','cust123','2024-02-09','1999-09-14','Shahid Smriti Hall, RUET','Village: Satkhira Sadar, Satkhira','customer'),(35,'Nahida Akter','customer18@email.com','cust123','2024-02-09','2000-11-06','Kamal Apu Hall, SUST','Thana: Sadar, Sunamganj','customer'),(36,'Fahim Ahmed','customer19@email.com','cust123','2024-02-10','2001-01-24','Bangabandhu Hall, MIST','Village: Tangail Sadar, Tangail','customer'),(37,'Sadia Jahan','customer20@email.com','cust123','2024-02-10','1998-03-30','Fatema Hall, JUST','House 20, Jashore Sadar, Jashore','customer'),(38,'Hasan Mahmud','customer21@email.com','cust123','2024-02-11','2000-06-11','Sher Shah Hall, BUET','Village: Faridpur Sadar, Faridpur','customer'),(39,'Jannatul Ferdous','customer22@email.com','cust123','2024-02-11','1999-08-23','Pritilata Hall, CU','Thana: Sadar, Noakhali','customer'),(40,'Saif Ullah','customer23@email.com','cust123','2024-02-12','2001-10-15','Nawab Faizunnesa Hall, JU','Village: Lakshmipur Sadar, Lakshmipur','customer'),(41,'Khadija Akter','customer24@email.com','cust123','2024-02-12','2000-12-07','Begum Sufia Kamal Hall, DU','House 10, Bhola Sadar, Bhola','customer'),(42,'Zahid Hasan','customer25@email.com','cust123','2024-02-13','1998-02-19','Kazi Nazrul Islam Hall, RU','Village: Chapainawabganj Sadar','customer'),(43,'Mst. Sharmin','customer26@email.com','cust123','2024-02-13','2001-04-02','Indira Gandhi Hall, SUST','Thana: Sadar, Habiganj','customer'),(44,'Shahriar Nafees','customer27@email.com','cust123','2024-02-14','1999-06-13','A. F. Rahman Hall, BUET','Village: Brahmanbaria Sadar','customer'),(45,'Papiya Islam','customer28@email.com','cust123','2024-02-14','2000-08-05','Bongo Bandhu Hall, CUET','House 7, Chandpur','customer'),(46,'Nayeem Hasan','customer29@email.com','cust123','2024-02-15','2001-10-28','Dr. M. A. Wazed Miah Hall, RUET','Village: Sirajganj Sadar','customer'),(47,'Sharmin Akter','customer30@email.com','cust123','2024-02-15','1998-12-18','Rani Bilashmoni Hall, JU','Thana: Sadar, Gaibandha','customer'),(48,'Rony Hossain','customer31@email.com','cust123','2024-02-16','2000-02-09','Haji Muhammad Mohsin Hall, DU','Village: Dinajpur Sadar','customer'),(49,'Runa Laila','customer32@email.com','cust123','2024-02-16','1999-04-01','Begum Rokeya Hall, RU','House 15, Rangpur Sadar','customer'),(50,'Mamunur Rashid','customer33@email.com','cust123','2024-02-17','2001-06-23','Shaheed Abdur Rab Hall, CU','Village: Nilphamari Sadar','customer'),(51,'Afroza Begum','customer34@email.com','cust123','2024-02-17','2000-08-14','Kallyanpur Hall, NSU','Thana: Sadar, Lalmonirhat','customer'),(52,'Tareq Rahman','customer35@email.com','cust123','2024-02-18','1998-10-05','Uttara Hall, AIUB','Village: Kurigram Sadar','customer'),(53,'Moumita Saha','customer36@email.com','cust123','2024-02-18','2001-12-27','Bashundhara Hall, BRACU','House 9, Thakurgaon Sadar','customer'),(54,'Delwar Hossain','customer37@email.com','cust123','2024-02-19','1999-02-18','Green Road Hall, IUT','Village: Panchagarh Sadar','customer'),(55,'Sabrina Sultana','customer38@email.com','cust123','2024-02-19','2000-04-10','Mohakhali Hall, MIST','Thana: Sadar, Joypurhat','customer'),(56,'Sohel Rana','customer39@email.com','cust123','2024-02-20','2001-06-01','Banani Hall, DU','Village: Bogura Sadar','customer'),(57,'Kajol Begum','customer40@email.com','cust123','2024-02-20','1998-07-22','Gulshan Hall, JU','House 12, Naogaon Sadar','customer'),(58,'Russell Ahmed','customer41@email.com','cust123','2024-02-21','2000-09-13','Dhanmondi Hall, CU','Village: Netrokona Sadar','customer'),(59,'Keya Akter','customer42@email.com','cust123','2024-02-21','1999-11-04','Mirpur Hall, RUET','Thana: Sadar, Kishoreganj','customer'),(60,'Emon Hossain','customer43@email.com','cust123','2024-02-22','2001-01-26','Uttora Hall, BUET','Village: Manikganj Sadar','customer'),(61,'Tanjina Akter','customer44@email.com','cust123','2024-02-22','2000-03-17','Motijheel Hall, SUST','House 8, Munshiganj Sadar','customer'),(62,'Rashed Khan','customer45@email.com','cust123','2024-02-23','1998-05-09','Paltan Hall, KU','Village: Rajbari Sadar','customer'),(63,'Mithila Akter','customer46@email.com','cust123','2024-02-23','2001-07-31','Shantinagar Hall, JUST','Thana: Sadar, Madaripur','customer'),(64,'Tanvir Hasan','customer47@email.com','cust123','2024-02-24','1999-10-12','Malibagh Hall, DU','Village: Shariatpur Sadar','customer'),(65,'Orchita Akter','customer48@email.com','cust123','2024-02-24','2000-12-03','Rampura Hall, JU','House 5, Gopalganj Sadar','customer'),(66,'Jewel Rana','customer49@email.com','cust123','2024-02-25','2001-02-24','Khilgaon Hall, CU','Village: Narayanganj Sadar','customer'),(67,'Priya Akter','customer50@email.com','cust123','2024-02-25','1998-04-15','Jatrabari Hall, RU','Thana: Sadar, Gazipur','customer'),(68,'Shuvo Hossain','customer51@email.com','cust123','2024-02-26','2000-06-06','Demra Hall, BUET','Village: Narsingdi Sadar','customer'),(69,'Rima Begum','customer52@email.com','cust123','2024-02-26','1999-08-28','Shyampur Hall, CUET','House 3, Brahmanbaria','customer'),(70,'Likhon Ahmed','customer53@email.com','cust123','2024-02-27','2001-10-19','Kadamtali Hall, RUET','Village: Comilla Sadar','customer'),(71,'Sathi Akter','customer54@email.com','cust123','2024-02-27','2000-12-11','Keraniganj Hall, SUST','Thana: Sadar, Chandpur','customer'),(72,'Bappy Hossain','customer55@email.com','cust123','2024-02-28','1998-02-02','Nawabganj Hall, KU','Village: Sylhet Sadar','customer'),(100,'sohidul','sohidul@gmail.com','123','2026-04-18','2004-07-06','demra','feni','customer'),(101,'korim','korim@example','123','2026-04-19','2004-07-09','dhaka','borishal','staff'),(154,'nafiz','nafiz.com','asdf','2026-04-21','2004-06-09','nai','nai','staff'),(1000,'Sohidul islam','sohidulislam@example.com','123','2026-04-22','2003-07-06','Demra,dhaka','Feni','customer');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users_phone`
--

DROP TABLE IF EXISTS `users_phone`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users_phone` (
  `ID` int NOT NULL,
  `Phone` varchar(20) NOT NULL,
  PRIMARY KEY (`Phone`,`ID`),
  KEY `ID` (`ID`),
  CONSTRAINT `users_phone_ibfk_1` FOREIGN KEY (`ID`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users_phone`
--

LOCK TABLES `users_phone` WRITE;
/*!40000 ALTER TABLE `users_phone` DISABLE KEYS */;
INSERT INTO `users_phone` VALUES (1,'01710000001'),(1,'01710000002'),(2,'01810000001'),(2,'01910000002'),(3,'01710000003'),(3,'01810000003'),(4,'01710000004'),(4,'01910000004'),(5,'01510000005'),(5,'01710000005'),(6,'01610000006'),(6,'01710000006'),(7,'01710000007'),(7,'01810000007'),(8,'01710000008'),(8,'01910000008'),(9,'01510000009'),(9,'01710000009'),(10,'01610000010'),(10,'01710000010'),(11,'01710000011'),(11,'01810000011'),(12,'01710000012'),(12,'01910000012'),(13,'01510000013'),(13,'01710000013'),(14,'01610000014'),(14,'01710000014'),(15,'01710000015'),(15,'01810000015'),(16,'01710000016'),(16,'01910000016'),(17,'01510000017'),(17,'01710000017'),(18,'01610000018'),(18,'01710000018'),(19,'01710000019'),(19,'01810000019'),(20,'01710000020'),(20,'01910000020'),(21,'01510000021'),(21,'01710000021'),(22,'01610000022'),(22,'01710000022'),(23,'01710000023'),(23,'01810000023'),(24,'01710000024'),(24,'01910000024'),(25,'01510000025'),(25,'01710000025'),(26,'01610000026'),(26,'01710000026'),(27,'01710000027'),(27,'01810000027'),(28,'01710000028'),(28,'01910000028'),(29,'01510000029'),(29,'01710000029'),(30,'01610000030'),(30,'01710000030'),(31,'01710000031'),(31,'01810000031'),(32,'01710000032'),(32,'01910000032'),(33,'01510000033'),(33,'01710000033'),(34,'01610000034'),(34,'01710000034'),(35,'01710000035'),(35,'01810000035'),(36,'01710000036'),(36,'01910000036'),(37,'01510000037'),(37,'01710000037'),(38,'01610000038'),(38,'01710000038'),(39,'01710000039'),(39,'01810000039'),(40,'01710000040'),(40,'01910000040'),(41,'01510000041'),(41,'01710000041'),(42,'01610000042'),(42,'01710000042'),(43,'01710000043'),(43,'01810000043'),(44,'01710000044'),(44,'01910000044'),(45,'01510000045'),(45,'01710000045'),(46,'01610000046'),(46,'01710000046'),(47,'01710000047'),(47,'01810000047'),(48,'01710000048'),(48,'01910000048'),(49,'01510000049'),(49,'01710000049'),(50,'01610000050'),(50,'01710000050'),(51,'01710000051'),(51,'01810000051'),(52,'01710000052'),(52,'01910000052'),(53,'01510000053'),(53,'01710000053'),(54,'01610000054'),(54,'01710000054'),(55,'01710000055'),(55,'01810000055'),(56,'01710000056'),(56,'01910000056'),(57,'01510000057'),(57,'01710000057'),(58,'01610000058'),(58,'01710000058'),(59,'01710000059'),(59,'01810000059'),(60,'01710000060'),(60,'01910000060'),(61,'01510000061'),(61,'01710000061'),(62,'01610000062'),(62,'01710000062'),(63,'01710000063'),(63,'01810000063'),(64,'01710000064'),(64,'01910000064'),(65,'01510000065'),(65,'01710000065'),(66,'01610000066'),(66,'01710000066'),(67,'01710000067'),(67,'01810000067'),(68,'01710000068'),(68,'01910000068'),(69,'01510000069'),(69,'01710000069'),(70,'01610000070'),(70,'01710000070'),(71,'01710000071'),(71,'01810000071'),(72,'01710000072'),(72,'01910000072'),(100,'01776338090'),(101,'014xxxxxxx'),(154,'0177xxxxx'),(1000,'01776338090');
/*!40000 ALTER TABLE `users_phone` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-05-02 23:19:49
