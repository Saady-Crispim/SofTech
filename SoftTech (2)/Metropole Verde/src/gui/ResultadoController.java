package gui;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ResultadoController implements Initializable {

    @FXML
    private Button playAgainButton;

    @FXML
    private Button exitButton;

    @FXML
    private Label scoreLabel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Defina a pontuação no label quando a interface for inicializada
        int pontuacao = GameState.getInstance().getPontuacao();
        if (scoreLabel != null) {
            scoreLabel.setText(String.valueOf(pontuacao));
        }
    }

    @FXML
    public void handlePlayAgain(ActionEvent event) {
        // Resetar o estado do jogo
        GameState.getInstance().reset(); // Zera a pontuação e o estado das fases
        GameProgress.getInstance().reset(); // Zera o progresso das fases

        // Navegar para a interface inicial do jogo
        navigateTo("GuiInicial.fxml", event); // Altere para o arquivo FXML correto
    }

    @FXML
    public void handleExit(ActionEvent event) {
        // Navegar de volta ao menu principal ou fechar a aplicação
        navigateTo("MenuPrincipal.fxml", event); // Altere para o arquivo FXML correto
    }

    private void navigateTo(String fxmlFile, ActionEvent event) {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
