CREATE DATABASE normalizacao;

USE normalizacao;

/*
para uma tabela estar na primeira forma normal, é necessário que não existam grupos de valores repetidos, seus valores devem ser atomicos ( campos unicos) e a tabela deve possuir um identificador
que identifique o dado como único
*/

CREATE TABLE pessoa(
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
sobrenome VARCHAR (50),
idade INT,
genero VARCHAR(15),
email VARCHAR(100),
cpf VARCHAR(14) NOT NULL UNIQUE,
cidade VARCHAR(50),
bairro VARCHAR(50),
cep VARCHAR(10),
complemento VARCHAR(100),
logradouro VARCHAR(100),
estado VARCHAR(50),
uf CHAR(2),
numero VARCHAR(10),
telefone VARCHAR(16),
ddd CHAR(3),
celular VARCHAR(16),
fixo VARCHAR (10),
comercial VARCHAR(16)
);

INSERT INTO pessoa VALUES(NULL, "Terezinha", "de Jesus", 33, "F", "terezinhadejesus@email.com", "000.111.222-34", "Brasília", "asa norte", "72.000-222", "proximo ao laranjeiras",
"via", "Distrito Federal",
"DF", "04", NULL, "061", "91122-3344", NULL, NULL);
INSERT INTO pessoa VALUES(NULL, "Benezinho", "de Almeida", 58, "M", "benezinhodealmeida@email.com", "111.222.333-45", "Brasília", "asa sul", "72.111-222", "proximo ao oliveira",
"quadra", "Distrito Federal",
"DF", "11", NULL, "061", "92233-4455", NULL, NULL);

SELECT * FROM pessoa;

/* Para estar na segunda forma normal os atributos devem depender da chave primaria em sua totalidade não apenas parte dela */

CREATE TABLE pessoa2(
idPessoa INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
sobrenome VARCHAR(50),
cpf VARCHAR(14) NOT NULL UNIQUE,
genero VARCHAR(10),
id_endereco INTEGER,
CONSTRAINT fk_id_endereco_endereco
FOREIGN KEY (id_endereco) REFERENCES endereco(idEndereco)
);

CREATE TABLE endereco(
idEndereco INTEGER PRIMARY KEY AUTO_INCREMENT,
cep VARCHAR(13),
bairro VARCHAR(100),
cidade VARCHAR(100),
uf CHAR(2)
);

INSERT INTO pessoa2 VALUES(NULL, "Benezinho", "de Almeida", "111.222.333-45", "M", 1);
INSERT INTO pessoa2 VALUES(NULL, "Mariazinha", "da Silva", "141.232.323-89", "F", 2);
INSERT INTO pessoa2 VALUES(NULL, "Manoelzinho", "Pereira", "112.223.334-67", "M", 3);

INSERT INTO endereco VALUES(NULL, "72.111-222", "asa sul", "Brasília", "DF");
INSERT INTO endereco VALUES(NULL, "72.111-333", "asa norte", "Brasília", "DF");
INSERT INTO endereco VALUES(NULL, "72.111-444", "cruzeiro", "Brasília", "DF");

SELECT *FROM pessoa2;

SELECT * FROM endereco;

DROP TABLE pessoa2;

DROP TABLE endereco;

SELECT * FROM endereco INNER JOIN pessoa2 ON endereco.idEndereco = pessoa2.id_endereco;

SELECT nome, cpf, cep, bairro, cidade, uf FROM pessoa2 INNER JOIN endereco ON pessoa2.id_endereco = endereco.IdEndereco;

CREATE TABLE telefone(
idTelefone INTEGER PRIMARY KEY AUTO_INCREMENT,
ddd VARCHAR(5),
numero VARCHAR(10),
id_pessoa INTEGER,
CONSTRAINT fk_id_pessoa_pessoa2
FOREIGN KEY(id_pessoa) REFERENCES pessoa2(idPessoa)
);

INSERT INTO telefone VALUES(NULL, "061", "91122-3344", 2),
(NULL, "061", "91223-3445", 3), (NULL, "061", "92255-6677", 4);

/* Para a tabela estar na terceira forma normal ela precisa estar de acordo com a 1ª e a 2ª forma normal
não existir dependências transativas
nenhum atributo não chave não pode depender de outro atributo não chave */

CREATE TABLE produto(
idProduto INTEGER PRIMARY KEY AUTO_INCREMENT,
nome_produto VARCHAR(50),
quantidade INT,
valor DOUBLE,
total_estoque DOUBLE
);





