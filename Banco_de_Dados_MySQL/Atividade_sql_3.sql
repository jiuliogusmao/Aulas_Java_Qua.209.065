CREATE DATABASE produtos;

USE produtos;

CREATE TABLE itens(
descricao VARCHAR (200),
unidade_de_medida VARCHAR(50),
valor_unitario DOUBLE, 
quantidade INT
);

INSERT INTO itens VALUES ("mouses", "15 cm x 4 cm", 30, 50),
("teclados", "35 cm x 10 cm", 70, 100),
("monitores", "25 polegadas", 500, 78),
("gabinetes", "50 x 10 x 40", 500, 150),
("webcams", "regulável", 650, 200);

SELECT * FROM itens;

ALTER TABLE itens RENAME COLUMN descrição TO descricao; 

ALTER TABLE itens RENAME COLUMN valor_unitário TO valor_unitario; 

SELECT concat("Há ", quantidade, " ", descricao, " no estoque com valor unitário de ", valor_unitario, "reais") AS estoque FROM itens;

DROP TABLE itens;
