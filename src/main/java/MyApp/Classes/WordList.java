package MyApp.Classes;

import MyApp.Util.JsonHandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;

public class WordList {
    private final UUID id;
    private final String wordListName;
    private final ArrayList<Word> words;

    public WordList(String wordListName) {
        this.id = UUID.randomUUID();
        this.wordListName = wordListName;
        this.words = new ArrayList<>();
    }

    public void NewWordList() throws IOException {
        try {
            String fileName = "wordLists/" + this.wordListName + ".json";
            JsonHandler.writeJson(this, fileName);

        } catch (IOException e) {
            System.err.println("Error writing word list: " + e.getMessage());
        }
    }

    public static WordList getWordList(String wordListName) throws IOException {
        try {
            String fileName = "wordLists/" + wordListName + ".json";
            File file = new File(fileName);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                    new WordList(wordListName);
                    return null;
                } catch (IOException e) {
                    System.err.println("Error creating word list file: " + e.getMessage());
                    throw e;
                }
            }
            try {
                if (file.length() < 0) {
                    new WordList(wordListName);
                    return null;
                }
                JsonHandler.readJson(WordList.class, fileName);
            } catch (IOException e) {
                System.err.println("Error reading word list: " + e.getMessage());
                throw e;
            }
        } catch (IOException e) {
            System.err.println("Error getting word list: " + e.getMessage());
            throw e;
        }
        return null;
    }

    public void addWord(Word word) {
        words.add(word);
    }

    public UUID getId() {
        return id;
    }

    public String getWordListName() {
        return wordListName;
    }

    public ArrayList<Word> getWords() {
        return words;
    }
}
