-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-10-2024 a las 14:33:51
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
-- Base de datos: `ejercicio4`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `CodAlu` int(11) NOT NULL,
  `NomAlu` varchar(45) NOT NULL,
  `Ap1Alu` varchar(45) NOT NULL,
  `Ap2Alu` varchar(45) DEFAULT NULL,
  `DNI` varchar(10) DEFAULT NULL,
  `TipVia` varchar(45) NOT NULL,
  `NomVia` varchar(45) NOT NULL,
  `Num` int(11) NOT NULL,
  `Puerta` int(11) NOT NULL,
  `Planta` int(11) NOT NULL,
  `CP` int(11) NOT NULL,
  `EdaAlu` date NOT NULL,
  `CodLoc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`CodAlu`, `NomAlu`, `Ap1Alu`, `Ap2Alu`, `DNI`, `TipVia`, `NomVia`, `Num`, `Puerta`, `Planta`, `CP`, `EdaAlu`, `CodLoc`) VALUES
(1, 'Lucia', 'Villena', 'Martin', '12487562F', 'Calle', '', 6, 1, 0, 29010, '1997-10-29', 1),
(2, 'Susana', 'Marin', NULL, '12251562F', 'Avenida', '', 9, 3, 0, 29090, '2001-01-16', 5),
(3, 'Pedro', 'Lopez', 'Ramirez', '12432562Q', 'Calle', '', 3, 3, 5, 29910, '2001-06-15', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `CodAsi` int(11) NOT NULL,
  `NomAsi` varchar(45) NOT NULL,
  `CurAsi` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`CodAsi`, `NomAsi`, `CurAsi`) VALUES
(1, 'Lengua', '1ºESO'),
(2, 'Lengua', '2ºESO'),
(3, 'Quimica', '1ºESO'),
(4, 'Quimica', '2ºESO'),
(5, 'Biologia', '1ºESO'),
(6, 'Biologia', '2ºESO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `localidad`
--

CREATE TABLE `localidad` (
  `CodLoc` int(11) NOT NULL,
  `NomLoc` varchar(45) NOT NULL,
  `CodPro` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `localidad`
--

INSERT INTO `localidad` (`CodLoc`, `NomLoc`, `CodPro`) VALUES
(1, 'Torrox', 1),
(2, 'Camas', 2),
(3, 'Adra', 3),
(4, 'Baza', 4),
(5, 'Montoro', 5),
(6, 'Velez-Málaga', 1),
(7, 'Loja', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `matricula`
--

CREATE TABLE `matricula` (
  `CodAlu` int(11) NOT NULL,
  `CodAsi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `matricula`
--

INSERT INTO `matricula` (`CodAlu`, `CodAsi`) VALUES
(1, 2),
(2, 6),
(3, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `provincia`
--

CREATE TABLE `provincia` (
  `CodPro` int(11) NOT NULL,
  `NomPro` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `provincia`
--

INSERT INTO `provincia` (`CodPro`, `NomPro`) VALUES
(1, 'Málaga'),
(2, 'Sevilla'),
(3, 'Almeria'),
(4, 'Granada'),
(5, 'Córdoba');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`CodAlu`),
  ADD KEY `CodLoc` (`CodLoc`);

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`CodAsi`);

--
-- Indices de la tabla `localidad`
--
ALTER TABLE `localidad`
  ADD PRIMARY KEY (`CodLoc`),
  ADD KEY `CodPro` (`CodPro`);

--
-- Indices de la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD PRIMARY KEY (`CodAlu`,`CodAsi`),
  ADD KEY `CodAsi` (`CodAsi`);

--
-- Indices de la tabla `provincia`
--
ALTER TABLE `provincia`
  ADD PRIMARY KEY (`CodPro`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD CONSTRAINT `alumno_ibfk_1` FOREIGN KEY (`CodLoc`) REFERENCES `localidad` (`CodLoc`);

--
-- Filtros para la tabla `localidad`
--
ALTER TABLE `localidad`
  ADD CONSTRAINT `localidad_ibfk_1` FOREIGN KEY (`CodPro`) REFERENCES `provincia` (`CodPro`);

--
-- Filtros para la tabla `matricula`
--
ALTER TABLE `matricula`
  ADD CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`CodAlu`) REFERENCES `alumno` (`CodAlu`),
  ADD CONSTRAINT `matricula_ibfk_2` FOREIGN KEY (`CodAsi`) REFERENCES `asignatura` (`CodAsi`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
