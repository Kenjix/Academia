CREATE DATABASE academia;
USE academia;

CREATE TABLE frequencia
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	data DATE,
	presenca BIT DEFAULT 0
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
	FK_frequencia INT,
	updated DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
	FOREIGN KEY (FK_frequencia) REFERENCES frequencia (id)
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

CREATE TABLE equipamento
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	disponivel BIT DEFAULT 1
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
	FOREIGN KEY (FK_equipamento) REFERENCES equipamento(id),
	FOREIGN KEY (FK_exercicios) REFERENCES exercicios(id)
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
	FK_cliente INT,
	FK_funcionario INT,
	FK_exercicios INT,
	FOREIGN KEY (FK_cliente) REFERENCES cliente (id),
	FOREIGN KEY (FK_funcionario) REFERENCES funcionario (id),
	FOREIGN KEY (FK_exercicios) REFERENCES exercicios (id)
);

--Procedure para geracao de matriculas de clientes
DELIMITER $$
CREATE PROCEDURE insereCliente(	IN nome VARCHAR(60), 
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
			INSERT INTO cliente (matricula, nome, cpf, telefone, celular, email, dataNasc, peso, altura, dataInicio, objetivo, observacoes, foto) 
			VALUES (matriculaGerada, nome, cpfFormatado, telFormatado, celFormatado, email, dataNasc, peso, altura, dataInicio, objetivo, observacoes, foto);
	END$$
DELIMITER ;

--Trigger para prevenir insercao de clientes duplicados.
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

--Trigger para prevenir insercao de funcionarios duplicados.
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

--Trigger para formatar cpf em updates e contato
DELIMITER $$
CREATE TRIGGER trigger_update_formatarCpfContato
BEFORE UPDATE ON cliente
FOR EACH ROW
	BEGIN
		SET NEW.celular = replace(replace(replace(NEW.celular,'(',''),')',''),'-','');
		SET NEW.telefone = replace(replace(replace(NEW.telefone,'(',''),')',''),'-','');
		SET NEW.cpf = replace(replace(NEW.cpf,'.',''),'-','');
	END$$
DELIMITER ;