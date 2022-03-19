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
  
  ![image](https://user-images.githubusercontent.com/44496666/159127924-55b29b54-32e3-4c23-bf8a-0b490ce16926.png)

![image](https://user-images.githubusercontent.com/44496666/159127940-d8c62b0a-c477-4073-b7e7-d516183567fa.png)
![image](https://user-images.githubusercontent.com/44496666/159127953-196e76ca-17b3-4d22-a3ce-dbd0edc66a6e.png)

AFTER RUN HIBERNATE PROJECT

![image](https://user-images.githubusercontent.com/44496666/159128062-f0a99248-afe9-4efc-ada9-7bf6ba89b0b1.png)

![image](https://user-images.githubusercontent.com/44496666/159128069-5d7c00fb-1287-4c2e-9342-992002793fab.png)

![image](https://user-images.githubusercontent.com/44496666/159128079-a426a5fb-1fdb-4d37-b280-039c5a08698e.png)


