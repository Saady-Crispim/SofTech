package gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import application.Alerts;
import javafx.scene.control.Alert.AlertType;

public class Jogada {

    @FXML
    public Button A, B, C, D, Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10;
    @FXML
    private Button btnVoltar;

    @FXML
    public void onCERTOEMPAction(ActionEvent event) {
        processarResposta("a Empresa.fxml", 500, event);
    }

    @FXML
    public void onERRADOEMPAction(ActionEvent event) {
        processarResposta("a Empresa.fxml", 0, event);
    }

    @FXML
    public void CERTOPRODSERV(ActionEvent event) {
        processarResposta("Produto e ServiçO.fxml", 500, event);
    }

    @FXML
    public void ERRADOPRODSERV(ActionEvent event) {
        processarResposta("Produto e ServiçO.fxml", 0, event);
    }

    @FXML
    public void onVoltarAction(ActionEvent event) {
        navigateTo("GuiInicial.fxml", event);
    }

    @FXML
    public void onQ1Action(ActionEvent event) {
        processarFase(0, "1.Q1.fxml", event); // Fase 1
    }

    @FXML
    public void onQ2Action(ActionEvent event) {
        processarFase(1, "1.Q2.fxml", event); // Fase 2
    }

    @FXML
    public void onQ3Action(ActionEvent event) {
        processarFase(2, "1.Q3.fxml", event); // Fase 3
    }

    @FXML
    public void onQ4Action(ActionEvent event) {
        processarFase(3, "1.Q4.fxml", event); // Fase 4
    }

    @FXML
    public void onQ5Action(ActionEvent event) {
        processarFaseFinal(4, event); // Fase 5
    }

    @FXML
    public void onQ6Action(ActionEvent event) {
        processarFase(5, "2.Q1.fxml", event); // Fase 6
    }

    @FXML
    public void onQ7Action(ActionEvent event) {
        processarFase(6, "2.Q2.fxml", event); // Fase 7
    }

    @FXML
    public void onQ8Action(ActionEvent event) {
        processarFase(7, "2.Q3.fxml", event); // Fase 8
    }

    @FXML
    public void onQ9Action(ActionEvent event) {
        processarFase(8, "2.Q4.fxml", event); // Fase 9
    }

    @FXML
    public void onQ10Action(ActionEvent event) {
        processarFaseFinal(9, event); // Fase 10
    }

    private void processarFase(int numeroFase, String fxmlFile, ActionEvent event) {
        if (!GameProgress.getInstance().isFaseRespondida(numeroFase)) {
            GameProgress.getInstance().marcarFaseComoRespondida(numeroFase);
            navigateTo(fxmlFile, event);
        } else {
            Alerts.showAlert("Atenção", "Fase já jogada", "Você já jogou esta fase. Não é possível jogá-la novamente.", AlertType.WARNING);
        }
    }

    private void processarFaseFinal(int numeroFase, ActionEvent event) {
        if (!GameProgress.getInstance().isFaseRespondida(numeroFase)) {
            GameProgress.getInstance().marcarFaseComoRespondida(numeroFase);

            String fxmlFile = GameState.getInstance().getPontuacao() >= 1500 ? "positivo.fxml" : "negativo.fxml";
            navigateTo(fxmlFile, event);
        } else {
            Alerts.showAlert("Atenção", "Fase já jogada", "Você já jogou esta fase. Não é possível jogá-la novamente.", AlertType.WARNING);
        }
    }

    private void processarResposta(String fxmlFile, int pontuacaoIncremento, ActionEvent event) {
        GameState.getInstance().addPontuacao(pontuacaoIncremento);
        System.out.println("Pontuação: " + GameState.getInstance().getPontuacao());
        navigateTo(fxmlFile, event);
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
