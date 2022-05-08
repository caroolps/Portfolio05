create schema if not EXISTS educalytics_db;
use educalytics_db;
create user if not EXISTS 'educalytics'@'localhost' identified by 'educalytics';
grant select, insert, delete, update on educalytics.* to educalytics@'localhost';

CREATE TABLE `educalytics_db`.`login` (
    `id` BIGINT NOT NULL AUTO_INCREMENT ,
    `email` VARCHAR(255) NOT NULL ,
    `password` VARCHAR(255) NOT NULL ,
    PRIMARY KEY (`id`),
    UNIQUE `uq_login_email` (`email`)
) ENGINE = InnoDB;

CREATE TABLE `educalytics_db`.`auth` (
    `id` BIGINT NOT NULL AUTO_INCREMENT ,
    `permission` VARCHAR(100) NOT NULL ,
    PRIMARY KEY (`id`), UNIQUE `uq_auth_permission` (`permission`)
) ENGINE = InnoDB;

CREATE TABLE `educalytics_db`.`auth_login` (
    `auth_id` BIGINT NOT NULL ,
    `login_id` BIGINT NOT NULL ,
    PRIMARY KEY (`auth_id`, `login_id`),
    FOREIGN KEY auth_login_fk (`login_id`) REFERENCES login(`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY auth_auth_fk (`auth_id`) REFERENCES auth(`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE `educalytics_db`.`profile` (
    `id` BIGINT NOT NULL AUTO_INCREMENT ,
    `login_id` BIGINT NOT NULL ,
    `name` VARCHAR(255) NOT NULL ,
    `doc` VARCHAR(20) NOT NULL ,
    `gender` VARCHAR(255) NULL ,
    `birthday` DATE NULL ,
    `phone` VARCHAR(25) NULL ,
    `mobile` VARCHAR(25) NULL ,
    `created_at` DATE NULL,
    PRIMARY KEY (`id`),
    UNIQUE `profile_doc` (`doc`),
    UNIQUE `profile_login_id` (`login_id`),
    FOREIGN KEY profile_login_fk (`login_id`) REFERENCES login(`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE = InnoDB;

CREATE TABLE `educalytics_db`.`performance` (
  `prf_std_id` BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id do aluno, ou numero de matricula',
  `prf_course` VARCHAR(40) NOT NULL COMMENT 'matéria que o aluno cursa',
  `prf_partial_grade` FLOAT NOT NULL COMMENT 'nota parcial do aluno em determinada materia',
  `prf_partial_classes` INT NOT NULL COMMENT 'aulas frequentadas pelo aluno em determinada materia',
  `prf_total_classes` INT NOT NULL COMMENT 'total de aulas da materia frequentada pelo aluno\n',
  PRIMARY KEY (`prf_std_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

CREATE TABLE `educalytics_db`.`tss` (
  `tss_id` BIGINT NOT NULL AUTO_INCREMENT,
  `tss_avg_min` INT NOT NULL COMMENT 'tempo médio, parte dos minutos',
  `tss_exp_plat` FLOAT NOT NULL COMMENT 'experiencia com a plataforma',
  `tss_avg_hr` INT NOT NULL COMMENT 'tempo médio, parte das horas',
  `tss_exp_content` FLOAT NOT NULL COMMENT 'SATISFACAO MEDIA COM CONTEUDO',
  PRIMARY KEY (`tss_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COMMENT='TEMPO, SATISFACAO, SATISCACAO';

CREATE TABLE `educalytics_db`.`activation` (
  `act_id` bigint NOT NULL AUTO_INCREMENT,
  `act_num_usr` INT NOT NULL COMMENT 'numero de usuarios (ex: 350, 420, 390 etc.)',
  `act_semestre` INT NOT NULL COMMENT 'semestre: 1o semestre ou 2o semestre',
  `act_sem_year` YEAR NOT NULL COMMENT 'ano O RESULTADO É A JUNÇÃO DOS CAMPOS = 2021.2, 2021.1, 2020.2, 2020.1.',
  PRIMARY KEY (`act_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4;

INSERT INTO auth values(1, "ROLE_USER");
INSERT INTO auth values(2, "ROLE_ADMIN");
INSERT INTO login values(1, "admin", "$2a$10$i3.Z8Yv1Fwl0I5SNjdCGkOTRGQjGvHjh/gMZhdc3e7LIovAklqM6C");
INSERT INTO auth_login values(2, 1);

INSERT INTO profile values(1, 1, "Teste", "123.123.123-12", "masculino", "12/12/12", "(12)1212-1212", "(12) 1 2121-2121", CURRENT_DATE);

INSERT INTO `activation` VALUES (1,581,1,2012),(2,593,2,2012),(3,436,1,2013),(4,583,2,2013),(5,599,1,2014),(6,368,2,2014),(7,386,1,2015),(8,254,2,2015),(9,305,1,2016),(10,542,2,2016),(11,384,1,2017),(12,392,2,2017),(13,568,1,2018),(14,589,2,2018),(15,510,1,2019),(16,385,2,2019),(17,523,1,2020),(18,482,2,2020),(19,594,1,2021),(20,400,2,2021);
INSERT INTO `performance` VALUES (1,'MATH',5,32,45),(2,'MATH',6,31,45),(3,'MATH',3,26,45),(4,'MATH',7,33,45),(5,'MATH',3,26,45),(6,'MATH',1,26,45),(7,'MATH',2,36,45),(8,'MATH',7,20,45),(9,'MATH',10,28,45),(10,'MATH',4,28,45),(11,'PHYSICS',5,34,45),(12,'PHYSICS',6,26,45),(13,'PHYSICS',9,37,45),(14,'PHYSICS',7,24,45),(15,'PHYSICS',9,26,45),(16,'PHYSICS',3,26,45),(17,'PHYSICS',8,35,45),(18,'PHYSICS',5,34,45),(19,'PHYSICS',8,39,45),(20,'PHYSICS',5,21,45);
INSERT INTO `tss` VALUES (1,6,99,19,55),(2,56,99,16,64),(3,31,18,19,73),(4,40,32,0,98),(5,35,80,11,31),(6,43,32,9,36),(7,47,19,21,89),(8,49,4,23,32),(9,39,25,8,13),(10,43,67,11,21),(11,58,1,17,37),(12,22,52,4,76),(13,26,42,23,49),(14,15,93,17,72),(15,28,92,9,55),(16,32,38,3,93),(17,56,6,2,34),(18,14,79,20,44),(19,31,73,3,48),(20,18,0,18,86);

