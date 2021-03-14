/*Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
 deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
 informações dos produtos desta empresa. */
create database db_pizzaria_legal;

use db_pizzaria_legal;

/*Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).*/
create table tb_pizza(
id_pizza int auto_increment primary key, 
nome varchar(55) not null,
descricao varchar(55) not null,
tamanho varchar(55),
com_borda char(1)
);





create table tb_categoria(
id_categoria int primary key auto_increment,
tipo varchar (200) not null,
descricao_cat varchar (200) 
);



create table tb_produto(
id_produto int auto_increment primary key,
valor double(10,00) not null,
fk_categoria int not null,
fk_pizza int not null

);
alter table tb_produto
add constraint fk_pizza
foreign key (fk_pizza)
references tb_pizza (id_pizza);

alter table tb_produto
add constraint fk_categoria
foreign key (fk_categoria)
references tb_categoria (id_categoria);

-- Popule esta tabela Categoria com até 5 dados.

insert into tb_categoria (tipo, descricao_cat)
values ("doce", "disponivel"),
("salgada", "disponivel"),
("doce", "indisponivel"),
("doce", "indisponivel"),
("salgada", "disponivel");

-- Popule esta tabela pizza com até 8 dados

insert into tb_pizza (nome, descricao, tamanho, com_borda)
values ("Calabresa", "calabresa, cebola, azeitona", "broto", "S"),
("Bacon", "bacon, ovo, mussarela", "grande", "S"),
("Peperoni", "linguiça, molho, tomate", "broto", "S"),
("Mussarela", "queijo, tomate, azeitona", "grande", "S"),
("Portuguesa", "ovo, presunto, bacon", "broto", "S"),
("Calabresa", "calabresa, cebola, azeitona", "grande", "S"),
("5queijos", "mussarela, gorgonzola, mizqueijos", "grande", "S");


insert into tb_produto (valor,fk_pizza,fk_categoria)
values (45.90, 1,2),
('45.90', 1,2),
('60.90', 1,2),
('50.90', 1,2),
('27.50', 1,2),
('35.90', 1,2),
('23.90', 1,2);

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais.
select * from tb_produto where valor > 45;


-- Faça um select trazendo os Produtos com valor entre 29 e 60 reais.
select * from  tb_produto where valor between 29 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
select * from tb_pizza where nome like "%c%";


-- Faça um um select com Inner join entre tabela categoria e pizza.
select * from tb_categoria inner join tb_pizza on tb_categoria.id_categoria = tb_pizza.id_pizza;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select P.valor , C.tipo , C.descricao_cat ,PI.nome from tb_produto as P 
inner join tb_pizza as PI on PI.id_pizza = P.fk_pizza 
inner join tb_categoria as C on C.id_categoria = P.fk_categoria;
