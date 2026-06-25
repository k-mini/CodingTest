-- 코드를 입력하세요
-- SELECT warehouse_id, 
--        warehouse_name, 
--        address, 
--        --nvl(freezer_yn,'N')
--        case when freezer_yn is null then 'N' 
--             else freezer_yn 
--         end as freezer_yn
-- from food_warehouse
-- where address like '경기도%'
-- order by warehouse_id;

-- select warehouse_id,warehouse_name,address,
--         --nvl(freezer_yn,'N') as FREEZER_YN
--        case when freezer_yn is null then 'N'
--        else freezer_yn
--        end as freezer_yn
-- from food_warehouse
-- where address like '%경기도%'
-- order by warehouse_id asc;

-- 26.6.25
select warehouse_id, warehouse_name,address,
nvl(freezer_yn, 'N') freezer_yn
from food_warehouse
where address like '%경기%'
order by warehouse_id ;