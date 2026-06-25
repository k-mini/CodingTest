-- 코드를 입력하세요
-- select book_id,to_char(published_date,'YYYY-MM-DD') as published_date
--   from book
--  where category = '인문'
--    and to_char(published_date,'YYYY') ='2021'
-- order by published_date asc;

-- select book_id, to_char(published_date,'YYYY-MM-DD HH24:mi:SS') as published_date
-- from book
-- where to_char(published_date,'YYYY') = '2021'
--   and category = '인문'
-- order by published_date asc;

-- 26.6.24
select book_id, to_char(published_date, 'YYYY-MM-dd') 
  from book
 where to_char(published_date, 'YYYY') = 2021
   and category = '인문'
 order by published_date;