/*Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o
seguinte nome db_cidade_das_carnes, onde o sistema trabalhará com as informações dos
produtos desta empresa.*/

create database db_cidade_das_carnes;
use db_cidade_das_carnes;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.*/

create table tb_categoria(
id int(10) auto_increment primary key,
tipo varchar(300) not null,
estoque boolean not null
);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não
esqueça de criar a foreign key de tb_categoria nesta tabela).*/

create table tb_produto(
id int(10) auto_increment primary key,
nome varchar(300) not null,
preco decimal not null,
kg_produto int not null,
categoria_id int,

foreign key (categoria_id) references tb_categoria (id)
);


/*Popule esta tabela Categoria com até 5 dados.*/
insert into tb_categoria (tipo, estoque)
values 
 ("Bovino", true),
 ("Suino", true),
 ("Aves", false),
 ("Vegetariano", true),
 ("Vegano", true);
 
 select * from tb_categoria;
 
 
/*Popule esta tabela Produto com até 8 dados.*/
insert into tb_produto (nome, preco, kg_produto, categoria_id)
values
("Linguiça", 25.90, 1, 1),
("Asinha de Frango", 22.90, 3, 3),
("Picanha", 80.85, 5, 1),
("Alcatra", 35.90, 5, 3),
("Queijo para Churrasco", 17.90, 0500, 4),
("Carne de Soja", 25.90, 2, 5),
("Linguiça de Frango", 20.90, 1, 3),
("Rabada", 20.00, 2, 1);

select * from tb_produto;

/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
select * from tb_produto where preco > 50;

/*Faça um select trazendo os Produtos com valor entre 3 e 60 reais.*/
select * from tb_produto where preco between 3 and 60;

/*Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
select * from tb_produto where nome like "%C%";

/*Faça um um select com Inner join entre tabela categoria e produto.*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where tb_categoria.tipo = "Bovino";
 