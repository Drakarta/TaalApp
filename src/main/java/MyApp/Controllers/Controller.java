package MyApp.Controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

public interface Controller  {
    @FXML
    public default void initialize() {
    }
}
