package MyApp.Classes;

import MyApp.Util.JsonHandler;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class User {
    private final UUID id;
    private final String username;
    private final String hashWord;

    public User() {
        this.id = UUID.randomUUID();
        this.username = "";
        this.hashWord = "";
    }

    public User(String username, String hashWord) {
        this.id = UUID.randomUUID();
        this.username = username;
        this.hashWord = hashWord;
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
        String fileName = "users.json";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                return new AppConfig();
            } catch (IOException e) {
                System.err.println("Error creating users file: " + e.getMessage());
                throw e;
            }
        }
        try {
            if (file.length() == 0) {
                return new AppConfig();
            }
            return JsonHandler.readJson(AppConfig.class, fileName);
        } catch (IOException e) {
            System.err.println("Error reading users: " + e.getMessage());
            throw e;
        }
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
}
