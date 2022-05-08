-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: db
-- Tempo de geração: 12-Nov-2021 às 23:54
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `educalytics_db`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `activation`
--

CREATE TABLE `activation` (
  `act_id` bigint(20) NOT NULL,
  `act_num_usr` int(11) NOT NULL COMMENT 'numero de usuarios (ex: 350, 420, 390 etc.)',
  `act_semestre` int(11) NOT NULL COMMENT 'semestre: 1o semestre ou 2o semestre',
  `act_sem_year` year(4) NOT NULL COMMENT 'ano O RESULTADO É A JUNÇÃO DOS CAMPOS = 2021.2, 2021.1, 2020.2, 2020.1.'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `activation`
--

INSERT INTO `activation` (`act_id`, `act_num_usr`, `act_semestre`, `act_sem_year`) VALUES
(1, 581, 1, 2012),
(2, 593, 2, 2012),
(3, 436, 1, 2013),
(4, 583, 2, 2013),
(5, 599, 1, 2014),
(6, 368, 2, 2014),
(7, 386, 1, 2015),
(8, 254, 2, 2015),
(9, 305, 1, 2016),
(10, 542, 2, 2016),
(11, 384, 1, 2017),
(12, 392, 2, 2017),
(13, 568, 1, 2018),
(14, 589, 2, 2018),
(15, 510, 1, 2019),
(16, 385, 2, 2019),
(17, 523, 1, 2020),
(18, 482, 2, 2020),
(19, 594, 1, 2021),
(20, 400, 2, 2021);

-- --------------------------------------------------------

--
-- Estrutura da tabela `auth`
--

CREATE TABLE `auth` (
  `id` bigint(20) NOT NULL,
  `permission` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `auth`
--

INSERT INTO `auth` (`id`, `permission`) VALUES
(2, 'ROLE_ADMIN'),
(1, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Estrutura da tabela `auth_login`
--

CREATE TABLE `auth_login` (
  `auth_id` bigint(20) NOT NULL,
  `login_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `auth_login`
--

INSERT INTO `auth_login` (`auth_id`, `login_id`) VALUES
(2, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_assigments`
--

CREATE TABLE `dim_assigments` (
  `asg_id` bigint(20) NOT NULL,
  `asg_type` varchar(250) DEFAULT NULL,
  `asg_number` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_assigments`
--

INSERT INTO `dim_assigments` (`asg_id`, `asg_type`, `asg_number`) VALUES
(1, 'prova', 4),
(2, 'prova', 4),
(3, 'prova', 4),
(4, 'prova', 4),
(5, 'prova', 4),
(6, 'prova', 4),
(7, 'prova', 4),
(8, 'prova', 4),
(9, 'prova', 4),
(10, 'prova', 4),
(11, 'prova', 2),
(12, 'prova', 2),
(13, 'prova', 2),
(14, 'prova', 2),
(15, 'prova', 2),
(16, 'prova', 2),
(17, 'prova', 2),
(18, 'prova', 2),
(19, 'prova', 2),
(20, 'prova', 2),
(21, 'prova', 3),
(22, 'prova', 3),
(23, 'prova', 3),
(24, 'prova', 3),
(25, 'prova', 3),
(26, 'prova', 3),
(27, 'prova', 3),
(28, 'prova', 3),
(29, 'prova', 3),
(30, 'prova', 3),
(31, 'prova', 1),
(32, 'prova', 1),
(33, 'prova', 1),
(34, 'prova', 1),
(35, 'prova', 1),
(36, 'prova', 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_class_of`
--

CREATE TABLE `dim_class_of` (
  `idclass_of` bigint(20) NOT NULL,
  `term` varchar(15) DEFAULT NULL,
  `available` int(11) DEFAULT NULL COMMENT 'available = tempo possível na plataforma'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_class_of`
--

INSERT INTO `dim_class_of` (`idclass_of`, `term`, `available`) VALUES
(1, '1', 346),
(2, '2', 346),
(3, '3', 346),
(4, '4', 346),
(5, '5', 346),
(6, '6', 346),
(7, '7', 346),
(8, '8', 346),
(9, '9', 346),
(10, '10', 346),
(11, '11', 346),
(12, '12', 346),
(13, '13', 346),
(14, '14', 346),
(15, '15', 346),
(16, '16', 346),
(17, '17', 346),
(18, '18', 346),
(19, '19', 346),
(20, '20', 346),
(21, '21', 346),
(22, '22', 346),
(23, '23', 346),
(24, '24', 346),
(25, '25', 346),
(26, '26', 346),
(27, '27', 346),
(28, '28', 346),
(29, '29', 346),
(30, '30', 346),
(31, '31', 346),
(32, '32', 346),
(33, '33', 346),
(34, '34', 346),
(35, '35', 346),
(36, '36', 346);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_course`
--

CREATE TABLE `dim_course` (
  `crs_id` bigint(20) NOT NULL,
  `crs_name` varchar(45) DEFAULT NULL,
  `crs_num_asg` varchar(45) DEFAULT 'quantidade de avaliações da disciplina'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_course`
--

INSERT INTO `dim_course` (`crs_id`, `crs_name`, `crs_num_asg`) VALUES
(11, 'Estrutura de Dados', 'quantidade de avaliações da disciplina'),
(12, 'Algoritmos', 'quantidade de avaliações da disciplina'),
(13, 'Engenharia de Software', 'quantidade de avaliações da disciplina'),
(14, 'Arquitetura e Modelagem de Banco de Dados', 'quantidade de avaliações da disciplina'),
(15, 'Linguagem de Programação 1', 'quantidade de avaliações da disciplina'),
(16, 'Linguagem de Programação 2', 'quantidade de avaliações da disciplina'),
(17, 'Estatística Descritiva', 'quantidade de avaliações da disciplina'),
(18, 'Programação de Banco de Dados', 'quantidade de avaliações da disciplina'),
(19, 'Sistemas Operacionais', 'quantidade de avaliações da disciplina'),
(20, 'Padrões de Projetos de Sistemas', 'quantidade de avaliações da disciplina');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_programme`
--

CREATE TABLE `dim_programme` (
  `prg_id` bigint(20) NOT NULL,
  `prg_name` varchar(45) DEFAULT NULL,
  `prg_description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_programme`
--

INSERT INTO `dim_programme` (`prg_id`, `prg_name`, `prg_description`) VALUES
(13, 'Banco de dados', 'Tecnólogo'),
(14, 'Ciências da computação', 'Bacharelado'),
(15, 'Análise e desenvolvimento de sistemas', 'Tecnólogo');

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_student`
--

CREATE TABLE `dim_student` (
  `std_id` bigint(20) NOT NULL,
  `std_name` varchar(45) DEFAULT NULL,
  `std_status` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_student`
--

INSERT INTO `dim_student` (`std_id`, `std_name`, `std_status`) VALUES
(1, 'Brigg', 1),
(7, 'Karon', NULL),
(8, 'Prue', NULL),
(9, 'Bryn', NULL),
(10, 'Wilbur', NULL),
(11, 'Golda', NULL),
(12, 'Lucinda', NULL),
(13, 'Lodovico', NULL),
(14, 'Dareen', NULL),
(15, 'Gwenneth', NULL),
(16, 'Meir', NULL),
(17, 'Edward', NULL),
(18, 'Vin', NULL),
(19, 'Ives', NULL),
(20, 'Pat', NULL),
(21, 'Rowney', NULL),
(22, 'Bebe', NULL),
(23, 'Gino', NULL),
(24, 'Christi', NULL),
(25, 'Averell', NULL),
(26, 'Jeromy', NULL),
(27, 'Ransell', NULL),
(28, 'Natty', NULL),
(29, 'Mair', NULL),
(30, 'Hoebart', NULL),
(31, 'Herminia', NULL),
(32, 'Kevina', NULL),
(33, 'Cheston', NULL),
(34, 'Waldo', NULL),
(35, 'Dean', NULL),
(36, 'Gert', NULL),
(37, 'Murry', NULL),
(38, 'Grove', NULL),
(39, 'Kevina', NULL),
(40, 'Zolly', NULL),
(41, 'Celina', NULL),
(42, 'Diana', NULL),
(43, 'Sunshine', NULL),
(44, 'Osborne', NULL),
(45, 'Gloriana', NULL),
(46, 'Brianne', NULL),
(47, 'Felice', NULL),
(48, 'Gustavo', NULL),
(49, 'Keene', NULL),
(50, 'Lanni', NULL),
(51, 'Agosto', NULL),
(52, 'Gordan', NULL),
(53, 'Jennica', NULL),
(54, 'Stephen', NULL),
(55, 'Jereme', NULL),
(56, 'Agosto', NULL),
(57, 'Gordan', NULL),
(58, 'Jennica', NULL),
(59, 'Stephen', NULL),
(60, 'Jereme', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_student_participation`
--

CREATE TABLE `dim_student_participation` (
  `std_id` bigint(20) NOT NULL,
  `std_name` varchar(250) DEFAULT NULL,
  `std_status` int(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_student_participation`
--

INSERT INTO `dim_student_participation` (`std_id`, `std_name`, `std_status`) VALUES
(1, 'Brigg', 1),
(2, 'Karon', NULL),
(3, 'Prue', NULL),
(4, 'Bryn', NULL),
(5, 'Wilbur', NULL),
(6, 'Golda', NULL),
(7, 'Lucinda', NULL),
(8, 'Lodovico', NULL),
(9, 'Dareen', NULL),
(10, 'Gwenneth', NULL),
(11, 'Meir', NULL),
(12, 'Edward', NULL),
(13, 'Vin', NULL),
(14, 'Ives', NULL),
(15, 'Pat', NULL),
(16, 'Rowney', NULL),
(17, 'Bebe', NULL),
(18, 'Gino', NULL),
(19, 'Christi', NULL),
(20, 'Averell', NULL),
(21, 'Jeromy', NULL),
(22, 'Ransell', NULL),
(23, 'Natty', NULL),
(24, 'Mair', NULL),
(25, 'Hoebart', NULL),
(26, 'Herminia', NULL),
(27, 'Kevina', NULL),
(28, 'Cheston', NULL),
(29, 'Waldo', NULL),
(30, 'Dean', NULL),
(31, 'Gert', NULL),
(32, 'Murry', NULL),
(33, 'Grove', NULL),
(34, 'Kevina', NULL),
(35, 'Zolly', NULL),
(36, 'Celina', NULL),
(37, 'Diana', NULL),
(38, 'Sunshine', NULL),
(39, 'Osborne', NULL),
(40, 'Gloriana', NULL),
(41, 'Brianne', NULL),
(42, 'Felice', NULL),
(43, 'Gustavo', NULL),
(44, 'Keene', NULL),
(45, 'Lanni', NULL),
(46, 'Agosto', NULL),
(47, 'Gordan', NULL),
(48, 'Jennica', NULL),
(49, 'Stephen', NULL),
(50, 'Jereme', NULL),
(51, 'Agosto', NULL),
(52, 'Gordan', NULL),
(53, 'Jennica', NULL),
(54, 'Stephen', NULL),
(55, 'Jereme', NULL);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_time`
--

CREATE TABLE `dim_time` (
  `tim_id` bigint(20) NOT NULL,
  `tim_semestre` bigint(20) DEFAULT NULL,
  `tim_year` bigint(20) DEFAULT NULL,
  `tim_month` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_time`
--

INSERT INTO `dim_time` (`tim_id`, `tim_semestre`, `tim_year`, `tim_month`) VALUES
(1, 1, 2016, 1),
(2, 1, 2016, 2),
(3, 1, 2016, 3),
(4, 1, 2016, 4),
(5, 1, 2016, 5),
(6, 1, 2016, 6),
(7, 2, 2016, 7),
(8, 2, 2016, 8),
(9, 2, 2016, 9),
(10, 2, 2016, 10),
(11, 2, 2016, 11),
(12, 2, 2016, 12),
(13, 1, 2017, 1),
(14, 1, 2017, 2),
(15, 1, 2017, 3),
(16, 1, 2017, 4),
(17, 1, 2017, 5),
(18, 1, 2017, 6),
(19, 2, 2017, 7),
(20, 2, 2017, 8),
(21, 2, 2017, 9),
(22, 2, 2017, 10),
(23, 2, 2017, 11),
(24, 2, 2017, 12),
(25, 1, 2018, 1),
(26, 1, 2018, 2),
(27, 1, 2018, 3),
(28, 1, 2018, 4),
(29, 1, 2018, 5),
(30, 1, 2018, 6),
(31, 2, 2018, 7),
(32, 2, 2018, 8),
(33, 2, 2018, 9),
(34, 2, 2018, 10),
(35, 2, 2018, 11),
(36, 2, 2018, 12),
(37, 1, 2019, 1),
(38, 1, 2019, 2),
(39, 1, 2019, 3),
(40, 1, 2019, 4),
(41, 1, 2019, 5),
(42, 1, 2019, 6),
(43, 2, 2019, 7),
(44, 2, 2019, 8),
(45, 2, 2019, 9),
(46, 2, 2019, 10),
(47, 2, 2019, 11),
(48, 2, 2019, 12),
(49, 1, 2020, 1),
(50, 1, 2020, 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `dim_time_participation`
--

CREATE TABLE `dim_time_participation` (
  `tim_id` bigint(20) NOT NULL,
  `chat_created_at` datetime DEFAULT NULL,
  `chat_disconnect` varchar(50) DEFAULT NULL,
  `chat_hash_connect` varchar(50) DEFAULT NULL,
  `chat_from` varchar(50) DEFAULT NULL,
  `chat_id` varchar(50) DEFAULT NULL,
  `chat_user_id` int(11) DEFAULT NULL,
  `chat_update_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `dim_time_participation`
--

INSERT INTO `dim_time_participation` (`tim_id`, `chat_created_at`, `chat_disconnect`, `chat_hash_connect`, `chat_from`, `chat_id`, `chat_user_id`, `chat_update_at`) VALUES
(1, '2021-11-01 20:55:35', 'Mon Nov 01 20:58:54 BRT 2021', '457c1b94-729b-486c-88a2-86955986dec0', 'vjCmwe4mD1XMjsbcAAAB', '61807e779e90d796da4c1f70', 1, '2021-11-01 20:58:55'),
(2, '2021-11-01 21:08:26', 'Mon Nov 01 21:08:47 BRT 2021', '457c1b94-729b-486c-88a2-86955986dec0', 'hZxh4hrPa3kEsIoNAAAB', '6180817a5953a86d61f5d171', 1, '2021-11-01 21:08:48'),
(3, '2021-11-01 21:12:03', 'Mon Nov 01 21:13:15 BRT 2021', '457c1b94-729b-486c-88a2-86955986dec0', 'Mkg0vUaT0Lufp0fNAAAB', '61808253630e3bf2d3790ca1', 1, '2021-11-01 21:13:16'),
(4, '2021-11-01 21:53:47', 'Mon Nov 01 21:55:28 BRT 2021', '457c1b94-729b-486c-88a2-86955986dec0', '-2kNS_H57k779yWUAAAB', '61808c1b668a1a5eb9fb6ab3', 2, '2021-11-01 21:55:29'),
(5, '2021-10-23 16:55:35', 'Mon Nov 01 20:58:54 BRT 2021', '457c1b94-729b-486c-88a2-86955986dec0', 'vjCmwe4mD1XMjsbcAAAB', '61812c431e9815b89abccdfc', 2, '2021-10-23 16:58:55'),
(6, '2021-11-02 11:09:27', 'Tue Nov 02 11:10:09 BRT 2021', '316d6d79-5077-41da-9b2a-86436657c020', 'S8h1B0Vc9cAEvWx1AAAB', '61814697648a8841fcf0c541', 3, '2021-11-02 11:10:09'),
(7, '2021-11-02 11:16:44', NULL, '316d6d79-5077-41da-9b2a-86436657c020', 'jZgwFycS3jHJGGxyAAAj', '6181484c648a8841fcf0c546', 3, '2021-11-02 11:16:44'),
(8, '2021-11-02 11:34:38', NULL, 'c466943f-e969-4200-92bb-74260115f248', 'SUt1p3_Z963dUDjkAAAp', '61814c7e648a8841fcf0c54f', 4, '2021-11-02 11:34:38'),
(9, '2021-11-02 11:34:45', NULL, 'c466943f-e969-4200-92bb-74260115f248', 'SUt1p3_Z963dUDjkAAAp', '61814c84648a8841fcf0c551', 4, '2021-11-02 11:34:45'),
(10, '2021-11-02 11:46:04', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', 'Mu118ap_zDHxo-EZAAAp', '61814f2b42caf41c6af98de0', 1, '2021-11-02 11:46:04'),
(11, '2021-11-02 11:49:31', NULL, 'c466943f-e969-4200-92bb-74260115f248', '7m3aAe6Z1ezSJtfOAABD', '61814ffb42caf41c6af98de8', 5, '2021-11-02 11:49:31'),
(12, '2021-11-02 11:57:38', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', 'OXITGr59RjLaubK2AABv', '618151e242caf41c6af98df4', 9, '2021-11-02 11:57:38'),
(13, '2021-11-02 11:59:45', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', 'OXITGr59RjLaubK2AABv', '6181526142caf41c6af98dfc', 9, '2021-11-02 11:59:45'),
(14, '2021-11-02 12:13:37', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', 'zBbOD_27MV2WmWwLAAAf', '618155a1c97729c44d002053', 11, '2021-11-02 12:13:37'),
(15, '2021-11-02 12:16:10', 'Tue Nov 02 12:16:26 BRT 2021', '94b1500a-4ee9-42e7-8488-b3fea076544f', 'u7G-tZzH1SdFhkEQAAAx', '6181563ac97729c44d00205f', 12, '2021-11-02 12:16:26'),
(16, '2021-11-02 12:19:18', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', '27O6rhEnY_BmlthXAAAz', '618156f6c97729c44d002065', 1, '2021-11-02 12:19:18'),
(17, '2021-11-02 12:22:33', 'Tue Nov 02 12:23:00 BRT 2021', '7dd06779-771b-4ae6-882b-91785ea5727e', 'JhdPYDaVkj_88uKlAAA3', '618157b8c97729c44d002075', 22, '2021-11-02 12:23:00'),
(18, '2021-11-02 12:24:37', NULL, '7dd06779-771b-4ae6-882b-91785ea5727e', 'ao2gK34vC1QMQRtFAAA5', '61815835c97729c44d002079', 33, '2021-11-02 12:24:37'),
(19, '2021-11-04 20:02:18', NULL, '456ef5b8-0102-4377-a5a6-39c8bf29d799', 'iFTcaDjIRIIMCnWMAAAF', '61846679f674bda744ffc53a', 50, '2021-11-04 20:02:18');

-- --------------------------------------------------------

--
-- Estrutura da tabela `fact_participation`
--

CREATE TABLE `fact_participation` (
  `acc_elap` float NOT NULL,
  `term` varchar(250) NOT NULL,
  `available` float NOT NULL,
  `dim_time_tim_id` bigint(20) NOT NULL,
  `dim_assigments_asg_id` bigint(20) NOT NULL,
  `dim_student_std_id` bigint(20) NOT NULL,
  `dim_class_of_idclass_of` bigint(20) NOT NULL,
  `par_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fact_participation`
--

INSERT INTO `fact_participation` (`acc_elap`, `term`, `available`, `dim_time_tim_id`, `dim_assigments_asg_id`, `dim_student_std_id`, `dim_class_of_idclass_of`, `par_id`) VALUES
(336, '2020.1', 346, 1, 1, 1, 1, 1),
(250, '2020.1', 346, 2, 2, 2, 2, 2),
(150, '2020.1', 346, 3, 3, 3, 3, 3),
(370, '2020.1', 346, 4, 4, 4, 4, 4),
(270, '2020.1', 346, 5, 5, 5, 5, 5),
(170, '2020.1', 346, 6, 6, 6, 6, 6),
(130, '2020.1', 346, 7, 7, 7, 7, 7),
(228, '2020.1', 346, 8, 8, 8, 8, 8),
(118, '2020.1', 346, 9, 9, 9, 9, 9),
(341, '2020.1', 346, 10, 10, 10, 10, 10),
(97, '2020.1', 346, 11, 11, 11, 11, 11),
(344, '2020.1', 346, 12, 12, 12, 12, 12),
(327, '2020.1', 346, 13, 13, 13, 13, 13),
(336, '2020.1', 346, 14, 14, 14, 14, 14),
(250, '2020.1', 346, 15, 15, 15, 15, 15),
(150, '2020.1', 346, 16, 16, 16, 16, 16),
(370, '2020.1', 346, 17, 17, 17, 17, 17),
(270, '2020.1', 346, 18, 18, 18, 18, 18),
(170, '2020.1', 346, 19, 19, 19, 19, 19);

-- --------------------------------------------------------

--
-- Estrutura da tabela `fact_performance`
--

CREATE TABLE `fact_performance` (
  `pfc_std_grade` float NOT NULL,
  `prg_id` bigint(20) NOT NULL,
  `crs_id` bigint(20) NOT NULL,
  `std_id` bigint(20) NOT NULL,
  `tim_id` bigint(20) NOT NULL,
  `prf_id` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `fact_performance`
--

INSERT INTO `fact_performance` (`pfc_std_grade`, `prg_id`, `crs_id`, `std_id`, `tim_id`, `prf_id`) VALUES
(8.5, 13, 11, 10, 1, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`id`, `email`, `password`) VALUES
(1, 'admin', '$2a$10$i3.Z8Yv1Fwl0I5SNjdCGkOTRGQjGvHjh/gMZhdc3e7LIovAklqM6C');

-- --------------------------------------------------------

--
-- Estrutura da tabela `performance`
--

CREATE TABLE `performance` (
  `prf_std_id` bigint(20) NOT NULL COMMENT 'id do aluno, ou numero de matricula',
  `prf_course` varchar(40) NOT NULL COMMENT 'matéria que o aluno cursa',
  `prf_partial_grade` float NOT NULL COMMENT 'nota parcial do aluno em determinada materia',
  `prf_partial_classes` int(11) NOT NULL COMMENT 'aulas frequentadas pelo aluno em determinada materia',
  `prf_total_classes` int(11) NOT NULL COMMENT 'total de aulas da materia frequentada pelo aluno\n'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `performance`
--

INSERT INTO `performance` (`prf_std_id`, `prf_course`, `prf_partial_grade`, `prf_partial_classes`, `prf_total_classes`) VALUES
(1, 'MATH', 5, 32, 45),
(2, 'MATH', 6, 31, 45),
(3, 'MATH', 3, 26, 45),
(4, 'MATH', 7, 33, 45),
(5, 'MATH', 3, 26, 45),
(6, 'MATH', 1, 26, 45),
(7, 'MATH', 2, 36, 45),
(8, 'MATH', 7, 20, 45),
(9, 'MATH', 10, 28, 45),
(10, 'MATH', 4, 28, 45),
(11, 'PHYSICS', 5, 34, 45),
(12, 'PHYSICS', 6, 26, 45),
(13, 'PHYSICS', 9, 37, 45),
(14, 'PHYSICS', 7, 24, 45),
(15, 'PHYSICS', 9, 26, 45),
(16, 'PHYSICS', 3, 26, 45),
(17, 'PHYSICS', 8, 35, 45),
(18, 'PHYSICS', 5, 34, 45),
(19, 'PHYSICS', 8, 39, 45),
(20, 'PHYSICS', 5, 21, 45);

-- --------------------------------------------------------

--
-- Estrutura da tabela `profile`
--

CREATE TABLE `profile` (
  `id` bigint(20) NOT NULL,
  `login_id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `doc` varchar(20) NOT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `phone` varchar(25) DEFAULT NULL,
  `mobile` varchar(25) DEFAULT NULL,
  `created_at` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `profile`
--

INSERT INTO `profile` (`id`, `login_id`, `name`, `doc`, `gender`, `birthday`, `phone`, `mobile`, `created_at`) VALUES
(1, 1, 'Teste', '123.123.123-12', 'masculino', '2012-12-12', '(12)1212-1212', '(12) 1 2121-2121', '2021-11-10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `tss`
--

CREATE TABLE `tss` (
  `tss_id` bigint(20) NOT NULL,
  `tss_avg_min` int(11) NOT NULL COMMENT 'tempo médio, parte dos minutos',
  `tss_exp_plat` float NOT NULL COMMENT 'experiencia com a plataforma',
  `tss_avg_hr` int(11) NOT NULL COMMENT 'tempo médio, parte das horas',
  `tss_exp_content` float NOT NULL COMMENT 'SATISFACAO MEDIA COM CONTEUDO'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='TEMPO, SATISFACAO, SATISCACAO';

--
-- Extraindo dados da tabela `tss`
--

INSERT INTO `tss` (`tss_id`, `tss_avg_min`, `tss_exp_plat`, `tss_avg_hr`, `tss_exp_content`) VALUES
(1, 6, 99, 19, 55),
(2, 56, 99, 16, 64),
(3, 31, 18, 19, 73),
(4, 40, 32, 0, 98),
(5, 35, 80, 11, 31),
(6, 43, 32, 9, 36),
(7, 47, 19, 21, 89),
(8, 49, 4, 23, 32),
(9, 39, 25, 8, 13),
(10, 43, 67, 11, 21),
(11, 58, 1, 17, 37),
(12, 22, 52, 4, 76),
(13, 26, 42, 23, 49),
(14, 15, 93, 17, 72),
(15, 28, 92, 9, 55),
(16, 32, 38, 3, 93),
(17, 56, 6, 2, 34),
(18, 14, 79, 20, 44),
(19, 31, 73, 3, 48),
(20, 18, 0, 18, 86);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `activation`
--
ALTER TABLE `activation`
  ADD PRIMARY KEY (`act_id`);

--
-- Índices para tabela `auth`
--
ALTER TABLE `auth`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_auth_permission` (`permission`);

--
-- Índices para tabela `auth_login`
--
ALTER TABLE `auth_login`
  ADD PRIMARY KEY (`auth_id`,`login_id`),
  ADD KEY `auth_login_fk` (`login_id`);

--
-- Índices para tabela `dim_assigments`
--
ALTER TABLE `dim_assigments`
  ADD PRIMARY KEY (`asg_id`);

--
-- Índices para tabela `dim_class_of`
--
ALTER TABLE `dim_class_of`
  ADD PRIMARY KEY (`idclass_of`);

--
-- Índices para tabela `dim_course`
--
ALTER TABLE `dim_course`
  ADD PRIMARY KEY (`crs_id`);

--
-- Índices para tabela `dim_programme`
--
ALTER TABLE `dim_programme`
  ADD PRIMARY KEY (`prg_id`);

--
-- Índices para tabela `dim_student`
--
ALTER TABLE `dim_student`
  ADD PRIMARY KEY (`std_id`);

--
-- Índices para tabela `dim_student_participation`
--
ALTER TABLE `dim_student_participation`
  ADD PRIMARY KEY (`std_id`);

--
-- Índices para tabela `dim_time`
--
ALTER TABLE `dim_time`
  ADD PRIMARY KEY (`tim_id`),
  ADD KEY `idx_dim_time_lookup` (`tim_id`);

--
-- Índices para tabela `dim_time_participation`
--
ALTER TABLE `dim_time_participation`
  ADD PRIMARY KEY (`tim_id`);

--
-- Índices para tabela `fact_participation`
--
ALTER TABLE `fact_participation`
  ADD PRIMARY KEY (`par_id`),
  ADD KEY `fk_fact_participation_dim_time_idx` (`dim_time_tim_id`),
  ADD KEY `fk_fact_participation_dim_assigments1_idx` (`dim_assigments_asg_id`),
  ADD KEY `fk_fact_participation_dim_student1_idx` (`dim_student_std_id`),
  ADD KEY `fk_fact_participation_dim_class_of1_idx` (`dim_class_of_idclass_of`);

--
-- Índices para tabela `fact_performance`
--
ALTER TABLE `fact_performance`
  ADD PRIMARY KEY (`prf_id`);

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_login_email` (`email`);

--
-- Índices para tabela `performance`
--
ALTER TABLE `performance`
  ADD PRIMARY KEY (`prf_std_id`);

--
-- Índices para tabela `profile`
--
ALTER TABLE `profile`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `profile_doc` (`doc`),
  ADD UNIQUE KEY `profile_login_id` (`login_id`);

--
-- Índices para tabela `tss`
--
ALTER TABLE `tss`
  ADD PRIMARY KEY (`tss_id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `activation`
--
ALTER TABLE `activation`
  MODIFY `act_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `auth`
--
ALTER TABLE `auth`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `dim_assigments`
--
ALTER TABLE `dim_assigments`
  MODIFY `asg_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `dim_class_of`
--
ALTER TABLE `dim_class_of`
  MODIFY `idclass_of` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT de tabela `dim_course`
--
ALTER TABLE `dim_course`
  MODIFY `crs_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `dim_programme`
--
ALTER TABLE `dim_programme`
  MODIFY `prg_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de tabela `dim_student`
--
ALTER TABLE `dim_student`
  MODIFY `std_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de tabela `dim_student_participation`
--
ALTER TABLE `dim_student_participation`
  MODIFY `std_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT de tabela `dim_time`
--
ALTER TABLE `dim_time`
  MODIFY `tim_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de tabela `dim_time_participation`
--
ALTER TABLE `dim_time_participation`
  MODIFY `tim_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `fact_participation`
--
ALTER TABLE `fact_participation`
  MODIFY `par_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de tabela `fact_performance`
--
ALTER TABLE `fact_performance`
  MODIFY `prf_id` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `performance`
--
ALTER TABLE `performance`
  MODIFY `prf_std_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id do aluno, ou numero de matricula', AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de tabela `profile`
--
ALTER TABLE `profile`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `tss`
--
ALTER TABLE `tss`
  MODIFY `tss_id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `auth_login`
--
ALTER TABLE `auth_login`
  ADD CONSTRAINT `auth_auth_fk` FOREIGN KEY (`auth_id`) REFERENCES `auth` (`id`) ON UPDATE CASCADE,
  ADD CONSTRAINT `auth_login_fk` FOREIGN KEY (`login_id`) REFERENCES `login` (`id`) ON UPDATE CASCADE;

--
-- Limitadores para a tabela `profile`
--
ALTER TABLE `profile`
  ADD CONSTRAINT `profile_login_fk` FOREIGN KEY (`login_id`) REFERENCES `login` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
