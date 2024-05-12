package MyApp.Classes;

import java.io.File;
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

//    public ArrayList<String> getWordListNames() {
//        File folder = new File("wordLists");
//        File[] listOfFiles = folder.listFiles();
//        ArrayList<String> wordListNames = new ArrayList<>();
//        assert listOfFiles != null;
//        for (File file : listOfFiles) {
//            if (file.isFile()) {
//                String fileName = file.getName();
//                String wordListName = fileName.substring(0, fileName.lastIndexOf('.'));
//                wordListNames.add(wordListName);
//            }
//        }
//        return wordListNames;
//    }
}