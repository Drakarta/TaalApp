module MyApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens MyApp to javafx.fxml;
    exports MyApp;
    exports MyApp.Controllers;
    opens MyApp.Controllers to javafx.fxml;
}