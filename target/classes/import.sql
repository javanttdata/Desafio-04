INSERT INTO tb_category(name, description) VALUES('salario', 'empresa A')
INSERT INTO tb_category(name, description) VALUES('despesa', 'escola A')
INSERT INTO tb_category(name, description) VALUES('horas extras', 'adicional noturno')


INSERT INTO tb_lancamentos(name, description, type, amount, dataLancamento, paid, categoryId) VALUES('salario', 'recebimento', 'dinheiro', '300', "05/11/2021", true, "1")
