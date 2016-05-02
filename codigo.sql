-- MySQL Script generated by MySQL Workbench
-- Mon Apr 25 13:00:10 2016
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`TBDonador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBDonador` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(100) NULL COMMENT '',
  `correo` VARCHAR(45) NULL COMMENT '',
  `direccion` VARCHAR(45) NULL COMMENT '',
  `telefono` VARCHAR(45) NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBDonacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBDonacion` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `fecha` DATE NULL COMMENT '',
  `esMonetario` TINYINT(1) NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  `donador` INT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `donador_idx` (`donador` ASC)  COMMENT '',
  CONSTRAINT `donador`
    FOREIGN KEY (`donador`)
    REFERENCES `mydb`.`TBDonador` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBAdquisicion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBAdquisicion` (
  `fecha` DATETIME NOT NULL COMMENT '',
  `fueDonado` TINYINT(1) NULL COMMENT '',
  `idDonacion` INT NULL COMMENT '',
  `idItem` VARCHAR(50) NULL COMMENT '',
  PRIMARY KEY (`fecha`)  COMMENT '',
  INDEX `idDonacion_idx` (`idDonacion` ASC)  COMMENT '',
  CONSTRAINT `idDonacion`
    FOREIGN KEY (`idDonacion`)
    REFERENCES `mydb`.`TBDonacion` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBTextos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBTextos` (
  `id` VARCHAR(50) NOT NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  `titulo` VARCHAR(45) NULL COMMENT '',
  `disponible` TINYINT(1) NULL COMMENT '',
  `numeroEjemplares` INT NULL COMMENT '',
  `editorial` VARCHAR(45) NULL COMMENT '',
  `fechaDePublicacion` DATE NULL COMMENT '',
  `numeroDePaginas` VARCHAR(45) NULL COMMENT '',
  `autor` VARCHAR(100) NULL COMMENT '',
  `Pais` VARCHAR(45) NULL COMMENT '',
  `numeroDePublicacion` VARCHAR(10) NULL COMMENT '',
  `lugarDePublicacion` VARCHAR(45) NULL COMMENT '',
  `TBAdquisicion_fecha` DATE NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_TBTextos_TBAdquisicion1_idx` (`TBAdquisicion_fecha` ASC)  COMMENT '',
  CONSTRAINT `fk_TBTextos_TBAdquisicion1`
    FOREIGN KEY (`TBAdquisicion_fecha`)
    REFERENCES `mydb`.`TBAdquisicion` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBMultimedia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBMultimedia` (
  `id` VARCHAR(50) NOT NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  `titulo` VARCHAR(45) NULL COMMENT '',
  `areaEducativa` VARCHAR(45) NULL COMMENT '',
  `narrador` VARCHAR(45) NULL COMMENT '',
  `nombreDelLibro` VARCHAR(45) NULL COMMENT '',
  `plataforma` VARCHAR(45) NULL COMMENT '',
  `version` VARCHAR(45) NULL COMMENT '',
  `año` VARCHAR(45) NULL COMMENT '',
  `director` VARCHAR(45) NULL COMMENT '',
  `pais` VARCHAR(45) NULL COMMENT '',
  `TBAdquisicion_fecha` DATETIME NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_TBMultimedia_TBAdquisicion1_idx` (`TBAdquisicion_fecha` ASC)  COMMENT '',
  CONSTRAINT `fk_TBMultimedia_TBAdquisicion1`
    FOREIGN KEY (`TBAdquisicion_fecha`)
    REFERENCES `mydb`.`TBAdquisicion` (`fecha`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBBiblioteca`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBBiblioteca` (
  `nombre` VARCHAR(100) NULL COMMENT '',
  `direccion` VARCHAR(150) NULL COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBPersonal`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBPersonal` (
  `numeroPersonal` VARCHAR(50) NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `direccion` VARCHAR(100) NULL COMMENT '',
  `fechaNacimiento` DATE NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  `telefono` VARCHAR(45) NULL COMMENT '',
  `correo` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`numeroPersonal`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBReportes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBReportes` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `fechaInicio` DATE NULL COMMENT '',
  `fechaFinal` DATE NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  `archivo` BLOB NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBPrestatario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBPrestatario` (
  `numeroPersonal` VARCHAR(50) NOT NULL COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `direccion` VARCHAR(100) NULL COMMENT '',
  `fechaNacimiento` DATE NULL COMMENT '',
  `tipo` VARCHAR(45) NULL COMMENT '',
  `telefono` VARCHAR(45) NULL COMMENT '',
  `correo` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`numeroPersonal`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBCondonacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBCondonacion` (
  `idCondonacion` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `autoridad` VARCHAR(45) NULL COMMENT '',
  `justificacion` TEXT(1000) NULL COMMENT '',
  PRIMARY KEY (`idCondonacion`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBAdeudo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBAdeudo` (
  `idAdeudo` INT NOT NULL COMMENT '',
  `fechaInicial` DATETIME NULL COMMENT '',
  `monto` FLOAT NULL COMMENT '',
  `tipo` TINYINT(1) NULL COMMENT '',
  `idPrestatario` VARCHAR(45) NULL COMMENT '',
  `TBCondonacion_idCondonacion` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idAdeudo`)  COMMENT '',
  INDEX `fk_TBAdeudo_TBCondonacion1_idx` (`TBCondonacion_idCondonacion` ASC)  COMMENT '',
  CONSTRAINT `fk_TBAdeudo_TBCondonacion1`
    FOREIGN KEY (`TBCondonacion_idCondonacion`)
    REFERENCES `mydb`.`TBCondonacion` (`idCondonacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Prestamo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Prestamo` (
  `idPrestamo` INT NOT NULL COMMENT '',
  `idPrestatario` VARCHAR(50) NULL COMMENT '',
  `estado` VARCHAR(45) NULL COMMENT '',
  `vencimiento` DATETIME NULL COMMENT '',
  `TBPrestatario_numeroPersonal` VARCHAR(50) NOT NULL COMMENT '',
  `TBAdeudo_idAdeudo` INT NOT NULL COMMENT '',
  PRIMARY KEY (`idPrestamo`)  COMMENT '',
  INDEX `fk_Prestamo_TBPrestatario1_idx` (`TBPrestatario_numeroPersonal` ASC)  COMMENT '',
  INDEX `fk_Prestamo_TBAdeudo1_idx` (`TBAdeudo_idAdeudo` ASC)  COMMENT '',
  CONSTRAINT `fk_Prestamo_TBPrestatario1`
    FOREIGN KEY (`TBPrestatario_numeroPersonal`)
    REFERENCES `mydb`.`TBPrestatario` (`numeroPersonal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Prestamo_TBAdeudo1`
    FOREIGN KEY (`TBAdeudo_idAdeudo`)
    REFERENCES `mydb`.`TBAdeudo` (`idAdeudo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TBReservacion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`TBReservacion` (
  `idReservacion` INT NOT NULL COMMENT '',
  `idPrestatario` VARCHAR(50) NULL COMMENT '',
  `idItem` VARCHAR(50) NULL COMMENT '',
  `fechaVencimiento` DATETIME NULL COMMENT '',
  `TBPrestatario_numeroPersonal` VARCHAR(50) NOT NULL COMMENT '',
  PRIMARY KEY (`idReservacion`)  COMMENT '',
  INDEX `fk_TBReservacion_TBPrestatario1_idx` (`TBPrestatario_numeroPersonal` ASC)  COMMENT '',
  CONSTRAINT `fk_TBReservacion_TBPrestatario1`
    FOREIGN KEY (`TBPrestatario_numeroPersonal`)
    REFERENCES `mydb`.`TBPrestatario` (`numeroPersonal`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;