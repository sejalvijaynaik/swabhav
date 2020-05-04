select * from emp;

CREATE TRIGGER after_employee_insert 
after insert on emp FOR EACH ROW 
INSERT INTO emp_log_info
SET operation = 'insert',
emp_log_info.empno = new.empno,
emp_log_info.ename = new.ename,
emp_log_info.job = new.job,
emp_log_info.mgr = new.mgr,
emp_log_info.hiredate = new.hiredate,
emp_log_info.sal = new.sal,
emp_log_info.comm = new.comm,
emp_log_info.deptno = new.deptno,
change_date = now();

drop trigger after_employee_insert;

insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values(7999, 'SEJAL', 'ANALYST', 7839, '2020-02-12', 3000.00, 200.00, 20);
