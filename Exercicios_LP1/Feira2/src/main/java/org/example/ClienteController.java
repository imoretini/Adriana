package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteController {

    @FXML
    private Button btCadastrar;

    @FXML
    private TextField txtCarteira;

    @FXML
    private TextField txtIdade;

    @FXML
    private TextField txtNome;

    Cliente c;

    @FXML
    void cadastrar(ActionEvent event) {
        c= new Cliente(txtNome.getText(), Integer.parseInt(txtCarteira.getText()), Integer.parseInt(txtIdade.getText()));
        c.mostrarDinheiro();
    }
}

