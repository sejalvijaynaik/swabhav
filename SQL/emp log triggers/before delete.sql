select * from emp;

CREATE TRIGGER before_employee_delete
before delete on emp FOR EACH ROW 
INSERT INTO emp_log_info
SET operation = 'before_delete',
emp_log_info.empno = old.empno,
emp_log_info.ename = old.ename,
emp_log_info.job = old.job,
emp_log_info.mgr = old.mgr,
emp_log_info.hiredate = old.hiredate,
emp_log_info.sal = old.sal,
emp_log_info.comm = old.comm,
emp_log_info.deptno = old.deptno,
change_date = now();

delete from emp where ename = 'sejal';

select * from emp_log_info;