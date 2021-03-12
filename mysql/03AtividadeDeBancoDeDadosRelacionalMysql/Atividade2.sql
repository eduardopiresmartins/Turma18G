-- Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
-- informações dos produtos deste ecommerce.
CREATE DATABASE db_ecommerce;

USE db_ecommerce;

-- Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
CREATE TABLE tb_produtos (
	id bigint(5) auto_increment,
    nome VARCHAR(255) NOT NULL,
    fabricante VARCHAR(255) NOT NULL,
    validade date,
    peso double(10,2) NOT NULL,
    preco double(10,2) NOT NULL,
    
    primary key (id)
);

-- Popule esta tabela com até 8 dados;
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Vinho", "Cabernê", "2023-05-08", 1, 25.99);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Leite Integral", "Ninho", "2022-2-5", 1, 4.50);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Chopp de Vinho", "Draft", "2023-1-25", 1, 6.99);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Nescal Cereal", "Nestlê", "2025-03-28", 700.0, 5.45);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Biscoito de Polvilho", "Forno de Minas", "2021-12-5", 0.300, 11.99);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Caixa de Chocolate", "Nestlê", "2021-05-22", 0.500, 8.99);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Tapioca", "Da Terrinha", "2022-1-12", 0.500, 8.99);
insert into tb_produtos (nome, fabricante, validade, peso, preco) values ("Salgadinho Fandangos", "Elma Chips", "2021-12-7", 0.700, 26.90);

-- Faça um select que retorne os produtos com o valor maior do que 500.
SELECT * FROM tb_produtos WHERE preco > 500;

-- Faça um select que retorne os produtos com o valor menor do que 500.
SELECT * FROM tb_produtos WHERE preco < 500;

-- Ao término atualize um dado desta tabela através de uma query de atualização.
UPDATE tb_produtos SET nome = "Suco" WHERE id = 6;