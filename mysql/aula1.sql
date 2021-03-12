CREATE database db_generation_rh;

use db_generation_rh;

create table tb_funcionarios(
id bigint auto_increment,
nome varchar(255) not null,
idade bigint,
funcao int	not null,
salario float not null,
primary key (id)

);

insert into tb_funcionarios (nome,salario) values ("eduardo",28,5000);
insert into tb_funcionarios (nome,salario) values ("brenda",24,7000);

select * from tb_funcionarios;
