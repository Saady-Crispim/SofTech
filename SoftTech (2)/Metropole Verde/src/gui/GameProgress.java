package gui;

public class GameProgress {
    private static GameProgress instance = null;
    private boolean[] fasesRespondidas;

    private GameProgress() {
        fasesRespondidas = new boolean[10];
    }

    public static GameProgress getInstance() {
        if (instance == null) {
            instance = new GameProgress();
        }
        return instance;
    }

    public boolean isFaseRespondida(int fase) {
        return fasesRespondidas[fase];
    }

    public void marcarFaseComoRespondida(int fase) {
        fasesRespondidas[fase] = true;
    }

    public void reset() {
        // Resetar o progresso das fases
        fasesRespondidas = new boolean[10];
    }
}
