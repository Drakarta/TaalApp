package MyApp.Controllers;

import MyApp.Classes.AppConfig;
import MyApp.Classes.User;
import at.favre.lib.crypto.bcrypt.BCrypt;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import MyApp.Util.FxmlLoader;

import java.io.IOException;

public class LoginController implements Controller {
    @FXML
    private Label titleLabel;
    @FXML
    private VBox rootLayout;
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    @FXML
    public void handleSubmitButtonAction() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();
        AppConfig users = User.getUsers();
        for (User user : users.userList) {
            if (user.getUsername().equals(username)) {
                if (BCrypt.verifyer().verify(password.toCharArray(), user.getHashWord()).verified) {
                    FxmlLoader.load(rootLayout, "/MyApp/mainMenu.fxml");
                } else {
                    titleLabel.setText("Invalid username or password");
                }
                return;
            } else {
                titleLabel.setText("Invalid username or password");
            }
        }
    }

    @FXML
    public void handleRegisterButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/register.fxml");
    }
}



