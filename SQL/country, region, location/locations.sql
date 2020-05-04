CREATE TABLE LOCATIONS( 
	LOCATION_ID int not null, 
	STREET_ADDRESS VARCHAR(40), 
	POSTAL_CODE VARCHAR(12), 
	CITY VARCHAR(30) NOT NULL, 
	STATE_PROVINCE VARCHAR(25), 
	COUNTRY_ID CHAR(2)
);

desc locations;

ALTER TABLE LOCATIONS
ADD CONSTRAINT LOC_ID_PK PRIMARY KEY (LOCATION_ID),
add CONSTRAINT LOC_C_ID_FK FOREIGN KEY (COUNTRY_ID) REFERENCES COUNTRIES(COUNTRY_ID);

INSERT INTO locations VALUES( 1000, '1297 Via Cola di Rie', '00989', 'Roma', NULL, 'IT');
INSERT INTO locations VALUES( 1100, '93091 Calle della Testa', '10934', 'Venice', NULL, 'IT');
INSERT INTO locations VALUES( 1200, '2017 Shinjuku-ku', '1689', 'Tokyo', 'Tokyo Prefecture', 'JP');
INSERT INTO locations VALUES( 1300, '9450 Kamiya-cho', '6823', 'Hiroshima', NULL, 'JP');
INSERT INTO locations VALUES( 1400, '2014 Jabberwocky Rd', '26192', 'Southlake', 'Texas', 'US');
INSERT INTO locations VALUES( 1500, '2011 Interiors Blvd', '99236', 'South San Francisco', 'California', 'US');
INSERT INTO locations VALUES( 1600, '2007 Zagora St', '50090', 'South Brunswick', 'New Jersey', 'US');
INSERT INTO locations VALUES( 1700, '2004 Charade Rd', '98199', 'Seattle', 'Washington', 'US');
INSERT INTO locations VALUES( 1800, '147 Spadina Ave', 'M5V 2L7', 'Toronto', 'Ontario', 'CA');
INSERT INTO locations VALUES( 1900, '6092 Boxwood St', 'YSW 9T2', 'Whitehorse', 'Yukon', 'CA');

INSERT INTO locations VALUES( 2000, '9809 andheri St', '400063', 'Mumbai', 'Maharashtra', 'IN');

select * from locations;