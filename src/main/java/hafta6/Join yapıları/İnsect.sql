SELECT first_name FROM actor
UNION
SELECT first_name FROM customer
ORDER BY first_name;

SELECT first_name FROM actor
INTERSECT
SELECT first_name FROM customer
ORDER BY first_name;


SELECT first_name FROM actor
EXCEPT
SELECT first_name FROM customer
ORDER BY first_name;

SELECT first_name FROM actor
UNION ALL
SELECT first_name FROM customer
ORDER BY first_name;

SELECT a.first_name
FROM actor a
JOIN customer c ON a.first_name = c.first_name
ORDER BY a.first_name;

SELECT a.first_name
FROM actor a
LEFT JOIN customer c ON a.first_name = c.first_name
WHERE c.first_name IS NULL
ORDER BY a.first_name;
