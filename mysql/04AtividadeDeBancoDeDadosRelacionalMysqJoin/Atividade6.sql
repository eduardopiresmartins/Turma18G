/*Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/

create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.*/

create table tb_categoria(
id int (10) auto_increment primary key,
modalidade varchar (300) not null,
quantidade boolean not null

);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

create table tb_produto (
id int (10) auto_increment primary key,
nome varchar (300) not null,
descricao varchar (300) not null,
investimento decimal(10,2) not null,
categoria_id int, 

foreign key (categoria_id) references tb_categoria (id)

);

-- Popule esta tabela Categoria com até 5 dados.
insert into tb_categoria (modalidade, quantidade)
values 
 ("Presencial", true),
 ("Online", true),
 ("Técnico", false),
 ("Iniciante", true),
 ("Preparatório", true);
 
 -- Popule esta tabela Produto com até 8 dados.
insert into tb_produto (nome, descricao, investimento, categoria_id)
values
("Java", "introdução a Java", 1999.90, 1),
("JavaScript", "curso Javascript", 725.90, 2),
("Angular", "curso de Angular front-end", 445.90, 3),
("NodeJS", "curso de NodeJS", 1121.90, 4),
("React", "curso de React ", 1112.90, 2),
("MySql", "curso de MySql", 1135.90, 3),
("WordPress", "curso de WordPress", 555.90, 2),
("Git", "curso de Git", 300.00, 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where investimento > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where investimento between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
select * from tb_produto where nome like "%J%";

-- Faça um um select com Inner join entre tabela categoria e produto.*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where tb_categoria.modalidade = "Presencial";