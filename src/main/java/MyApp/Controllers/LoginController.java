package MyApp.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import MyApp.Util.FxmlLoader;

public class LoginController {
    @FXML
    private VBox rootLayout;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    public void handleSubmitButtonAction() {
        String Username = usernameField.getText();
        String Password = passwordField.getText();
        System.out.println("Username: " + Username + " Password: " + Password);
        FxmlLoader.load(rootLayout, "/MyApp/mainMenu.fxml");
    }
}



