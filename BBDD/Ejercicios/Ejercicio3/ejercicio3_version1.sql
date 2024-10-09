-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2024 a las 12:34:31
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `ejercicio3_version1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `especie`
--

CREATE TABLE `especie` (
  `CodEsp` int(11) NOT NULL,
  `NomEsp` varchar(45) NOT NULL,
  `AltEsp` decimal(4,2) NOT NULL,
  `PesEsp` decimal(6,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `esp_mov`
--

CREATE TABLE `esp_mov` (
  `CodEsp` int(11) NOT NULL,
  `CodMov` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `CodMov` int(11) NOT NULL,
  `DesMov` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `especie`
--
ALTER TABLE `especie`
  ADD PRIMARY KEY (`CodEsp`);

--
-- Indices de la tabla `esp_mov`
--
ALTER TABLE `esp_mov`
  ADD PRIMARY KEY (`CodEsp`,`CodMov`),
  ADD KEY `CodMov` (`CodMov`);

--
-- Indices de la tabla `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`CodMov`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `esp_mov`
--
ALTER TABLE `esp_mov`
  ADD CONSTRAINT `esp_mov_ibfk_1` FOREIGN KEY (`CodEsp`) REFERENCES `especie` (`CodEsp`),
  ADD CONSTRAINT `esp_mov_ibfk_2` FOREIGN KEY (`CodMov`) REFERENCES `movimiento` (`CodMov`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
