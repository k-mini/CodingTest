-- 코드를 입력하세요
-- select a.flavor
--   from first_half a,icecream_info b
--   where a.flavor = b.flavor
--     and a.total_order > 3000
--     and b.ingredient_type = 'fruit_based'
-- order by a.total_order desc;

-- select fh.flavor
--   from first_half fh
-- inner join icecream_info II on fh.flavor = II.flavor
--   where fh.total_order > 3000
--   and II.ingredient_type = 'fruit_based'
--   order by fh.total_order desc

-- select a.flavor
-- from first_half a inner join  icecream_info b
--   on a.flavor = b.flavor
-- where a.total_order > 3000
--   and b.ingredient_type = 'fruit_based'
-- order by a.total_order desc;

-- 26.6.24
select a.flavor
 from first_half a
 inner join icecream_info b
 on a.flavor = b.flavor
where a.total_order >= 3000
and b.ingredient_type = 'fruit_based'
order by a.total_order desc;
