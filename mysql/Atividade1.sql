/*Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.*/
create database db_generation_game_online;


use db_generation_game_online;

/*Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.*/
create  table tb_classe(
id_classe int auto_increment primary key,
nome varchar(55) not null,
categoria int not null

); 



/*Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).*/
create table tb_personagem(
id_personagem int auto_increment primary key,
nome varchar(55) not null,
ataque int not null,
defesa int not null,
cod_classe int

);

ALTER TABLE tb_personagem ADD CONSTRAINT fk_personagem_pessoa FOREIGN KEY(cod_classe) REFERENCES tb_classe (id_classe);

/*Popule esta tabela classe com até 5 dados.*/
insert into tb_classe(nome,categoria) values ('terra',1);
insert into tb_classe(nome,categoria) values ('mar',2);
insert into tb_classe(nome,categoria) values ('fogo',3);
insert into tb_classe(nome,categoria) values ('ar',4);
insert into tb_classe(nome,categoria) values ('pedra',5);

/*Popule esta tabela personagem com até 8 dados.*/
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Naruto',  '10000', '5000',1);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Goku', '4000', '2000',2);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Simpson', '3000', '1500',3);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Bulma','2000', '1000',4);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Cell', '2000', '1000',2);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Majin Boo', '4000', '2000',3);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Freeza', '6000', '3000',4);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Trunks', '1000', '500',3);
insert into tb_personagem (nome,ataque,defesa,cod_classe) values ('Android 17','1000', '500',2);


/*Faça um select que retorne os personagens com o poder de ataque maior do que 2000.*/
select	nome, ataque from tb_personagem
where ataque >2000;

/*Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.*/
select nome, defesa from tb_personagem
where defesa between 1000 and 2000;


/*Faça um select utilizando LIKE buscando os personagens com a letra C.*/
select nome from tb_personagem
where nome like "%c%";


/*Faça um um select com Inner join entre tabela classe e personagem.*/
select * from tb_classe 
inner join tb_personagem 
on tb_classe.id = tb_personagem.classe_id;


/*Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).*/
SELECT * FROM tb_classe INNER JOIN tb_personagem ON tb_classe.id_classe = tb_personagem.cod_classe WHERE tb_classe.categoria = "pedra";
