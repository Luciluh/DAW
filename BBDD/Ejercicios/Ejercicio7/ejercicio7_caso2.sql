-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-10-2024 a las 22:15:13
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
-- Base de datos: `ejercicio7_caso2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contrato`
--

CREATE TABLE `contrato` (
  `DurCon` varchar(20) NOT NULL,
  `TipCon` varchar(45) NOT NULL,
  `CodEnt` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `contrato`
--

INSERT INTO `contrato` (`DurCon`, `TipCon`, `CodEnt`) VALUES
('6 meses', 'Tiempo parcial', 1),
('1 año', 'Tiempo completo', 2),
('3 meses', 'Prueba', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrevista`
--

CREATE TABLE `entrevista` (
  `CodEnt` int(11) NOT NULL,
  `LugEnt` varchar(45) NOT NULL,
  `FecEnt` date NOT NULL,
  `HorEnt` time NOT NULL,
  `CodPer` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `entrevista`
--

INSERT INTO `entrevista` (`CodEnt`, `LugEnt`, `FecEnt`, `HorEnt`, `CodPer`) VALUES
(1, 'Oficina Central', '2023-10-01', '10:00:00', 1),
(2, 'Sala de Juntas', '2023-10-02', '11:30:00', 2),
(3, 'Oficina Regional', '2023-10-03', '09:00:00', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `CodPer` int(11) NOT NULL,
  `NomPer` varchar(20) NOT NULL,
  `TlfPer` varchar(15) NOT NULL,
  `Ape1Per` varchar(20) NOT NULL,
  `Ape2Per` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`CodPer`, `NomPer`, `TlfPer`, `Ape1Per`, `Ape2Per`) VALUES
(1, 'Juan', '123456789', 'Pérez', 'González'),
(2, 'María', '987654321', 'López', 'Martínez'),
(3, 'Carlos', '456789123', 'Sánchez', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD PRIMARY KEY (`CodEnt`);

--
-- Indices de la tabla `entrevista`
--
ALTER TABLE `entrevista`
  ADD PRIMARY KEY (`CodEnt`),
  ADD KEY `CodPer` (`CodPer`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`CodPer`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contrato`
--
ALTER TABLE `contrato`
  ADD CONSTRAINT `contrato_ibfk_1` FOREIGN KEY (`CodEnt`) REFERENCES `entrevista` (`CodEnt`);

--
-- Filtros para la tabla `entrevista`
--
ALTER TABLE `entrevista`
  ADD CONSTRAINT `entrevista_ibfk_1` FOREIGN KEY (`CodPer`) REFERENCES `persona` (`CodPer`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
