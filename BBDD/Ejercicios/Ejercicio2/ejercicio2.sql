-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-10-2024 a las 23:01:39
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
-- Base de datos: `ejercicio2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coche`
--

CREATE TABLE `coche` (
  `MatCoc` varchar(10) NOT NULL,
  `ColCoc` varchar(45) NOT NULL,
  `PueCoc` int(11) NOT NULL,
  `CabCoc` int(11) NOT NULL,
  `CenCoc` int(11) NOT NULL,
  `CodCoc` int(11) NOT NULL,
  `AntCoc` date NOT NULL,
  `CodMod` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `coche`
--

INSERT INTO `coche` (`MatCoc`, `ColCoc`, `PueCoc`, `CabCoc`, `CenCoc`, `CodCoc`, `AntCoc`, `CodMod`) VALUES
('1243ASD', 'Azul', 5, 100, 50, 1, '2003-10-31', 5),
('5553PJD', 'Rojo', 4, 140, 90, 2, '2009-11-14', 2),
('3343GVD', 'Blanco', 2, 50, 30, 3, '2015-01-11', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `CodMar` int(11) NOT NULL,
  `NomMar` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`CodMar`, `NomMar`) VALUES
(1, 'OPEL'),
(2, 'BMW'),
(3, 'SEAT'),
(4, 'RENAULT'),
(5, 'PORSHE');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

CREATE TABLE `modelo` (
  `CodMod` int(11) NOT NULL,
  `NomMod` varchar(45) NOT NULL,
  `CodMar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `modelo`
--

INSERT INTO `modelo` (`CodMod`, `NomMod`, `CodMar`) VALUES
(1, 'Corsa', 1),
(2, 'Astra', 1),
(3, '330d', 2),
(4, 'Toledo', 3),
(5, 'Ibiza', 3),
(6, 'Cayenne', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `coche`
--
ALTER TABLE `coche`
  ADD PRIMARY KEY (`CodCoc`),
  ADD KEY `CodMod` (`CodMod`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`CodMar`);

--
-- Indices de la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD PRIMARY KEY (`CodMod`),
  ADD KEY `CodMar` (`CodMar`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `coche`
--
ALTER TABLE `coche`
  ADD CONSTRAINT `coche_ibfk_1` FOREIGN KEY (`CodMod`) REFERENCES `modelo` (`CodMod`);

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`CodMar`) REFERENCES `marca` (`CodMar`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
