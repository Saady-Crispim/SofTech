package gui;

public class GameState {

    private static GameState instance;
    private int pontuacao;
    private boolean[] fasesRespondidas;

    private GameState() {
        // Inicialize as variáveis
        reset(); // Inicializa com valores padrão
    }

    public static GameState getInstance() {
        if (instance == null) {
            instance = new GameState();
        }
        return instance;
    }

    public void addPontuacao(int pontos) {
        pontuacao += pontos;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void reset() {
        // Resetar pontuação e fases respondidas
        pontuacao = 0;
        fasesRespondidas = new boolean[10]; // Considera 10 fases
    }

    public boolean isFaseRespondida(int numeroFase) {
        return fasesRespondidas[numeroFase];
    }

    public void setFaseRespondida(int numeroFase, boolean respondida) {
        fasesRespondidas[numeroFase] = respondida;
    }
}
