INSERT INTO employee (id, name, birthday, email) VALUES
(1, 'Ahmet', '1990-02-14', 'ahmet.kaya@example.com'),
(2, 'Ayşe', '1987-06-23', 'ayse.yildiz@example.com');
-- Devamı Mockaroo tarafından oluşturulacak

-- id ile ismi güncelle


UPDATE employee SET name = 'Kemal' WHERE id = 5;

-- name ile email güncelle
UPDATE employee SET email = 'kemal.deniz@example.com' WHERE name = 'Kemal';

-- birthday ile ismi güncelle
UPDATE employee SET name = 'Fatma' WHERE birthday = '1990-02-14';

-- email ile doğum günü güncelle
UPDATE employee SET birthday = '1992-08-08' WHERE email = 'ayse.yildiz@example.com';

-- id ile email güncelle
UPDATE employee SET email = 'updated.email@example.com' WHERE id = 10;


-- id ile sil
DELETE FROM employee WHERE id = 1;

-- name ile sil
DELETE FROM employee WHERE name = 'Ahmet';

-- birthday ile sil
DELETE FROM employee WHERE birthday = '1987-06-23';

-- email ile sil
DELETE FROM employee WHERE email = 'ahmet.kaya@example.com';


-- id ile sil (tekrar farklı değer)
DELETE FROM employee WHERE id = 50;
DELETE FROM employee WHERE id = 50;
