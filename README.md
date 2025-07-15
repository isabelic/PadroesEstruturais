# Padrões de Projeto - Command, Strategy e Observer

-  `Command`: Sistema de fila de impressão 
-  `Strategy`: Cálculo de planos 
-  `Observer`: Sistema de notícias 

---

1. Qual a principal vantagem do padrão Observer em sistemas reativos?

--> Uma das vantagens mais clara que percebi é que o sistema ficou independente, os usuários recebem notificações automaticamente quando uma notícia é publicada.
Isso reflete ao padrao observer: ações automáticas disparadas por eventos.



2. Por que o Strategy é melhor que muitos if?

--> Na minha aplicação do Strategy, criei três planos de streaming e uma interface CalcularPlano.
Ao invés de usar muitos if, apenas instancio a estratégia correta com base na escolha do usuário.
Isso deixa o código mais limpo e facil de manter ,  se eu quiser adicionar um novo plano, só crio uma nova classe.


3. Dê um exemplo real em que Command seja melhor que apenas chamar métodos diretamente.

--> Na atividade fila de impressão, representei ações como objetos com a classe (Imprimir).
Com isso, implementei um gerenciador que permite executar, desfazer e listar comandos.
Isso seria impossível se eu apenas chamasse métodos direto. Command é ideal quando tem  necessidade de histórico e controle das ações.


