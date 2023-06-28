CREATE DATABASE atividade_sql;
USE atividade_sql;
CREATE TABLE pessoa (
    nome VARCHAR(50) NOT NULL,
    idade INT NOT NULL,
    email VARCHAR(50),
    cep VARCHAR(8),
    endereco VARCHAR(120),
    numero INT,
    bairro VARCHAR(100),
    cidade VARCHAR(100),
    estado VARCHAR(100),
    telefone VARCHAR(20)
);
INSERT INTO  pessoa VALUES ("Leandro Rodrigo Renan Dias",70,"leandro.rodrigo.dias@yahoo.it","57015574","Rua D",
962,"Vergel do Lago", "Maceió","AL","8238365814"),
("Pietra Luana Jesus",19,"pietra_luana_jesus@cfaraujo.eng.br","64212365","Travessa Santa Teresinha I",
531,"Alto Santa Maria","Parnaíba","PI","8625086731"),
("Bruna Juliana Corte Real",41,"bruna.juliana.cortereal@mushsanches.com","44001232","Rua Barão do Rio Branco",
378,"Centro","Feira de Santana","BA","7539022370"),
("Murilo José Assis",45,"murilojoseassis@hotmnail.com","82015154","Rua Dídimo Cercal da Silva",
518,"Santa Felicidade","Curitiba","PR","4135889593"),
("João Heitor Aparício",46,"joaoheitoraparicio@vemarbrasil.com.br","41337190","Rua da Independência",
432,"Cajazeiras","Salvador","BA","7125931722"),
("Carlos Nicolas Lima",62,	"carlosnicolaslima@dvdja.com.br",	"69315618","Rua Gaivota",
385,"São Bento","Boa Vista","RR","9536224752"),
("Cláudio Iago Nelson da Mota",65,"claudio_iago_damota@oerlikon.com","65076570","Rua Quinze",
616,"São Francisco","São Luís","MA","9825354649"),
("Clarice Sarah Isabel Melo",	"clarice-melo81@prokopetz.com.br",	"57038706",	"Rua E",
760,"Guaxuma","Maceió","AL","8238676002"),
("Analu Bárbara Barbosa",49,"analu_barbosa@bodyfast.com.br","69914330","Travessa Israel Lira",
979,"Calafate","Rio Branco","AC","6827532204"),
("Calebe Sebastião Moreira",42,"calebe_sebastiao_moreira@netservicos.com.br","52130152","Rua Doutor Joaquim Portela",
153,"Porto da Madeira","Recife","PE","8127370399");

SELECT * FROM pessoa;
SELECT count(*) FROM pessoa;
SELECT * FROM pessoa WHERE cidade = 'salvador' AND idade > 18;
INSERT INTO pessoa VALUES("Analu Bárbara Barbosa",49,NULL,"69914330","Travessa Israel Lira",
979,"Calafate","Rio Branco","AC","6827532204");
INSERT INTO pessoa VALUES("Pietra Luana Jesus",19,NULL,"64212365","Travessa Santa Teresinha I",
531,"Alto Santa Maria","Parnaíba","PI","8625086731");
SELECT count(*) AS "Quantidade de Pessoas" FROM pessoa WHERE estado LIKE '%PE%';
SELECT * FROM pessoa WHERE idade = 30;

SELECT COUNT(*) AS quantidade, nome FROM pessoa WHERE idade > 15 GROUP BY nome;

SELECT nome FROM pessoa WHERE email IS NULL;

SET SQL_SAFE_UPDATES = 0;
UPDATE pessoa SET email = "meuemail@gmail.com" WHERE nome LIKE "Cláudio%";

SELECT nome, email FROM pessoa WHERE nome LIKE "Cláudio%";

UPDATE pessoa SET email = "meuemail@gmail.com" WHERE email IS NULL AND nome LIKE "Analu%";

SELECT nome FROM pessoa WHERE email = "meuemail@gmail.com";

SELECT * FROM pessoa ORDER BY nome ASC;

CREATE TABLE produto (
nome_do_produto VARCHAR(30),
preço DOUBLE
);

ALTER TABLE produto ADD quantidade INT;

DESC produto;

ALTER TABLE produto DROP COLUMN preço;

ALTER TABLE produto ADD preco DOUBLE;

ALTER TABLE produto RENAME COLUMN nome_do_produto TO nomes_dos_produtos; 

SELECT concat(nome, " tem ", idade, " anos") as informacao from pessoa;

DELETE FROM pessoa WHERE nome LIKE "Analú%";
        