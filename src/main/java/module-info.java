module MyApp {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires bcrypt;

    opens MyApp.temp to com.fasterxml.jackson.databind;
    exports MyApp;
    exports MyApp.Controllers;
    opens MyApp.Controllers to javafx.fxml;
}
