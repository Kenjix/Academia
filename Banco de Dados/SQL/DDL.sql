-- DROP DATABASE academia;
CREATE DATABASE academia;
USE academia;

CREATE TABLE estabelecimento(
	id INT PRIMARY KEY,
    nome VARCHAR(60),
    descricao VARCHAR(50),
    logo MEDIUMBLOB
);

CREATE TABLE funcionario (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14) UNIQUE NOT NULL,
	telefone VARCHAR(13),
	celular VARCHAR(14),
	email VARCHAR(60),
	dataNasc DATE NOT NULL,
	peso FLOAT NOT NULL,
	altura FLOAT NOT NULL,
	observacoes TEXT,
	cargaHoraria INT,
	turno VARCHAR(20),
	especialidade VARCHAR(50)
);

CREATE TABLE cliente (
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(60) NOT NULL,
	cpf VARCHAR(14) UNIQUE NOT NULL,
	matricula BIGINT UNIQUE NOT NULL,
	telefone VARCHAR(13),
	celular VARCHAR(14),
	email VARCHAR(60),
	dataNasc DATE NOT NULL,
	peso FLOAT NOT NULL,
	altura FLOAT NOT NULL,
	dataInicio DATE NOT NULL,
	dataFim DATE,
	objetivo VARCHAR(80),
	ativo BIT DEFAULT 1,
	foto MEDIUMBLOB,
	observacoes TEXT,	
	updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP	
);

CREATE TABLE frequencia
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	data DATE,
	presenca BIT DEFAULT 0,
    FK_cliente INT,
    FOREIGN KEY (FK_cliente) REFERENCES cliente (id)
);

CREATE TABLE equipamento
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    patrimonio VARCHAR(10) UNIQUE NOT NULL,
	nome VARCHAR(50) NOT NULL,
    dataAquisicao DATE,
	disponivel BIT DEFAULT 1,
    observacoes TEXT    
);

CREATE TABLE exercicios
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	grupoMuscular VARCHAR(50)
);

CREATE TABLE exerc_equip
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	FK_equipamento INT,
	FK_exercicios INT,
	FOREIGN KEY (FK_equipamento) REFERENCES equipamento(id) ON DELETE CASCADE,
	FOREIGN KEY (FK_exercicios) REFERENCES exercicios(id) ON DELETE CASCADE
);

CREATE TABLE treinos (
	id INT PRIMARY KEY AUTO_INCREMENT,
	ordem INT,
	series VARCHAR(20),
	repeticao INT,
	carga INT,
	tipoTreino VARCHAR(20),
	trocaTreino DATE,
	observacao TEXT,
    ativo BIT DEFAULT 1,
	FK_cliente INT,
	FK_funcionario INT,
	FK_exercicios INT,
	FOREIGN KEY (FK_cliente) REFERENCES cliente (id),
	FOREIGN KEY (FK_funcionario) REFERENCES funcionario (id),
	FOREIGN KEY (FK_exercicios) REFERENCES exercicios (id)
);

-- ------------------------------------------------ PROCEDURES--------------------------------------------------

-- Procedure para geracao de matriculas de clientes
DELIMITER $$
CREATE PROCEDURE insereCliente(	
				IN nome VARCHAR(60), 
				IN cpf VARCHAR(14), 
				IN dataNasc DATE, 
				IN peso FLOAT, 
				IN altura FLOAT,
				IN dataInicio DATE, 
				IN dataFim DATE,
				IN objetivo VARCHAR(80),
				IN foto MEDIUMBLOB,
				IN email VARCHAR(60),
				IN telefone VARCHAR(13), 
				IN celular VARCHAR(14),
				IN observacoes TEXT)
	BEGIN
		DECLARE num INT;
		DECLARE anoAtual INT;
		DECLARE matriculaGerada INT;
		DECLARE cpfFormatado VARCHAR(11);
        DECLARE telFormatado VARCHAR(13);
        DECLARE celFormatado VARCHAR(14); 
		SET cpfFormatado = (select replace(replace(cpf,'.',''),'-',''));
        SET telFormatado = (select replace(replace(replace(telefone,'(',''),')',''),'-',''));
        SET celFormatado = (select replace(replace(replace(celular,'(',''),')',''),'-',''));
		SET anoAtual = YEAR(CURDATE());
		SET num = (SELECT MAX(matricula) FROM cliente WHERE YEAR(updated) = YEAR(CURDATE()));        
			IF num IS NULL THEN
				SET matriculaGerada = (SELECT CONCAT(anoAtual, LPAD(1, 6, 0)));
			ELSE			
				SET matriculaGerada = (SELECT MAX(matricula)+1 FROM cliente WHERE YEAR(updated) = YEAR(CURDATE()));   
			END IF;
			INSERT INTO cliente (matricula, nome, cpf, telefone, celular, email, dataNasc, peso, altura, dataInicio, dataFim, objetivo, observacoes, foto) 
			VALUES (matriculaGerada, nome, cpfFormatado, telFormatado, celFormatado, email, dataNasc, peso, altura, dataInicio, dataFim, objetivo, observacoes, foto);
	END$$
DELIMITER ;

-- Procedure para geracao  e formatacao de campos de funcionario
DELIMITER $$
CREATE PROCEDURE insereFunc(
				IN nome VARCHAR(60), 
				IN cpf VARCHAR(14), 
                IN telefone VARCHAR(13), 
                IN celular VARCHAR(14),
                IN email VARCHAR(60),
				IN dataNasc DATE, 
				IN peso FLOAT, 
				IN altura FLOAT,
				IN observacoes TEXT,
                IN cargaHoraria INT,
                IN turno VARCHAR(20),
                IN especialidade VARCHAR(50))
	BEGIN
		DECLARE cpfFormatado VARCHAR(11);
        DECLARE telFormatado VARCHAR(13);
        DECLARE celFormatado VARCHAR(14); 
		SET cpfFormatado = (select replace(replace(cpf,'.',''),'-',''));
        SET telFormatado = (select replace(replace(replace(telefone,'(',''),')',''),'-',''));
        SET celFormatado = (select replace(replace(replace(celular,'(',''),')',''),'-',''));
		INSERT INTO funcionario (nome, cpf, telefone, celular, email, dataNasc, peso, altura, observacoes, cargaHoraria, turno, especialidade) 
		VALUES (nome, cpfFormatado, telFormatado, celFormatado, email, dataNasc, peso, altura, observacoes, cargaHoraria, turno, especialidade);
	END$$
DELIMITER ;

-- Procedure para geracao de patrimonio de equipamentos
DELIMITER $$
CREATE PROCEDURE insereEquipamento(	
				IN nome VARCHAR(50), 
				IN dataAquisicao DATE, 
				IN observacoes TEXT)
	BEGIN
		DECLARE codigo VARCHAR(10);
		DECLARE patrimonioGerado VARCHAR(10);
		SET codigo = (SELECT MAX(patrimonio) FROM equipamento);          
			IF codigo IS NULL THEN
				SET patrimonioGerado = LPAD(1, 5, 0);
			ELSE			
				SET patrimonioGerado =  LPAD((SELECT MAX(patrimonio)+1 FROM equipamento), 5, 0);
			END IF;
			INSERT INTO equipamento (patrimonio, nome, dataAquisicao, observacoes) 
			VALUES (patrimonioGerado, nome, dataAquisicao, observacoes);
	END$$
DELIMITER ;

-- ------------------------------------------------ TRIGGERS--------------------------------------------------

-- Trigger para prevenir insercao de clientes duplicados.
DELIMITER $$
CREATE TRIGGER trigger_cliente_before
BEFORE INSERT 
ON cliente 
FOR EACH ROW	 
	BEGIN	
		IF (EXISTS(SELECT 1 FROM cliente WHERE nome = new.nome and dataNasc = new.dataNasc)) THEN
			SIGNAL SQLSTATE VALUE '45000' SET MESSAGE_TEXT = 'Registro existente';
		END IF;
	END$$
DELIMITER ;

-- Trigger para prevenir insercao de funcionarios duplicados.
DELIMITER $$
CREATE TRIGGER trigger_funcionario_before
BEFORE INSERT 
ON funcionario 
FOR EACH ROW
	BEGIN
		IF (EXISTS(SELECT 1 FROM funcionario WHERE nome = new.nome and dataNasc = new.dataNasc)) THEN
		    SIGNAL SQLSTATE VALUE '45000' SET MESSAGE_TEXT = 'Registro existente';
		END IF;
	END$$
DELIMITER ;

-- Trigger para formatar cpf em updates e contato
DELIMITER $$
CREATE TRIGGER trigger_update_formatarCpfContatoCli
BEFORE UPDATE ON cliente
FOR EACH ROW
	BEGIN
		SET NEW.celular = replace(replace(replace(NEW.celular,'(',''),')',''),'-','');
		SET NEW.telefone = replace(replace(replace(NEW.telefone,'(',''),')',''),'-','');
		SET NEW.cpf = replace(replace(NEW.cpf,'.',''),'-','');
	END$$
DELIMITER ;

-- Trigger para formatar cpf em updates e contato
DELIMITER $$
CREATE TRIGGER trigger_update_formatarCpfContatoFunc
BEFORE UPDATE ON funcionario
FOR EACH ROW
	BEGIN
		SET NEW.celular = replace(replace(replace(NEW.celular,'(',''),')',''),'-','');
		SET NEW.telefone = replace(replace(replace(NEW.telefone,'(',''),')',''),'-','');
		SET NEW.cpf = replace(replace(NEW.cpf,'.',''),'-','');
	END$$
DELIMITER ;

-- Procedure para insercao e atualizacao de dados do estabelecimento
DELIMITER $$
CREATE PROCEDURE insereEst(
				IN nome VARCHAR(60), 
                IN descricao VARCHAR(50), 
                IN logo MEDIUMBLOB)
	BEGIN  
		DECLARE ide INT;
		SET ide = (SELECT MAX(id) FROM estabelecimento);
		IF ide > 0 THEN
			UPDATE estabelecimento SET nome = nome, descricao = descricao, logo = logo WHERE id = 1;
        ELSEIF ide IS NULL THEN
			INSERT INTO estabelecimento (id, nome, descricao, logo) VALUES (1, nome, descricao, logo);
		END IF;
	END$$
DELIMITER ;

 -- ------------------------------------------------ VIEWS--------------------------------------------------

-- View para listar frequencia de clientes
CREATE VIEW view_frequencia_cliente
AS
SELECT cliente.nome, frequencia.data, frequencia.presenca
FROM frequencia
INNER JOIN cliente ON cliente.id = frequencia.fk_cliente;

-- View para listar treinos de clientes
CREATE VIEW view_treinos_cliente
AS
SELECT treinos.id AS idTreino, cliente.nome AS clienteNome, exercicios.nome AS exercicioNome, treinos.ordem, 
treinos.carga, treinos.series, treinos.repeticao, treinos.ativo, treinos.fk_cliente, treinos.fk_exercicios
FROM treinos
INNER JOIN cliente ON cliente.id = treinos.fk_cliente
INNER JOIN exercicios ON exercicios.id = treinos.fk_exercicios;