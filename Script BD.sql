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
('Rafael', '(14)23252-3634');

INSERT INTO tb_emprestimos (data_emprestimo, data_devolucao, entregue, id_amigo) VALUES
('2024-06-10', '2024-06-15', false, 1),
('2024-06-05', '2025-06-05', false, 4),
('2024-05-01', '2024-06-01', false, 3),
('2024-05-15', '2025-06-07', false, 3),
('2024-06-05', '2024-06-10', true, 2);

INSERT INTO tb_ferramentas (nome, marca, custo_aquisicao, id_emprestimo) VALUES 
('Martelo', 'Bosch', 29.99, 1),
('Enxada', 'Tramontina', 54.99, 3),
('Furadeira', 'Stanley', 299.99, 2),
('Pá', 'Tramontina', 39.99, 4),
('Trena', 'Stanley', 69.99, NULL);
