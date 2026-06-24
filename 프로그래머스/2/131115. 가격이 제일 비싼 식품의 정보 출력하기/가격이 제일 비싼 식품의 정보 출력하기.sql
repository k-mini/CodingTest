-- 코드를 입력하세요
-- select product_id,
--        product_name,
--        product_cd,
--        category,
--        price
--   from (select * from food_product order by price desc)
--  where rownum = 1
--  ;

-- select *
--   from food_product
--  where price in (select max(price) from food_product)

-- 26.6.24
select product_id, product_name, product_cd,category, price
from food_product
where price in (select max(price) from food_product);