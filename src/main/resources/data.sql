INSERT INTO cidade (id_cidade, uf, nome, estado) VALUES 
(1, 'SP', 'São Paulo', 'São Paulo'),
(2, 'RJ', 'Rio de Janeiro', 'Rio de Janeiro'),
(3, 'MG', 'Belo Horizonte', 'Minas Gerais'),
(4, 'BA', 'Salvador', 'Bahia'),
(5, 'PR', 'Curitiba', 'Paraná');

INSERT INTO categoria_frete (id_categoria_frete, nome, descricao, percentual_adicional) VALUES 
(1, 'Express', 'Frete expresso com entrega em até 24 horas', 15.0),
(2, 'Econômico', 'Frete econômico com prazo de entrega estendido', 5.0),
(3, 'Internacional', 'Frete para envios internacionais', 25.0),
(4, 'Overnight', 'Frete com entrega no dia seguinte', 20.0),
(5, 'Padrão', 'Frete padrão com prazo de entrega regular', 10.0);

INSERT INTO pessoa_fisica (id_pessoa_fisica, nome, email, telefone, cpf) VALUES 
(1, 'João Silva', 'joao.silva@example.com', '(11) 98765-4321', '123.456.789-00'),
(2, 'Maria Oliveira', 'maria.oliveira@example.com', '(21) 91234-5678', '987.654.321-00'),
(3, 'Carlos Pereira', 'carlos.pereira@example.com', '(31) 99876-5432', '111.222.333-44'),
(4, 'Ana Souza', 'ana.souza@example.com', '(41) 92345-6789', '444.555.666-77'),
(5, 'Fernanda Lima', 'fernanda.lima@example.com', '(51) 93456-7890', '888.999.000-11');

INSERT INTO cliente (id_cliente, contato, ativo, fk_pessoa_fisica) VALUES 
(1, 'contato.joao@example.com', TRUE, 1),
(2, 'contato.maria@example.com', TRUE, 2),
(3, 'contato.carlos@example.com', FALSE, 3);

INSERT INTO tipo_veiculo (id_tipo_veiculo, nome, peso_maximo) VALUES 
(1, 'Caminhão Leve', 5000.0),
(2, 'Caminhão Médio', 10000.0),
(3, 'Caminhão Pesado', 20000.0),
(4, 'Van', 3000.0),
(5, 'Moto', 500.0);

INSERT INTO filial (id_filial, nome, endereco, telefone) VALUES 
(1, 'Filial São Paulo', 'Av. Paulista, 1000, São Paulo, SP', '(11) 99999-1234'),
(2, 'Filial Rio de Janeiro', 'Rua das Laranjeiras, 300, Rio de Janeiro, RJ', '(21) 98888-5678'),
(3, 'Filial Belo Horizonte', 'Av. Afonso Pena, 1500, Belo Horizonte, MG', '(31) 97777-9101'),
(4, 'Filial Salvador', 'Rua Chile, 50, Salvador, BA', '(71) 96666-2345'),
(5, 'Filial Curitiba', 'Av. Marechal Deodoro, 500, Curitiba, PR', '(41) 95555-6789');

INSERT INTO veiculo (id_veiculo, numero_placa, fk_filial, fk_tipo_veiculo) VALUES 
(1, 'ABC-1234', 1, 1),
(2, 'DEF-5678', 2, 2),
(3, 'GHI-9101', 3, 3),
(4, 'JKL-1121', 4, 4),
(5, 'MNO-3141', 5, 5);



