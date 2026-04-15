package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ClienteController {

    @FXML
    private Button btElogiar;

    @FXML
    private Button btReclamar;

    @FXML
    private Button btVoltarSalao;

    @FXML
    private TextField txtNomeCliente;

    @FXML
    private TextField txtReclamar;

    @FXML
    private TextField txtSatisfeito;

    Cliente c;

    @FXML
    void cadastrar(ActionEvent event) {
        c = new Cliente(txtNomeCliente.getText(), Boolean.parseBoolean(txtSatisfeito.getText()), Boolean.parseBoolean(txtReclamar.getText());
        c.elogiar();
    }
}