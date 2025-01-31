-- Drop user first if they exist
DROP USER if exists 'springpokemon'@'%' ;

-- Now create user with prop privileges
CREATE USER 'springpokemon'@'%' IDENTIFIED BY 'springpokemon';

GRANT ALL PRIVILEGES ON * . * TO 'springpokemon'@'%';

CREATE DATABASE  IF NOT EXISTS `pokemon_directory`;
USE `pokemon_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `pokemon`;

CREATE TABLE `pokemones` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `generacion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` VALUES 
	(1,'Bulbasaur','Planta','Primera generacion'),
	(2,'Ivysaur','Planta','Primera generacion'),
	(3,'Venasaur','Planta','Primera generacion'),
	(4,'Charmander','Fuego','Primera generacion'),
	(5,'Charmeleon','Fuego','Primera generacion');

