# C2TC_Hibernate_with_JPA
## Single table per class hierarchy :
## Inheritance type : SINGLE_TABLE


Please run the below DDL query before you execute this application.

CREATE TABLE `demo`.`emp_store` (
  `empId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `salary` FLOAT NULL,
  PRIMARY KEY (`empId`));
