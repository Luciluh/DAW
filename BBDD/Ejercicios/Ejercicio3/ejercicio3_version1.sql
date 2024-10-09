-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2024 a las 23:54:15
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

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

--
-- Volcado de datos para la tabla `especie`
--

INSERT INTO `especie` (`CodEsp`, `NomEsp`, `AltEsp`, `PesEsp`) VALUES
(1, 'Pikachu', 34.10, 101.12),
(2, 'Eevee', 66.50, 123.12),
(3, 'Lapras', 77.43, 234.32),
(4, 'Ratata', 54.10, 412.12),
(5, 'Diglet', 87.10, 601.12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `esp_mov`
--

CREATE TABLE `esp_mov` (
  `CodEsp` int(11) NOT NULL,
  `CodMov` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `esp_mov`
--

INSERT INTO `esp_mov` (`CodEsp`, `CodMov`) VALUES
(1, 1),
(1, 2),
(1, 7),
(2, 2),
(2, 3),
(2, 6),
(3, 2),
(3, 5),
(4, 2),
(4, 3),
(4, 6),
(4, 7),
(5, 2),
(5, 4),
(5, 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento`
--

CREATE TABLE `movimiento` (
  `CodMov` int(11) NOT NULL,
  `DesMov` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `movimiento`
--

INSERT INTO `movimiento` (`CodMov`, `DesMov`) VALUES
(1, 'Impactrueno'),
(2, 'Placaje'),
(3, 'Mordisco'),
(4, 'Excavar'),
(5, 'Surf'),
(6, 'Látigo'),
(7, 'Ataque rápido'),
(8, 'Bola sombra');

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
