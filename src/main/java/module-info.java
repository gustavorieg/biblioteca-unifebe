module br.com.project.bibliotecaunifebe {
    requires javafx.controls;
    requires javafx.fxml;


    opens br.com.project.bibliotecaunifebe to javafx.fxml;
    exports br.com.project.bibliotecaunifebe;
    exports br.com.project.bibliotecaunifebe.controller;
    opens br.com.project.bibliotecaunifebe.controller to javafx.fxml;
}