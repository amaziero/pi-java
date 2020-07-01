
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `pi-java` DEFAULT CHARACTER SET utf8 ;

USE `pi-java` ;
-- -----------------------------------------------------
-- Table `pi-java`.`add_item`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pi-java`.`add_item` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `qtd` INT NULL,
  `id_product` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_register_item_add_item`
    FOREIGN KEY (`id_product`)
    REFERENCES `pi-java`.`register_item` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

--------------------------- ----------------------------
-- Table `pi-java`.`register_item`
-------------------------------------------------------

CREATE TABLE IF NOT EXISTS `pi-java`.`register_item` (
  `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `description` VARCHAR(100) NULL,
  `name_item` VARCHAR(100) NULL,
  `cost` DOUBLE NULL,
  `sell_price` DOUBLE NULL,
  `quantity` DOUBLE NULL)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;