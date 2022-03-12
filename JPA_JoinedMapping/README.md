# C2TC_Hibernate_with_JPA
## Joined Subclass Strategy
## Inheritance type: JOINED


Please run the below DDL query before you execute this application.

CREATE TABLE `demo`.`emp1` (
  `employeeId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `salary` FLOAT NULL,
  PRIMARY KEY (`employeeId`));

CREATE TABLE `demo`.`mgr1` (
  `departmentName` VARCHAR(45) NULL,
  `employeeId` INT NOT NULL,
  INDEX `employeeId_idx` (`employeeId` ASC) VISIBLE,
  CONSTRAINT `employeeId`
    FOREIGN KEY (`employeeId`)
    REFERENCES `demo`.`emp1` (`employeeId`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

