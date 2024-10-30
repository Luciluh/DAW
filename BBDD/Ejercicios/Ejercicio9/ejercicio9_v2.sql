-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2024 a las 22:31:46
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
-- Base de datos: `ejercicio9_v2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `CodDep` int(11) NOT NULL,
  `NomDep` varchar(50) NOT NULL,
  `NumDesp` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`CodDep`, `NomDep`, `NumDesp`) VALUES
(1, 'Ventas', 5),
(2, 'Recursos Humanos', 3),
(3, 'Desarrollo', 8),
(4, 'Marketing', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE `empleado` (
  `CodEmp` int(11) NOT NULL,
  `NomEmp` varchar(20) NOT NULL,
  `ApeEmp` varchar(20) NOT NULL,
  `SalEmp` int(11) NOT NULL,
  `DniEmp` int(11) NOT NULL,
  `CodDep` int(11) DEFAULT NULL,
  `EdadEmp` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empleado`
--

INSERT INTO `empleado` (`CodEmp`, `NomEmp`, `ApeEmp`, `SalEmp`, `DniEmp`, `CodDep`, `EdadEmp`) VALUES
(1, 'Juan', 'Pérez', 3000, 12345678, 1, '1990-01-15'),
(2, 'Ana', 'Gómez', 3500, 87654321, 2, '1985-06-20'),
(3, 'Luis', 'Martínez', 4000, 11223344, 3, '1988-03-10'),
(4, 'María', 'López', 4500, 44332211, 1, '1995-12-01'),
(5, 'Pedro', 'Hernández', 3200, 99887766, 4, '1992-09-30');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`CodDep`);

--
-- Indices de la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD PRIMARY KEY (`CodEmp`),
  ADD KEY `CodDep` (`CodDep`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`CodDep`) REFERENCES `departamento` (`CodDep`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
