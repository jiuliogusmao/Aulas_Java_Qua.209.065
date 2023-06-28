#cria o banco de dados
CREATE DATABASE banco_teste;

#coloca o banco em uso
USE banco_teste;

#cria a tabela
CREATE TABLE pessoa(
nome VARCHAR(50),
idade INT,
genero CHAR(1),
peso DOUBLE
);

#descreve a tabela 
desc pessoa;

#insere o produto na tabela 
INSERT INTO  pessoa VALUES ("Maria de Lourdes da Silva", 33, "F", 80.65);

INSERT INTO pessoa(nome, idade) VALUES("Luizinho", 22);

INSERT INTO pessoa VALUES("Zezinho", 65, null, 53),
("Maria", null, 'F', 56),
("Morgana", 50, 'F', null),
("Cristiano Ronaldo", 35, 'M', null); 

#pesquisa todos os dados da tabela
SELECT * FROM pessoa;

SELECT nome FROM pessoa WHERE idade = 23;
SELECT genero FROM pessoa WHERE nome LIKE "Zezinho%";
SELECT genero FROM pessoa WHERE nome LIKE "%lourdes%";
SELECT * FROM pessoa WHERE genero = 'M' OR idade > 33;
SELECT * FROM pessoa WHERE genero = 'M' AND idade > 33;
SELECT count(*) FROM pessoa;
SELECT count(*) AS "Quantidade de Pessoas" FROM pessoa;


CREATE TABLE produto(
descricaoProduto VARCHAR(100),
#indica respectiviamente a quantidade de dígitos e antes e após a vírgula
preco DOUBLE(6,2),
#enum é utilizado para valores conhecidos, pré-definidos
status_pedido ENUM ("entregue", "preparando", "saiu pra entrega")
);

INSERT INTO produto VALUES("sanduba", 15.56, 3);

SELECT * FROM produto;