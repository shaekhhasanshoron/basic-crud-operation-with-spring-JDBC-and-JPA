/*
create table person
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);
*/


INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1001, 'Shaekh','Dhaka',sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1002, 'Hasan','Puran Dhaka',sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1003, 'Shoron','Gandaria',sysdate());