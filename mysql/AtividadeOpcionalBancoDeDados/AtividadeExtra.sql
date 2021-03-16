/*Crie um banco de dados para um serviço de uma loja de móveis e decoração, o nome do
banco deverá ter o seguinte: db_nome minha_casa_mais_bonita, onde o sistema trabalhará
com as informações dos produtos desta loja.*/

create database db_nome_minha_casa_mais_bonita;

use db_nome_minha_casa_mais_bonita;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta loja.*/

create table tb_categoria(
id int (10) auto_increment primary key,
sala varchar (255) not null,
cozinha varchar (255),
quarto varchar (255)
);


/*Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço desta loja(não esqueça de criar
a foreign key de tb_categoria nesta tabela).*/

create table tb_produto (
id int (10) auto_increment primary key,
nome varchar (300) not null,
descricao varchar (300) not null,
preco decimal(10,2) not null,
categoria_id int, 

foreign key (categoria_id) references tb_categoria (id)

);

/*Crie a tabela Usuario e utilize a habilidade de abstração e determine 5 atributos relevantes
dos tb_usuario para se trabalhar com o serviço desta loja.*/

create table tb_usuario(
id int not null auto_increment,
nome varchar (255) not null,
endereço varchar(255),
email varchar(255),
cpf varchar(255),
Serasa Boolean,
PRIMARY KEY (id)
);


-- Popule atabela Categoria com até 5 dados.
insert into tb_categoria (sala, cozinha, quarto)
values 
 ("Sofa", "Tapete", "Almofada"),
 ("Panela", "Jogo de Talheres", "Toalha de Mesa"),
 ("Cama", "Edredom", "Travisseiro");
 
 -- Popule a tabela Produto com até 8 dados. 
insert into tb_produto (nome, descricao, preco, categoria_id)
values
("Cama de Casal", "Cama de Casal Box", 500.00, 3),
("Cama de Solteiro", "Cama de Solteiro Box", 250.00, 3),
("Talher", "Jogo de Talheres", 79.99, 2),
("Toalha", "Toalha de Mesa 2x2", 35.90, 2),
("Sofa", "Sofa 3 lugares azul", 399.00, 1),
("Estante", "Estante Rústica ", 1200.00, 1),
("Panela", "Panela de Pressão Inoz", 200.00, 2) ,
("Tapete", "Tapete 2x2 redondo", 200.00, 1);

-- Popule atabela Usuario com até 5 dados.
insert into tb_usuario (nome, endereço, email, cpf, serasa)
values
("Eduardo", "Embu das Artes", "edupiresmartins@gmail.com", 412.412, true),
("Brenda", "São Paulo","brenda@gmail.com", 353.353, true),
("Lais", "Embu das Artes","lais@gmail.com", 159.159, true),
("Reila","Lisboa","reila@gmail.com", 265.265, false),
("Barbara","Taboão da Serra","barbara@gmail.com", 458.458, false );

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto where preco > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
select * from tb_produto where preco between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.*/
select * from tb_produto where nome like "%B%";

-- Faça um select utilizando LIKE buscando os Usuários com a letra C.
select * from tb_usuario where nome like "%C%";

-- Faça um um select com Inner join entre tabela categoria e produto.*/
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id;

-- faça um select que retorne a média de preços dos produtos;
select avg(preco) from tb_produto;

-- faça um select que retorne a soma de preços dos produtos;
select sum(l.preco) from tb_produtos;

-- faça um select que quantidade de produtos cadastrados na tabela
SELECT COUNT(DISTINCT nome) FROM tb_produto;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_categoria inner join tb_produto on tb_categoria.id = tb_produto.categoria_id where "sala";






