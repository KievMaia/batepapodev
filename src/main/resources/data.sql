insert into time (nome)
values ('Produto');

insert into time (nome)
values ('Comercial');

insert into time (nome)
values ('Marketing');

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('12345678900', CURRENT_DATE - INTERVAL '7' DAY, 'user1@example.com', 'João Silva', 1, true);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('23456789011', CURRENT_DATE - INTERVAL '14' DAY, 'user2@example.com', 'Maria Santos', 1, true);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('34567890122', CURRENT_DATE - INTERVAL '21' DAY, 'user3@example.com', 'Pedro Oliveira', 1, false);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('45678901233', CURRENT_DATE - INTERVAL '28' DAY, 'user4@example.com', 'Ana Souza', 2, false);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('56789012344', CURRENT_DATE - INTERVAL '35' DAY, 'user5@example.com', 'Lucas Pereira', 2, true);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('67890123455', CURRENT_DATE - INTERVAL '42' DAY, 'user6@example.com', 'Carolina Santos', 1, true);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('78901234566', CURRENT_DATE - INTERVAL '49' DAY, 'user7@example.com', 'Rodrigo Almeida', 3, true);

INSERT INTO colaborador (cpf, data_cadastro, email, nome, time_id, status)
VALUES ('89012345677', CURRENT_DATE - INTERVAL '56' DAY, 'user8@example.com', 'Larissa Rodrigues', 3, false);
