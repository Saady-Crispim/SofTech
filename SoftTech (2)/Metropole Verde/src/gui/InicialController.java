package gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InicialController {

    @FXML
    private Button View2;
    @FXML
    private Button regras;
    @FXML
    private Button apostila;
    @FXML
    private Button apostila2;
    @FXML
    private Button apostila3;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button ProdeServ; 
    @FXML
    private Button Empresa; 
    
    @FXML
    public void onProdeServAction(ActionEvent event) {
        navigateTo("Produto e ServiçO.fxml", event);
    } 
    
    @FXML
    public void onEmpresaAction(ActionEvent event) {
        navigateTo("a Empresa.fxml", event);
    }
    
    @FXML
    public void onRegrasAction(ActionEvent event) {
        navigateTo("regras.fxml", event);
    }
    
    @FXML
    public void onApostilaAction(ActionEvent event) {
        navigateTo("Apostila.fxml", event);
    }

    @FXML
    public void onApostila2Action(ActionEvent event) {
        navigateTo("Apostila2.fxml", event);
    }
    
    @FXML
    public void onApostila3Action(ActionEvent event) {
        navigateTo("Apostila3.fxml", event);
    }

    @FXML
    public void onVoltarAction(ActionEvent event) {
        navigateTo("GuiInicial.fxml", event);
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
