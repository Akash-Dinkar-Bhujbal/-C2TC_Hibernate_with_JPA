# C2TC_Hibernate_with_JPA
## Table per concrete entity class:
## Inheritance type: TABLE_PER_CLASS


Please run the below DDL query before you execute this application.

CREATE TABLE `demo`.`emp` (
  `employeeId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `salary` FLOAT NULL,
  PRIMARY KEY (`employeeId`));



CREATE TABLE `demo`.`mgr` (
  `departmentName` VARCHAR(45) NOT NULL);
