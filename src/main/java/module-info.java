module com.example.projetodepadroesjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetodepadroesjava to javafx.fxml;
    exports com.example.projetodepadroesjava;
    exports padoresjava.singleton;
    opens padoresjava.singleton to javafx.fxml;
}