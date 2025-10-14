PI_IV_Mous-Track
Uma aplicação web projetada para centralizar e otimizar processos de importação e exportação, facilitando a comunicação e o gerenciamento de documentos entre agentes de comex internos, externos e clientes finais.

📜 Sobre o Projeto
No dinâmico setor de Comércio Exterior (Comex), a gestão de múltiplos processos, documentos e a comunicação entre diferentes agentes pode se tornar um grande desafio. Este projeto nasceu para solucionar essa dor, oferecendo uma plataforma centralizada onde empresas podem gerenciar suas operações de importação e exportação de forma intuitiva e segura.

O sistema permite que um administrador gerencie sua equipe de agentes, que por sua vez podem criar, atualizar e compartilhar processos específicos com parceiros internacionais, mantendo toda a comunicação e documentação organizada em um único lugar.

✨ Principais Funcionalidades

👤 Gerenciamento de Usuários e Acessos
Acesso Admin: O primeiro usuário é o administrador da empresa, que pode editar seu perfil (nome, foto, senha).
Cadastro de Agentes: O admin pode cadastrar seus funcionários (agentes), definindo permissões de acesso (Importação, Exportação ou Ambos).
Login por Domínio: O sistema agrupa automaticamente usuários da mesma empresa com base no domínio do e-mail, garantindo a separação e segurança dos dados.
Convite Automatizado: Ao ser cadastrado, o agente recebe um e-mail com suas credenciais de acesso iniciais.

🗂️ Gestão de Processos (Cards)
Criação de Processos: Agentes podem iniciar novos processos (ex: "Importação Nestlé"), especificando o tipo (Importação/Exportação) e o modal (Aéreo/Marítimo).
Dashboard de Cards: A tela principal exibe todos os processos em formato de cards, com um número de identificação único e gerado automaticamente. É possível alternar a visualização entre Importação e Exportação.
Detalhes do Processo: Ao clicar em um card, ele se expande para exibir detalhes, checklists de tarefas, campo para observações e a possibilidade de anexar mais documentos.

🤝 Colaboração e Comunicação
Compartilhamento Externo: Um agente pode compartilhar um card específico com um agente externo (parceiro internacional) via e-mail.
Acesso Restrito: O agente externo recebe um link de acesso exclusivo e temporário, que dá permissão para visualizar e interagir apenas com o card compartilhado.
Chat Integrado: Cada card compartilhado gera um chat interno para comunicação direta entre o agente da empresa e o parceiro externo.
Tela de Chats: Uma tela dedicada, similar ao Slack, agrega todos os chats em que o usuário está envolvido.
Fim do Acesso: O acesso do agente externo é revogado automaticamente quando o processo é marcado como "Concluído".

📄 Documentação e Rastreio
Repositório de Documentos: Cada processo possui um repositório dedicado para armazenar todos os documentos anexados, mantendo um registro organizado.
Gerador de S.I.: Uma tela específica para preenchimento de dados e geração do documento de Shipping Instruction (S.I.).
Rastreio de Carga:
Integração com API pública para rastreio de cargas via AWB (Aéreo) ou BL (Marítimo).
Permite que o agente interno edite e confirme as informações de rastreio.
Possibilidade de compartilhar um link de visualização somente do rastreio com o cliente final.

🛠️ Tecnologias (Planejadas)
Backend: Java
Frontend: (A definir: React, Angular, Vue, etc.)
Banco de Dados: (A definir: PostgreSQL, MySQL, etc.)

👥 Integrantes
Este projeto foi desenvolvido pela seguinte equipe:

Ana Beatriz Maranho
Eduardo Sanvido
Juliana Prado 
Laura Nogueira
Nando Balzaneli

👨‍🏫 Professor Orientador
Este projeto foi orientado pelo professor:

Luã Muriana
