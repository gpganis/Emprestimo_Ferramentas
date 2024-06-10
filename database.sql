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
INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES (1, 'Gabriel' ,'(12)34567-8924');
INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES (2, 'Mathues', '(98)75265-4321');
INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES (3, 'Pedro', '(66)91827-3645');
INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES (4, 'Rennan' , '(42)28374-8228');
INSERT INTO tb_amigos(id_amigo,nome,telefone) VALUES (5, 'Rafael' , '(14)23252-3634');

-- adicionando dados de exemplo na tabela de Emprestimos
INSERT INTO tb_emprestimos(id_emprestimo,id_amigo,data_emprestimo, data_devolucao,entregue) VALUES (1,5,'2024-06-07','2024-07-30',0);
INSERT INTO tb_emprestimos(id_emprestimo,id_amigo,data_emprestimo, data_devolucao,entregue) VALUES (2,1,'2024-06-07','2024-08-25',0);
INSERT INTO tb_emprestimos(id_emprestimo,id_amigo,data_emprestimo, data_devolucao,entregue) VALUES (3,3,'2024-06-07','2024-09-10',0);

-- adicionando dados de exemplo na tabela de Ferramentas
INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao,id_emprestimo) VALUES (1,'Martelo','Bosch', 23.50,1);
INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao) VALUES (2,'Enxada','Tramontina', 45.25);
INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao,id_emprestimo) VALUES (3,'Furadeira','Stanley', 267.00,3);
INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao) VALUES (4,'Pá','Tramontina', 34.67);
INSERT INTO tb_ferramentas(id_ferramenta,nome,marca,custo_aquisicao,id_emprestimo) VALUES (5,'Trena','Stanley', 56.78,2);
