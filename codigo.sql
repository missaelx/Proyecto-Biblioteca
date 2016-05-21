-- phpMyAdmin SQL Dump
-- version 4.4.0
-- http://www.phpmyadmin.net
--
-- Servidor: localhost:3030
-- Tiempo de generación: 21-05-2016 a las 12:11:28
-- Versión del servidor: 5.5.42
-- Versión de PHP: 5.6.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de datos: `mydb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBAdeudo`
--

CREATE TABLE `TBAdeudo` (
  `idAdeudo` int(11) NOT NULL,
  `fechaInicial` datetime DEFAULT NULL,
  `monto` float DEFAULT NULL,
  `tipo` tinyint(1) DEFAULT NULL,
  `idPrestamo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBAdquisicion`
--

CREATE TABLE `TBAdquisicion` (
  `fecha` datetime NOT NULL,
  `fueDonado` tinyint(1) DEFAULT NULL,
  `idDonacion` int(11) DEFAULT NULL,
  `idItem` varchar(50) DEFAULT NULL,
  `idAdquisicion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBBiblioteca`
--

CREATE TABLE `TBBiblioteca` (
  `nombre` varchar(100) DEFAULT NULL,
  `direccion` varchar(150) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBCondonacion`
--

CREATE TABLE `TBCondonacion` (
  `idAdeudo` int(11) NOT NULL,
  `autoridad` varchar(45) DEFAULT NULL,
  `justificacion` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBDonacion`
--

CREATE TABLE `TBDonacion` (
  `id` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `esMonetario` tinyint(1) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `donador` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBDonador`
--

CREATE TABLE `TBDonador` (
  `id` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `direccion` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBMultimedia`
--

CREATE TABLE `TBMultimedia` (
  `id` varchar(50) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `areaEducativa` varchar(45) DEFAULT NULL,
  `narrador` varchar(45) DEFAULT NULL,
  `nombreDelLibro` varchar(45) DEFAULT NULL,
  `plataforma` varchar(45) DEFAULT NULL,
  `version` varchar(45) DEFAULT NULL,
  `año` varchar(45) DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPersonal`
--

CREATE TABLE `TBPersonal` (
  `numeroPersonal` varchar(50) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBPersonal`
--

INSERT INTO `TBPersonal` (`numeroPersonal`, `nombre`, `direccion`, `fechaNacimiento`, `tipo`, `telefono`, `correo`) VALUES
('10', 'Juan Carlos Perez', 'Coder Dojo FEI', '2016-05-02', 'BIBLIOTECARIO', '2281818181', 'elrevo@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPrestamo`
--

CREATE TABLE `TBPrestamo` (
  `idPrestamo` int(11) NOT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `vencimiento` datetime DEFAULT NULL,
  `TBPrestatario_numeroPersonal` varchar(50) NOT NULL,
  `TBPersonal_numeroPersonal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPrestatario`
--

CREATE TABLE `TBPrestatario` (
  `numeroPersonal` varchar(50) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL,
  `textoPrestados` int(11) NOT NULL DEFAULT '0',
  `vigencia` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBPrestatario`
--

INSERT INTO `TBPrestatario` (`numeroPersonal`, `nombre`, `direccion`, `fechaNacimiento`, `tipo`, `telefono`, `correo`, `textoPrestados`, `vigencia`) VALUES
('1', 'Missael Hernandez', 'Lejos de Xalapa', '1996-03-09', 'Alumno', '2218717935', 'missaelxp@gmail.com', 0, '2016-05-10'),
('2', 'Andres Meza', 'Cerca de Xalapa', '1994-04-22', 'Maestro', '2128172187', 'techmeza@gmail.com', 5, '2016-05-10');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBReportes`
--

CREATE TABLE `TBReportes` (
  `id` int(11) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFinal` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `archivo` blob
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBReservacion`
--

CREATE TABLE `TBReservacion` (
  `idReservacion` int(11) NOT NULL,
  `idPrestatario` varchar(50) DEFAULT NULL,
  `idItem` varchar(50) DEFAULT NULL,
  `fechaVencimiento` datetime DEFAULT NULL,
  `TBPrestatario_numeroPersonal` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTextoEjemplares`
--

CREATE TABLE `TBTextoEjemplares` (
  `idEjemplar` varchar(50) NOT NULL,
  `idDescripcion` varchar(50) DEFAULT NULL,
  `idAdquisicion` int(11) DEFAULT NULL,
  `disponible` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTextos`
--

CREATE TABLE `TBTextos` (
  `id` varchar(50) NOT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `disponible` tinyint(1) DEFAULT NULL,
  `editorial` varchar(45) DEFAULT NULL,
  `fechaDePublicacion` date DEFAULT NULL,
  `numeroEjemplares` int(11) DEFAULT NULL,
  `numeroDePaginas` varchar(45) DEFAULT NULL,
  `autor` varchar(100) DEFAULT NULL,
  `pais` varchar(45) DEFAULT NULL,
  `numeroDePublicacion` varchar(10) DEFAULT NULL,
  `lugarDePublicacion` varchar(45) DEFAULT NULL,
  `numeroDeRevista` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTextos`
--

INSERT INTO `TBTextos` (`id`, `tipo`, `titulo`, `disponible`, `editorial`, `fechaDePublicacion`, `numeroEjemplares`, `numeroDePaginas`, `autor`, `pais`, `numeroDePublicacion`, `lugarDePublicacion`, `numeroDeRevista`) VALUES
('1', 'Revista', 'Playboy', 1, 'Jeft', '2016-05-03', 10, '54', 'Missael', 'Mexico', '3', 'Mexico DF', '5'),
('2', 'Libro', 'UML in color', 1, 'Trillas', '2016-05-18', 2, '390', 'Color', 'Estados Unidos', '3', '2', NULL),
('3', 'Tesis', 'Missaelitos en el ambiente', 1, 'Missael', '2016-05-03', 5, '132', 'Missael Hernandez Rosado', 'Mexico', '4', 'UV', NULL),
('4', 'Periodico', 'AZ', 1, 'Salamanca', '2016-05-01', 1, '42', 'Missael', 'Canada', '3', 'Xalapa', NULL),
('5', 'Ensayo', 'El poder', 1, 'UV', '2016-05-02', 2, '20', 'Missael', 'Mexico', '13', 'Xalapa', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `TBAdeudo`
--
ALTER TABLE `TBAdeudo`
  ADD PRIMARY KEY (`idAdeudo`);

--
-- Indices de la tabla `TBAdquisicion`
--
ALTER TABLE `TBAdquisicion`
  ADD PRIMARY KEY (`idAdquisicion`),
  ADD KEY `idDonacion_idx` (`idDonacion`);

--
-- Indices de la tabla `TBCondonacion`
--
ALTER TABLE `TBCondonacion`
  ADD PRIMARY KEY (`idAdeudo`),
  ADD KEY `idAdeudo_idx` (`idAdeudo`);

--
-- Indices de la tabla `TBDonacion`
--
ALTER TABLE `TBDonacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `donador_idx` (`donador`);

--
-- Indices de la tabla `TBDonador`
--
ALTER TABLE `TBDonador`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `TBMultimedia`
--
ALTER TABLE `TBMultimedia`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `TBPersonal`
--
ALTER TABLE `TBPersonal`
  ADD PRIMARY KEY (`numeroPersonal`);

--
-- Indices de la tabla `TBPrestamo`
--
ALTER TABLE `TBPrestamo`
  ADD PRIMARY KEY (`idPrestamo`),
  ADD KEY `fk_Prestamo_TBPrestatario1_idx` (`TBPrestatario_numeroPersonal`),
  ADD KEY `fk_Prestamo_TBPersonal1_idx` (`TBPersonal_numeroPersonal`);

--
-- Indices de la tabla `TBPrestatario`
--
ALTER TABLE `TBPrestatario`
  ADD PRIMARY KEY (`numeroPersonal`);

--
-- Indices de la tabla `TBReportes`
--
ALTER TABLE `TBReportes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `TBReservacion`
--
ALTER TABLE `TBReservacion`
  ADD PRIMARY KEY (`idReservacion`),
  ADD KEY `fk_TBReservacion_TBPrestatario1_idx` (`TBPrestatario_numeroPersonal`);

--
-- Indices de la tabla `TBTextoEjemplares`
--
ALTER TABLE `TBTextoEjemplares`
  ADD PRIMARY KEY (`idEjemplar`),
  ADD KEY `idAdquisicion_idx` (`idAdquisicion`),
  ADD KEY `idDescripcion_idx` (`idDescripcion`);

--
-- Indices de la tabla `TBTextos`
--
ALTER TABLE `TBTextos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `TBAdeudo`
--
ALTER TABLE `TBAdeudo`
  MODIFY `idAdeudo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBCondonacion`
--
ALTER TABLE `TBCondonacion`
  MODIFY `idAdeudo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBDonacion`
--
ALTER TABLE `TBDonacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBDonador`
--
ALTER TABLE `TBDonador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBPrestamo`
--
ALTER TABLE `TBPrestamo`
  MODIFY `idPrestamo` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBReportes`
--
ALTER TABLE `TBReportes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `TBAdquisicion`
--
ALTER TABLE `TBAdquisicion`
  ADD CONSTRAINT `idDonacion` FOREIGN KEY (`idDonacion`) REFERENCES `TBDonacion` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBCondonacion`
--
ALTER TABLE `TBCondonacion`
  ADD CONSTRAINT `idAdeudo` FOREIGN KEY (`idAdeudo`) REFERENCES `TBAdeudo` (`idAdeudo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBDonacion`
--
ALTER TABLE `TBDonacion`
  ADD CONSTRAINT `donador` FOREIGN KEY (`donador`) REFERENCES `TBDonador` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBPrestamo`
--
ALTER TABLE `TBPrestamo`
  ADD CONSTRAINT `fk_Prestamo_TBPersonal1` FOREIGN KEY (`TBPersonal_numeroPersonal`) REFERENCES `TBPersonal` (`numeroPersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Prestamo_TBPrestatario1` FOREIGN KEY (`TBPrestatario_numeroPersonal`) REFERENCES `TBPrestatario` (`numeroPersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBReservacion`
--
ALTER TABLE `TBReservacion`
  ADD CONSTRAINT `fk_TBReservacion_TBPrestatario1` FOREIGN KEY (`TBPrestatario_numeroPersonal`) REFERENCES `TBPrestatario` (`numeroPersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBTextoEjemplares`
--
ALTER TABLE `TBTextoEjemplares`
  ADD CONSTRAINT `idAdquisicion` FOREIGN KEY (`idAdquisicion`) REFERENCES `TBAdquisicion` (`idAdquisicion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idDescripcion` FOREIGN KEY (`idDescripcion`) REFERENCES `TBTextos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
