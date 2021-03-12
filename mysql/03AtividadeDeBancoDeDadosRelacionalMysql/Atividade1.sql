-- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema 
-- trabalhará com as informações dos funcionários desta empresa.
CREATE DATABASE bd_sistema_rh;

USE bd_sistema_rh;

-- Crie uma tabela de funcionários e utilizando a habilidade de abstração e determine 
-- 5 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH.
CREATE TABLE tb_funcioanrio (
	id bigint(5) auto_increment,
    nome VARCHAR(255) NOT NULL,
    idade int(3) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    salario double(10,2) NOT NULL,
    
    primary key (id)
);

-- Popule esta tabela com até 5 dados;
INSERT INTO tb_funcioanrio (nome, idade, cargo, salario) VALUES ("Eduardo", 28, "Desenvolvedor Java Junior", 5000.00);
INSERT INTO tb_funcioanrio (nome, idade, cargo, salario) VALUES ("Brenda", 24, "Advogada", 4300.00);
INSERT INTO tb_funcioanrio (nome, idade, cargo, salario) VALUES ("Laís", 27, "Esteticista", 3500.00);
INSERT INTO tb_funcioanrio (nome, idade, cargo, salario) VALUES ("Reila", 28, "Nutricionista", 3000.00);
INSERT INTO tb_funcioanrio (nome, idade, cargo, salario) VALUES ("Barbara", 26, "Professora", 2600.00);

-- Faça um select que retorne os funcionários com o salário maior do que 2000.
select * from tb_funcioanrio where salario > 2000;

-- Faça um select que retorne os funcionários com o salário menor do que 2000.
select * from tb_funcioanrio where salario < 2000;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
update tb_funcioanrio set tb_funcioanrio.cargo = "Desenvolvedor Java Full Stack" where id = 1;