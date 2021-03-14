/*Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/ 

create database db_farmacia_do_bem; 

use db_farmacia_do_bem;

/*Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.*/

create table tb_categoria(
id int (10) auto_increment primary key,
descricao varchar (300) not null,
quantidade boolean not null

);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).*/

create table tb_produto (
id int (10) auto_increment primary key,
nome varchar (300) not null,
descricao varchar (300) not null,
preco double(10,2) not null,
categoria_id int, 

foreign key (categoria_id) references tb_categoria (id)

);


/*Popule esta tabela Categoria com até 5 dados.*/

insert into tb_categoria (descricao, quantidade)
values 
 ("Medicamento", true),
 ("Perfumaria", true),
 ("Psicotropicos", false),
 ("Higiene Pessoal", true),
 ("Saude", true);
 
 /*Popule esta tabela Produto com até 8 dados.*/

insert into tb_produto (nome, descricao, preco, categoria_id)
values
("Fralda", "fralda pampers GG", 25.90, 1),
("Nelsaldina", "comprimidos 10g", 5.90, 2),
("Gel Modelador", "gel modelador para cabelo masculino 500g", 11.90, 3),
("Quilaira", "teste de gravides", 21.90, 4),
("Desodorante", "desodorante Rexona Spray 80ml", 12.90, 5),
("Minoxidil", "minoxidil tonico capilar 70ml", 75.90, 4),
("Cotonete", "cotonete jhonsson&jhonsson", 5.90, 3),
("Enxaguante Bocal", "listerine 500ml", 17.90, 1);

/*Faça um select que retorne os Produtos com o valor maior do que 50 reais.*/
select * from tb_produto where preco > 50;

/*Faça um select trazendo os Produtos com valor entre 3 e 60 reais.*/
select * from tb_produto where preco between 3 and 60;

/*Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
select * from tb_produto where nome like "%B%";

/*Faça um um select com Inner join entre tabela categoria e produto.*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where quantidade = "Higiene Pessoal";
