# Requisitos Funcionais

RF01 - Cadastro de Ferramentas: O software deve permitir o cadastro de ferramentas, com nome, marca e custo.

RF02 - Cadastro de Amigos: O software deve permitir o cadastro de amigos, com nome e telefone.

RF03 - Registro de Empréstimos: O software deve permitir o registro de empréstimos, com a ferramenta emprestada, o amigo, a data do empréstimo e a data de devolução.

RF04 - Aviso de Pendência de Empréstimos: O software deve alertar o usuário se o amigo possui ferramentas não devolvidas ao registrar um novo empréstimo.

RF05 - Relatório de Ferramentas: O software deve gerar um relatório com todas as ferramentas cadastradas, incluindo descrição, valor de cada uma e o total gasto na aquisição.

RF06 - Relatório de Empréstimos Ativos: O software deve gerar um relatório com todos os empréstimos ativos, informando a ferramenta emprestada, o amigo, a data do empréstimo e a data prevista de devolução.

RF07 - Relatório de Empréstimos Pendentes: O software deve gerar um relatório com todos os empréstimos que ultrapassaram o prazo de devolução, informando a ferramenta, o amigo, a data do empréstimo e a data limite de devolução.

RF08 - Relatório de Todos os Empréstimos: O software deve gerar um relatório com todos os empréstimos realizados, informando a ferramenta, o amigo, se o empréstimo está ativo ou pendente, a data do empréstimo, a data limite de devolução e o amigo que mais fez empréstimos.

RF09 - Agenda Integrada: O software deve compartilhar lembretes de eventos por e-mail.

RF10 - Verificação de Ferramentas Não Devolvidas: O software deve verificar se o amigo tem ferramentas não devolvidas antes de registrar um novo empréstimo e informar ao usuário.

# Requisitos Não Funcionais

RNF01 - Localização: O software deve ser executado localmente no computador do usuário, sem necessidade de internet.

RNF02 - Interface Amigável: O software deve ter uma interface fácil de usar, adequada para usuários não técnicos.

RNF03 - Segurança: O software deve proteger os dados cadastrados, garantindo a segurança das informações pessoais e financeiras.

RNF04 - Integração com Google Agenda: O software deve integrar-se de forma eficaz e confiável com a Google Agenda, garantindo o compartilhamento correto de lembretes.

RNF05 - Compatibilidade: O software deve rodar localmente em um computador pessoal com o Windows 10 ou 11.

RNF06 - Linguagem de Programação: O software deve ser desenvolvido em Java 1.8.

RNF07 - Banco de Dados: O software deve ser conectado a uma base de dados usando MySQL 8.3.0.

# Regras de Negócio

NE01 - Empréstimo Exclusivo: Uma ferramenta só pode ser emprestada a um amigo de cada vez.

NE02 - Custo de Aquisição Positivo: O custo de aquisição de uma ferramenta deve ser um valor positivo.

NE03 - Campos Obrigatórios: O cadastro de amigos, ferramentas ou empréstimo não podem ser realizados enquanto existir algum campo em branco.

NE04 - Data de Devolução Válida: A data de devolução de uma ferramenta não pode ser anterior à data do empréstimo.

NE05 - Pendências: O cadastro de um amigo, uma ferramenta ou um empréstimo não pode ser excluido enquanto existir alguma pendência.

# Configuração do Banco de Dados

- [Script do Banco de Dados](https://github.com/gpganis/Emprestimo_Ferramentas/blob/master/database.sql)

- Login: root

- Senha: Unisul@1520

# Grupo

- Gabriel Pagani de Souza - RA 1072410845

- Matheus Joseph de Freitas Coloni - RA 1072451389

- Rafael Mendes Morais - RA 10724115482

- Rennan Rosa Guedes - RA 1072418210

- Pedro Henrique Menezes André - RA 1072416494
