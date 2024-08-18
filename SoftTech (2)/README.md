# Metrópole Verde: jogos como aplicação de educação ambiental
# Bibliotecas e Ferramentas para a formação da GUI
O código apresentado utiliza JavaFX para criar a interface gráfica do jogo e Scene Builder para a construção visual dessa interface. Por exemplo, na classe FinalController, os elementos da interface são definidos com anotações @FXML que se referem aos elementos definidos no arquivo FXML gerado pelo Scene Builder. O JavaFX manipula esses elementos de interface conforme necessário, como exibir pontuações e atualizar labels.

• Scene Builder: O Scene Builder é uma ferramenta de design de interface gráfica do usuário (GUI) para JavaFX. Permite criar layouts de interface visualmente, arrastando e soltando elementos gráficos na área de design. Após criar o layout, o Scene Builder gera um arquivo FXML que pode ser carregado em aplicativos JavaFX para exibir a interface.

• JavaFX: JavaFX é uma biblioteca de software e plataforma para criar aplicativos de desktop e aplicações web baseadas em RIAs (Rich Internet Applications). Fornecendo recursos para criar interfaces de usuário ricas e interativas, incluindo controles, gráficos, animações e efeitos visuais. JavaFX é integrado ao JDK a partir da versão 8.
Essas ferramentas trabalham em conjunto para criar interfaces de usuário modernas e dinâmicas em aplicações Java. O Scene Builder é usado para o design visual da interface, enquanto o JavaFX fornece classes e APIs para manipular e interagir com os elementos da interface no código Java.

# Programa start e métodos de troca de interfaces
Método start (Stage stage): Este método é chamado quando a aplicação é iniciada. Ele recebe um parâmetro do tipo Stage, que representa a janela principal da aplicação. No corpo do método, é carregado uma interface de usuário (UI) a partir de um arquivo FXML usando o FXMLLoader. Em seguida, é criado uma cena (Scene) com a interface carregada e a define na janela principal (Stage). Por fim, a janela principal é exibida com o método show ().
Método main(String[] args): É o ponto de entrada da aplicação Java, o qual seja um método estático que recebe um array de String como argumento. O método main() é responsável por iniciar a aplicação chamando o método launch(), que inicia o JavaFX Application Thread e chama o método start() da classe Start.
 

# Página inicial
Assim como na classe start que é usado para chamar o arquivo fxml, a classe “inicialController” define cada método com parâmetros do tipo “Action event” que é responsável por atribuir ações através de algum evento. No caso dessa classe é definida controladora para os fxml que receberam ações simples como a de troca de tela sendo aplicadas aos eventos de clique em botões. Por esta classe ser exclusivamente designada para ações de click a mesma foi designada como controladoras das páginas Regras e catálogo de propriedades, já que não precisam de outra lógica atribuída.
 

# Play
A opção “play” tem por sua vez efetuar ações responsável pela escolha (e suas logicas aplicadas) dos jogadores. Nela percebe-se que é atribuído ações como a de atualização de labels e imagens, atualização e compartilhamento de dados (nomeados como recursos), além de atribuir condições responsável por detectar a vez do jogador e rodada.

•	Coleta: O método onColetaAction e onCasaCompAction lidam com a coleta de recursos e construção de uma propriedade ("casa de compostagem"), respectivamente. Eles verificam se é possível realizar a ação com base nas condições do jogo, como recursos disponíveis e estado atual da partida.
 
•	Alerts: São utilizados alerts para informar ao jogador sobre erros ou condições específicas durante as ações. Por exemplo, se um jogador tenta construir uma casa de compostagem sem recursos suficientes, um alerta de erro é exibido.
 
•	Construção: A construção da "casa de compostagem" é realizada nos métodos onCasaCompAction. Eles verificam se o jogador tem recursos suficientes para construir e se o jogador já possui a propriedade. Em caso afirmativo, a construção é realizada e a pontuação é atualizada.
 
•	Sistema de rodada e jogador: O sistema de rodada e jogador é implementado para controlar a progressão do jogo. Os métodos verificam se ainda há rodadas disponíveis (roundAtual <= 7), se é a vez do jogador atual e alternam entre os jogadores após cada ação. Quando o limite de rodadas é atingido, a partida é direcionada para a fase final.

# Página Final
•	Armazenamento e compartilhamento de dados (pontuação):
Na classe Pontuacao, os dados de pontuação dos jogadores são armazenados e compartilhados entre diferentes partes do jogo. A classe implementa o padrão Singleton para garantir que apenas uma instância da pontuação seja criada e compartilhada.
 
Na classe FinalController, a pontuação é recuperada da instância única de Pontuacao e exibida na tela final do jogo. Os labels lblPontuacao1 e lblPontuacao2 são atualizados de acordo com a pontuação dos jogadores.
 
