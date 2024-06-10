select BOOK_ID, date_format(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
from BOOK
where CATEGORY = '인문' and PUBLISHED_DATE LIKE '2021%'
order by PUBLISHED_DATE