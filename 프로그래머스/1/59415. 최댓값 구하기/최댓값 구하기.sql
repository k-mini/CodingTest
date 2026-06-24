-- 코드를 입력하세요
--SELECT max(datetime) as 시간 from animal_ins;
-- select datetime as 시간
-- from (select datetime from animal_ins order by datetime desc)
-- where rownum = 1;

-- select datetime as 시간
-- from  (select * from animal_ins order by datetime desc)
-- where rownum = 1;

-- 26.6.24
-- select max(datetime) 시간 from animal_ins;
select datetime 시간
from (select datetime from animal_ins order by datetime desc)
where rownum = 1;