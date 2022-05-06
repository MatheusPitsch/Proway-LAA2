CREATE DATABASE empresa;
USE empresa;

DROP DATABASE empresa;

CREATE TABLE IF NOT EXISTS funcionarios (id INT UNSIGNED PRIMARY KEY NOT NULL,
 nome VARCHAR(50) NOT NULL,
 sobrenome VARCHAR(100) NOT NULL, 
 data_nascimento DATE NOT NULL, 
 cpf VARCHAR(20) NOT NULL, 
 rg VARCHAR(10) NOT NULL,
 logradouro VARCHAR(2) NOT NULL,
 cep VARCHAR (20) NOT NULL,
 cidade VARCHAR(20) ,
 telefone VARCHAR(30) NOT NULL, 
 funcao VARCHAR(30) NOT NULL,
 salario FLOAT(10,2) NOT NULL, 
 id_departamento INT UNSIGNED NOT NULL);

CREATE TABLE IF NOT EXISTS departamento(id INT UNSIGNED PRIMARY KEY NOT NULL,
 nome VARCHAR(100),
 localizacao VARCHAR(50), 
 id_gerente INT  );

INSERT INTO funcionarios (id, nome, sobrenome, data_nascimento, cpf, rg, logradouro, cep, cidade, telefone, funcao, salario, id_departamento) VALUES
(1, 'MATHEUS', 'PITSCH', '2002-5-13', 10590430920, 1234567, 'SC', 89031440, 'BLUMENAU', 32371022, 'AUXILIAR ADMINISTRATIVO', 1400, 1),
(2, 'LUANA', 'FAGUNDES', '1996-7-15', 14729745036, 1234567, 'SC', 89475221, 'INDAIAL', 32389594, 'FINANCEIRO', 2000, 1),  # NÃO DA PARA DAR ESPEÇO ENTRE TEM QUE COLOCAR _ ?
(3, 'JOSE', 'HENRIQUE', '2003-2-22', 20136578544, 1234567, 'RS', 890000100, 'PORTO_ALEGRE', 32372464, 'PORTEIRO', 1980, 1),
(4,'KLEITON', 'JUNIOR', '1980-6-15', 36415424714, 1234567, 'SP', 81065100, 'JUNDIA', 39745812, 'FAXINEIRO', 1000, 1),
(5,'NICOLE', 'KEIT', '2004-8-27', 45678921356, 1234567, 'SC', 87364521, 'FLORIPA', 38397456,' JOVEM_APRENDIZ', 500, 1);

SELECT
id,
nome,
sobrenome,
funcao,
salario
FROM 
funcionarios
GROUP BY 
nome
HAVING
salario > 1000;

SELECT
id,
nome,
sobrenome,
data_nascimento
FROM
funcionarios
ORDER BY 
data_nascimento DESC

