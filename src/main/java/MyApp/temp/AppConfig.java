package MyApp.temp;

import java.util.ArrayList;
import java.util.List;

public class AppConfig {
    private static final AppConfig instance = new AppConfig();
    public List<User> userList;

    public AppConfig() {
        this.userList = new ArrayList<>();
    }

    public static AppConfig getInstance() {
        return instance;
    }
}