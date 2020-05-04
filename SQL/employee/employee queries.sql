select * from emp;

select * from emp order by ename;

select * from emp where deptno in (10, 20);

select * from emp where job = 'clerk';

select * from emp where comm is null;

select * from emp where sal between 2000 and 5000;

select *, (sal*12 + ifnull(comm, 0)) as 'annual salary' from emp;

select * from emp order by sal desc limit 3;

select *, concat(round(datediff(curdate(), hiredate)/365), ' years') as tenure from emp;

select distinct(deptno) from emp;

select deptno, ename from emp where ename = 'scott';

select * from emp where deptno = (select deptno from emp where ename = 'scott');

select job from emp where ename = 'smith';

select * from emp where job = (select job from emp where ename = 'smith');

--1)display no of employees
select count(*) from emp;

--2)display sum of salaries of employeeess
select sum(sal) from emp;

--3)display avg of salreis of employeees
select avg(sal) from emp;

--4)display sum,avg,count of employees--
select deptno, count(*) as count, avg(sal) as average, sum(sal) as sum from emp group by deptno;

--find out diff between group by and order by
--is it necessary to use having clause with group by
--order by sorts the data in asc or desc order??
--what is the diff between left join and right

--5)display the deptwise , headcount

select dept.deptno, count(empno) as 'head count' from dept
left join emp
on dept.DEPTNO = emp.DEPTNO group by dept.deptno;

--6)display the jobwie headocunt

select emp.JOB, count(*) as 'head count' from dept
right join emp
on dept.DEPTNO = emp.DEPTNO group by emp.JOB;

--7)display deptwise ,jobwise head count

select  dept.DEPTNO, job, count(empno) from dept
right join emp
on dept.DEPTNO = emp.DEPTNO group by dept.DEPTNO, job;

--8)display the deptwise employees whose count greater than 2 and who are in dept 10 ,20.Sorty the result by descending order of count
select * from (
select dept.deptno, count(empno) as head_count from dept
left join emp
on dept.DEPTNO = emp.DEPTNO where dept.deptno in (10, 20) group by dept.deptno) a
where head_count > 2 order by a.deptno desc;

select dept.deptno, count(empno) as head_count from dept
left join emp
on dept.DEPTNO = emp.DEPTNO where dept.deptno in (10, 20)  group by dept.deptno having head_count > 2 order by head_count desc;

--9)display ename,deptname

select dname, ename from dept
right join emp
on dept.DEPTNO = emp.DEPTNO;

--10)display the deptname wise count

select  dname, count(empno) from dept
left join emp
on dept.DEPTNO = emp.DEPTNO group by dept.deptno;

--11)display the deptname,jobwise count

select  emp.DEPTNO, dname, job, count(empno) from dept
right join emp
on dept.DEPTNO = emp.DEPTNO group by emp.deptno, job;

--12)display all the deptments , with employees if any (if no emps then display null)

select dept.DEPTNO, dname, empno, ename from dept
left join emp
on dept.DEPTNO = emp.DEPTNO;

--13)display the deptments where there are no employees

select dept.DEPTNO, dname from dept
left join emp
on dept.DEPTNO = emp.DEPTNO where empno is null;

--14)display the empname and their bossnames

select a.ENAME as 'emp name', b.ENAME as 'boss name'
from emp a
left join emp b
on a.mgr = b.empno where b.ename is not null;

--15)display all the empnames and boss names if any (if no boss display null)

select a.ENAME as 'emp name', b.ENAME as 'boss name'
from emp a
left join emp b
on a.mgr = b.empno;

--16)display enmae,deptname and bossname

select dept.DEPTNO as 'employee dept no',dname, a.empno as 'employee No', a.ename as 'employee name', b.empno as 'boss no', b.ENAME as 'boss name' 
from (emp a
left join emp b
on a.mgr = b.empno)
left join dept on a.deptno = dept.deptno;
