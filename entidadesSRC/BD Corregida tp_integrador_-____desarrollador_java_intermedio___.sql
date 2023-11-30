-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2023 at 06:06 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tp integrador - “desarrollador java intermedio”`
--
CREATE DATABASE IF NOT EXISTS `tp integrador - “desarrollador java intermedio”` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `tp integrador - “desarrollador java intermedio”`;

-- --------------------------------------------------------

--
-- Table structure for table `equipo`
--

CREATE TABLE `equipo` (
  `idEquipo` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `titulares` int(11) NOT NULL,
  `suplentes` int(11) NOT NULL,
  `directorTecnico` varchar(100) NOT NULL,
  `puntos` int(11) NOT NULL,
  `partidosJugados` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `equipo`
--

INSERT INTO `equipo` (`idEquipo`, `nombre`, `titulares`, `suplentes`, `directorTecnico`, `puntos`, `partidosJugados`, `estado`) VALUES
(1, 'Boca', 11, 7, 'Mariano Herron', 3, 1, 1),
(2, 'River', 11, 7, 'Marin Demichelis', 0, 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `puntajes`
--

CREATE TABLE `puntajes` (
  `idEquipo` int(11) NOT NULL,
  `puntos` int(11) NOT NULL,
  `PG` int(11) NOT NULL,
  `PE` int(11) NOT NULL,
  `PP` int(11) NOT NULL,
  `fecha` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `puntajes`
--

INSERT INTO `puntajes` (`idEquipo`, `puntos`, `PG`, `PE`, `PP`, `fecha`) VALUES
(1, 3, 1, 0, 0, '30/11/23'),
(2, 0, 0, 0, 1, '30/11/23');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `equipo`
--
ALTER TABLE `equipo`
  ADD KEY `idEquipo` (`idEquipo`);

--
-- Indexes for table `puntajes`
--
ALTER TABLE `puntajes`
  ADD PRIMARY KEY (`idEquipo`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `puntajes`
--
ALTER TABLE `puntajes`
  ADD CONSTRAINT `puntajes_ibfk_1` FOREIGN KEY (`idEquipo`) REFERENCES `equipo` (`idEquipo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
