-- phpMyAdmin SQL Dump
-- version 5.2.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 29 sep. 2026 à 9h45
-- Version du serveur : 8.4.7
-- Version de PHP : 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Structure de la table `sotc_training_course`
--
DROP TABLE IF EXISTS sotc_training_course;
CREATE TABLE sotc_training_course (
	tc_id_training_course int(10)NOT NULL AUTO_INCREMENT,
	tc_name varchar(30) NOT NULL,
	tc_description varchar(250),
	tc_duration_in_days int(4) NOT NULL,
	tc_in_person boolean NOT NULL,
	tc_remotely boolean NOT NULL ,
	tc_unitary_price float(8) NOT NULL DEFAULT 0,
	tc_is_available boolean NOT NULL
	PRIMARY KEY (`tc_id_training_course`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `sotc_training_course`
--

INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Apprenez à programmer en Java","Dans ce cours, apprenez les bases de la programmation en Java, prenez en main la programmation orientée objet et perfectionnez votre maîtrise de Java.", 10, TRUE,TRUE, 200 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Créez une application Java avec Spring Boot","", 8, TRUE, TRUE,  160 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Créez une maquette web avec Figma","Decouvrez comment construire le rendu visuel d'une page web.", 6, FALSE,TRUE, 120 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Créez des pages web dynamiques avec JavaScript","Manipulez le DOM, rendez votre page web dynamique, utilisez une API HTTP pour interagir avec un service web, et utilisez des librairies pour enrichir votre page web.", 12, TRUE, TRUE, 240 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Découvrez TypeScript","Apprenez à écrire en TypeScript pour détecter vos erreurs de code avant même que vous exécutiez votre code !", 4, TRUE, FALSE, 80 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Adoptez Visual Studio comme environnement de développement","Prenez en main l'IDE Visual Studio pour créer et manipuler un projet de développement ! Vous découvrirez les avantages d'un IDE par rapport à un simple éditeur de code comme Visual Studio Code.", 10, FALSE, TRUE, 200 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Testez votre code Java pour réaliser des applications de qualité","", 10, FALSE, TRUE, 200 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Créez votre site web avec HTML5 et CSS3","", 15, TRUE,FALSE, 300);
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Requêtez une base de données avec SQL","Initiez-vous à la modélisation relationnelle et construisez des requêtes SQL avec des fonctions pertinentes pour alimenter vos data analyses avec les bonnes données.", 12, TRUE, TRUE, 240 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Gérez du code avec Git et GitHub","", 6, TRUE, TRUE, 120 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Découvrez l'univers de la cybersécurité","Comprenez le déroulement des cyberattaques, enjeu majeur de société, et découvrez l’ensemble des métiers qui participent à la cybersécurité. Peut-être vous demain ?", 4, TRUE, FALSE, 80 );
INSERT INTO sotc_training_course ( tc_name, tc_description, tc_duration_in_days, tc_in_person, tc_remotely, tc_unitary_price ) VALUES ( "Débutez avec Angular","", 10, FALSE, TRUE, 200 );

SELECT * FROM sotc_training_course;

--
-- Structure de la table `sotc_cart`
--
DROP TABLE IF EXISTS sotc_cart;
CREATE TABLE sotc_cart (
	ca_id_cart int(10) NOT NULL AUTO_INCREMENT,
	ca_total_price float(30) NOT NULL,
	ca_id_user int(10) NOT NULL,
	ca_id_customer	int(10) NOT NULL,
	PRIMARY KEY (`ca_id_cart`),
	KEY `ca_id_user` (`ca_id_user`),
	KEY `ca_id_customer` (`ca_id_customer`)
 )ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
 
 
--
-- Structure de la table `sotc_user`
--
DROP TABLE IF EXISTS sotc_user;
 CREATE TABLE sotc_user (
	us_id_user int(10) NOT NULL AUTO_INCREMENT,
	us_login varchar(20)  UNIQUE NOT NULL,
	us_password varchar(20) NOT NULL,
	PRIMARY KEY (`us_id_user`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `sotc_user`
--


INSERT INTO sotc_user (us_login, us_password) VALUES ("test", "123");
INSERT INTO sotc_user (us_login, us_password) VALUES ("test1","456");
INSERT INTO sotc_user (us_login, us_password ) VALUES ("test2","789");
 
--
-- Structure de la table `sotc_customer`
--
DROP TABLE IF EXISTS sotc_customer;
CREATE TABLE sotc_customer (
	cu_id_customer	int(10) NOT NULL AUTO_INCREMENT,
	cu_lastname varchar(50) NOT NULL,
	cu_firstname varchar(50) NOT NULL,
	cu_email varchar(45) NOT NULL,
	cu_address	varchar(90) NOT NULL,	
	cu_phone_number varchar(45) NOT NULL, 
	PRIMARY KEY (`cu_id_customer`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Déchargement des données de la table `sotc_customer`
--


INSERT INTO sotc_customer (cu_lastname, cu_firstname, cu_email, cu_address, cu_phone_number) VALUES ("test", "test","test@gmail.com","rue des templiers 33000 Bordeaux","0556764532");
INSERT INTO sotc_customer (cu_lastname, cu_firstname, cu_email, cu_address, cu_phone_number) VALUES ("test1","test1","test1@gmail.com","rue du furet 33700 Mérignac","0557438712");
INSERT INTO sotc_customer (cu_lastname, cu_firstname, cu_email, cu_address, cu_phone_number) VALUES ("test2","test2","test2@gmail.com","allée des myrtille 33500 Libourne","0645983452");
 
--
-- Structure de la table `sotc_orders`
-- 
DROP TABLE IF EXISTS sotc_order;
CREATE TABLE sotc_order (
	or_id_order int(10) NOT NULL AUTO_INCREMENT,
	or_quantity int(10) NOT NULL DEFAULT 0,
	or_id_cart int(10) NOT NULL,
	PRIMARY KEY (`or_id_order`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Structure de la table `sotc_user_order`
--
DROP TABLE IF EXISTS sotc_user_order;
CREATE TABLE sotc_user_order (
	us_or_id_user	int(10)	NOT NULL,
	us_or_id_order int(10) NOT NULL,
	PRIMARY KEY (`us_or_id_user`,`us_or_id_order`),
	KEY `us_or_id_order` (`us_or_id_order`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Structure de la table `sotc_training_course_cart`
--
DROP TABLE IF EXISTS sotc_training_course_cart;
CREATE TABLE sotc_training_course_cart (
	tc_ca_id_training_course int(10) NOT NULL,
	tc_ca_id_cart int(10) NOT NULL,
	PRIMARY KEY (`tc_ca_id_training_course`,`tc_ca_id_cart`),
    KEY `tc_ca_id_cart` (`tc_ca_id_cart`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Contraintes pour la table `gd_article_fournisseur`
--
ALTER TABLE `sotc_training_course_cart`
ADD CONSTRAINT `sotc_training_course_cart_ibfk_1` FOREIGN KEY (`tc_ca_id_training_course`) REFERENCES `sotc_training_course` (`tc_id_training_course`),
ADD CONSTRAINT `sotc_training_course_cart_ibfk_2` FOREIGN KEY (`tc_ca_id_cart`) REFERENCES `sotc_cart` (`ca_id_cart`);
  
  
ALTER TABLE `sotc_user_order`
ADD CONSTRAINT `sotc_user_order_ibfk_1` FOREIGN KEY (`us_or_id_user`) REFERENCES `sotc_user` (`us_id_user`),
ADD CONSTRAINT `sotc_user_order_ibfk_2` FOREIGN KEY (`us_or_id_order`) REFERENCES `sotc_order` (`or_id_order`);