# C2TC_Hibernate_with_JPA
## CARDINALITY : Bidirectional
## One to One Relationship 

Please run the below DDL query before you execute this application.

CREATE TABLE TEST.STUDENT1
(
studentId INT PRIMARY KEY,
name VARCHAR(45),
address_id INT REFERENCES
ADDRESS1(address_id)
);

CREATE TABLE TEST.ADDRESS1
(
address_id INT PRIMARY KEY,
address_street VARCHAR(45),
address_city VARCHAR(45),
address_state VARCHAR(45),
address_zipcode VARCHAR(45)
);

![image](https://user-images.githubusercontent.com/44496666/159131193-4223cacb-9ba1-4bcb-91cd-b987cd93e3ee.png)

![image](https://user-images.githubusercontent.com/44496666/159131214-1772c6f3-f69e-4fa6-ada9-5ce74a13bda8.png)
![image](https://user-images.githubusercontent.com/44496666/159131220-c7d6c4d0-c24d-4081-89ff-b2837b3d859f.png)

AFTER RUN HIBERNATE PROJECT

![image](https://user-images.githubusercontent.com/44496666/159131265-eae00f35-92de-4505-b7bc-f6a7007187f9.png)

![image](https://user-images.githubusercontent.com/44496666/159131278-8a7da495-ac76-4334-9243-91847b4fc12f.png)

![image](https://user-images.githubusercontent.com/44496666/159131290-868990ad-338e-47e9-a582-8637387b88f4.png)

**LEARNING:**

![image](https://user-images.githubusercontent.com/44496666/159131807-fa84bef6-5338-4da5-ba01-88f548de79fb.png)

