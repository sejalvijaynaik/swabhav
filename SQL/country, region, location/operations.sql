--display the regions there no entry for country
select regions.region_id, region_name from regions
left join countries
on regions.region_id = countries.REGION_ID where country_id is null;

--display the countries there no states
select * from countries
left join locations
on countries.COUNTRY_ID = locations.COUNTRY_ID order by state_province, locations.COUNTRY_ID;

--display region name,countryname and state name
select * from (regions
left join countries on
regions.region_id = countries.REGION_ID)
left join locations on countries.COUNTRY_ID = locations.COUNTRY_ID where city = 'mumbai';
