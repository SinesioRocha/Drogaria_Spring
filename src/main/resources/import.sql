insert into categoria (nome) values ("Refrigerantes");
insert into categoria (nome) values ("Cervejas");
insert into categoria (nome) values ("Salgadinhos");

insert into produto (nome, preco, quantidade, validade, categoria_codigo) values ("Coca Cola Descartável 2 Litros", 12.30, 10, "2023-01-15", 1);
insert into produto (nome, preco, quantidade, validade, categoria_codigo) values ("Torcida Bacon com 200 Gramas", 2.50, 15, "2024-04-30", 3);
insert into produto (nome, preco, quantidade, validade, categoria_codigo) values ("Heineken Retornável com 600 ML", 9.00, 30, "2022-12-15", 2);

insert into pedido (horario) values ("2022-08-30 19:30:00");
insert into pedido (horario) values ("2022-08-31 20:43:00");
insert into pedido (horario) values ("2022-09-05 21:25:00");

insert into item (pedido_codigo, produto_codigo, quantidade, preco) values (3, 2, 2, 5.00);

