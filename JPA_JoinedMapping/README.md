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

![image](https://user-images.githubusercontent.com/44496666/159130020-af1fe471-6dc7-4828-a4ff-345f724527e9.png)

![image](https://user-images.githubusercontent.com/44496666/159130043-ad66b0a4-020b-4015-98ed-471d576ffdae.png)
![image](https://user-images.githubusercontent.com/44496666/159130048-4d6dd4ca-64b8-45bc-a201-a75e0b8e901c.png)

AFTER RUN HIBERNATE PROJECT

![image](https://user-images.githubusercontent.com/44496666/159130095-933ff0e2-1846-462c-adb9-fef8205854f7.png)

![image](https://user-images.githubusercontent.com/44496666/159130100-f59129c9-1451-4777-ba05-c9f4f8f0ab01.png)

![image](https://user-images.githubusercontent.com/44496666/159130109-12cfa441-b8ad-42b6-9744-540edab3b2bf.png)
