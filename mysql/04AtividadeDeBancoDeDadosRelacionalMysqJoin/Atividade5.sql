/*Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa.*/

create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.*/

create table tb_categoria(
id int (10) auto_increment primary key,
descricao varchar (300) not null,
quantidade boolean not null

);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

create table tb_produto (
id int (10) auto_increment primary key,
nome varchar (300) not null,
descricao varchar (300) not null,
preco decimal(10,2) not null,
categoria_id int, 

foreign key (categoria_id) references tb_categoria (id)

);

-- Popule esta tabela Categoria com até 5 dados.
insert into tb_categoria (descricao, quantidade)
values 
 ("Elétrica", true),
 ("Construção", true),
 ("Moveleiro", false),
 ("Hidraulica", true),
 ("Insumos", true);
 
 -- Popule esta tabela Produto com até 8 dados.
 insert into tb_produto (nome, descricao, preco, categoria_id)
values
("Fio", "rolo de fio sill 100mt", 99.90, 1),
("Cimento", "saco cimento votorantin 50kg", 25.90, 2),
("Seladora", "seladora farben 18l", 45.90, 3),
("Cano PVC", "cano pvc marrom tigre 7mt", 21.90, 4),
("Espuma Expansiva", "espuma espansiva spray 700ml", 12.90, 2),
("Parafuso", "parafuso fx philips cx c/500", 35.90, 3),
("Broca", "cotonete broca de madeira 8mm", 5.90, 2),
("Parafusadeira", "parafusadeira c/bateria Makita", 3777.90, 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
select * from tb_produto where preco > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where preco between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
select * from tb_produto where nome like "%C%";

-- Faça um um select com Inner join entre tabela categoria e produto.*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where tb_categoria.descricao = "Hidraulica";