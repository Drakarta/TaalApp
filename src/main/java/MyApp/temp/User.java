package MyApp.temp;

import MyApp.Util.JsonHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class User {
    private UUID id;
    private String username;
    private String hashWord;
    private ArrayList<Word> wordList;

    // Default constructor
    public User() {
        this.id = UUID.randomUUID();
        this.username = "";
        this.hashWord = "";
        this.wordList = new ArrayList<>();
    }

    public User(String username, String hashWord) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.hashWord = hashWord;
        this.wordList = new ArrayList<>();
    }

    public void addUser() {
        try {
            AppConfig appConfig = getUsers();
            if (appConfig.userList == null) {
                appConfig = AppConfig.getInstance();
            }
            appConfig.userList.add(this);
            JsonHandler.writeJson(appConfig, "users.json");
        } catch (IOException e) {
            System.err.println("Error adding user: " + e.getMessage());
        }
    }

    public static AppConfig getUsers() throws IOException {
        return JsonHandler.readJson(AppConfig.class, "users.json");
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getHashWord() {
        return hashWord;
    }

    public ArrayList<Word> getWordList() {
        return wordList;
    }
}
