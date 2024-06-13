-- Remove a tabela tb_ferramentas se já existir
DROP TABLE IF EXISTS `tb_ferramentas`;

-- Remove a tabela tb_emprestimos se já existir
DROP TABLE IF EXISTS `tb_emprestimos`;

-- Remove a tabela tb_amigos se já existir
DROP TABLE IF EXISTS `tb_amigos`;

-- Cria a tabela tb_amigos
CREATE TABLE IF NOT EXISTS `tb_amigos` (
  `id_amigo` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `telefone` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_amigo`)
) ENGINE = InnoDB;

-- Cria a tabela tb_emprestimos
CREATE TABLE IF NOT EXISTS `tb_emprestimos` (
  `id_emprestimo` INT NOT NULL AUTO_INCREMENT,
  `data_emprestimo` DATE NOT NULL,
  `data_devolucao` DATE NOT NULL,
  `entregue` BOOLEAN NOT NULL,
  `id_amigo` INT NOT NULL,
  PRIMARY KEY (`id_emprestimo`),
  INDEX `fk_tb_emprestimos_tb_amigos_idx` (`id_amigo` ASC) VISIBLE,
  CONSTRAINT `fk_tb_emprestimos_tb_amigos`
    FOREIGN KEY (`id_amigo`)
    REFERENCES `tb_amigos` (`id_amigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

-- Cria a tabela tb_ferramentas
CREATE TABLE IF NOT EXISTS `tb_ferramentas` (
  `id_ferramenta` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `custo_aquisicao` DOUBLE NOT NULL,
  `id_emprestimo` INT,
  PRIMARY KEY (`id_ferramenta`),
  INDEX `fk_tb_ferramentas_tb_emprestimos1_idx` (`id_emprestimo` ASC) VISIBLE,
  CONSTRAINT `fk_tb_ferramentas_tb_emprestimos1`
    FOREIGN KEY (`id_emprestimo`)
    REFERENCES `tb_emprestimos` (`id_emprestimo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE = InnoDB;

-- adicionando dados de exemplo na tabela de Amigos
INSERT INTO tb_amigos (nome, telefone) VALUES 
('Gabriel', '(12)34567-8924'),
('Mathues', '(98)75265-4321'),
('Pedro', '(66)91827-3645'),
('Rennan', '(42)28374-8228'),
('Rafael', '(14)23252-3634'),
('Maria', '(55)98765-4321'),
('João', '(33)12345-6789'),
('Ana', '(87)65432-1098'),
('Lucas', '(21)90876-5432'),
('Carla', '(34)67890-1234'),
('Bruno', '(67)54321-0987'),
('Julia', '(99)01234-5678'),
('Mariana', '(23)45678-9012'),
('Fernanda', '(78)90123-4567'),
('Diego', '(89)34567-8901'),
('Camila', '(01)23456-7890'),
('Gustavo', '(45)67890-1234'),
('Tatiane', '(56)78901-2345'),
('André', '(78)90123-4567'),
('Larissa', '(12)34567-1234');

INSERT INTO tb_ferramentas (nome, marca, custo_aquisicao, id_emprestimo) VALUES 
('Martelo', 'Bosch', 29.99, NULL),
('Enxada', 'Tramontina', 54.99, NULL),
('Furadeira', 'Stanley', 299.99, NULL),
('Pá', 'Tramontina', 39.99, NULL),
('Trena', 'Stanley', 69.99, NULL),
('Alicate', 'Irwin', 19.99, NULL),
('Chave de Fenda', 'Belzer', 12.99, NULL),
('Serrote', 'Vonder', 39.99, NULL),
('Escada', 'Alulev', 119.99, NULL),
('Parafusadeira', 'DeWalt', 149.99, NULL),
('Plaina', 'Makita', 99.99, NULL),
('Marreta', 'Tramontina', 49.99, NULL),
('Nível a Laser', 'Bosch', 249.99, NULL),
('Serra Circular', 'Makita', 199.99, NULL),
('Lixadeira', 'Black+Decker', 89.99, NULL),
('Tesoura de Podar', 'Trapp', 39.99, NULL),
('Broca', 'Bosch', 9.99, NULL),
('Talhadeira', 'Western', 12.99, NULL),
('Serra Tico-Tico', 'Bosch', 109.99, NULL),
('Furadeira de Impacto', 'DeWalt', 229.99, NULL),
('Lanterna', 'Energizer', 19.99, NULL),
('Fita Métrica', 'Stanley', 15.99, NULL),
('Martelo de Borracha', 'Vonder', 24.99, NULL),
('Chave Inglesa', 'Belzer', 14.99, NULL),
('Formão', 'Irwin', 9.99, NULL),
('Nível de Bolha', 'Alulev', 7.99, NULL),
('Serra Copo', 'Bosch', 34.99, NULL),
('Marreta de Borracha', 'Tramontina', 34.99, NULL),
('Grampo de Aperto Rápido', 'Bessey', 24.99, NULL),
('Lanterna de Cabeça', 'Petzl', 39.99, NULL),
('Alicate de Corte', 'KNIPEX', 34.99, NULL),
('Chave de Fenda Phillips', 'Tramontina', 11.99, NULL),
('Lâmina de Serra', 'Bosch', 12.99, NULL),
('Nível Magnético', 'Vonder', 17.99, NULL),
('Chave de Catraca', 'Stanley', 27.99, NULL),
('Serra Manual', 'Bahco', 29.99, NULL),
('Furadeira Angular', 'Makita', 199.99, NULL),
('Tesoura de Aviação', 'Irwin', 19.99, NULL),
('Grampeador Manual', 'Bosch', 19.99, NULL),
('Chave Allen', 'Gedore', 14.99, NULL),
('Chave Combinada', 'Tramontina', 19.99, NULL),
('Nível a Laser', 'Makita', 349.99, NULL),
('Plaina Elétrica', 'DeWalt', 249.99, NULL),
('Serra de Esquadria', 'Bosch', 399.99, NULL),
('Serra de Fita', 'Makita', 599.99, NULL),
('Trena a Laser', 'Stanley', 119.99, NULL),
('Escada Telescópica', 'Alulev', 149.99, NULL),
('Marreta de Ferro', 'Tramontina', 39.99, NULL),
('Alicate de Bico', 'Irwin', 15.99, NULL),
('Chave de Boca', 'Tramontina', 11.99, NULL);