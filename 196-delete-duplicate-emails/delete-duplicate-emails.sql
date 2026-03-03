# Write your MySQL query statement below
delete from Person
where id not in (
select id from 
    (    
        select id,
        row_number() over (partition by email order by id asc) as rn
        from Person
    )A
    where rn = 1  
)