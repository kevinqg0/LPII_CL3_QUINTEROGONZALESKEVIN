-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-10-2024 a las 14:32:44
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
-- Base de datos: `bdquinterogonzaleskevin`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_medicocl3`
--

CREATE TABLE `tbl_medicocl3` (
  `IDMEDICOCL3` int(11) NOT NULL,
  `nombrecl3` varchar(255) DEFAULT NULL,
  `apellidocl3` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `dnicl3` varchar(255) DEFAULT NULL,
  `estadocivilcl3` varchar(255) DEFAULT NULL,
  `fechanacimcl3` date DEFAULT NULL,
  `dni` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `estadocivil` varchar(255) DEFAULT NULL,
  `fechanac` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tbl_medicocl3`
--

INSERT INTO `tbl_medicocl3` (`IDMEDICOCL3`, `nombrecl3`, `apellidocl3`, `email`, `dnicl3`, `estadocivilcl3`, `fechanacimcl3`, `dni`, `apellido`, `estadocivil`, `fechanac`, `nombre`) VALUES
(1, 'Jose', 'gonzales', 'kevinqg0@gmail.com', '75116809', 'soltero', '2024-10-22', NULL, NULL, NULL, NULL, NULL),
(2, 'kevin', 'gonzales', 'kevinqg0@gmail.com', '75116809', 'soltero', '2024-10-23', NULL, NULL, NULL, NULL, NULL),
(3, 'Carlos', 'TINTAYA', 'TINTAYA@gmaoil.com', '62376432', 'casado', '2024-10-23', NULL, NULL, NULL, NULL, NULL),
(4, 'Kevin', 'MATOS', 'MATOS@GMAIL.COM', '12321323', 'casado', '2024-10-22', NULL, NULL, NULL, NULL, NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_medicocl3`
--
ALTER TABLE `tbl_medicocl3`
  ADD PRIMARY KEY (`IDMEDICOCL3`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_medicocl3`
--
ALTER TABLE `tbl_medicocl3`
  MODIFY `IDMEDICOCL3` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
