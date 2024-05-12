package MyApp.Controllers;

import MyApp.Util.FxmlLoader;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public class WordListController implements Controller {
    @FXML
    private VBox rootLayout;
    @FXML
    private VBox Content;

    @Override
    public void initialize() {

//        Content.getChildren().add();
    }

    public void handleAddWordListButtonAction() {

    }

    public void handleEditWordListButtonAction() {
    }

    public void handleDeleteWordListButtonAction() {
    }

    public void handleBackButtonAction() {
        FxmlLoader.load(rootLayout, "/MyApp/mainMenu.fxml");
    }
}
