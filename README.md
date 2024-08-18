# Documentação do Jogo

## Visão Geral

Este jogo é um quiz interativo com perguntas divididas em várias fases. O objetivo é responder corretamente às perguntas para acumular pontos e avançar pelas fases. O jogador deve completar todas as fases para alcançar a pontuação final e receber um feedback sobre seu desempenho.

## Como Jogar

1. **Escolha o Tipo das Perguntas**: 
   - Selecione o tipo de perguntas que deseja responder, que pode ser voltado para produtos ou serviços.

2. **Navegue pelas Fases**:
   - O jogo possui 10 fases principais e 2 fases finais. Você pode acessar cada fase apenas uma vez.
   - As fases são divididas em dois grupos:
     - **Grupo 1**: Fases 1 a 5
     - **Grupo 2**: Fases 6 a 10

3. **Responda às Perguntas**:
   - Cada pergunta correta nas fases principais adiciona 500 pontos à sua pontuação.
   - Respostas incorretas não adicionam pontos.

4. **Finalização**:
   - Após completar a Fase 5, você será direcionado para uma tela de resultado baseada na sua pontuação.
   - Ao completar a Fase 10, você também será direcionado para a tela de resultado.

## Regras do Jogo

- **Objetivo**: Completar todas as fases e alcançar a maior pontuação possível.
- **Estrutura**:
  - O jogo é composto por 10 fases principais e 2 fases finais.
  - Cada fase pode ser jogada apenas uma vez.
  - As fases estão divididas em dois grupos:
    - **Grupo 1**: Fases 1 a 5
    - **Grupo 2**: Fases 6 a 10
- **Pontuação**:
  - Respostas corretas nas fases principais adicionam 500 pontos.
  - Respostas incorretas não adicionam pontos.
  - A pontuação final é calculada com base nas respostas corretas acumuladas durante o jogo.
- **Respostas e Navegação**:
  - Fases 1 a 4: Responda perguntas e avance para a próxima fase.
  - Fase 5: É uma fase final que leva a uma tela de resultado baseada na pontuação.
  - Fases 6 a 9: Continue respondendo perguntas e avançando.
  - Fase 10: A última fase do grupo 2 que leva à tela de resultado.

## Observações

- **Fases Únicas**: Você pode acessar cada fase apenas uma vez. Não será possível jogar uma fase novamente após completá-la.
- **Botão de Pontuação**: Uma fase com o símbolo “?” não é uma pergunta, mas um botão que leva à interface de pontuação. Pressione-o apenas quando terminar todas as fases.

## Principais Funções

- **`processarFase(int numeroFase, String fxmlFile, ActionEvent event)`**:
  - Gerencia o progresso do jogador entre fases.
  - Verifica se a fase foi respondida anteriormente e, se não, marca-a como respondida e navega para a próxima fase.
  - Caso a fase já tenha sido jogada, exibe um alerta informando que a fase não pode ser jogada novamente.

- **`processarFaseFinal(int numeroFase, ActionEvent event)`**:
  - Processa as fases finais do jogo.
  - Avalia a pontuação final do jogador e direciona para a tela de resultado (positiva ou negativa) com base na pontuação alcançada.

- **`processarResposta(String fxmlFile, int pontuacaoIncremento, ActionEvent event)`**:
  - Atualiza a pontuação do jogador com base na resposta dada.
  - Navega para a próxima tela de perguntas ou para a tela de resultado, conforme necessário.

- **`navigateTo(String fxmlFile, ActionEvent event)`**:
  - Gerencia a navegação entre diferentes telas do jogo.
  - Carrega a tela FXML correspondente e exibe-a ao jogador.

## Informações Técnicas

- **Tecnologias Usadas**:
  - JavaFX para a interface gráfica do jogo.
  - FXML para a definição das interfaces do usuário.
  - Controladores Java para a lógica do jogo e navegação.

- **Estrutura do Projeto**:
  - **Classes**:
    - `Jogada`: Gerencia a navegação entre as fases e a pontuação.
    - `GameProgress`: Gerencia o progresso do jogador e quais fases foram completadas.
    - `GameState`: Mantém a pontuação e o estado atual do jogo.
    - `Alerts`: Exibe mensagens de alerta para o jogador.

- **Arquivos de Interface**:
  - `GuiInicial.fxml`: Tela inicial do jogo.
  - `Fases (Q1, Q2, etc.).fxml`: Telas das fases do jogo.
  - `Resultado.fxml`: Tela de resultado final do jogo, positiva ou negativa.

---
