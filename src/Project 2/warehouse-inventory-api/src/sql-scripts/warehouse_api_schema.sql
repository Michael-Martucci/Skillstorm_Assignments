-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema warehouse_api
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema warehouse_api
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `warehouse_api` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `warehouse_api` ;

-- -----------------------------------------------------
-- Table `warehouse_api`.`branch`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `warehouse_api`.`branch` (
  `store_num` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(30) NULL DEFAULT NULL,
  `address` VARCHAR(30) NULL DEFAULT NULL,
  `branch_manager` VARCHAR(30) NULL DEFAULT NULL,
  `num_of_employees` INT UNSIGNED NULL DEFAULT NULL,
  `max_capacity_lbs` INT UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`store_num`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `warehouse_api`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `warehouse_api`.`products` (
  `product_id` INT NOT NULL AUTO_INCREMENT,
  `product_name` VARCHAR(30) NULL DEFAULT NULL,
  `quantity` INT NULL DEFAULT NULL,
  `weight_lbs` INT NULL DEFAULT NULL,
  `location_id` INT NULL DEFAULT NULL,
  PRIMARY KEY (`product_id`),
  INDEX `FKjjo9w0ar8us7pawgrytxh736t` (`location_id` ASC) VISIBLE,
  CONSTRAINT `FKjjo9w0ar8us7pawgrytxh736t`
    FOREIGN KEY (`location_id`)
    REFERENCES `warehouse_api`.`branch` (`store_num`))
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
