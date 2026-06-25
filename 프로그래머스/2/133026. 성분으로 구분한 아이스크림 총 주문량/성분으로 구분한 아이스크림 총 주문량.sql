-- 코드를 입력하세요
-- SELECT b.ingredient_type,
--        sum(a.total_order) as total_order
--   from first_half a
--   inner join icecream_info b
--   on (a.flavor = b.flavor)
-- group by b.ingredient_type
-- order by total_order;

-- 26.6.25
select ingredient_type, sum(total_order) total_order
  from first_half a
  inner join icecream_info b on a.flavor = b.flavor
  group by ingredient_type
  order by total_order;