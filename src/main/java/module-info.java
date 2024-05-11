module org.example.demo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens MyApp to javafx.fxml;
    exports MyApp;
    exports MyApp.Controllers;
    opens MyApp.Controllers to javafx.fxml;
}