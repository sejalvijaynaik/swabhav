select * from emp;

CREATE TRIGGER after_employee_update 
after update on emp FOR EACH ROW 
INSERT INTO emp_log_info
SET operation = 'after_update',
emp_log_info.empno = new.empno,
emp_log_info.ename = new.ename,
emp_log_info.job = new.job,
emp_log_info.mgr = new.mgr,
emp_log_info.hiredate = new.hiredate,
emp_log_info.sal = new.sal,
emp_log_info.comm = new.comm,
emp_log_info.deptno = new.deptno,
change_date = now();

update emp set sal = 2000.00 where ename = 'allen'; 

select * from emp_log_info;