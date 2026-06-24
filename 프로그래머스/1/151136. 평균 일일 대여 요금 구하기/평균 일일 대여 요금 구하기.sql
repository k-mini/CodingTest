-- 코드를 입력하세요
-- SELECT round(avg(daily_fee),0) as average_fee
--   from car_rental_company_car
--  where car_type = 'SUV'
-- group by car_type
-- SELECT round(sum(daily_fee) / count(*), 0) as average_fee
--   from car_rental_company_car
--  where car_type = 'SUV'
-- group by car_type

-- select round(avg(daily_fee)) as average_fee
-- from car_rental_company_car
-- where car_type = 'SUV';

-- 26.06.24
select round(avg(daily_fee),0) average_fee
from car_rental_company_car
where car_type = 'SUV';
