CREATE TABLE REGIONS( 
	region_id int NOT NULL, 
	region_name VARCHAR(25) 
);

ALTER TABLE REGIONS
ADD CONSTRAINT reg_id_pk PRIMARY KEY (region_id);

desc regions;

INSERT INTO regions VALUES( 1, 'Europe');
INSERT INTO regions VALUES( 2, 'Americas');
INSERT INTO regions VALUES( 3, 'Asia');
INSERT INTO regions VALUES( 4, 'Middle East and Africa');

select * from regions;