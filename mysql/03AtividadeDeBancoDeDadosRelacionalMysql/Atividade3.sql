-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
-- informações dos alunos deste registro dessa escola.
CREATE DATABASE db_sistema_escola;

USE db_sistema_escola;

-- Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos alunos/a para se trabalhar com o serviço dessa escola.
CREATE TABLE tb_alunos (
	id bigint(5) auto_increment,
	nome VARCHAR(255) NOT NULL,
	idade int(2) NOT NULL,
	turma VARCHAR(255) NOT NULL,
	media double(10,2) NOT NULL,
    
    primary key (id)
);

-- Popule esta tabela com até 8 dados;
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Eduardo", 12, "13578", 10.0);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Brenda", 13, "13578", 9.5);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Laís", 11, "13578", 8.0);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Reila", 13, "13578", 8.0);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Barbara", 13, "13578", 5.0);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Vagner", 11, "13578", 3.5);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Michell", 12, "13578", 4.5);
INSERT INTO tb_alunos (nome, idade, turma, media) VALUES ("Renan", 13, "13578", 2.0);

-- Faça um select que retorne o/as alunos/a com a nota maior do que 7.
SELECT * FROM tb_alunos WHERE media > 7;

-- Faça um select que retorne o/as alunos/a com a nota menor do que 7.
SELECT * FROM tb_alunos WHERE media < 7;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
UPDATE tb_alunos SET media = "6.3" WHERE id = 5;