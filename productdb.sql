CREATE DATABASE `productdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `product` (
  `product_id` bigint NOT NULL AUTO_INCREMENT,
  `discount` double DEFAULT NULL,
  `final_price` double DEFAULT NULL,
  `product_category` varchar(255) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `product_price` double NOT NULL,
  `product_type` varchar(255) NOT NULL,
  `id` bigint DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  KEY `FKl862hyblvkm76312lq73etw8u` (`id`),
  CONSTRAINT `FKl862hyblvkm76312lq73etw8u` FOREIGN KEY (`id`) REFERENCES `charge` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1007 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `charge` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `delivery` double NOT NULL,
  `gst` double NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
ALTER TABLE productdb.product auto_increment = 1001;
ALTER TABLE productdb.charge auto_increment = 1;