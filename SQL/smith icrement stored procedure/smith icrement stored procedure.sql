select * from emp;

DELIMITER $$
CREATE PROCEDURE smith_increment_2k(in amount decimal(13,2), in name varchar(100))
BEGIN
    update emp
    set sal = sal + amount
    where ename = name;
END$$
DELIMITER ;

call smith_increment_2k(2000.00, 'smith');

drop procedure smith_increment_2k;