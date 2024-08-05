package br.com.project.bibliotecaunifebe.controller;

import br.com.project.bibliotecaunifebe.model.dao.UsuariosDAO;
import br.com.project.bibliotecaunifebe.model.database.Database;
import br.com.project.bibliotecaunifebe.model.database.DatabaseFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class HelloController{

    private final Database database = DatabaseFactory.getDatabase("postgresql");
    private final Connection connection = database.conectar();
    private final UsuariosDAO usuariosDAO = new UsuariosDAO();

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        if (connection != null) {
            System.out.println("conectado meu peixe");
        } else {
            System.out.println("F");
        }
    }

}