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
INSERT INTO  pessoa VALUES ("Uguinho", 23, "M", 50);

INSERT INTO pessoa(nome, idade) values("Luizinho", 22);

#pesquisa todos os dados da tabela
SELECT * FROM pessoa;