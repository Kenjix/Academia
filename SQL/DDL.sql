CREATE DATABASE academia;

CREATE TABLE frequencia
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    data DATE
);

CREATE TABLE cliente
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
    matricula BIGINT UNIQUE NOT NULL, -- TRIGGER PARA GERAR
    dataNasc DATE NOT NULL,
    peso FLOAT NOT NULL,
    altura FLOAT NOT NULL,
    dataInicio DATE NOT NULL,
    dataFim DATE,
    dataTroca DATE,
    objetivo VARCHAR(80),
    ativo BIT DEFAULT 1,
    observacoes TEXT,
    FK_frequencia INT,
    FOREIGN KEY (FK_frequencia) REFERENCES frequencia(id)
);

CREATE TABLE funcionario
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(60) NOT NULL,
    cpf VARCHAR(11) UNIQUE NOT NULL,
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

CREATE TABLE treinos
(
	id INT PRIMARY KEY AUTO_INCREMENT,
    ordem INT,
    series VARCHAR(20),
    repeticao INT,
    carga INT,
    tipoTreino VARCHAR(20),
    observacao TEXT,
    FK_cliente INT,
    FK_funcionario INT,
    FK_exercicios INT,
    FOREIGN KEY (FK_cliente) REFERENCES cliente(id),
    FOREIGN KEY (FK_funcionario) REFERENCES funcionario(id),
    FOREIGN KEY (FK_exercicios) REFERENCES exercicios(id)
);
