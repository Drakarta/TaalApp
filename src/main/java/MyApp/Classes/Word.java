package MyApp.Classes;

import java.util.UUID;

public class Word {
    private final UUID id;
    private final String word;
    private final String definition;

    public Word(String word, String definition) {
        this.id = UUID.randomUUID();
        this.word = word;
        this.definition = definition;
    }

    public UUID getId() {
        return id;
    }

    public String getWord() {
        return word;
    }

    public String getDefinition() {
        return definition;
    }
}
