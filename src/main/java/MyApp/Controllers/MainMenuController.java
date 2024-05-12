package MyApp.Controllers;

import MyApp.Util.FxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainMenuController implements Controller {
    @FXML
    private VBox rootLayout;
    @FXML
    public void handleWordListsButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/wordList.fxml");
    }
    @FXML
    public void handleLogoutButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/login.fxml");
    }
    @FXML
    public void handleExitButtonAction() {
        System.exit(0);
    }
}
