-- 코드를 입력하세요
-- SELECT pt_name,
--        pt_no,
--        gend_cd,
--        age,
--        case when tlno is not null then tlno  
--             else 'NONE'
--        end as TLNO
--   from patient
--  where age <= 12
--    and gend_cd = 'W'
--  order by age desc, pt_name asc

-- select pt_name,pt_no,gend_cd,age,
-- --nvl(tlno,'NONE') as tlno
--        case when tlno is null then 'NoNE'
--        else tlno
--        end as tlno
-- from patient
-- where age <= 12
--   and gend_cd = 'W'
-- order by age desc,pt_name asc;

-- 26.6.24
select pt_name,pt_no,gend_cd,age, nvl(tlno, 'NONE') tlno
  from patient
 where age <= 12 and gend_cd = 'W'
 order by age desc, pt_name;
