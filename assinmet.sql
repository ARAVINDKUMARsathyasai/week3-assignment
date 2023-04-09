SHOW DATABASES
CREATE DATABASE AXIS
USE  AXIS
CREATE TABLE employee (id INT(23) , NAME TEXT (50), address TEXT (50), salary INT(30))
DESC employee
INSERT INTO employee VALUES (111,"ARAVINDKUMAR","BSCT HOSTEL",67000);
SELECT * FROM employee
INSERT INTO employee (id,NAME, address) VALUES (112,"SUNIL KUMAR","Bangalore")
SELECT * FROM employee WHERE id =111
SELECT salary FROM employee
SELECT NAME,salary FROM employee
SELECT salary,NAME AS TITLE FROM employee
UPDATE employee SET salary = 68000 WHERE id = 112
UPDATE employee SET salary=90000 WHERE salary=68000
SELECT * FROM employee
DELETE FROM employee WHERE id = 111
TRUNCATE employee
DESC employee
DROP DATABASE axis

ALTER TABLE employee ADD(city TEXT(35));
ALTER TABLE employee MODIFY city INT(44)

create table student like employee
rename table student to students
show tables

Select distinct name from employee
select * from employee order by name asc
SELECT * FROM employee ORDER BY NAME desc

select id, name, sum(salary) from employee group by (name)
SELECT id, NAME, max(salary) FROM employee GROUP BY (NAME)
SELECT id, NAME, min(salary) FROM employee GROUP BY (NAME)
select id, name, count(name) as total_repeat from employee group by name;
select min(salary), id from employee group by id having min(salary)>500

