package MyApp.Controllers;

import MyApp.Util.FxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class MainMenuController {
    @FXML
    private VBox rootLayout;
    @FXML
    public void handleWordListsButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/wordLists.fxml");
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
