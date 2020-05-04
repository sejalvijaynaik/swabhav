select * from emp;

select * from emp_log_info;

create table emp_log_info(
	empno int,
	ename varchar(100),
	job varchar(100),
	mgr int,
	hiredate date,
	sal decimal(13,2),
	comm decimal(13,2),
	deptno int,
	operation varchar(100),
	change_date datetime
);

drop table  emp_log_info;

