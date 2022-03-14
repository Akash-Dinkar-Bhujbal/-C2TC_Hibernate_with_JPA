# C2TC_Hibernate_with_JPA
## CARDINALITY : Unidirectional
## One to One Relationship 

Please run the below DDL query before you execute this application.

CREATE TABLE DEMO.STUDENT1
(
studentId INT PRIMARY KEY,
name VARCHAR(45),
address_id INT REFERENCES
ADDRESS1(address_id)
);

CREATE TABLE DEMO.ADDRESS1
(
address_id INT PRIMARY KEY,
address_street VARCHAR(45),
address_city VARCHAR(45),
address_state VARCHAR(45),
address_zipcode VARCHAR(45)
);
