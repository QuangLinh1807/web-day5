CREATE DATABASE web_day5;
USE web_day5;

CREATE TABLE STUDENT(
	STUDENT_ID INT NOT NULL AUTO_INCREMENT, 
    STUDENT_NAME VARCHAR(50) NOT NULL, 
    STUDENT_DOB DATE,
    PRIMARY KEY ( STUDENT_ID )
);

select * from student;