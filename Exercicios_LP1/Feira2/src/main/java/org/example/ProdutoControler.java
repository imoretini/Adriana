package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ProdutoControler {
    @FXML
    private Button btCadastrar;

    @FXML
    private TextField txtCategoria;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPreco;

    @FXML
    void Cadastrar(ActionEvent event) {
    System.out.println("boa noite");
    }

}
