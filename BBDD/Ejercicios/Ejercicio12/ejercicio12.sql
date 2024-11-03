-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-11-2024 a las 02:30:31
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
-- Base de datos: `ejercicio12`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `baña`
--

CREATE TABLE `baña` (
  `km` int(11) NOT NULL,
  `CodPro` int(11) NOT NULL,
  `CodRio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `baña`
--

INSERT INTO `baña` (`km`, `CodPro`, `CodRio`) VALUES
(25, 1, 1),
(30, 2, 1),
(10, 3, 2),
(15, 4, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comunidad`
--

CREATE TABLE `comunidad` (
  `CodCom` int(11) NOT NULL,
  `NomCom` varchar(20) NOT NULL,
  `NumHabCom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comunidad`
--

INSERT INTO `comunidad` (`CodCom`, `NomCom`, `NumHabCom`) VALUES
(1, 'Comunidad A', 50000),
(2, 'Comunidad B', 75000),
(3, 'Comunidad C', 30000);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `CodPro` int(11) NOT NULL,
  `NomPro` varchar(20) NOT NULL,
  `NumHabPro` int(11) NOT NULL,
  `CodCom` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`CodPro`, `NomPro`, `NumHabPro`, `CodCom`) VALUES
(1, 'Provincia A', 20000, 1),
(2, 'Provincia B', 30000, 1),
(3, 'Provincia C', 25000, 2),
(4, 'Provincia D', 15000, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rio`
--

CREATE TABLE `rio` (
  `CodRio` int(11) NOT NULL,
  `NomRio` varchar(20) NOT NULL,
  `LonRio` float NOT NULL,
  `CauRio` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rio`
--

INSERT INTO `rio` (`CodRio`, `NomRio`, `LonRio`, `CauRio`) VALUES
(1, 'Río A', 150.5, 120),
(2, 'Río B', 200, 80),
(3, 'Río C', 90.3, 200.5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `baña`
--
ALTER TABLE `baña`
  ADD PRIMARY KEY (`CodPro`,`CodRio`),
  ADD KEY `CodRio` (`CodRio`);

--
-- Indices de la tabla `comunidad`
--
ALTER TABLE `comunidad`
  ADD PRIMARY KEY (`CodCom`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`CodPro`),
  ADD KEY `CodCom` (`CodCom`);

--
-- Indices de la tabla `rio`
--
ALTER TABLE `rio`
  ADD PRIMARY KEY (`CodRio`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `baña`
--
ALTER TABLE `baña`
  ADD CONSTRAINT `baña_ibfk_1` FOREIGN KEY (`CodPro`) REFERENCES `provincia` (`CodPro`),
  ADD CONSTRAINT `baña_ibfk_2` FOREIGN KEY (`CodRio`) REFERENCES `rio` (`CodRio`);

--
-- Filtros para la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD CONSTRAINT `provincia_ibfk_1` FOREIGN KEY (`CodCom`) REFERENCES `comunidad` (`CodCom`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
