-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-10-2024 a las 12:56:03
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
-- Base de datos: `ejercicio5`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `CodCli` int(11) NOT NULL,
  `NomCli` varchar(20) NOT NULL,
  `Ape1Cli` varchar(20) NOT NULL,
  `Ape2Cli` varchar(20) DEFAULT NULL,
  `email` varchar(30) NOT NULL,
  `DNI` varchar(10) NOT NULL,
  `TlfCli` int(11) NOT NULL,
  `Edad` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`CodCli`, `NomCli`, `Ape1Cli`, `Ape2Cli`, `email`, `DNI`, `TlfCli`, `Edad`) VALUES
(1, 'Lucia', 'Villena', NULL, 'lvil@gmail.com', '53674120F', 656876415, '1997-09-10'),
(2, 'Carmen', 'Villena', NULL, 'lvil@gmail.com', '56671910F', 656876965, '1995-09-10'),
(3, 'Leyre', 'Jimenez', NULL, 'lji@gmail.com', '53673010F', 656226415, '2000-05-10'),
(4, 'Carlos', 'Lopez', 'Ramirez', 'asd@gmail.com', '53961910F', 656555415, '1997-03-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hotel`
--

CREATE TABLE `hotel` (
  `TipVia` varchar(20) NOT NULL,
  `NomVia` varchar(20) NOT NULL,
  `NumVia` int(11) NOT NULL,
  `Planta` int(11) DEFAULT NULL,
  `Puerta` varchar(5) DEFAULT NULL,
  `CP` int(11) NOT NULL,
  `CodHot` int(11) NOT NULL,
  `EstHot` int(11) NOT NULL,
  `CodLoc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `hotel`
--

INSERT INTO `hotel` (`TipVia`, `NomVia`, `NumVia`, `Planta`, `Puerta`, `CP`, `CodHot`, `EstHot`, `CodLoc`) VALUES
('Calle', 'Jaén', 23, NULL, NULL, 29591, 1, 4, 1),
('Calle', 'Jacob', 2, NULL, NULL, 29581, 2, 4, 2),
('Calle', 'Cordoba', 3, NULL, NULL, 28591, 3, 4, 6),
('Avenida', 'Jaén', 53, NULL, NULL, 29551, 4, 5, 5),
('Calle', 'Angustia', 293, NULL, NULL, 22391, 5, 3, 2),
('Pasje', 'Alamos', 63, NULL, NULL, 29561, 6, 2, 1),
('Calle', 'Flores', 9, NULL, NULL, 29593, 7, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidad`
--

CREATE TABLE `localidad` (
  `CodLoc` int(11) NOT NULL,
  `NomLoc` varchar(15) NOT NULL,
  `CodPro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `localidad`
--

INSERT INTO `localidad` (`CodLoc`, `NomLoc`, `CodPro`) VALUES
(1, 'Torrox', 1),
(2, 'Camas', 6),
(3, 'Adra', 2),
(4, 'Baza', 3),
(5, 'Montoro', 7),
(6, 'Velez-Málaga', 1),
(7, 'Loja', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `CodPro` int(11) NOT NULL,
  `NomPro` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`CodPro`, `NomPro`) VALUES
(1, 'Málaga'),
(2, 'Almeria'),
(3, 'Granada'),
(4, 'Cadiz'),
(5, 'Almeria'),
(6, 'Sevilla'),
(7, 'Córdoba'),
(8, 'Jaén');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `Hot_Cli` int(11) NOT NULL,
  `NumHab` int(11) NOT NULL,
  `FecSal` date NOT NULL,
  `NumHue` int(11) NOT NULL,
  `FecEnt` date NOT NULL,
  `CodHot` int(11) NOT NULL,
  `CodCli` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CodCli`);

--
-- Indices de la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD PRIMARY KEY (`CodHot`),
  ADD KEY `CodLoc` (`CodLoc`);

--
-- Indices de la tabla `localidad`
--
ALTER TABLE `localidad`
  ADD PRIMARY KEY (`CodLoc`),
  ADD KEY `CodPro` (`CodPro`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`CodPro`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`Hot_Cli`),
  ADD UNIQUE KEY `CodHot` (`CodHot`,`CodCli`),
  ADD KEY `CodCli` (`CodCli`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `hotel`
--
ALTER TABLE `hotel`
  ADD CONSTRAINT `hotel_ibfk_1` FOREIGN KEY (`CodLoc`) REFERENCES `localidad` (`CodLoc`);

--
-- Filtros para la tabla `localidad`
--
ALTER TABLE `localidad`
  ADD CONSTRAINT `localidad_ibfk_1` FOREIGN KEY (`CodPro`) REFERENCES `provincia` (`CodPro`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`CodHot`) REFERENCES `hotel` (`CodHot`),
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`CodCli`) REFERENCES `cliente` (`CodCli`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
