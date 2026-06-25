-- 코드를 입력하세요
-- SELECT dr_name,
--        dr_id,
--        mcdp_cd,
--        to_char(hire_ymd,'YYYY-MM-DD') as hire_ymd
-- from doctor
-- where MCDP_CD in ('CS','GS')
-- order by hire_ymd desc, dr_name asc
-- select dr_name,dr_id,mcdp_cd,to_char(hire_ymd,'yyyy-MM-DD') as hire_ymd
-- from doctor
-- where mcdp_cd = 'CS' or mcdp_cd = 'GS'
-- order by hire_ymd desc, dr_name asc;


select  dr_name, dr_id, mcdp_cd, to_char(hire_ymd, 'YYYY-MM-DD') hire_ymd
  from doctor
  where mcdp_cd = 'CS' OR mcdp_cd = 'GS'
  order by hire_ymd desc, dr_name;