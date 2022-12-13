-- Clientes
CALL insereCliente('Melissa Tânia Fátima Almada', 061731455108, '1995-07-07', 83, 1.75, '2022-01-06', '2022-02-06', 'Emagrecer', null, 'melissa_almada@focustg.com.br', 8529142295, 85995733020, 'Hernia de disco');
CALL insereCliente('Marcelo Iago Severino Galvão', 18410188562, '1955-10-12', 64, 1.99, '2022-05-03', '2022-06-03','Fortalecer braços', null, 'marcelo-galvao70@omnibrasil.com.br', 2729808670, 27999246550, 'Não pode comparecer 3 vezes por semana');
CALL insereCliente('Levi Benedito Ruan da Paz', 10718593073, '1957-05-02', 84, 1.85, '2020-02-12', '2020-05-12', 'Ganhar massa muscular', null, 'levi.benedito.dapaz@ddfnet.com.br', 9628889063, 96987733542, 'Somente turno da manhã');
CALL insereCliente('Danilo Vitor Leonardo Alves', 86477461552,'1995-04-07', 107, 1.89, '2022-10-08', '2022-11-08', 'Emagracer', null, 'danilo_vitor_alves@santosferreira.abv.br', 7339248389, 73992222846, 'Não faz dieta regular');
CALL insereCliente('Renato Theo Caleb Teixeira', 58372022003,'2002-10-02', 59, 1.81, '2022-08-18', '2022-09-18', 'Ganhar massa muscular', null, 'renato_teixeira@pib.com.br',  8438190079, 84992148124, 'Foco em braços');
CALL insereCliente('Heloise Luana Dias', 71024833410, '1979-08-23', 51, 1.57, '2022-06-20', '2022-08-20', 'Manter forma', null, 'heloise-dias83@deskprint.com.br', 8226429282, 82988827342, 'pode comparecer 2 vezes na semana');
CALL insereCliente('Martin Rafael Pietro Oliveira', 63594985610,'1970-07-17', 59, '1.81', '2021-12-03', '2022-01-03', 'Emagrecer', null, 'martin.rafael.oliveira@mega-vale.com', 6138513272, 61995537513, 'Possi diabetes');
CALL insereCliente('Ian Elias da Cunha', 36886185306,'1954-11-11', 81, '1.61', '2022-09-10', '2022-10-10', 'Musculação', null, 'ian.elias.dacunha@pgpci.com.br', 2725459219, 27991505082, 'Foco em braços e costas');
CALL insereCliente('Lavínia Sophia Pinto', 80002570505,'1988-03-13', 64, 1.84, '2021-08-20', '2022-01-20', 'Musculação', null, 'laviniasophiapinto@tirel.com.br', 9635089718, 96985720245, 'Foco em pernas');
CALL insereCliente('Oliver Renan da Silva', 86515575580,'1956-09-06', 88, 1.93, '2022-11-10', '2022-12-10', 'Emagrecer', null, 'oliver.renan.dasilva@opusvp.com.br', 9239006080, 92988178118, 'Pode comparecer 2 vezes por semana');

-- Funcionarios
CALL insereFunc('Raul Antonio Farias', 44647273016, 5125567051, 51988400431, 'raulantoniofarias@spires.com.br', '1957-03-01', 92, 1.61, null, 8, 'Manhã', 'Musculação');
CALL insereFunc('Fernanda Mariah Dias', 67423229008, 5363310152, 53997612499, 'fernanda-dias97@lavabit.com', '1987-10-13', 77, 1.82, null, 8, 'Tarde', 'Zumba');
CALL insereFunc('Igor Emanuel Mendes', 57437856000, 51366864453, 51985679702, 'igor_mendes@supracolor.com.br', '2002-07-12', 95, 1.94, null, 40, 'Tarde', 'Corrida');
CALL insereFunc('Bruno Caio Silveira', 67112053080, 54264054960, 54984892706, 'bruno.caio.silveira@bom.com.br', '1974-05-10', 77, 1.66, null, 20, 'Manhã', 'Musculação');
CALL insereFunc('Cecília Marina Clara de Paula', 36212369060, 5429924394, 54994086037, 'cecilia_depaula@iq.unesp.br', '1974-12-08', 86, 1.80, null, 4, 'Noite', 'Musculação');

-- Equipamentos
CALL insereEquipamento('Halteres', '2020-08-23', 'Garantida de 2 anos');
CALL insereEquipamento('Prancha abdominal', '2021-11-23', 'Pocuo utilizado');
CALL insereEquipamento('Bicicleta ergométrica', '2020-08-13', 'Trocada peças do pedal');
CALL insereEquipamento('Banco supino', '2019-02-23', null);
CALL insereEquipamento('Caneleiras', '2022-08-15', 'Trocar em 2023');
CALL insereEquipamento('Colchonete', '2020-11-25', null);
CALL insereEquipamento('Bolas', '2020-10-18', 'Reparado em 2019');
CALL insereEquipamento('Barra de Tríceps', '2018-11-15', null);
CALL insereEquipamento('Leg Press', '2017-08-02', null);

-- Exercicios
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Agachamento', 'Membros Inferioes');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Stiff', 'Membros Inferioes');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Avanço', 'Membros Inferioes');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Supino inclinado com halteres', 'Peitorais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Supino reto com barra', 'Peitorais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Flexões', 'Peitorais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Voador dorsal', 'Dorsais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Remada unilateral apoiada no banco', 'Dorsais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Remada curvada pegada supinada', 'Dorsais');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Flexão com pés elevados', 'Deltóides/Trapézio');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Elevação lateral', 'Deltóides/Trapézio');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Elevação frontal', 'Deltóides/Trapézio');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Rosca bíceps direta com barra', 'Bíceps');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Rosca bíceps direta com halteres', 'Bíceps');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Rosca bíceps martelo em pé com halteres', 'Bíceps');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Extensão de halteres sob a cabeça', 'Tríceps');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Mergulho nas paralelas', 'Tríceps');
INSERT INTO exercicios (nome, grupoMuscular) VALUES ('Tríceps na polia alta com barra reta', 'Tríceps');

-- exerc_equip
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES (1, 9);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(2, 8);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(3, 7);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(4, 6);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(5, 5);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(6, 4);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(7, 3);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(8, 2);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(9, 1);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(1, 10);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(2, 11);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(3, 12);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(4, 13);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(5, 14);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(6, 15);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(7, 16);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(8, 17);
INSERT INTO exerc_equip (FK_equipamento, FK_exercicios) VALUES(9, 18);

-- Treino
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 1, 1, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 1, 1, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 1, 1, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 1, 1, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 1, 1, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 1, 1, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 2, 2, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 2, 2, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 2, 2, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 2, 2, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 2, 2, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 2, 2, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 3, 1, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 3, 1, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 3, 1, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 3, 1, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 3, 1, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 3, 1, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 4, 5, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 4, 5, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 4, 5, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 4, 5, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 4, 5, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 4, 5, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 5, 4, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 5, 4, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 5, 4, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 5, 4, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 5, 4, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 5, 4, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 6, 3, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 6, 3, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 6, 3, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 6, 3, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 6, 3, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 6, 3, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 7, 3, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 7, 3, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 7, 3, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 7, 3, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 7, 3, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 7, 3, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 8, 1, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 8, 1, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 8, 1, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 8, 1, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 8, 1, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 8, 1, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'ab', '2022-10-23', null, 9, 2, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'ab', '2022-10-23', null, 9, 2, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'ab', '2022-10-23', null, 9, 2, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'ab', '2022-10-23', null, 9, 2, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'ab', '2022-10-23', null, 9, 2, 9);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'ab', '2022-10-23', null, 9, 2, 10);

INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (1, '3', 3, 10, 'abc', '2022-10-23', null, 10, 4, 8);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (2, '3', 3, 10, 'abc', '2022-10-23', null, 10, 4, 4);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (3, '3', 3, 20, 'abc', '2022-10-23', null, 10, 4, 3);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (4, '3', 3, 20, 'abc', '2022-10-23', null, 10, 4, 6);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (5, '3', 3, 30, 'abc', '2022-10-23', null, 10, 4, 1);
INSERT INTO treinos (ordem, series, repeticao, carga, tipoTreino, trocaTreino, observacao, FK_cliente, FK_funcionario, FK_exercicios) 
VALUES (6, '3', 3, 30, 'abc', '2022-10-23', null, 10, 4, 15);







