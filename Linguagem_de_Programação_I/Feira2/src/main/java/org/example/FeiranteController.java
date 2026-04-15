package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FeiranteController {

    @FXML
    private Button btCadastrar;

    @FXML
    private TextField txtNomeFeirante;

    @FXML
    private TextField txtProdutoPrincipal;

    @FXML
    private TextField txtSaldo;

    @FXML
    void Cadastrar(ActionEvent event) {
        IO.println("Feirante cadastrado!");

    }

}
