package MyApp;

import MyApp.Classes.Word;
import MyApp.Classes.WordList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Login");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException {
        Word word = new Word("hello", "a greeting");
        WordList wordList = new WordList("Greetings");
        wordList.NewWordList();
//        WordList wordList1 = WordList.getWordList("Greetings");
//        wordList1.addWord(word);

        launch(args);
    }
}