 SELECT COUNT(DISTINCT replacement_cost) FROM film;
 
SELECT DISTINCT replacement_cost FROM film;

SELECT COUNT(title LIKE 'T%' AND rating ='G') FROM film;

SELECT COUNT(city LIKE 'R%' OR city LIKE '%r')  FROM city;

SELECT COUNT(country LIKE '-----') FROM country;
 