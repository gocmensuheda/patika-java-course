
--aggregate fonksiyonlar; COUNT, MIN, MAX, AVG, SUM
SELECT MAX(length) FROM film WHERE rental_rate=4.99;

SELECT AVG(rental_rate) FROM film;

SELECT COUNT(*) FROM film WHERE title LIKE 'C%';

SELECT MAX(length) FROM film WHERE rental_rate=0.99;

SELECT DISTINCT COUNT(replacement_cost) FROM film WHERE length>150;