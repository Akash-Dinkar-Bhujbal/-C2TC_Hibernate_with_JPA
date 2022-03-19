# C2TC_Hibernate_with_JPA
## CARDINALITY : Unidirectional
## One to One Relationship 

Please run the below DDL query before you execute this application.

CREATE TABLE TEST.STUDENT
(
studentId INT PRIMARY KEY,
name VARCHAR(45),
address_id INT REFERENCES
ADDRESS1(address_id)
);

CREATE TABLE TEST.ADDRESS
(
address_id INT PRIMARY KEY,
address_street VARCHAR(45),
address_city VARCHAR(45),
address_state VARCHAR(45),
address_zipcode VARCHAR(45)
);

![image](https://user-images.githubusercontent.com/44496666/159130516-245e5927-5a13-478b-842a-958cb4e0200b.png)

![image](https://user-images.githubusercontent.com/44496666/159130808-7957d635-2450-4450-bffc-b4657c765968.png)
![image](https://user-images.githubusercontent.com/44496666/159130815-d02df8ff-cd25-4017-af93-f462f991b896.png)

AFTER RUN HIBERNATE PROJECT

![image](https://user-images.githubusercontent.com/44496666/159130838-f33daea3-a805-43cb-bf67-8551b182955e.png)

![image](https://user-images.githubusercontent.com/44496666/159130851-0dd9d8dc-f48f-41cf-b687-2eb8dd972fae.png)

![image](https://user-images.githubusercontent.com/44496666/159130856-cc078aad-32c9-4729-b3ef-3bf347010a9c.png)
