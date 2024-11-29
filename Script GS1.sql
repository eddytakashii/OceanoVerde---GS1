use oceanoverde;

-- Tabela Usuario(Pai)
CREATE TABLE USUARIO(
	id int auto_increment primary key,
    nome varchar(100) not null,
    senha varchar(100) not null
);

-- Tabela MelhorasOceano(filho)
CREATE TABLE MELHORASOCEANO(
	qtn_ongs int(50) not null,
    quant_residuso_tirados double(10,2) not null,
    diminuicao_temperatura double(10,2) not null
);

-- tabela QuantLixosOceano
CREATE TABLE QUANTLIXOOCEANO(
qnt_lixo double(10,2) not null,
qnt_lixo_mensal double(10,2) not null
);

CREATE TABLE POLUICAOMARINHA(
quant_lixo double(10,2) not null,
quant_petroleo double(10,2) not null
);

INSERT INTO MELHORASOCEANO(qtn_ongs,quant_residuso_tirados,diminuicao_temperatura) VALUES (10,200.5,1.1);
SELECT * FROM MELHORASOCEANO;

INSERT INTO QUANTLIXOOCEANO(qnt_lixo,qnt_lixo_mensal) VALUES(1000.5,60.5);
INSERT INTO POLUICAOMARINHA(quant_lixo,quant_petroleo) VALUES(5100.03,65.8);

