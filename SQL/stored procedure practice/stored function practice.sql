select * from emp;

DELIMITER $$
CREATE PROCEDURE salary_increment_20()
BEGIN
    update emp
    set sal = sal*1.2
    where deptno = 10;
END$$
DELIMITER ;

drop procedure salary_increment_20;

call salary_increment_20;
