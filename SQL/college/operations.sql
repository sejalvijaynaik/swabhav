select * from departments
left join colleges
on departments.college_id = colleges.id order by colleges.id;

select * from (professors
left join departments
on professors.department_id = departments.id)
left join colleges
on departments.college_id = colleges.id order by colleges.id;



