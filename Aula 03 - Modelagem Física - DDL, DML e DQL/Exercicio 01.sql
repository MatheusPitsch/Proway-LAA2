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
INSERT INTO vendas (id_nf,id_item,cod_prod,valor_unitario,quantidade,desconto) VALUES
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

SELECT # A
	id_nf,id_item,cod_prod,valor_unitario,desconto
FROM
	vendas
WHERE
	desconto IS NOT NULL;
SELECT  # B
	id_item,
    id_nf,
    cod_prod,
    valor_unitario,
	ROUND( valor_unitario - (valor_unitario * (desconto/ 100)),2) valor_vendido
FROM
vendas
WHERE
	desconto IS NOT NULL;

UPDATE  # C
	vendas
SET	
	desconto = 0
WHERE
	desconto  IS NULL;

SELECT*FROM vendas;

SELECT # D
id_item,
id_nf,
cod_prod,
valor_unitario,
DESCONTO,
QUANTIDADE,
ROUND( valor_unitario - (valor_unitario * (desconto/ 100)),2) valor_vendido,
ROUND(quantidade*valor_unitario) valor_total
FROM
vendas;

SELECT # E
id_nf,
ROUND(quantidade*valor_unitario) valor_total
FROM
vendas
GROUP BY
id_nf;

SELECT # F
id_nf,
ROUND(quantidade*valor_unitario) valor_total
FROM
vendas
GROUP BY
id_nf
ORDER BY
valor_total DESC;

SELECT #AQUI DEU NÃO DEU CERTO G
cod_prod,
QUANTIDADE
FROM
vendas
GROUP BY 
cod_prod
ORDER BY
QUANTIDADE;
 
SELECT # H  - PORQUE NA DEMONSTRAÇÃO TINHA A FUNÇÃO SUM
id_nf,
COD_PROD,
ROUND(quantidade*valor_unitario) valor_total
FROM
vendas
GROUP BY
COD_PROD,
id_nf
HAVING
valor_total>10;

SELECT # I
id_nf,
(QUANTIDADE * valor_unitario) valor_total
FROM
vendas
GROUP BY 
id_nf
HAVING
valor_total > 500
ORDER BY
valor_total;

SELECT # J 
cod_prod,
avg(desconto) media
FROM
vendas
GROUP BY
cod_prod;

SELECT # k - POR QUE NÃO APARECE O MENOR VALOR
cod_prod,
MIN(desconto),
MAX(desconto),
avg(desconto)media
FROM
vendas
GROUP BY
cod_prod;

SELECT # L
id_nf,
SUM(id_item)quantidade_item
FROM
vendas
GROUP BY 
id_nf
HAVING
SUM(id_item > 3)


