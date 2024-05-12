package MyApp.Controllers;

import MyApp.Util.FxmlLoader;
import MyApp.Util.JsonHandler;
import MyApp.temp.User;
import at.favre.lib.crypto.bcrypt.BCrypt;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Arrays;

public class RegisterController {
    @FXML
    private VBox rootLayout;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    public void handleRegisterButtonAction() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        String hashWord = BCrypt.withDefaults().hashToString(12, password.toCharArray());
        new User(username, hashWord).addUser();
        FxmlLoader.load(rootLayout, "/MyApp/login.fxml");
    }
    @FXML
    public void handleLoginButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/login.fxml");
    }
}
