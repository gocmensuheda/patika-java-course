SELECT COUNT(*) AS uzun_filmler_sayisi
FROM film
WHERE length > (
    SELECT AVG(length) FROM film
);


SELECT COUNT(*) AS en_yuksek_kiralama_film_sayisi
FROM film
WHERE rental_rate = (
    SELECT MAX(rental_rate) FROM film
);


SELECT title, rental_rate, replacement_cost
FROM film
WHERE rental_rate = (
    SELECT MIN(rental_rate) FROM film
)
AND replacement_cost = (
    SELECT MIN(replacement_cost) FROM film
);


SELECT customer.customer_id, customer.first_name, customer.last_name, COUNT(payment.payment_id) AS toplam_odeme_sayisi
FROM customer
JOIN payment ON customer.customer_id = payment.customer_id
GROUP BY customer.customer_id, customer.first_name, customer.last_name
ORDER BY toplam_odeme_sayisi DESC
LIMIT 10;
