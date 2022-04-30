CREATE DATABASE tabela_de_vendas;
USE tabela_de_vendas;

SET SQL_SAFE_UPDATES = 0;

DROP TABLE vendas;

CREATE TABLE IF NOT EXISTS vendas (
id_nf INT UNSIGNED NOT NULL,
id_item INT UNSIGNED NOT NULL,
cod_prod INT UNSIGNED NOT NULL,
valor_unitario FLOAT (10,2) NOT NULL,
quantidade INT NOT NULL,
desconto INT,
PRIMARY KEY (id_nf, id_item, cod_prod)
);
INSERT INTO vendas (ID_NF,ID_ITEM,COD_PROD,valor_unitario,QUANTIDADE,DESCONTO) VALUES
(1,	1,	1,	25.00,	10,	5  ),
(1,	2,	2,	13.00,	3, NULL),
(1,	3,	3,	15.00,	2, NULL),
(1,	4,	4,	10.00,	1, NULL),
(1,	5,	5,	30.00,	1, NULL),
(2,	1,	3,	15.00,	4, NULL),
(2,	2,	4,	10.00,	5, NULL),
(2,	3,	5,	30.00,	7, NULL),
(3,	1,	1,	25.00,	5, NULL),
(3,	2,	4,	10.00,	4, NULL),
(3,	3,	5,	30.00,	5, NULL),
(3,	4,	2,	13.50,	7, NULL),
(4,	1,	5,	30.00,	10,	15),
(4,	2,	4,	10.00,	12,	5),
(4,	3,	1,	25.00,	13,	5),
(4,	4,	2,	13.00,	15,	5),
(5,	1,	3,	15.00,	3,	NULL),
(5,	2,	5,	30.00,	6,	NULL),
(6,	1,	1,	25.00,	22,	15),
(6,	2,	3,	15.00,	25,	20),
(7,	1,	1,	25.00,	10,	3),
(7,	2,	2,	13.50,	10,	4),
(7,	3,	3,	15.00,	10,	4),
(7,	4,	5,	30.00,	10,	1);

SELECT
	id_nf,id_item,cod_prod,valor_unitario,desconto
FROM
	vendas
WHERE
	desconto IS NOT NULL;
SELECT
	id_item,
    id_nf,
    cod_prod,
    valor_unitario,
	ROUND( valor_unitario - (valor_unitario * (desconto/ 100)),2) valor_vendido
FROM
vendas
WHERE
	desconto IS NOT NULL;

UPDATE
	vendas
SET	
	desconto = 0
WHERE
	desconto  IS NULL;

SELECT*FROM vendas;