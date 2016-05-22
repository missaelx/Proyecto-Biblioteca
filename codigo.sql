-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 22-05-2016 a las 23:53:53
-- Versión del servidor: 5.6.26
-- Versión de PHP: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mydb`
--
CREATE DATABASE IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `mydb`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBAdeudos`
--

CREATE TABLE IF NOT EXISTS `TBAdeudos` (
  `idAdeudo` int(11) unsigned NOT NULL,
  `fechaInicial` datetime NOT NULL,
  `fechaFinal` datetime DEFAULT NULL,
  `monto` decimal(2,0) unsigned DEFAULT NULL,
  `idMonedaAdeudo` int(10) unsigned NOT NULL,
  `tipo` tinyint(1) NOT NULL,
  `idPrestamo` int(11) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBAdquisiciones`
--

CREATE TABLE IF NOT EXISTS `TBAdquisiciones` (
  `idAdquisicion` int(11) unsigned NOT NULL,
  `fecha` datetime NOT NULL,
  `fueDonado` tinyint(1) NOT NULL,
  `idDonacion` int(11) unsigned DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBAdquisiciones`
--

INSERT INTO `TBAdquisiciones` (`idAdquisicion`, `fecha`, `fueDonado`, `idDonacion`) VALUES
(1, '2016-05-09 00:00:00', 0, NULL),
(2, '2016-05-10 00:00:00', 0, NULL),
(3, '2016-05-04 00:00:00', 0, NULL),
(4, '2016-05-11 00:00:00', 0, NULL),
(5, '2016-05-10 00:00:00', 0, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBAutores`
--

CREATE TABLE IF NOT EXISTS `TBAutores` (
  `idAutor` int(10) unsigned NOT NULL,
  `nombre` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBAutores`
--

INSERT INTO `TBAutores` (`idAutor`, `nombre`) VALUES
(1, 'Xavier Limon'),
(2, 'Juan Carlos Perez Arriaga'),
(3, 'Xavier Limon');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBCondonaciones`
--

CREATE TABLE IF NOT EXISTS `TBCondonaciones` (
  `idAdeudo` int(11) unsigned NOT NULL,
  `autoridad` int(10) unsigned NOT NULL,
  `justificacion` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBDonaciones`
--

CREATE TABLE IF NOT EXISTS `TBDonaciones` (
  `idDonacion` int(11) unsigned NOT NULL,
  `fecha` date DEFAULT NULL,
  `esMonetario` tinyint(1) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `donador` int(11) unsigned DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBDonadores`
--

CREATE TABLE IF NOT EXISTS `TBDonadores` (
  `idDonador` int(11) unsigned NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `tipo` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBEditoriales`
--

CREATE TABLE IF NOT EXISTS `TBEditoriales` (
  `idEditorial` int(10) unsigned NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBEditoriales`
--

INSERT INTO `TBEditoriales` (`idEditorial`, `nombre`) VALUES
(1, 'E. El Rey'),
(2, 'E. UV');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBMultimedia`
--

CREATE TABLE IF NOT EXISTS `TBMultimedia` (
  `idMultimedia` varchar(50) NOT NULL,
  `tipo` int(10) unsigned NOT NULL,
  `titulo` varchar(45) NOT NULL,
  `areaEducativa` varchar(45) DEFAULT NULL,
  `narrador` varchar(45) DEFAULT NULL,
  `nombreDelLibro` varchar(45) DEFAULT NULL,
  `plataforma` varchar(45) DEFAULT NULL,
  `version` varchar(45) DEFAULT NULL,
  `año` date DEFAULT NULL,
  `director` varchar(45) DEFAULT NULL,
  `creadoEn` datetime DEFAULT NULL,
  `actualizadoEn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBMultimediaEjemplares`
--

CREATE TABLE IF NOT EXISTS `TBMultimediaEjemplares` (
  `idEjemplar` varchar(50) NOT NULL,
  `idMultimedia` varchar(50) NOT NULL,
  `idAdquision` int(11) unsigned NOT NULL,
  `disponible` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPaises`
--

CREATE TABLE IF NOT EXISTS `TBPaises` (
  `idPais` int(10) unsigned NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=241 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBPaises`
--

INSERT INTO `TBPaises` (`idPais`, `nombre`) VALUES
(1, 'Afganistán'),
(2, 'Islas Gland'),
(3, 'Albania'),
(4, 'Alemania'),
(5, 'Andorra'),
(6, 'Angola'),
(7, 'Anguilla'),
(8, 'Antártida'),
(9, 'Antigua y Barbuda'),
(10, 'Antillas Holandesas'),
(11, 'Arabia Saudí'),
(12, 'Argelia'),
(13, 'Argentina'),
(14, 'Armenia'),
(15, 'Aruba'),
(16, 'Australia'),
(17, 'Austria'),
(18, 'Azerbaiyán'),
(19, 'Bahamas'),
(20, 'Bahréin'),
(21, 'Bangladesh'),
(22, 'Barbados'),
(23, 'Bielorrusia'),
(24, 'Bélgica'),
(25, 'Belice'),
(26, 'Benin'),
(27, 'Bermudas'),
(28, 'Bhután'),
(29, 'Bolivia'),
(30, 'Bosnia y Herzegovina'),
(31, 'Botsuana'),
(32, 'Isla Bouvet'),
(33, 'Brasil'),
(34, 'Brunéi'),
(35, 'Bulgaria'),
(36, 'Burkina Faso'),
(37, 'Burundi'),
(38, 'Cabo Verde'),
(39, 'Islas Caimán'),
(40, 'Camboya'),
(41, 'Camerún'),
(42, 'Canadá'),
(43, 'República Centroafricana'),
(44, 'Chad'),
(45, 'República Checa'),
(46, 'Chile'),
(47, 'China'),
(48, 'Chipre'),
(49, 'Isla de Navidad'),
(50, 'Ciudad del Vaticano'),
(51, 'Islas Cocos'),
(52, 'Colombia'),
(53, 'Comoras'),
(54, 'República Democrática del Congo'),
(55, 'Congo'),
(56, 'Islas Cook'),
(57, 'Corea del Norte'),
(58, 'Corea del Sur'),
(59, 'Costa de Marfil'),
(60, 'Costa Rica'),
(61, 'Croacia'),
(62, 'Cuba'),
(63, 'Dinamarca'),
(64, 'Dominica'),
(65, 'República Dominicana'),
(66, 'Ecuador'),
(67, 'Egipto'),
(68, 'El Salvador'),
(69, 'Emiratos Árabes Unidos'),
(70, 'Eritrea'),
(71, 'Eslovaquia'),
(72, 'Eslovenia'),
(73, 'España'),
(74, 'Islas ultramarinas de Estados Unidos'),
(75, 'Estados Unidos'),
(76, 'Estonia'),
(77, 'Etiopía'),
(78, 'Islas Feroe'),
(79, 'Filipinas'),
(80, 'Finlandia'),
(81, 'Fiyi'),
(82, 'Francia'),
(83, 'Gabón'),
(84, 'Gambia'),
(85, 'Georgia'),
(86, 'Islas Georgias del Sur y Sandwich del Sur'),
(87, 'Ghana'),
(88, 'Gibraltar'),
(89, 'Granada'),
(90, 'Grecia'),
(91, 'Groenlandia'),
(92, 'Guadalupe'),
(93, 'Guam'),
(94, 'Guatemala'),
(95, 'Guayana Francesa'),
(96, 'Guinea'),
(97, 'Guinea Ecuatorial'),
(98, 'Guinea-Bissau'),
(99, 'Guyana'),
(100, 'Haití'),
(101, 'Islas Heard y McDonald'),
(102, 'Honduras'),
(103, 'Hong Kong'),
(104, 'Hungría'),
(105, 'India'),
(106, 'Indonesia'),
(107, 'Irán'),
(108, 'Iraq'),
(109, 'Irlanda'),
(110, 'Islandia'),
(111, 'Israel'),
(112, 'Italia'),
(113, 'Jamaica'),
(114, 'Japón'),
(115, 'Jordania'),
(116, 'Kazajstán'),
(117, 'Kenia'),
(118, 'Kirguistán'),
(119, 'Kiribati'),
(120, 'Kuwait'),
(121, 'Laos'),
(122, 'Lesotho'),
(123, 'Letonia'),
(124, 'Líbano'),
(125, 'Liberia'),
(126, 'Libia'),
(127, 'Liechtenstein'),
(128, 'Lituania'),
(129, 'Luxemburgo'),
(130, 'Macao'),
(131, 'ARY Macedonia'),
(132, 'Madagascar'),
(133, 'Malasia'),
(134, 'Malawi'),
(135, 'Maldivas'),
(136, 'Malí'),
(137, 'Malta'),
(138, 'Islas Malvinas'),
(139, 'Islas Marianas del Norte'),
(140, 'Marruecos'),
(141, 'Islas Marshall'),
(142, 'Martinica'),
(143, 'Mauricio'),
(144, 'Mauritania'),
(145, 'Mayotte'),
(146, 'México'),
(147, 'Micronesia'),
(148, 'Moldavia'),
(149, 'Mónaco'),
(150, 'Mongolia'),
(151, 'Montserrat'),
(152, 'Mozambique'),
(153, 'Myanmar'),
(154, 'Namibia'),
(155, 'Nauru'),
(156, 'Nepal'),
(157, 'Nicaragua'),
(158, 'Níger'),
(159, 'Nigeria'),
(160, 'Niue'),
(161, 'Isla Norfolk'),
(162, 'Noruega'),
(163, 'Nueva Caledonia'),
(164, 'Nueva Zelanda'),
(165, 'Omán'),
(166, 'Países Bajos'),
(167, 'Pakistán'),
(168, 'Palau'),
(169, 'Palestina'),
(170, 'Panamá'),
(171, 'Papúa Nueva Guinea'),
(172, 'Paraguay'),
(173, 'Perú'),
(174, 'Islas Pitcairn'),
(175, 'Polinesia Francesa'),
(176, 'Polonia'),
(177, 'Portugal'),
(178, 'Puerto Rico'),
(179, 'Qatar'),
(180, 'Reino Unido'),
(181, 'Reunión'),
(182, 'Ruanda'),
(183, 'Rumania'),
(184, 'Rusia'),
(185, 'Sahara Occidental'),
(186, 'Islas Salomón'),
(187, 'Samoa'),
(188, 'Samoa Americana'),
(189, 'San Cristóbal y Nevis'),
(190, 'San Marino'),
(191, 'San Pedro y Miquelón'),
(192, 'San Vicente y las Granadinas'),
(193, 'Santa Helena'),
(194, 'Santa Lucía'),
(195, 'Santo Tomé y Príncipe'),
(196, 'Senegal'),
(197, 'Serbia y Montenegro'),
(198, 'Seychelles'),
(199, 'Sierra Leona'),
(200, 'Singapur'),
(201, 'Siria'),
(202, 'Somalia'),
(203, 'Sri Lanka'),
(204, 'Suazilandia'),
(205, 'Sudáfrica'),
(206, 'Sudán'),
(207, 'Suecia'),
(208, 'Suiza'),
(209, 'Surinam'),
(210, 'Svalbard y Jan Mayen'),
(211, 'Tailandia'),
(212, 'Taiwán'),
(213, 'Tanzania'),
(214, 'Tayikistán'),
(215, 'Territorio Británico del Océano Índico'),
(216, 'Territorios Australes Franceses'),
(217, 'Timor Oriental'),
(218, 'Togo'),
(219, 'Tokelau'),
(220, 'Tonga'),
(221, 'Trinidad y Tobago'),
(222, 'Túnez'),
(223, 'Islas Turcas y Caicos'),
(224, 'Turkmenistán'),
(225, 'Turquía'),
(226, 'Tuvalu'),
(227, 'Ucrania'),
(228, 'Uganda'),
(229, 'Uruguay'),
(230, 'Uzbekistán'),
(231, 'Vanuatu'),
(232, 'Venezuela'),
(233, 'Vietnam'),
(234, 'Islas Vírgenes Británicas'),
(235, 'Islas Vírgenes de los Estados Unidos'),
(236, 'Wallis y Futuna'),
(237, 'Yemen'),
(238, 'Yibuti'),
(239, 'Zambia'),
(240, 'Zimbabue');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPersonal`
--

CREATE TABLE IF NOT EXISTS `TBPersonal` (
  `idPersonal` int(10) unsigned NOT NULL,
  `numeroPersonal` varchar(50) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `tipo` int(10) unsigned NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `creadoEn` datetime DEFAULT NULL,
  `actualizadoEn` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBPersonal`
--

INSERT INTO `TBPersonal` (`idPersonal`, `numeroPersonal`, `nombre`, `direccion`, `fechaNacimiento`, `tipo`, `telefono`, `correo`, `creadoEn`, `actualizadoEn`) VALUES
(1, 'SS1', 'Juan Carlos Perez', 'Lejos', '1977-04-22', 1, '238762386', 'jperez@uv.mx', '2016-05-12 00:00:00', '2016-05-17 00:00:00'),
(2, 'SS2', 'Xavier Ocharan', 'Lejos de Xalapa', '1979-05-09', 2, '23827387', 'jocharan@uv.mx', '2016-05-04 00:00:00', '2016-05-20 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPrestamos`
--

CREATE TABLE IF NOT EXISTS `TBPrestamos` (
  `idPrestamo` int(11) unsigned NOT NULL,
  `fechaVencimiento` datetime NOT NULL,
  `fechaSolicitudPrestamo` datetime NOT NULL,
  `fechaEntrega` datetime DEFAULT NULL,
  `idPersonal` int(10) unsigned NOT NULL,
  `idPrestatario` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBPrestatarios`
--

CREATE TABLE IF NOT EXISTS `TBPrestatarios` (
  `idPrestatario` int(10) unsigned NOT NULL,
  `numeroPersonal` varchar(50) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `tipo` int(10) unsigned NOT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `vigencia` date NOT NULL,
  `creadoEn` datetime DEFAULT NULL,
  `actualizadoEn` datetime DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBPrestatarios`
--

INSERT INTO `TBPrestatarios` (`idPrestatario`, `numeroPersonal`, `nombre`, `direccion`, `fechaNacimiento`, `tipo`, `telefono`, `correo`, `vigencia`, `creadoEn`, `actualizadoEn`) VALUES
(2, 'S1', 'Missael Hernandez Rosado', 'Xalapa', '1996-03-09', 1, '2281717935', 'missaelxp@gmail.com', '2016-08-30', '2016-05-10 00:00:00', '2016-05-22 00:00:00'),
(3, 'S2', 'Andres Roberto Meza Rivera', 'Las palmas', '1996-03-09', 2, '228177272', 'techmeza@gmail.com', '2016-08-30', '2016-05-18 00:00:00', '2016-05-27 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBReportes`
--

CREATE TABLE IF NOT EXISTS `TBReportes` (
  `idReporte` int(10) unsigned NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFinal` date DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `rutaArchivo` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBReservaciones`
--

CREATE TABLE IF NOT EXISTS `TBReservaciones` (
  `idReservacion` int(11) unsigned NOT NULL,
  `idTextoEjemplar` varchar(50) NOT NULL,
  `fechaVencimiento` datetime DEFAULT NULL,
  `idPrestatario` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTextoEjemplares`
--

CREATE TABLE IF NOT EXISTS `TBTextoEjemplares` (
  `idEjemplar` varchar(50) NOT NULL,
  `idTexto` varchar(50) NOT NULL,
  `idAdquisicion` int(11) unsigned NOT NULL,
  `disponible` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTextoEjemplares`
--

INSERT INTO `TBTextoEjemplares` (`idEjemplar`, `idTexto`, `idAdquisicion`, `disponible`) VALUES
('EJ1-1', '1', 1, 1),
('EJ1-2', '1', 2, 1),
('EJ2-1', '2', 3, 1),
('EJ2-2', '2', 4, 1),
('EJ3-1', '3', 5, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTextos`
--

CREATE TABLE IF NOT EXISTS `TBTextos` (
  `idTexto` varchar(50) NOT NULL,
  `tipo` int(10) unsigned NOT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  `editorial` int(10) unsigned NOT NULL,
  `fechaDePublicacion` date DEFAULT NULL,
  `numeroDePaginas` varchar(45) DEFAULT NULL,
  `numeroDePublicacion` varchar(10) DEFAULT NULL,
  `lugarDePublicacion` varchar(45) DEFAULT NULL,
  `numeroDeRevista` varchar(45) DEFAULT NULL,
  `creadoEn` datetime DEFAULT NULL,
  `modificadoEn` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTextos`
--

INSERT INTO `TBTextos` (`idTexto`, `tipo`, `titulo`, `editorial`, `fechaDePublicacion`, `numeroDePaginas`, `numeroDePublicacion`, `lugarDePublicacion`, `numeroDeRevista`, `creadoEn`, `modificadoEn`) VALUES
('1', 1, 'Periodico El Rey', 1, '2016-05-09', '43', '12', 'Mexico DF', NULL, '2016-05-22 16:22:06', '2016-05-22 16:22:06'),
('2', 2, 'Ensayo de Felix', 2, '2016-05-02', '50', '12', 'Xalapa', '12', '2016-05-10 07:22:30', '2016-05-25 00:00:00'),
('3', 3, 'Libro Bases de datos', 1, '2016-05-11', '21', '32', 'Veracruz', '21', '2016-05-17 05:20:15', '2016-05-10 04:18:31'),
('4', 4, 'Tesis del planeta', 1, '2016-05-04', '34', '43', 'Tepito', '43', '2016-05-10 00:00:00', '2016-05-10 00:00:00'),
('5', 5, 'Revista El interesante', 2, '2016-05-02', '43', '21', 'Coatepec', '12', '2016-05-10 00:00:00', '2016-05-10 00:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposDonadores`
--

CREATE TABLE IF NOT EXISTS `TBTiposDonadores` (
  `idTipo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposDonadores`
--

INSERT INTO `TBTiposDonadores` (`idTipo`, `nombre`) VALUES
(1, 'Fisica'),
(2, 'Moral');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposMonedas`
--

CREATE TABLE IF NOT EXISTS `TBTiposMonedas` (
  `idTipo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposMonedas`
--

INSERT INTO `TBTiposMonedas` (`idTipo`, `nombre`) VALUES
(1, 'Dolar'),
(2, 'Peso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposMultimedia`
--

CREATE TABLE IF NOT EXISTS `TBTiposMultimedia` (
  `idTipo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposMultimedia`
--

INSERT INTO `TBTiposMultimedia` (`idTipo`, `nombre`) VALUES
(1, 'Pelicula'),
(2, 'Software'),
(3, 'Audio'),
(4, 'Audiolibro'),
(5, 'Video');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposPersonal`
--

CREATE TABLE IF NOT EXISTS `TBTiposPersonal` (
  `idTipo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposPersonal`
--

INSERT INTO `TBTiposPersonal` (`idTipo`, `nombre`) VALUES
(1, 'Bibliotecario'),
(2, 'Administrador');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposPrestatarios`
--

CREATE TABLE IF NOT EXISTS `TBTiposPrestatarios` (
  `idTipoPrestatario` int(10) unsigned NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposPrestatarios`
--

INSERT INTO `TBTiposPrestatarios` (`idTipoPrestatario`, `nombre`) VALUES
(1, 'Alumno'),
(2, 'Maestro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TBTiposTextos`
--

CREATE TABLE IF NOT EXISTS `TBTiposTextos` (
  `idTipo` int(10) unsigned NOT NULL,
  `nombre` varchar(45) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `TBTiposTextos`
--

INSERT INTO `TBTiposTextos` (`idTipo`, `nombre`) VALUES
(1, 'Periodico'),
(2, 'Ensayo'),
(3, 'Libro'),
(4, 'Tesis'),
(5, 'Revista');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `textos-autores-aux`
--

CREATE TABLE IF NOT EXISTS `textos-autores-aux` (
  `idTexto` varchar(50) NOT NULL,
  `idAutor` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `textos-autores-aux`
--

INSERT INTO `textos-autores-aux` (`idTexto`, `idAutor`) VALUES
('1', 1),
('2', 2),
('3', 3),
('4', 1),
('5', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `textos-paises-aux`
--

CREATE TABLE IF NOT EXISTS `textos-paises-aux` (
  `idTexto` varchar(50) NOT NULL,
  `idPais` int(10) unsigned NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `textos-paises-aux`
--

INSERT INTO `textos-paises-aux` (`idTexto`, `idPais`) VALUES
('2', 4),
('1', 6),
('4', 34),
('3', 65),
('5', 67);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `TBAdeudos`
--
ALTER TABLE `TBAdeudos`
  ADD PRIMARY KEY (`idAdeudo`),
  ADD KEY `idPrestamo_idx` (`idPrestamo`),
  ADD KEY `idMonedaAdeudo-moneda_idx` (`idMonedaAdeudo`);

--
-- Indices de la tabla `TBAdquisiciones`
--
ALTER TABLE `TBAdquisiciones`
  ADD PRIMARY KEY (`idAdquisicion`),
  ADD KEY `idDonacion_idx` (`idDonacion`);

--
-- Indices de la tabla `TBAutores`
--
ALTER TABLE `TBAutores`
  ADD PRIMARY KEY (`idAutor`);

--
-- Indices de la tabla `TBCondonaciones`
--
ALTER TABLE `TBCondonaciones`
  ADD PRIMARY KEY (`idAdeudo`),
  ADD UNIQUE KEY `idAdeudo_UNIQUE` (`idAdeudo`),
  ADD KEY `idAdeudo_idx` (`idAdeudo`),
  ADD KEY `autoridad_idx` (`autoridad`);

--
-- Indices de la tabla `TBDonaciones`
--
ALTER TABLE `TBDonaciones`
  ADD PRIMARY KEY (`idDonacion`),
  ADD KEY `donador_idx` (`donador`);

--
-- Indices de la tabla `TBDonadores`
--
ALTER TABLE `TBDonadores`
  ADD PRIMARY KEY (`idDonador`),
  ADD KEY `tipo_idx` (`tipo`);

--
-- Indices de la tabla `TBEditoriales`
--
ALTER TABLE `TBEditoriales`
  ADD PRIMARY KEY (`idEditorial`);

--
-- Indices de la tabla `TBMultimedia`
--
ALTER TABLE `TBMultimedia`
  ADD PRIMARY KEY (`idMultimedia`),
  ADD KEY `tipo_idx` (`tipo`);

--
-- Indices de la tabla `TBMultimediaEjemplares`
--
ALTER TABLE `TBMultimediaEjemplares`
  ADD PRIMARY KEY (`idEjemplar`),
  ADD KEY `idMultimedia_idx` (`idMultimedia`),
  ADD KEY `idAdquisicion_idx` (`idAdquision`);

--
-- Indices de la tabla `TBPaises`
--
ALTER TABLE `TBPaises`
  ADD PRIMARY KEY (`idPais`);

--
-- Indices de la tabla `TBPersonal`
--
ALTER TABLE `TBPersonal`
  ADD PRIMARY KEY (`idPersonal`),
  ADD KEY `tipo_idx` (`tipo`);

--
-- Indices de la tabla `TBPrestamos`
--
ALTER TABLE `TBPrestamos`
  ADD PRIMARY KEY (`idPrestamo`),
  ADD KEY `fk_Prestamo_TBPrestatario1_idx` (`idPrestatario`),
  ADD KEY `fk_Prestamo_TBPersonal1_idx` (`idPersonal`);

--
-- Indices de la tabla `TBPrestatarios`
--
ALTER TABLE `TBPrestatarios`
  ADD PRIMARY KEY (`idPrestatario`),
  ADD KEY `tipo_idx` (`tipo`);

--
-- Indices de la tabla `TBReportes`
--
ALTER TABLE `TBReportes`
  ADD PRIMARY KEY (`idReporte`);

--
-- Indices de la tabla `TBReservaciones`
--
ALTER TABLE `TBReservaciones`
  ADD PRIMARY KEY (`idReservacion`),
  ADD KEY `fk_TBReservacion_TBPrestatario1_idx` (`idPrestatario`),
  ADD KEY `idTextoEjemplar_idx` (`idTextoEjemplar`);

--
-- Indices de la tabla `TBTextoEjemplares`
--
ALTER TABLE `TBTextoEjemplares`
  ADD PRIMARY KEY (`idEjemplar`),
  ADD KEY `idAdquisicion_idx` (`idAdquisicion`),
  ADD KEY `idDescripcion_idx` (`idTexto`);

--
-- Indices de la tabla `TBTextos`
--
ALTER TABLE `TBTextos`
  ADD PRIMARY KEY (`idTexto`),
  ADD KEY `tipo_idx` (`tipo`),
  ADD KEY `editorial_idx` (`editorial`);

--
-- Indices de la tabla `TBTiposDonadores`
--
ALTER TABLE `TBTiposDonadores`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `TBTiposMonedas`
--
ALTER TABLE `TBTiposMonedas`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `TBTiposMultimedia`
--
ALTER TABLE `TBTiposMultimedia`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `TBTiposPersonal`
--
ALTER TABLE `TBTiposPersonal`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `TBTiposPrestatarios`
--
ALTER TABLE `TBTiposPrestatarios`
  ADD PRIMARY KEY (`idTipoPrestatario`);

--
-- Indices de la tabla `TBTiposTextos`
--
ALTER TABLE `TBTiposTextos`
  ADD PRIMARY KEY (`idTipo`);

--
-- Indices de la tabla `textos-autores-aux`
--
ALTER TABLE `textos-autores-aux`
  ADD KEY `idTexto_idx` (`idTexto`),
  ADD KEY `idAutor_idx` (`idAutor`);

--
-- Indices de la tabla `textos-paises-aux`
--
ALTER TABLE `textos-paises-aux`
  ADD PRIMARY KEY (`idTexto`),
  ADD KEY `idTexto_idx` (`idTexto`),
  ADD KEY `idPais_idx` (`idPais`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `TBAdeudos`
--
ALTER TABLE `TBAdeudos`
  MODIFY `idAdeudo` int(11) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBAdquisiciones`
--
ALTER TABLE `TBAdquisiciones`
  MODIFY `idAdquisicion` int(11) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `TBAutores`
--
ALTER TABLE `TBAutores`
  MODIFY `idAutor` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `TBDonaciones`
--
ALTER TABLE `TBDonaciones`
  MODIFY `idDonacion` int(11) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBDonadores`
--
ALTER TABLE `TBDonadores`
  MODIFY `idDonador` int(11) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBEditoriales`
--
ALTER TABLE `TBEditoriales`
  MODIFY `idEditorial` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBPaises`
--
ALTER TABLE `TBPaises`
  MODIFY `idPais` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=241;
--
-- AUTO_INCREMENT de la tabla `TBPersonal`
--
ALTER TABLE `TBPersonal`
  MODIFY `idPersonal` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBPrestamos`
--
ALTER TABLE `TBPrestamos`
  MODIFY `idPrestamo` int(11) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBPrestatarios`
--
ALTER TABLE `TBPrestatarios`
  MODIFY `idPrestatario` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `TBReportes`
--
ALTER TABLE `TBReportes`
  MODIFY `idReporte` int(10) unsigned NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `TBTiposDonadores`
--
ALTER TABLE `TBTiposDonadores`
  MODIFY `idTipo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBTiposMonedas`
--
ALTER TABLE `TBTiposMonedas`
  MODIFY `idTipo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBTiposMultimedia`
--
ALTER TABLE `TBTiposMultimedia`
  MODIFY `idTipo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT de la tabla `TBTiposPersonal`
--
ALTER TABLE `TBTiposPersonal`
  MODIFY `idTipo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBTiposPrestatarios`
--
ALTER TABLE `TBTiposPrestatarios`
  MODIFY `idTipoPrestatario` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `TBTiposTextos`
--
ALTER TABLE `TBTiposTextos`
  MODIFY `idTipo` int(10) unsigned NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `TBAdeudos`
--
ALTER TABLE `TBAdeudos`
  ADD CONSTRAINT `idMonedaAdeudo-moneda` FOREIGN KEY (`idMonedaAdeudo`) REFERENCES `TBTiposMonedas` (`idTipo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idPrestamo-adeudo` FOREIGN KEY (`idPrestamo`) REFERENCES `TBPrestamos` (`idPrestamo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBAdquisiciones`
--
ALTER TABLE `TBAdquisiciones`
  ADD CONSTRAINT `idDonacion-adquisicion` FOREIGN KEY (`idDonacion`) REFERENCES `TBDonaciones` (`idDonacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBCondonaciones`
--
ALTER TABLE `TBCondonaciones`
  ADD CONSTRAINT `autoridad-condonacion` FOREIGN KEY (`autoridad`) REFERENCES `TBPersonal` (`idPersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idAdeudo-condonacion` FOREIGN KEY (`idAdeudo`) REFERENCES `TBAdeudos` (`idAdeudo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBDonaciones`
--
ALTER TABLE `TBDonaciones`
  ADD CONSTRAINT `donador` FOREIGN KEY (`donador`) REFERENCES `TBDonadores` (`idDonador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBDonadores`
--
ALTER TABLE `TBDonadores`
  ADD CONSTRAINT `tipodonador` FOREIGN KEY (`tipo`) REFERENCES `TBTiposDonadores` (`idTipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBMultimedia`
--
ALTER TABLE `TBMultimedia`
  ADD CONSTRAINT `tipo-multimedia` FOREIGN KEY (`tipo`) REFERENCES `TBTiposMultimedia` (`idTipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBMultimediaEjemplares`
--
ALTER TABLE `TBMultimediaEjemplares`
  ADD CONSTRAINT `idAdquisicion-multimedia` FOREIGN KEY (`idAdquision`) REFERENCES `TBAdquisiciones` (`idAdquisicion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idMultimedia-ejemplar` FOREIGN KEY (`idMultimedia`) REFERENCES `TBMultimedia` (`idMultimedia`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBPersonal`
--
ALTER TABLE `TBPersonal`
  ADD CONSTRAINT `tipo-personal` FOREIGN KEY (`tipo`) REFERENCES `TBTiposPersonal` (`idTipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBPrestamos`
--
ALTER TABLE `TBPrestamos`
  ADD CONSTRAINT `idPersonal-prestamo` FOREIGN KEY (`idPersonal`) REFERENCES `TBPersonal` (`idPersonal`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idPrestatario-prestamo` FOREIGN KEY (`idPrestatario`) REFERENCES `TBPrestatarios` (`idPrestatario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBPrestatarios`
--
ALTER TABLE `TBPrestatarios`
  ADD CONSTRAINT `tipo-prestatario` FOREIGN KEY (`tipo`) REFERENCES `TBTiposPrestatarios` (`idTipoPrestatario`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Filtros para la tabla `TBReservaciones`
--
ALTER TABLE `TBReservaciones`
  ADD CONSTRAINT `idPrestatario` FOREIGN KEY (`idPrestatario`) REFERENCES `TBPrestatarios` (`idPrestatario`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTextoEjemplar` FOREIGN KEY (`idTextoEjemplar`) REFERENCES `TBTextoEjemplares` (`idEjemplar`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `TBTextoEjemplares`
--
ALTER TABLE `TBTextoEjemplares`
  ADD CONSTRAINT `idAdquisicion` FOREIGN KEY (`idAdquisicion`) REFERENCES `TBAdquisiciones` (`idAdquisicion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTexto` FOREIGN KEY (`idTexto`) REFERENCES `TBTextos` (`idTexto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `TBTextos`
--
ALTER TABLE `TBTextos`
  ADD CONSTRAINT `editorial-textos` FOREIGN KEY (`editorial`) REFERENCES `TBEditoriales` (`idEditorial`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tipo-textos` FOREIGN KEY (`tipo`) REFERENCES `TBTiposTextos` (`idTipo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `textos-autores-aux`
--
ALTER TABLE `textos-autores-aux`
  ADD CONSTRAINT `idAutor-textos` FOREIGN KEY (`idAutor`) REFERENCES `TBAutores` (`idAutor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTexto-autores` FOREIGN KEY (`idTexto`) REFERENCES `TBTextos` (`idTexto`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `textos-paises-aux`
--
ALTER TABLE `textos-paises-aux`
  ADD CONSTRAINT `idPais-paises` FOREIGN KEY (`idPais`) REFERENCES `TBPaises` (`idPais`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idTexto-paises` FOREIGN KEY (`idTexto`) REFERENCES `TBTextos` (`idTexto`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
