CREATE TABLE CUSTOMER(
ID INT PRIMARY KEY AUTO_INCREMENT,
NAME VARCHAR(50) not null,
DESCRIPTION VARCHAR(50),

CREATEDATE TIMESTAMP not null,
CREATEDUSER VARCHAR(20) not null,
LASTMODIFIED TIMESTAMP not null,
UPDATEDUSER VARCHAR(20) not null
);